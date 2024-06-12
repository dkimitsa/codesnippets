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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UsercentricsUsercentricsSettings")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsSettings/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsSettingsPtr extends Ptr<UsercentricsSettings, UsercentricsSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsSettings() {}
    protected UsercentricsSettings(Handle h, long handle) { super(h, handle); }
    protected UsercentricsSettings(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLabels:secondLayer:version:language:imprintUrl:privacyPolicyUrl:cookiePolicyUrl:firstLayerDescriptionHtml:firstLayerMobileDescriptionHtml:settingsId:bannerMobileDescriptionIsActive:enablePoweredBy:displayOnlyForEU:tcf2Enabled:reshowBanner:editableLanguages:languagesAvailable:showInitialViewForVersionChange:ccpa:tcf2:customization:firstLayer:styles:interactionAnalytics:consentAnalytics:consentXDevice:variants:dpsDisplayFormat:framework:publishedApps:consentTemplates:categories:")
    public UsercentricsSettings(UsercentricsLabels labels, UsercentricsSecondLayer secondLayer, String version, String language, String imprintUrl, String privacyPolicyUrl, String cookiePolicyUrl, String firstLayerDescriptionHtml, String firstLayerMobileDescriptionHtml, String settingsId, boolean bannerMobileDescriptionIsActive, boolean enablePoweredBy, boolean displayOnlyForEU, boolean tcf2Enabled, UsercentricsInt reshowBanner, NSArray<NSString> editableLanguages, NSArray<NSString> languagesAvailable, NSArray<NSString> showInitialViewForVersionChange, UsercentricsCCPASettings ccpa, UsercentricsTCF2Settings tcf2, UsercentricsCustomization customization, UsercentricsFirstLayer firstLayer, UsercentricsStyles styles, boolean interactionAnalytics, boolean consentAnalytics, boolean consentXDevice, UsercentricsVariantsSettings variants, UsercentricsDpsDisplayFormat dpsDisplayFormat, UsercentricsUSAFrameworks framework, NSArray<UsercentricsPublishedApp> publishedApps, NSArray<UsercentricsServiceConsentTemplate> consentTemplates, NSArray<UsercentricsCategory> categories) { super((SkipInit) null); initObject(init(labels, secondLayer, version, language, imprintUrl, privacyPolicyUrl, cookiePolicyUrl, firstLayerDescriptionHtml, firstLayerMobileDescriptionHtml, settingsId, bannerMobileDescriptionIsActive, enablePoweredBy, displayOnlyForEU, tcf2Enabled, reshowBanner, editableLanguages, languagesAvailable, showInitialViewForVersionChange, ccpa, tcf2, customization, firstLayer, styles, interactionAnalytics, consentAnalytics, consentXDevice, variants, dpsDisplayFormat, framework, publishedApps, consentTemplates, categories)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bannerMobileDescriptionIsActive")
    public native boolean isBannerMobileDescriptionIsActive();
    @Property(selector = "ccpa")
    public native UsercentricsCCPASettings getCcpa();
    @Property(selector = "consentAnalytics")
    public native boolean isConsentAnalytics();
    @Property(selector = "consentXDevice")
    public native boolean isConsentXDevice();
    @Property(selector = "cookiePolicyUrl")
    public native String getCookiePolicyUrl();
    @Property(selector = "customization")
    public native UsercentricsCustomization getCustomization();
    @Property(selector = "displayOnlyForEU")
    public native boolean isDisplayOnlyForEU();
    @Property(selector = "dpsDisplayFormat")
    public native UsercentricsDpsDisplayFormat getDpsDisplayFormat();
    @Property(selector = "editableLanguages")
    public native NSArray<NSString> getEditableLanguages();
    @Property(selector = "enablePoweredBy")
    public native boolean isEnablePoweredBy();
    @Property(selector = "firstLayer")
    public native UsercentricsFirstLayer getFirstLayer();
    @Property(selector = "firstLayerDescriptionHtml")
    public native String getFirstLayerDescriptionHtml();
    @Property(selector = "firstLayerMobileDescriptionHtml")
    public native String getFirstLayerMobileDescriptionHtml();
    @Property(selector = "framework")
    public native UsercentricsUSAFrameworks getFramework();
    @Property(selector = "imprintUrl")
    public native String getImprintUrl();
    @Property(selector = "interactionAnalytics")
    public native boolean isInteractionAnalytics();
    @Property(selector = "labels")
    public native UsercentricsLabels getLabels();
    @Property(selector = "language")
    public native String getLanguage();
    @Property(selector = "languagesAvailable")
    public native NSArray<NSString> getLanguagesAvailable();
    @Property(selector = "privacyPolicyUrl")
    public native String getPrivacyPolicyUrl();
    @Property(selector = "publishedApps")
    public native NSArray<UsercentricsPublishedApp> getPublishedApps();
    @Property(selector = "reshowBanner")
    public native UsercentricsInt getReshowBanner();
    @Property(selector = "secondLayer")
    public native UsercentricsSecondLayer getSecondLayer();
    @Property(selector = "settingsId")
    public native String getSettingsId();
    @Property(selector = "showInitialViewForVersionChange")
    public native NSArray<NSString> getShowInitialViewForVersionChange();
    @Property(selector = "styles")
    public native UsercentricsStyles getStyles();
    @Property(selector = "tcf2")
    public native UsercentricsTCF2Settings getTcf2();
    @Property(selector = "tcf2Enabled")
    public native boolean isTcf2Enabled();
    @Property(selector = "variants")
    public native UsercentricsVariantsSettings getVariants();
    @Property(selector = "version")
    public native String getVersion();
    @Property(selector = "firstLayerDescription")
    public native NSAttributedString getFirstLayerDescription();
    @Property(selector = "firstLayerMobileDescription")
    public native NSAttributedString getFirstLayerMobileDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLabels:secondLayer:version:language:imprintUrl:privacyPolicyUrl:cookiePolicyUrl:firstLayerDescriptionHtml:firstLayerMobileDescriptionHtml:settingsId:bannerMobileDescriptionIsActive:enablePoweredBy:displayOnlyForEU:tcf2Enabled:reshowBanner:editableLanguages:languagesAvailable:showInitialViewForVersionChange:ccpa:tcf2:customization:firstLayer:styles:interactionAnalytics:consentAnalytics:consentXDevice:variants:dpsDisplayFormat:framework:publishedApps:consentTemplates:categories:")
    protected native @Pointer long init(UsercentricsLabels labels, UsercentricsSecondLayer secondLayer, String version, String language, String imprintUrl, String privacyPolicyUrl, String cookiePolicyUrl, String firstLayerDescriptionHtml, String firstLayerMobileDescriptionHtml, String settingsId, boolean bannerMobileDescriptionIsActive, boolean enablePoweredBy, boolean displayOnlyForEU, boolean tcf2Enabled, UsercentricsInt reshowBanner, NSArray<NSString> editableLanguages, NSArray<NSString> languagesAvailable, NSArray<NSString> showInitialViewForVersionChange, UsercentricsCCPASettings ccpa, UsercentricsTCF2Settings tcf2, UsercentricsCustomization customization, UsercentricsFirstLayer firstLayer, UsercentricsStyles styles, boolean interactionAnalytics, boolean consentAnalytics, boolean consentXDevice, UsercentricsVariantsSettings variants, UsercentricsDpsDisplayFormat dpsDisplayFormat, UsercentricsUSAFrameworks framework, NSArray<UsercentricsPublishedApp> publishedApps, NSArray<UsercentricsServiceConsentTemplate> consentTemplates, NSArray<UsercentricsCategory> categories);
    @Method(selector = "doCopyLabels:secondLayer:version:language:imprintUrl:privacyPolicyUrl:cookiePolicyUrl:firstLayerDescriptionHtml:firstLayerMobileDescriptionHtml:settingsId:bannerMobileDescriptionIsActive:enablePoweredBy:displayOnlyForEU:tcf2Enabled:reshowBanner:editableLanguages:languagesAvailable:showInitialViewForVersionChange:ccpa:tcf2:customization:firstLayer:styles:interactionAnalytics:consentAnalytics:consentXDevice:variants:dpsDisplayFormat:framework:publishedApps:consentTemplates:categories:")
    public native UsercentricsSettings doCopy(UsercentricsLabels labels, UsercentricsSecondLayer secondLayer, String version, String language, String imprintUrl, String privacyPolicyUrl, String cookiePolicyUrl, String firstLayerDescriptionHtml, String firstLayerMobileDescriptionHtml, String settingsId, boolean bannerMobileDescriptionIsActive, boolean enablePoweredBy, boolean displayOnlyForEU, boolean tcf2Enabled, UsercentricsInt reshowBanner, NSArray<NSString> editableLanguages, NSArray<NSString> languagesAvailable, NSArray<NSString> showInitialViewForVersionChange, UsercentricsCCPASettings ccpa, UsercentricsTCF2Settings tcf2, UsercentricsCustomization customization, UsercentricsFirstLayer firstLayer, UsercentricsStyles styles, boolean interactionAnalytics, boolean consentAnalytics, boolean consentXDevice, UsercentricsVariantsSettings variants, UsercentricsDpsDisplayFormat dpsDisplayFormat, UsercentricsUSAFrameworks framework, NSArray<UsercentricsPublishedApp> publishedApps, NSArray<UsercentricsServiceConsentTemplate> consentTemplates, NSArray<UsercentricsCategory> categories);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
