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
package org.robovm.pods.amznpubservices;

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
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DTBAdHelper/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DTBAdHelperPtr extends Ptr<DTBAdHelper, DTBAdHelperPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DTBAdHelper.class); }/*</bind>*/
    /*<constants>*/
    public static final String APS_ADMOB_CONST_SLOT_UUID = "slotUUId";
    public static final String APS_ADMOB_CONST_REQUEST_ID = "requestId";
    public static final String APS_ADMOB_CONST_SLOT_GROUP = "slotGroup";
    public static final String APS_ADMOB_CONST_WIDTH = "width";
    public static final String APS_ADMOB_CONST_HEIGHT = "height";
    public static final String APS_ADMOB_CONST_CCPA_APS_PRIVACY = "aps_privacy";
    public static final String APS_ADMOB_CONST_CCPA_US_PRIVACY = "us_privacy";
    public static final String APS_ADMOB_CONST_ADAPTER_VERSION_NAME = "custom_event_adapter_version";
    public static final String APS_ADMOB_CONST_ADAPTER_VERSION_VALUE = "2.0";
    public static final int APS_AAX_PRICE_POINT_LENGTH = 12;
    public static final String COMPARE_LESS_THAN_OR_EQUAL_TO = "leq";
    public static final String COMPARE_GREATER_THAN_OR_EQUAL_TO = "geq";
    public static final String COMPARE_EQUAL_TO = "eq";
    /*</constants>*/
    /*<constructors>*/
    public DTBAdHelper() {}
    protected DTBAdHelper(Handle h, long handle) { super(h, handle); }
    protected DTBAdHelper(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "createAmazonErrorWithCode:")
    public static native NSError createAmazonError(@MachineSizedSInt long code);
    @Method(selector = "createAmazonErrorWithCode:withMessage:")
    public static native NSError createAmazonError(@MachineSizedSInt long code, String msg);
    @Method(selector = "validateAdMobBannerCustomEventWithExpectedSizeHandler:serverParameter:parameters:")
    public static native boolean validateAdMobBannerCustomEvent(DTBExpectedSize expectedSizeHandler, String serverParameter, NSDictionary<?, ?> params);
    @Method(selector = "validateAdMobInterstitialCustomEvent:parameters:")
    public static native boolean validateAdMobInterstitialCustomEvent(String serverParameter, NSDictionary<?, ?> params);
    @Method(selector = "viewForAdView:expectedSizeHandler:requestedSize:")
    public static native UIView getViewForAdView(UIView adView, DTBExpectedSize expectedSizeHandler, @ByVal CGSize requestedSize);
    @Method(selector = "viewForAdView:expectedSize:requestedSize:")
    public static native UIView getViewForAdView(UIView adView, @ByVal CGSize expectedSize, @ByVal CGSize requestedSize);
    @Method(selector = "handleBannerBidsWith:withParams:")
    public static native boolean handleBannerBids(DTBExpectedSize expectedSizeHandler, NSDictionary<?, ?> params);
    @Method(selector = "isFetchManagerPresentForSmartBanner")
    public static native boolean isFetchManagerPresentForSmartBanner();
    @Method(selector = "skadnHelper:withInfo:")
    public static native void skadnHelper(String label, String info);
    @Method(selector = "generateRandomUniqueNumber")
    public static native String generateRandomUniqueNumber();
    @Method(selector = "createAdMobBannerRequestKeyword:width:height:extras:")
    public static native NSArray<?> createAdMobBannerRequestKeyword(String slotUUId, @MachineSizedSInt long width, @MachineSizedSInt long height, NSDictionary<?, ?> extras);
    @Method(selector = "createAdMobBannerRequestKeyword:width:height:")
    public static native NSArray<?> createAdMobBannerRequestKeyword(String slotUUId, @MachineSizedSInt long width, @MachineSizedSInt long height);
    @Method(selector = "createAdMobInterstitialRequestKeyword:")
    public static native NSArray<?> createAdMobInterstitialRequestKeyword(String slotUUId);
    @Method(selector = "createAdMobInterstitialRequestKeyword:extras:")
    public static native NSArray<?> createAdMobInterstitialRequestKeyword(String slotUUId, NSDictionary<?, ?> extras);
    @Method(selector = "createAdMobBannerRequestKeywordWithSlotGroup:")
    public static native NSArray<?> createAdMobBannerRequestKeyword(String slotGroup);
    @Method(selector = "createAdMobBannerRequestKeywordWithSlotGroup:extras:")
    public static native NSArray<?> createAdMobBannerRequestKeyword(String slotGroup, NSDictionary<?, ?> extras);
    @Method(selector = "getValueForKeyFromAdMobKeywords:key:")
    public static native String getValueForKeyFromAdMobKeywords(NSArray<?> adMobKeywords, String key);
    @Method(selector = "validateAdMobCustomSingleEventPricePoint:parameters:")
    public static native boolean validateAdMobCustomSingleEventPricePoint(String serverParameter, NSDictionary<?, ?> params);
    @Method(selector = "reverseString:")
    public static native String reverseString(String input);
    @Method(selector = "validateAdMobBannerCustomEventWithExpectedSizeHandlerGeneric:serverParameter:parameters:isSpp:")
    public static native boolean validateAdMobBannerCustomEvent(DTBExpectedSize expectedSizeHandler, String serverParameter, NSDictionary<?, ?> params, boolean isSpp);
    @Method(selector = "validateAdMobInterstitialCustomEventGeneric:parameters:isSpp:")
    public static native boolean validateAdMobInterstitialCustomEventGeneric(String serverParameter, NSDictionary<?, ?> params, boolean isSpp);
    @Method(selector = "sendAdapterSuccessEndEventWithEndTime:startTime:adapterVersion:bidId:correlationId:")
    public static native void sendAdapterSuccessEndEvent(NSNumber endTime, NSNumber startTime, String version, String bidId, String correlationId);
    @Method(selector = "sendAdapterFailureEndEventWithEndTime:startTime:adapterVersion:correlationId:")
    public static native void sendAdapterFailureEndEvent(NSNumber endTime, NSNumber startTime, String version, String correlationId);
    @Method(selector = "setAdapterVersion:")
    public static native void setAdapterVersion(String version);
    /*</methods>*/
}
