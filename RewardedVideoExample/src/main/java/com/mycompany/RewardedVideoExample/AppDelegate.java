package com.mycompany.RewardedVideoExample;

import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.UIApplication;
import org.robovm.apple.uikit.UIApplicationDelegateAdapter;
import org.robovm.apple.uikit.UIApplicationLaunchOptions;
import org.robovm.apple.uikit.UIWindow;
import org.robovm.objc.annotation.CustomClass;
import org.robovm.objc.annotation.IBOutlet;
import org.robovm.pods.google.GADMobileAds;

@CustomClass()
public class AppDelegate extends UIApplicationDelegateAdapter {

    @Override
    public boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions) {
        // Initialize Google Mobile Ads SDK
        GADMobileAds.configureWithApplicationID("ca-app-pub-3940256099942544~1458002511");

        return true;
    }

    @Override
    public void didEnterBackground(UIApplication application) {
        // Use this method to release shared resources, save user data, invalidate timers, and store
        // enough application state information to restore your application to its current state in case
        // it is terminated later.
        // If your application supports background execution, this method is called instead of
        // applicationWillTerminate: when the user quits.
        ViewController viewController = (ViewController )this.getWindow().getRootViewController();
        viewController.pauseGame();
    }


    @Override
    public void willEnterForeground(UIApplication application) {
        // Called as part of the transition from the background to the inactive state; here you can undo
        // many of the changes made on entering the background.
        ViewController viewController = (ViewController )this.getWindow().getRootViewController();
        viewController.resumeGame();
    }

    public static void main(String[] args) {
        try (NSAutoreleasePool pool = new NSAutoreleasePool()) {
            UIApplication.main(args, null, AppDelegate.class);
        }
    }
}
