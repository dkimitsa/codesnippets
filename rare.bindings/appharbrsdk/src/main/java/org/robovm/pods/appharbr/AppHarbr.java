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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("AppHarbrSDK.AppHarbr")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AppHarbr/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AppHarbrPtr extends Ptr<AppHarbr, AppHarbrPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AppHarbr.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AppHarbr() {}
    protected AppHarbr(Handle h, long handle) { super(h, handle); }
    protected AppHarbr(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "geConfiguration")
    public native AppHarbrConfiguration getGeConfiguration();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initializeSdkWithConfiguration:completion:")
    public native void initializeSdk(AppHarbrConfiguration configuration, @Block VoidBlock1<NSError> completion);
    @Method(selector = "addBannerAdSdk:adObject:delegate:")
    public native void addBanner(AdSdk adSdk, NSObject adObject, AppHarbrDelegate delegate);
    @Method(selector = "addNativeBannerAdSdk:adLoader:delegate:")
    public native void addNativeBanner(AdSdk adSdk, NSObject adLoader, AppHarbrDelegate delegate);
    @Method(selector = "addInterstitialAdSdk:interstitialAd:unitId:delegate:")
    public native void addInterstitial(AdSdk adSdk, NSObject interstitialAd, String unitId, AppHarbrDelegate delegate);
    @Method(selector = "addRewardedAdSdk:rewardedAd:unitId:delegate:")
    public native void addRewarded(AdSdk adSdk, NSObject rewardedAd, String unitId, AppHarbrDelegate delegate);
    @Method(selector = "addRewardedInterstitialAdSdk:rewardedAd:unitId:delegate:")
    public native void addRewardedInterstitial(AdSdk adSdk, NSObject rewardedIntertitialAd, String unitId, AppHarbrDelegate delegate);
    @Method(selector = "shouldBlockNativeAd:usingAdSdk:unitId:request:")
    public native AdResult shouldBlockNativeAd(NSObject nativeAd, AdSdk adSdk, String unitId, NSObject request);
    @Method(selector = "addMAAdPlacerAdUnitIdentifier:")
    public native void addMAAdPlacerAdUnitIdentifier(String adUnitIdentifier);
    @Method(selector = "removeMAAdPlacerAdUnitIdentifier:")
    public native void removeMAAdPlacerAdUnitIdentifier(String adUnitIdentifier);
    /**
     * @deprecated This method is deprecated. Please, use interstitialResult(forAd:) method instead.
     */
    @Deprecated
    @Method(selector = "getInterstitialStateWithAd:")
    public native AdStateResult getInterstitialState(NSObject ad);
    /**
     * @deprecated This method is deprecated. Please, use rewardedResult(forAd:) method instead.
     */
    @Deprecated
    @Method(selector = "getRewardedStateWithAd:")
    public native AdStateResult getRewardedState(NSObject ad);
    /**
     * @deprecated This method is deprecated. Please, use rewardedInterstitialResult(forAd:) method instead.
     */
    @Deprecated
    @Method(selector = "getRewardedInterstitialStateWithAd:")
    public native AdStateResult getRewardedInterstitialState(NSObject ad);
    @Method(selector = "interstitialResultForAd:")
    public native AdResult interstitialResultForAd(NSObject ad);
    @Method(selector = "rewardedResultForAd:")
    public native AdResult rewardedResultForAd(NSObject ad);
    @Method(selector = "rewardedInterstitialResultForAd:")
    public native AdResult rewardedInterstitialResultForAd(NSObject ad);
    /**
     * @deprecated you do not need to remove object
     */
    @Deprecated
    @Method(selector = "removeBannerWithView:")
    public native void removeBanner(NSObject adObject);
    /**
     * @deprecated you do not need to remove object
     */
    @Deprecated
    @Method(selector = "removeNativeBannerWithAdLoader:")
    public native void removeNativeBanner(NSObject adLoader);
    /**
     * @deprecated you do not need to remove object
     */
    @Deprecated
    @Method(selector = "removeInterstitialWithAd:")
    public native void removeInterstitial(NSObject ad);
    /**
     * @deprecated you do not need to remove object
     */
    @Deprecated
    @Method(selector = "removeRewardedWithAd:")
    public native void removeRewarded(NSObject ad);
    @Method(selector = "shared")
    public static native AppHarbr shared();
    /*</methods>*/
}
