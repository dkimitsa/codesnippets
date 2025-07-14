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
package org.robovm.pods.donkeyads;

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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DonkeyAdsSDKKitRvm.AdSdkRvm")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AdSdk/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AdSdkPtr extends Ptr<AdSdk, AdSdkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AdSdk.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AdSdk() {}
    protected AdSdk(Handle h, long handle) { super(h, handle); }
    protected AdSdk(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "versionNumber")
    public static native double versionNumber();
    @Method(selector = "configureWithToken:")
    public static native void configure(String token);
    @Method(selector = "configureWithToken:userId:")
    public static native void configure(String token, String userId);
    @Method(selector = "isInitialized")
    public static native boolean isInitialized();
    @Method(selector = "setUserId:")
    public static native void setUserId(String userId);
    @Method(selector = "setDelegate:")
    public static native void setDelegate(DonkeyAdsDelegate delegate);
    @Method(selector = "preloadAds")
    public static native void preloadAds();
    @Method(selector = "adAvailable")
    public static native boolean adAvailable();
    @Method(selector = "showNextAdFrom:")
    public static native void showNextAdFrom(UIViewController viewController);
    @Method(selector = "isNamedAdAvailableWithName:")
    public static native boolean isNamedAdAvailable(String name);
    @Method(selector = "showNamedAdFrom:name:overrideUrl:externalTracker:")
    public static native void showNamedAd(UIViewController viewController, String name, String overrideUrl, String externalTracker);
    @Method(selector = "showNamedAdFrom:name:overrideUrl:")
    public static native void showNamedAd(UIViewController viewController, String name, String overrideUrl);
    @Method(selector = "checkLoadedAssetsWithNamedOnly:")
    public static native NSArray<AdAsset> checkLoadedAssets(boolean namedOnly);
    @Method(selector = "checkLoadedAssetIdsWithNamedOnly:")
    public static native NSArray<NSString> checkLoadedAssetIds(boolean namedOnly);
    @Method(selector = "clearCache")
    public static native void clearCache();
    /*</methods>*/
}
