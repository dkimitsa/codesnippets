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
package org.robovm.pods.yabbiads;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC8YabbiAds8YabbiAds")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YabbiAds/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YabbiAdsPtr extends Ptr<YabbiAds, YabbiAdsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YabbiAds.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public YabbiAds() {}
    protected YabbiAds(Handle h, long handle) { super(h, handle); }
    protected YabbiAds(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "INTERSTITIAL")
    public static native @MachineSizedSInt long INTERSTITIAL();
    @Method(selector = "REWARDED")
    public static native @MachineSizedSInt long REWARDED();
    @Method(selector = "initialize:")
    public static native void initialize(YabbiConfiguration configuration);
    @Method(selector = "setCustomParams::")
    public static native void setCustomParams(String key, String value);
    @Method(selector = "setMetaData::")
    public static native void setMetaData(String key, String value);
    @Method(selector = "configuration")
    public static native YabbiConfiguration configuration();
    @Method(selector = "isInitialized")
    public static native boolean isInitialized();
    @Method(selector = "loadAd:")
    public static native void loadAd(@MachineSizedSInt long type);
    @Method(selector = "canLoadAd:")
    public static native boolean canLoadAd(@MachineSizedSInt long type);
    @Method(selector = "isAdLoaded:")
    public static native boolean isAdLoaded(@MachineSizedSInt long type);
    @Method(selector = "isAdLoading:")
    public static native boolean isAdLoading(@MachineSizedSInt long type);
    @Method(selector = "showAd::")
    public static native void showAd(@MachineSizedSInt long type, UIViewController rootViewController);
    @Method(selector = "destroyAd:")
    public static native void destroyAd(@MachineSizedSInt long type);
    @Method(selector = "setInterstitialDelegate:")
    public static native void setInterstitialDelegate(YbiInterstitialDelegate delegate);
    @Method(selector = "setRewardedDelegate:")
    public static native void setRewardedDelegate(YbiRewardedDelegate delegate);
    @Method(selector = "setUserConsent:")
    public static native void setUserConsent(boolean value);
    @Method(selector = "hasUserConsent")
    public static native boolean hasUserConsent();
    @Method(selector = "sdkVersion")
    public static native String sdkVersion();
    @Method(selector = "enableDebug:")
    public static native void enableDebug(boolean enbaled);
    /*</methods>*/
}
