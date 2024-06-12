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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("AppHarbrSDK.AppHarbrAdQuality")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AppHarbrAdQuality/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AppHarbrAdQualityPtr extends Ptr<AppHarbrAdQuality, AppHarbrAdQualityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AppHarbrAdQuality.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AppHarbrAdQuality() {}
    protected AppHarbrAdQuality(Handle h, long handle) { super(h, handle); }
    protected AppHarbrAdQuality(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isReady")
    public native boolean isReady();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initializeSdkWithApiKey:directMediationSdk:configuration:completion:")
    public native void initializeSdk(String apiKey, AdSdk directMediationSdk, NSDictionary<NSString, ?> configuration, @Block VoidBlock1<NSError> completion);
    @Method(selector = "verifyAdWithAdObject:adFormat:adContent:adNetworkSdk:mediationUnitId:adNetworkUnitId:mediationCID:adNetworkCID:extraData:delegate:")
    public native VerificationStatus verifyAd(NSObject adObject, AHAdFormat adFormat, String adContent, AdSdk adNetworkSdk, NSObject mediationUnitId, NSObject adNetworkUnitId, String mediationCID, String adNetworkCID, NSDictionary<NSString, ?> extraData, AppHarbrAdQualityDelegate delegate);
    @Method(selector = "willDisplayAdWithAdObject:adFormat:adContent:adNetworkSdk:mediationUnitId:adNetworkUnitId:mediationCID:adNetworkCID:extraData:")
    public native void willDisplayAd(NSObject adObject, AHAdFormat adFormat, String adContent, AdSdk adNetworkSdk, NSObject mediationUnitId, NSObject adNetworkUnitId, String mediationCID, String adNetworkCID, NSDictionary<NSString, ?> extraData);
    @Method(selector = "willCloseAdWithAdObject:")
    public native void willCloseAd(NSObject adObject);
    @Method(selector = "didClickAdWithAdObject:")
    public native void didClickAd(NSObject adObject);
    @Method(selector = "removeAdWithAdObject:")
    public native void removeAd(NSObject adObject);
    @Method(selector = "shared")
    public static native AppHarbrAdQuality shared();
    /*</methods>*/
}
