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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/APSAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class APSAdPtr extends Ptr<APSAd, APSAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(APSAd.class); }/*</bind>*/
    /*<constants>*/
    public static final String AMAZON_SUCCESS_RESPONSE = "amazon_ad_response";
    public static final String AMAZON_ERROR_RESPONSE = "amazon_ad_error";
    public static final String APS_NETWORK_KEY = "APS";
    /*</constants>*/
    /*<constructors>*/
    protected APSAd() {}
    protected APSAd(Handle h, long handle) { super(h, handle); }
    protected APSAd(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "state")
    public native APSAdState getState();
    @Property(selector = "adResponse")
    public native NSObject getAdResponse();
    @Property(selector = "adError")
    public native NSObject getAdError();
    @Property(selector = "slotUUID")
    public native String getSlotUUID();
    @Property(selector = "adFormat")
    public native APSAdFormat getAdFormat();
    @Property(selector = "adMediaType")
    public native APSAdMediaType getAdMediaType();
    @Property(selector = "adNetwork")
    public native APSAdNetwork getAdNetwork();
    @Property(selector = "customTargeting")
    public native NSDictionary<NSString, NSString> getCustomTargeting();
    @Property(selector = "mediationHints")
    public native NSDictionary<NSString, NSString> getMediationHints();
    @Property(selector = "amznSlots")
    public native String getAmznSlots();
    @Property(selector = "adView")
    public native UIView getAdView();
    @Property(selector = "errorCode")
    public native @MachineSizedSInt long getErrorCode();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "adWithMetadataFromAd:")
    public static native APSAd adWithMetadataFromAd(APSAd ad);
    @Method(selector = "isValidPricePoint:")
    public native boolean isValidPricePoint(String serverParameter);
    @Method(selector = "keywordsWithSlotUUID:")
    public static native NSArray<NSString> getAdMobKeywords(String slotUUID);
    @Method(selector = "keywordsWithSlotUUID:adFormat:")
    public static native NSArray<NSString> getAdMobKeywords(String slotUUID, APSAdFormat adFormat);
    @Method(selector = "networkDataWithKey:")
    public native NSDictionary<?, ?> getUnityLevelPlayNetworkData(String key);
    /*</methods>*/
}
