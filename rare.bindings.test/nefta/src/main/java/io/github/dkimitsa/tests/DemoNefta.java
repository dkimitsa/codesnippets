package io.github.dkimitsa.tests;


import org.robovm.apple.uikit.UIViewController;
import org.robovm.pods.neftasdk.NeftaPluginIOS;

public class DemoNefta {

    //private static String token = null;

    static String token = "5724765247504384";

    // pre-requirements:
    // frameworks required:
    //   - NeftaSDK.xcframework

    // goals:
    // - check that pod is able to link/run with dependencies

    private static NeftaPluginIOS nefta;
    static {
        if (token == null) throw new NullPointerException("Please set token in DemoNefta.token");
        nefta = NeftaPluginIOS.Init(token);
    }

    public static void demo(UIViewController vc) {
        System.out.println(NeftaPluginIOS.getVersionNumber());
        System.out.println(nefta.getEvents());
    }
}
