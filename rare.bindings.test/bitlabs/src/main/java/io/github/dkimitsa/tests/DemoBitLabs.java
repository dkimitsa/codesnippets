package io.github.dkimitsa.tests;


import org.robovm.apple.uikit.UIViewController;
import org.robovm.pods.bitlabs.BitLabs;
import org.robovm.pods.bitlabs.Survey;

public class DemoBitLabs {

    private static String token = null;

    // pre-requirements:
    // frameworks required:
    //   - BitLabs.xcframeworks

    // goals:
    // - check that pod is able to link/run with dependencies

    public static void demo(UIViewController vc) {
        if (token == null) throw new NullPointerException("Please set BitLab token in DemoBitLabs.token");
        BitLabs.shared().configure(token, "123");
        BitLabs.shared().requestTrackingAuthorization();
        BitLabs.shared().getSurveys(surveys -> {
            for (Survey s : surveys)
                System.out.println(s.asDictionary());
            if (!surveys.isEmpty())
                surveys.get(0).open(vc);
        });
    }
}
