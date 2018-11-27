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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LGSideMenuConsts/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(LGSideMenuConsts.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kLGSideMenuView", optional=true)
    public static native String getViewKey();
    @GlobalValue(symbol="kLGSideMenuAnimationDuration", optional=true)
    public static native String getAnimationDurationKey();
    @Library(Library.INTERNAL)
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        @GlobalValue(symbol="LGSideMenuWillHideLeftViewNotification", optional=true)
        public static native String WillHideLeftView();
        @GlobalValue(symbol="LGSideMenuDidHideLeftViewNotification", optional=true)
        public static native String DidHideLeftView();
        @GlobalValue(symbol="LGSideMenuWillShowRightViewNotification", optional=true)
        public static native String WillShowRightView();
        @GlobalValue(symbol="LGSideMenuDidShowRightViewNotification", optional=true)
        public static native String DidShowRightView();
        @GlobalValue(symbol="LGSideMenuWillHideRightViewNotification", optional=true)
        public static native String WillHideRightView();
        @GlobalValue(symbol="LGSideMenuWillShowLeftViewNotification", optional=true)
        public static native String WillShowLeftView();
        @GlobalValue(symbol="LGSideMenuShowLeftViewAnimationsNotification", optional=true)
        public static native String ShowLeftViewAnimations();
        @GlobalValue(symbol="LGSideMenuHideLeftViewAnimationsNotification", optional=true)
        public static native String HideLeftViewAnimations();
        @GlobalValue(symbol="LGSideMenuShowRightViewAnimationsNotification", optional=true)
        public static native String ShowRightViewAnimations();
        @GlobalValue(symbol="LGSideMenuHideRightViewAnimationsNotification", optional=true)
        public static native String HideRightViewAnimations();
        @GlobalValue(symbol="LGSideMenuDidHideRightViewNotification", optional=true)
        public static native String DidHideRightView();
        @GlobalValue(symbol="LGSideMenuDidShowLeftViewNotification", optional=true)
        public static native String DidShowLeftView();
    }
    /*</methods>*/
}
