package io.github.dkimitsa.tests;


import org.robovm.apple.uikit.UIViewController;
import org.robovm.pods.usercentrics.UsercentricsCore;
import org.robovm.pods.usercentrics.UsercentricsOptions;
import org.robovm.pods.usercentrics.UsercentricsRvm;

public class DemoUserCentrics {

    //private static String token = null;

    static String rulesetId = null;
    static String settingsId = "";

    // goals:
    // - check that pod is able to link/run with dependencies

    static {
        if (rulesetId == null) throw new NullPointerException("Please set rulesetId in DemoUserCentrics.rulesetId");
    }

    public static void demo(UIViewController vc) {
        UsercentricsOptions options = new UsercentricsOptions(settingsId);
        options.setRuleSetId(rulesetId);
        options.setConsentMediation(true);
        UsercentricsCore.configureOptions(options);
        UsercentricsCore.isReady(
                readyStatus -> {
                    System.out.println("ready  " + readyStatus);
                    UsercentricsRvm.showFirstLayer(vc, status -> {
                        System.out.println("showFirstLayer status  " + readyStatus);
                    });
                },
                nsError -> System.out.println("error  " + nsError)
        );
    }
}
