/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.lgp;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/UIViewControllerExtensions/*</name>*/ 
    extends /*<extends>*/NSExtensions/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIViewControllerExtensions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    private UIViewControllerExtensions() {}
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sideMenuController")
    public static native LGSideMenuController getSideMenuController(UIViewController thiz);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "showLeftView:")
    public static native void showLeftView(UIViewController thiz, NSObject sender);
    @Method(selector = "hideLeftView:")
    public static native void hideLeftView(UIViewController thiz, NSObject sender);
    @Method(selector = "toggleLeftView:")
    public static native void toggleLeftView(UIViewController thiz, NSObject sender);
    @Method(selector = "showLeftViewAnimated:")
    public static native void showLeftViewAnimated(UIViewController thiz, NSObject sender);
    @Method(selector = "hideLeftViewAnimated:")
    public static native void hideLeftViewAnimated(UIViewController thiz, NSObject sender);
    @Method(selector = "toggleLeftViewAnimated:")
    public static native void toggleLeftViewAnimated(UIViewController thiz, NSObject sender);
    @Method(selector = "showRightView:")
    public static native void showRightView(UIViewController thiz, NSObject sender);
    @Method(selector = "hideRightView:")
    public static native void hideRightView(UIViewController thiz, NSObject sender);
    @Method(selector = "toggleRightView:")
    public static native void toggleRightView(UIViewController thiz, NSObject sender);
    @Method(selector = "showRightViewAnimated:")
    public static native void showRightViewAnimated(UIViewController thiz, NSObject sender);
    @Method(selector = "hideRightViewAnimated:")
    public static native void hideRightViewAnimated(UIViewController thiz, NSObject sender);
    @Method(selector = "toggleRightViewAnimated:")
    public static native void toggleRightViewAnimated(UIViewController thiz, NSObject sender);
    /*</methods>*/
}
