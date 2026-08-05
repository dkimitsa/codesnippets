package com.mycompany.myapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.composedemo.DemoWidget
import com.mycompany.myapp.Main.SceneDelegate
import org.robovm.apple.foundation.NSAutoreleasePool
import org.robovm.apple.uikit.*
import org.robovm.compose.RoboVmComposeViewController
import org.robovm.objc.annotation.CustomClass
import org.robovm.rt.annotation.ForceLinkClass

/// note: @ForceLinkClass(Main.SceneDelegate.class) is important here in this setup
///       as there is no reference in Java code to SceneDelegate class and it will be
///       dropped. Options either have @ForceLinkClass annotation or add it to
///       `forceLinkClasses` in robovm.xml.
@ForceLinkClass(SceneDelegate::class)
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        NSAutoreleasePool().use { pool ->
            UIApplication.main<UIApplication?, AppDelegate?>(args, null, AppDelegate::class.java)
        }
    }

    private class AppDelegate : UIApplicationDelegateAdapter() {
        override fun didFinishLaunching(
            application: UIApplication?,
            launchOptions: UIApplicationLaunchOptions?
        ): Boolean {
            return true
        } //        This method is optional as long as UIApplicationSceneManifest section in Info.plist is configured properly
        //        @Override
        //        public UISceneConfiguration getConfigurationForConnectingSceneSession(UIApplication application, UISceneSession connectingSceneSession, UISceneConnectionOptions options) {
        //            UISceneConfiguration config = new UISceneConfiguration("Default Configuration", connectingSceneSession.getRole());
        //            config.setDelegateClass(SceneDelegate.class);
        //            return config;
        //        }
    }

    /**
     * SceneDelegate.
     * UISceneDelegateClassName section of Info.plist should match its full qualified name,
     * e.g. "package com.mycompany.myapp;.Main.SceneDelegate" for this class.
     * Note: preload = true in @CustomClass annotation is critical here to make this class
     * discoverably by ObjC runtime.
     */
    @CustomClass(preload = true)
    class SceneDelegate : UIWindowSceneDelegateAdapter() {
        private var window: UIWindow? = null
        private var rootViewController: UIViewController? = null

        override fun willConnect(
            scene: UIScene?,
            session: UISceneSession?,
            connectionOptions: UISceneConnectionOptions?
        ) {
            if (scene is UIWindowScene) {
                val windowScene = scene

                // Set up the view controller.
                rootViewController = RoboVmComposeViewController {
                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        DemoWidget()
                    }
                }

                // Create a new window
                window = UIWindow(windowScene)
                // Set the view controller as the root controller for the window.
                window!!.setRootViewController(rootViewController)
                // Make the window visible.
                window!!.makeKeyAndVisible()
            }
        }
    }
}
