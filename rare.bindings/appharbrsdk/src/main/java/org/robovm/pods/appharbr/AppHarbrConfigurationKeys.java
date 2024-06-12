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
package org.robovm.pods.appharbr;

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
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("AppHarbrSDK.AppHarbrConfigurationKeys")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AppHarbrConfigurationKeys/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AppHarbrConfigurationKeysPtr extends Ptr<AppHarbrConfigurationKeys, AppHarbrConfigurationKeysPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AppHarbrConfigurationKeys.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AppHarbrConfigurationKeys() {}
    protected AppHarbrConfigurationKeys(Handle h, long handle) { super(h, handle); }
    protected AppHarbrConfigurationKeys(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "timeOut")
    public static native String timeOut();
    @Method(selector = "enableBlockAll")
    public static native String enableBlockAll();
    @Method(selector = "enableReportAll")
    public static native String enableReportAll();
    @Method(selector = "blockDomains")
    public static native String blockDomains();
    @Method(selector = "muteAd")
    public static native String muteAd();
    @Method(selector = "interstitialAdTimeLimit")
    public static native String interstitialAdTimeLimit();
    @Method(selector = "debug")
    public static native String debug();
    /*</methods>*/
}
