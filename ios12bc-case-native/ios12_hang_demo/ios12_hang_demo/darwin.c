//
//  darwin.c
//  ios12_hang_framework
//

//
// dkimitsa: this is code cut from bdwgc to demonstrate hand of GC in iOS12
//

#include "darwin.h"
#include <mach/mach.h>
#include <mach/thread_act.h>
#include <sys/sysctl.h>
#include <mach/machine.h>
#include <CoreFoundation/CoreFoundation.h>

typedef bool GC_bool;
#define GC_MAX_MACH_THREADS 100
#define STATIC static
struct GC_mach_thread {
    thread_act_t thread;
    GC_bool already_suspended;
};
#define ABORT(x) abort()

struct GC_mach_thread GC_mach_threads[GC_MAX_MACH_THREADS];
STATIC int GC_mach_threads_count = 0;
/* FIXME: it is better to implement GC_mach_threads as a hash set.  */

/* returns true if there's a thread in act_list that wasn't in old_list */
STATIC GC_bool GC_suspend_thread_list(thread_act_array_t act_list, int count,
                                      thread_act_array_t old_list,
                                      int old_count, mach_port_t my_thread)
{
    int i;
    int j = -1;
    GC_bool changed = FALSE;
    
    for (i = 0; i < count; i++) {
        thread_act_t thread = act_list[i];
        GC_bool found;
        struct thread_basic_info info;
        mach_msg_type_number_t outCount;
        kern_return_t kern_result;
        
        if (thread == my_thread) {
            /* Don't add our and the handler threads. */
            continue;
        }
        
#   ifdef DEBUG_THREADS
        GC_log_printf("Attempting to suspend thread %p\n",
                      (void *)(word)thread);
#   endif
        /* find the current thread in the old list */
        found = FALSE;
        {
            int last_found = j; /* remember the previous found thread index */
            
            /* Search for the thread starting from the last found one first.  */
            while (++j < old_count)
                if (old_list[j] == thread) {
                    found = TRUE;
                    break;
                }
            if (!found) {
                /* If not found, search in the rest (beginning) of the list.    */
                for (j = 0; j < last_found; j++)
                    if (old_list[j] == thread) {
                        found = TRUE;
                        break;
                    }
                
                if (!found) {
                    /* add it to the GC_mach_threads list */
                    if (GC_mach_threads_count == GC_MAX_MACH_THREADS)
                        ABORT("Too many threads");
                    GC_mach_threads[GC_mach_threads_count].thread = thread;
                    /* default is not suspended */
                    GC_mach_threads[GC_mach_threads_count].already_suspended = FALSE;
                    changed = TRUE;
                }
            }
        }
        
        outCount = THREAD_INFO_MAX;
        kern_result = thread_info(thread, THREAD_BASIC_INFO,
                                  (thread_info_t)&info, &outCount);
        if (kern_result != KERN_SUCCESS) {
            /* The thread may have quit since the thread_threads() call we  */
            /* mark already suspended so it's not dealt with anymore later. */
            if (!found)
                GC_mach_threads[GC_mach_threads_count++].already_suspended = TRUE;
            continue;
        }
#   ifdef DEBUG_THREADS
        GC_log_printf("Thread state for %p = %d\n", (void *)(word)thread,
                      info.run_state);
#   endif
        if (info.suspend_count != 0) {
            /* thread is already suspended. */
            if (!found)
                GC_mach_threads[GC_mach_threads_count++].already_suspended = TRUE;
            continue;
        }
        
#   ifdef DEBUG_THREADS
        GC_log_printf("Suspending %p\n", (void *)(word)thread);
#   endif
        do {
            kern_result = thread_suspend(thread);
        } while (kern_result == KERN_ABORTED);
        if (kern_result != KERN_SUCCESS) {
            /* The thread may have quit since the thread_threads() call we  */
            /* mark already suspended so it's not dealt with anymore later. */
            if (!found)
                GC_mach_threads[GC_mach_threads_count++].already_suspended = TRUE;
            continue;
        }
        if (!found)
            GC_mach_threads_count++;
    }
    return changed;
}

/* Caller holds allocation lock.        */
void GC_stop_world(void)
{
    task_t my_task = current_task();
    mach_port_t my_thread = mach_thread_self();
    kern_return_t kern_result;
    
# ifdef DEBUG_THREADS
    GC_log_printf("Stopping the world from thread %p\n",
                  (void *)(word)my_thread);
# endif
    
        unsigned i;
        GC_bool changed;
        thread_act_array_t act_list, prev_list;
        mach_msg_type_number_t listcount, prevcount;
        
        /* Clear out the mach threads list table.  We do not need to      */
        /* really clear GC_mach_threads[] as it is used only in the range */
        /* from 0 to GC_mach_threads_count-1, inclusive.                  */
        GC_mach_threads_count = 0;
        
        /* Loop stopping threads until you have gone over the whole list  */
        /* twice without a new one appearing.  thread_create() won't      */
        /* return (and thus the thread stop) until the new thread exists, */
        /* so there is no window whereby you could stop a thread,         */
        /* recognize it is stopped, but then have a new thread it created */
        /* before stopping show up later.                                 */
        changed = TRUE;
        prev_list = NULL;
        prevcount = 0;
        do {
            kern_result = task_threads(my_task, &act_list, &listcount);
            
            if (kern_result == KERN_SUCCESS) {
                changed = GC_suspend_thread_list(act_list, listcount, prev_list,
                                                 prevcount, my_thread);
                
                if (prev_list != NULL) {
                    for (i = 0; i < prevcount; i++)
                        mach_port_deallocate(my_task, prev_list[i]);
                    
                    vm_deallocate(my_task, (vm_address_t)prev_list,
                                  sizeof(thread_t) * prevcount);
                }
                
                /* Repeat while having changes. */
                prev_list = act_list;
                prevcount = listcount;
            }
        } while (changed);
        
        for (i = 0; i < prevcount; i++)
            mach_port_deallocate(my_task, prev_list[i]);
        vm_deallocate(my_task, (vm_address_t)act_list,
                      sizeof(thread_t) * listcount);

# ifdef DEBUG_THREADS
    GC_log_printf("World stopped from %p\n", (void *)(word)my_thread);
# endif
    mach_port_deallocate(my_task, my_thread);
}

void GC_thread_resume(thread_act_t thread)
{
    kern_return_t kern_result;
# if defined(DEBUG_THREADS) || defined(GC_ASSERTIONS)
    struct thread_basic_info info;
    mach_msg_type_number_t outCount = THREAD_INFO_MAX;
    kern_result = thread_info(thread, THREAD_BASIC_INFO,
                              (thread_info_t)&info, &outCount);
    if (kern_result != KERN_SUCCESS)
        ABORT("thread_info failed");
# endif
# ifdef DEBUG_THREADS
    GC_log_printf("Resuming thread %p with state %d\n", (void *)(word)thread,
                  info.run_state);
# endif
    /* Resume the thread */
    kern_result = thread_resume(thread);
    if (kern_result != KERN_SUCCESS)
        ABORT("thread_resume failed");
}

/* Caller holds allocation lock, and has held it continuously since     */
/* the world stopped.                                                   */
void GC_start_world(void)
{
    task_t my_task = current_task();
# ifdef DEBUG_THREADS
    GC_log_printf("World starting\n");
# endif

        int i;
        int j = GC_mach_threads_count;
        kern_return_t kern_result;
        thread_act_array_t act_list;
        mach_msg_type_number_t listcount;
        
        kern_result = task_threads(my_task, &act_list, &listcount);
        if (kern_result != KERN_SUCCESS)
            ABORT("task_threads failed");
        
        for (i = 0; i < (int)listcount; i++) {
            thread_act_t thread = act_list[i];
            int last_found = j;        /* The thread index found during the   */
            /* previous iteration (count value     */
            /* means no thread found yet).         */
            
            /* Search for the thread starting from the last found one first.  */
            while (++j < GC_mach_threads_count) {
                if (GC_mach_threads[j].thread == thread)
                    break;
            }
            if (j >= GC_mach_threads_count) {
                /* If not found, search in the rest (beginning) of the list.    */
                for (j = 0; j < last_found; j++) {
                    if (GC_mach_threads[j].thread == thread)
                        break;
                }
            }
            
            if (j != last_found) {
                /* The thread is found in GC_mach_threads.      */
                if (GC_mach_threads[j].already_suspended) {
#           ifdef DEBUG_THREADS
                    GC_log_printf("Not resuming already suspended thread %p\n",
                                  (void *)(word)thread);
#           endif
                } else {
                    GC_thread_resume(thread);
                }
            }
            
            mach_port_deallocate(my_task, thread);
        }
        vm_deallocate(my_task, (vm_address_t)act_list,
                      sizeof(thread_t) * listcount);
# ifdef DEBUG_THREADS
    GC_log_printf("World started\n");
# endif
}
