//
//  main.c
//  MachExceptionSaveRestoreTest
//
//

#include <stdio.h>
#include "signal.h"

const char *exception_names[] = {
    NULL,
    "EXC_BAD_ACCESS",
    "EXC_BAD_INSTRUCTION",
    "EXC_ARITHMETIC",
    "EXC_EMULATION",
    "EXC_SOFTWARE",
    "EXC_BREAKPOINT",
    "EXC_SYSCALL",
    "EXC_MACH_SYSCALL",
    "EXC_RPC_ALERT",
    "EXC_CRASH",
    "EXC_RESOURCE",
    "EXC_GUARD",
    "EXC_CORPSE_NOTIFY"
};

const char *exception_states[] = {
    NULL,
    "EXCEPTION_DEFAULT",
    "EXCEPTION_STATE",
    "EXCEPTION_STATE_IDENTITY"
};

//MACHINE_THREAD_STATE

void dumpPorts(SavedMachPorts *state) {
    for (int i = FIRST_EXCEPTION; i < EXC_TYPES_COUNT; i++) {
        if (MACH_PORT_VALID(state->ports[i])) {
            mach_port_t port = state->ports[i];
            exception_behavior_t behavior = state->behaviors[i] & (MACH_EXCEPTION_CODES - 1);
            thread_state_flavor_t flavor = state->flavors[i];
            printf("    %-20s %d, %s, flavor = %d\n", exception_names[i], port, exception_states[behavior], flavor);
        }
    }
}

mach_port_t registerPort(int mask) {
    mach_port_t mach_ex_port = MACH_PORT_NULL;
    mach_port_t self = mach_task_self();
    assert(mach_port_allocate(self, MACH_PORT_RIGHT_RECEIVE, &mach_ex_port) == KERN_SUCCESS);
    assert(mach_port_insert_right(self, mach_ex_port, mach_ex_port, MACH_MSG_TYPE_MAKE_SEND) == KERN_SUCCESS);
    assert(task_set_exception_ports(self, mask, mach_ex_port, EXCEPTION_DEFAULT, MACHINE_THREAD_STATE) == KERN_SUCCESS);
    return mach_ex_port;
}

void unregisterPort(int mask) {
    mach_port_t self = mach_task_self();
    assert(task_set_exception_ports(self, mask, MACH_PORT_NULL, EXCEPTION_DEFAULT, MACHINE_THREAD_STATE) == KERN_SUCCESS);
}


int main(int argc, const char * argv[]) {
    // step one, gettings installed exception ports at moment of start
    SavedMachPorts dump, *savedPorts;
    savedPorts = (SavedMachPorts*)rvmSaveMachPorts(NULL);
    
    printf("Startup exception ports:\n");
    getMachPorts(&dump);
    dumpPorts(&dump);
    
    // remove all ports
    unregisterPort(EXC_MASK_ALL);
    
    // setup own ports
    mach_port_t ownPort = registerPort(EXC_MASK_BAD_ACCESS);
    printf("Regstered port: %d\n", ownPort);
    
    printf("\nPorts after modification:\n");
    getMachPorts(&dump);
    dumpPorts(&dump);
    
    // restoring original ports
    rvmReinstallSavedMachPorts(NULL, savedPorts);

    printf("\nRestored ports:\n");
    getMachPorts(&dump);
    dumpPorts(&dump);

    return 0;
}
