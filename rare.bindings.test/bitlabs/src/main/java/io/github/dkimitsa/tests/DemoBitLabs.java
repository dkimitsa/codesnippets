package io.github.dkimitsa.tests;


import org.robovm.pods.bitlabs.BitLabs;

public class DemoBitLabs {

    private static String token = null;

    // pre-requirements:
    // frameworks required:
    //   - BitLabs.xcframeworks

    // goals:
    // - check that pod is able to link/run with dependencies

    public static void demo() {
        if (token == null) throw new NullPointerException("Please set BitLab token in DemoBitLabs.token");
        BitLabs.shared().configure(token, "123");
        BitLabs.shared().requestTrackingAuthorization();
    }
}
