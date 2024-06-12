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
package org.robovm.pods.usercentrics;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsTCFVendor/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsTCFVendorPtr extends Ptr<UsercentricsTCFVendor, UsercentricsTCFVendorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsTCFVendor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsTCFVendor() {}
    protected UsercentricsTCFVendor(Handle h, long handle) { super(h, handle); }
    protected UsercentricsTCFVendor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConsent:features:flexiblePurposes:id:legitimateInterestConsent:legitimateInterestPurposes:name:policyUrl:purposes:restrictions:specialFeatures:specialPurposes:showConsentToggle:showLegitimateInterestToggle:cookieMaxAgeSeconds:usesNonCookieAccess:deviceStorageDisclosureUrl:usesCookies:cookieRefresh:dataSharedOutsideEU:dataRetention:dataCategories:vendorUrls:")
    public UsercentricsTCFVendor(UsercentricsBoolean consent, NSArray<UsercentricsIdAndName> features, NSArray<UsercentricsIdAndName> flexiblePurposes, int id, UsercentricsBoolean legitimateInterestConsent, NSArray<UsercentricsIdAndName> legitimateInterestPurposes, String name, String policyUrl, NSArray<UsercentricsIdAndName> purposes, NSArray<UsercentricsTCFVendorRestriction> restrictions, NSArray<UsercentricsIdAndName> specialFeatures, NSArray<UsercentricsIdAndName> specialPurposes, boolean showConsentToggle, boolean showLegitimateInterestToggle, UsercentricsDouble cookieMaxAgeSeconds, boolean usesNonCookieAccess, String deviceStorageDisclosureUrl, boolean usesCookies, UsercentricsBoolean cookieRefresh, UsercentricsBoolean dataSharedOutsideEU, UsercentricsDataRetention dataRetention, NSArray<UsercentricsIdAndName> dataCategories, NSArray<UsercentricsVendorUrl> vendorUrls) { super((SkipInit) null); initObject(init(consent, features, flexiblePurposes, id, legitimateInterestConsent, legitimateInterestPurposes, name, policyUrl, purposes, restrictions, specialFeatures, specialPurposes, showConsentToggle, showLegitimateInterestToggle, cookieMaxAgeSeconds, usesNonCookieAccess, deviceStorageDisclosureUrl, usesCookies, cookieRefresh, dataSharedOutsideEU, dataRetention, dataCategories, vendorUrls)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "consent")
    public native UsercentricsBoolean getConsent();
    @Property(selector = "cookieMaxAgeSeconds")
    public native UsercentricsDouble getCookieMaxAgeSeconds();
    @Property(selector = "cookieRefresh")
    public native UsercentricsBoolean getCookieRefresh();
    @Property(selector = "dataCategories")
    public native NSArray<UsercentricsIdAndName> getDataCategories();
    @Property(selector = "dataRetention")
    public native UsercentricsDataRetention getDataRetention();
    @Property(selector = "dataSharedOutsideEU")
    public native UsercentricsBoolean getDataSharedOutsideEU();
    @Property(selector = "deviceStorageDisclosureUrl")
    public native String getDeviceStorageDisclosureUrl();
    @Property(selector = "features")
    public native NSArray<UsercentricsIdAndName> getFeatures();
    @Property(selector = "flexiblePurposes")
    public native NSArray<UsercentricsIdAndName> getFlexiblePurposes();
    @Property(selector = "id")
    public native int getId();
    @Property(selector = "legitimateInterestConsent")
    public native UsercentricsBoolean getLegitimateInterestConsent();
    @Property(selector = "legitimateInterestPurposes")
    public native NSArray<UsercentricsIdAndName> getLegitimateInterestPurposes();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "policyUrl")
    public native String getPolicyUrl();
    @Property(selector = "purposes")
    public native NSArray<UsercentricsIdAndName> getPurposes();
    @Property(selector = "restrictions")
    public native NSArray<UsercentricsTCFVendorRestriction> getRestrictions();
    @Property(selector = "showConsentToggle")
    public native boolean isShowConsentToggle();
    @Property(selector = "showLegitimateInterestToggle")
    public native boolean isShowLegitimateInterestToggle();
    @Property(selector = "specialFeatures")
    public native NSArray<UsercentricsIdAndName> getSpecialFeatures();
    @Property(selector = "specialPurposes")
    public native NSArray<UsercentricsIdAndName> getSpecialPurposes();
    @Property(selector = "usesCookies")
    public native boolean usesCookies();
    @Property(selector = "usesNonCookieAccess")
    public native boolean usesNonCookieAccess();
    @Property(selector = "vendorUrls")
    public native NSArray<UsercentricsVendorUrl> getVendorUrls();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithConsent:features:flexiblePurposes:id:legitimateInterestConsent:legitimateInterestPurposes:name:policyUrl:purposes:restrictions:specialFeatures:specialPurposes:showConsentToggle:showLegitimateInterestToggle:cookieMaxAgeSeconds:usesNonCookieAccess:deviceStorageDisclosureUrl:usesCookies:cookieRefresh:dataSharedOutsideEU:dataRetention:dataCategories:vendorUrls:")
    protected native @Pointer long init(UsercentricsBoolean consent, NSArray<UsercentricsIdAndName> features, NSArray<UsercentricsIdAndName> flexiblePurposes, int id, UsercentricsBoolean legitimateInterestConsent, NSArray<UsercentricsIdAndName> legitimateInterestPurposes, String name, String policyUrl, NSArray<UsercentricsIdAndName> purposes, NSArray<UsercentricsTCFVendorRestriction> restrictions, NSArray<UsercentricsIdAndName> specialFeatures, NSArray<UsercentricsIdAndName> specialPurposes, boolean showConsentToggle, boolean showLegitimateInterestToggle, UsercentricsDouble cookieMaxAgeSeconds, boolean usesNonCookieAccess, String deviceStorageDisclosureUrl, boolean usesCookies, UsercentricsBoolean cookieRefresh, UsercentricsBoolean dataSharedOutsideEU, UsercentricsDataRetention dataRetention, NSArray<UsercentricsIdAndName> dataCategories, NSArray<UsercentricsVendorUrl> vendorUrls);
    @Method(selector = "doCopyConsent:features:flexiblePurposes:id:legitimateInterestConsent:legitimateInterestPurposes:name:policyUrl:purposes:restrictions:specialFeatures:specialPurposes:showConsentToggle:showLegitimateInterestToggle:cookieMaxAgeSeconds:usesNonCookieAccess:deviceStorageDisclosureUrl:usesCookies:cookieRefresh:dataSharedOutsideEU:dataRetention:dataCategories:vendorUrls:")
    public native UsercentricsTCFVendor doCopy(UsercentricsBoolean consent, NSArray<UsercentricsIdAndName> features, NSArray<UsercentricsIdAndName> flexiblePurposes, int id, UsercentricsBoolean legitimateInterestConsent, NSArray<UsercentricsIdAndName> legitimateInterestPurposes, String name, String policyUrl, NSArray<UsercentricsIdAndName> purposes, NSArray<UsercentricsTCFVendorRestriction> restrictions, NSArray<UsercentricsIdAndName> specialFeatures, NSArray<UsercentricsIdAndName> specialPurposes, boolean showConsentToggle, boolean showLegitimateInterestToggle, UsercentricsDouble cookieMaxAgeSeconds, boolean usesNonCookieAccess, String deviceStorageDisclosureUrl, boolean usesCookies, UsercentricsBoolean cookieRefresh, UsercentricsBoolean dataSharedOutsideEU, UsercentricsDataRetention dataRetention, NSArray<UsercentricsIdAndName> dataCategories, NSArray<UsercentricsVendorUrl> vendorUrls);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
