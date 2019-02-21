//
//  signal.h
//  MachExceptionSaveRestoreTest
//

#ifndef signal_h
#define signal_h

#define DARWIN

#include <stdlib.h>
#include <stdbool.h>
#include <assert.h>

#include <mach/mach.h>
#include <mach/semaphore.h>
#include <mach/task.h>
#include <mach/mach_init.h>

// empty mock
typedef struct {
} Env;

typedef bool jboolean;

typedef struct {
    mach_port_t ports[EXC_TYPES_COUNT];
    exception_behavior_t behaviors[EXC_TYPES_COUNT];
    thread_state_flavor_t flavors[EXC_TYPES_COUNT];
} SavedMachPorts;

void* rvmSaveMachPorts(Env* env);
jboolean rvmReinstallSavedMachPorts(Env* env, void* p);

kern_return_t buildMachPortList(SavedMachPorts *state);
#define getMachPorts(state) assert(buildMachPortList(state) == KERN_SUCCESS)

#endif /* signal_h */
