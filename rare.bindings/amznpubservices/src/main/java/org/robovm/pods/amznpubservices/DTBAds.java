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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DTBAds/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DTBAdsPtr extends Ptr<DTBAds, DTBAdsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DTBAds.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public DTBAds() {}
    protected DTBAds(Handle h, long handle) { super(h, handle); }
    protected DTBAds(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "useSecureConnection")
    public native boolean isUseSecureConnection();
    @Property(selector = "setUseSecureConnection:")
    public native void setUseSecureConnection(boolean v);
    @Property(selector = "testMode")
    public native boolean isTestMode();
    @Property(selector = "setTestMode:")
    public native void setTestMode(boolean v);
    @Property(selector = "useGeoLocation")
    public native boolean isUseGeoLocation();
    @Property(selector = "setUseGeoLocation:")
    public native void setUseGeoLocation(boolean v);
    @Property(selector = "mraidPolicy")
    public native DTBMRAIDPolicy getMraidPolicy();
    @Property(selector = "setMraidPolicy:")
    public native void setMraidPolicy(DTBMRAIDPolicy v);
    @Property(selector = "mraidCustomVersions")
    public native NSArray<NSString> getMraidCustomVersions();
    @Property(selector = "setMraidCustomVersions:")
    public native void setMraidCustomVersions(NSArray<NSString> v);
    @Property(selector = "isReady")
    public native boolean isReady();
    @Property(selector = "setIsReady:")
    public native void setIsReady(boolean v);
    @Property(selector = "debugProperties")
    public native DTBDebugProperties getDebugProperties();
    @Property(selector = "setDebugProperties:")
    public native void setDebugProperties(DTBDebugProperties v);
    @Property(selector = "serverlessMarkers")
    public native NSArray<?> getServerlessMarkers();
    @Property(selector = "setServerlessMarkers:")
    public native void setServerlessMarkers(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="DTBiOSSDKVersionNumber", optional=true)
    public static native double getVersionNumber();
    @GlobalValue(symbol="DTBiOSSDKVersionString", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String getVersionString();
    
    /**
     * @deprecated APS no longer supports this API. For GDPR, we support TCFv2 strings. Implementation instructions can be found on the APS Portal under Resources > Privacy
     */
    @Deprecated
    @Method(selector = "setVendorList:")
    public native void setVendorList(NSArray<NSNumber> vendorList);
    /**
     * @deprecated APS no longer supports this API. For GDPR, we support TCFv2 strings. Implementation instructions can be found on the APS Portal under Resources > Privacy
     */
    @Deprecated
    @Method(selector = "setConsentStatus:")
    public native void setConsentStatus(DTBConsentStatus consentStatus);
    /**
     * @deprecated APS no longer supports this API. For GDPR, we support TCFv2 strings. Implementation instructions can be found on the APS Portal under Resources > Privacy
     */
    @Deprecated
    @Method(selector = "setCmpFlavor:")
    public native void setCmpFlavor(DTBCMPFlavor cmpFlavor);
    /**
     * @deprecated APS no longer supports this API. For GDPR, we support TCFv2 strings. Implementation instructions can be found on the APS Portal under Resources > Privacy
     */
    @Deprecated
    @Method(selector = "isConsentStatusUnknown")
    public native boolean isConsentStatusUnknown();
    @Method(selector = "setAppKey:")
    public native void setAppKey(String appKey);
    @Method(selector = "setAdNetworkInfo:")
    public native void setAdNetworkInfo(DTBAdNetworkInfo dtbAdNetworkInfo);
    @Method(selector = "appKey")
    public native String appKey();
    @Method(selector = "setLogLevel:")
    public native void setLogLevel(DTBLogLevel logLevel);
    @Method(selector = "addSlotGroup:")
    public native void addSlotGroup(DTBSlotGroup group);
    @Method(selector = "slotGroupByName:")
    public native DTBSlotGroup slotGroupByName(String name);
    @Method(selector = "hasAdapters")
    public native boolean hasAdapters();
    /**
     * @deprecated APS no longer supports this API. For GDPR, we support TCFv2 strings. Implementation instructions can be found on the APS Portal under Resources > Privacy
     */
    @Deprecated
    @Method(selector = "removeNonIAB")
    public native void removeNonIAB();
    @Method(selector = "setAPSPublisherExtendedIdFeatureEnabled:")
    public native void setAPSPublisherExtendedIdFeatureEnabled(boolean publisherExtendedIdFeatureEnabled);
    @Method(selector = "addCustomAttribute:value:")
    public native void addCustomAttribute(String withKey, NSObject value);
    @Method(selector = "removeCustomAttribute:")
    public native void removeCustomAttribute(String forKey);
    @Method(selector = "sharedInstance")
    public static native DTBAds sharedInstance();
    @Method(selector = "version")
    public static native String version();
    @Method(selector = "getLocalExtras:")
    public static native NSDictionary<?, ?> getLocalExtras(String adUnitId);
    @Method(selector = "setLocalExtras:localExtras:")
    public static native void setLocalExtras(String adUnitId, NSDictionary<?, ?> localExtras);
    @Method(selector = "removeLocalExtras:")
    public static native void removeLocalExtras(String key);
    /*</methods>*/
}
