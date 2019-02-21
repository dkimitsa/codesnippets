//
//  signal.c
//  MachExceptionSaveRestoreTest
//
//  Created by Igor Myslovskyy on 2/21/19.
//  Copyright © 2019 MobiVM. All rights reserved.
//

#include "signal.h"

#if defined(DARWIN)
kern_return_t buildMachPortList(SavedMachPorts *state) {
    // prepares converts port list into array where each cell corresponds exception
    mach_msg_type_number_t count;
    exception_mask_t masks[EXC_TYPES_COUNT];
    mach_port_t ports[EXC_TYPES_COUNT];
    exception_behavior_t behaviors[EXC_TYPES_COUNT];
    thread_state_flavor_t flavors[EXC_TYPES_COUNT];
    
    kern_return_t result = task_get_exception_ports(mach_task_self(), EXC_MASK_ALL, masks, &count, ports, behaviors, flavors);
    if (result == KERN_SUCCESS) {
        memset(state, 0, sizeof(SavedMachPorts));
        for (int j = 0; j < count; j++) {
            exception_mask_t mask = masks[j];
            mach_port_t port = ports[j];
            exception_behavior_t behavior = behaviors[j];
            thread_state_flavor_t flavor = flavors[j];
            for (int i = FIRST_EXCEPTION; i < EXC_TYPES_COUNT; i++) {
                if (mask & (1 << i)) {
                    state->ports[i] = port;
                    state->behaviors[i] = behavior;
                    state->flavors[i] = flavor;
                }
            }
        }
    }
    
    return result;
}
#endif

void* rvmSaveMachPorts(Env* env) {
#if defined(DARWIN)
    SavedMachPorts* state = malloc(sizeof(SavedMachPorts));
    kern_return_t result = buildMachPortList(state);
    assert(result == KERN_SUCCESS);
    if (result != KERN_SUCCESS) {
        // failed
        free(state);
        return NULL;
    }
    
    return state;
#else
    return NULL;
#endif
}

jboolean rvmReinstallSavedMachPorts(Env* env, void* p) {
#if defined(DARWIN)
    SavedMachPorts* savedPorts = (SavedMachPorts*) p;
    SavedMachPorts state;
    kern_return_t result = buildMachPortList(&state);
    assert(result == KERN_SUCCESS);
    if (result != KERN_SUCCESS) {
        free(p);
        return false;
    }
    
    // compare current state and revert back to saved
    for (int i = FIRST_EXCEPTION; i < EXC_TYPES_COUNT; i++) {
        if (savedPorts->ports[i] != state.ports[i]) {
            mach_port_t port = savedPorts->ports[i];
            exception_behavior_t behavior = savedPorts->behaviors[i];
            thread_state_flavor_t flavor = savedPorts->flavors[i];
            if (!MACH_PORT_VALID(port)) {
                port = MACH_PORT_NULL;
                behavior = EXCEPTION_DEFAULT;
                flavor = MACHINE_THREAD_STATE;
            }
            
            assert(task_set_exception_ports(mach_task_self(), 1 << i, port, behavior, flavor) == KERN_SUCCESS);
        }
    }
    
    free(p);
    return true;
    
#else
    return false;
#endif
}
