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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UsercentricsUsercentricsService")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsService/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsServicePtr extends Ptr<UsercentricsService, UsercentricsServicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsService.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsService() {}
    protected UsercentricsService(Handle h, long handle) { super(h, handle); }
    protected UsercentricsService(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTemplateId:version:type:adminSettingsId:dataProcessor:dataPurposes:processingCompany:nameOfProcessingCompany:addressOfProcessingCompany:descriptionOfService:technologyUsed:languagesAvailable:dataCollectedList:dataPurposesList:dataRecipientsList:legalBasisList:retentionPeriodList:subConsents:language:createdBy:updatedBy:isLatest:linkToDpa:legalGround:optOutUrl:policyOfProcessorUrl:categorySlug:recordsOfProcessingActivities:retentionPeriodDescription:dataProtectionOfficer:privacyPolicyURL:cookiePolicyURL:locationOfProcessing:dataCollectedDescription:thirdCountryTransfer:description:cookieMaxAgeSeconds:usesNonCookieAccess:deviceStorageDisclosureUrl:deviceStorage:dpsDisplayFormat:isHidden:framework:isDeactivated:isAutoUpdateAllowed:disableLegalBasis:isEssential:")
    public UsercentricsService(String templateId, String version, String type, NSArray<NSString> adminSettingsId, String dataProcessor, NSArray<NSString> dataPurposes, String processingCompany, String nameOfProcessingCompany, String addressOfProcessingCompany, String descriptionOfService, NSArray<NSString> technologyUsed, NSArray<NSString> languagesAvailable, NSArray<NSString> dataCollectedList, NSArray<NSString> dataPurposesList, NSArray<NSString> dataRecipientsList, NSArray<NSString> legalBasisList, NSArray<NSString> retentionPeriodList, NSArray<NSString> subConsents, String language, String createdBy, String updatedBy, UsercentricsBoolean isLatest, String linkToDpa, String legalGround, String optOutUrl, String policyOfProcessorUrl, String categorySlug, String recordsOfProcessingActivities, String retentionPeriodDescription, String dataProtectionOfficer, String privacyPolicyURL, String cookiePolicyURL, String locationOfProcessing, String dataCollectedDescription, String thirdCountryTransfer, String description, UsercentricsLong cookieMaxAgeSeconds, UsercentricsBoolean usesNonCookieAccess, String deviceStorageDisclosureUrl, UsercentricsConsentDisclosureObject deviceStorage, String dpsDisplayFormat, boolean isHidden, String framework, UsercentricsBoolean isDeactivated, UsercentricsBoolean isAutoUpdateAllowed, UsercentricsBoolean disableLegalBasis, boolean isEssential) { super((SkipInit) null); initObject(init(templateId, version, type, adminSettingsId, dataProcessor, dataPurposes, processingCompany, nameOfProcessingCompany, addressOfProcessingCompany, descriptionOfService, technologyUsed, languagesAvailable, dataCollectedList, dataPurposesList, dataRecipientsList, legalBasisList, retentionPeriodList, subConsents, language, createdBy, updatedBy, isLatest, linkToDpa, legalGround, optOutUrl, policyOfProcessorUrl, categorySlug, recordsOfProcessingActivities, retentionPeriodDescription, dataProtectionOfficer, privacyPolicyURL, cookiePolicyURL, locationOfProcessing, dataCollectedDescription, thirdCountryTransfer, description, cookieMaxAgeSeconds, usesNonCookieAccess, deviceStorageDisclosureUrl, deviceStorage, dpsDisplayFormat, isHidden, framework, isDeactivated, isAutoUpdateAllowed, disableLegalBasis, isEssential)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "addressOfProcessingCompany")
    public native String getAddressOfProcessingCompany();
    @Property(selector = "adminSettingsId")
    public native NSArray<NSString> getAdminSettingsId();
    @Property(selector = "categorySlug")
    public native String getCategorySlug();
    @Property(selector = "cookieMaxAgeSeconds")
    public native UsercentricsLong getCookieMaxAgeSeconds();
    @Property(selector = "cookiePolicyURL")
    public native String getCookiePolicyURL();
    @Property(selector = "createdBy")
    public native String getCreatedBy();
    @Property(selector = "dataCollectedDescription")
    public native String getDataCollectedDescription();
    @Property(selector = "dataCollectedList")
    public native NSArray<NSString> getDataCollectedList();
    @Property(selector = "dataProcessor")
    public native String getDataProcessor();
    @Property(selector = "dataProtectionOfficer")
    public native String getDataProtectionOfficer();
    @Property(selector = "dataPurposes")
    public native NSArray<NSString> getDataPurposes();
    @Property(selector = "dataPurposesList")
    public native NSArray<NSString> getDataPurposesList();
    @Property(selector = "dataRecipientsList")
    public native NSArray<NSString> getDataRecipientsList();
    @Property(selector = "description_")
    public native String getDescription_();
    @Property(selector = "descriptionOfService")
    public native String getDescriptionOfService();
    @Property(selector = "deviceStorage")
    public native UsercentricsConsentDisclosureObject getDeviceStorage();
    @Property(selector = "deviceStorageDisclosureUrl")
    public native String getDeviceStorageDisclosureUrl();
    @Property(selector = "disableLegalBasis")
    public native UsercentricsBoolean getDisableLegalBasis();
    @Property(selector = "dpsDisplayFormat")
    public native String getDpsDisplayFormat();
    @Property(selector = "framework")
    public native String getFramework();
    @Property(selector = "isAutoUpdateAllowed")
    public native UsercentricsBoolean getIsAutoUpdateAllowed();
    @Property(selector = "isDeactivated")
    public native UsercentricsBoolean getIsDeactivated();
    @Property(selector = "isEssential")
    public native boolean isEssential();
    @Property(selector = "isHidden")
    public native boolean isHidden();
    @Property(selector = "isLatest")
    public native UsercentricsBoolean getIsLatest();
    @Property(selector = "language")
    public native String getLanguage();
    @Property(selector = "languagesAvailable")
    public native NSArray<NSString> getLanguagesAvailable();
    @Property(selector = "legalBasisList")
    public native NSArray<NSString> getLegalBasisList();
    @Property(selector = "legalGround")
    public native String getLegalGround();
    @Property(selector = "linkToDpa")
    public native String getLinkToDpa();
    @Property(selector = "locationOfProcessing")
    public native String getLocationOfProcessing();
    @Property(selector = "nameOfProcessingCompany")
    public native String getNameOfProcessingCompany();
    @Property(selector = "optOutUrl")
    public native String getOptOutUrl();
    @Property(selector = "policyOfProcessorUrl")
    public native String getPolicyOfProcessorUrl();
    @Property(selector = "privacyPolicyURL")
    public native String getPrivacyPolicyURL();
    @Property(selector = "processingCompany")
    public native String getProcessingCompany();
    @Property(selector = "recordsOfProcessingActivities")
    public native String getRecordsOfProcessingActivities();
    @Property(selector = "retentionPeriodDescription")
    public native String getRetentionPeriodDescription();
    @Property(selector = "retentionPeriodList")
    public native NSArray<NSString> getRetentionPeriodList();
    @Property(selector = "subConsents")
    public native NSArray<NSString> getSubConsents();
    @Property(selector = "technologyUsed")
    public native NSArray<NSString> getTechnologyUsed();
    @Property(selector = "templateId")
    public native String getTemplateId();
    @Property(selector = "thirdCountryTransfer")
    public native String getThirdCountryTransfer();
    @Property(selector = "type")
    public native String getType();
    @Property(selector = "updatedBy")
    public native String getUpdatedBy();
    @Property(selector = "usesNonCookieAccess")
    public native UsercentricsBoolean getUsesNonCookieAccess();
    @Property(selector = "version")
    public native String getVersion();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTemplateId:version:type:adminSettingsId:dataProcessor:dataPurposes:processingCompany:nameOfProcessingCompany:addressOfProcessingCompany:descriptionOfService:technologyUsed:languagesAvailable:dataCollectedList:dataPurposesList:dataRecipientsList:legalBasisList:retentionPeriodList:subConsents:language:createdBy:updatedBy:isLatest:linkToDpa:legalGround:optOutUrl:policyOfProcessorUrl:categorySlug:recordsOfProcessingActivities:retentionPeriodDescription:dataProtectionOfficer:privacyPolicyURL:cookiePolicyURL:locationOfProcessing:dataCollectedDescription:thirdCountryTransfer:description:cookieMaxAgeSeconds:usesNonCookieAccess:deviceStorageDisclosureUrl:deviceStorage:dpsDisplayFormat:isHidden:framework:isDeactivated:isAutoUpdateAllowed:disableLegalBasis:isEssential:")
    protected native @Pointer long init(String templateId, String version, String type, NSArray<NSString> adminSettingsId, String dataProcessor, NSArray<NSString> dataPurposes, String processingCompany, String nameOfProcessingCompany, String addressOfProcessingCompany, String descriptionOfService, NSArray<NSString> technologyUsed, NSArray<NSString> languagesAvailable, NSArray<NSString> dataCollectedList, NSArray<NSString> dataPurposesList, NSArray<NSString> dataRecipientsList, NSArray<NSString> legalBasisList, NSArray<NSString> retentionPeriodList, NSArray<NSString> subConsents, String language, String createdBy, String updatedBy, UsercentricsBoolean isLatest, String linkToDpa, String legalGround, String optOutUrl, String policyOfProcessorUrl, String categorySlug, String recordsOfProcessingActivities, String retentionPeriodDescription, String dataProtectionOfficer, String privacyPolicyURL, String cookiePolicyURL, String locationOfProcessing, String dataCollectedDescription, String thirdCountryTransfer, String description, UsercentricsLong cookieMaxAgeSeconds, UsercentricsBoolean usesNonCookieAccess, String deviceStorageDisclosureUrl, UsercentricsConsentDisclosureObject deviceStorage, String dpsDisplayFormat, boolean isHidden, String framework, UsercentricsBoolean isDeactivated, UsercentricsBoolean isAutoUpdateAllowed, UsercentricsBoolean disableLegalBasis, boolean isEssential);
    @Method(selector = "doCopyTemplateId:version:type:adminSettingsId:dataProcessor:dataPurposes:processingCompany:nameOfProcessingCompany:addressOfProcessingCompany:descriptionOfService:technologyUsed:languagesAvailable:dataCollectedList:dataPurposesList:dataRecipientsList:legalBasisList:retentionPeriodList:subConsents:language:createdBy:updatedBy:isLatest:linkToDpa:legalGround:optOutUrl:policyOfProcessorUrl:categorySlug:recordsOfProcessingActivities:retentionPeriodDescription:dataProtectionOfficer:privacyPolicyURL:cookiePolicyURL:locationOfProcessing:dataCollectedDescription:thirdCountryTransfer:description:cookieMaxAgeSeconds:usesNonCookieAccess:deviceStorageDisclosureUrl:deviceStorage:dpsDisplayFormat:isHidden:framework:isDeactivated:isAutoUpdateAllowed:disableLegalBasis:isEssential:")
    public native UsercentricsService doCopy(String templateId, String version, String type, NSArray<NSString> adminSettingsId, String dataProcessor, NSArray<NSString> dataPurposes, String processingCompany, String nameOfProcessingCompany, String addressOfProcessingCompany, String descriptionOfService, NSArray<NSString> technologyUsed, NSArray<NSString> languagesAvailable, NSArray<NSString> dataCollectedList, NSArray<NSString> dataPurposesList, NSArray<NSString> dataRecipientsList, NSArray<NSString> legalBasisList, NSArray<NSString> retentionPeriodList, NSArray<NSString> subConsents, String language, String createdBy, String updatedBy, UsercentricsBoolean isLatest, String linkToDpa, String legalGround, String optOutUrl, String policyOfProcessorUrl, String categorySlug, String recordsOfProcessingActivities, String retentionPeriodDescription, String dataProtectionOfficer, String privacyPolicyURL, String cookiePolicyURL, String locationOfProcessing, String dataCollectedDescription, String thirdCountryTransfer, String description, UsercentricsLong cookieMaxAgeSeconds, UsercentricsBoolean usesNonCookieAccess, String deviceStorageDisclosureUrl, UsercentricsConsentDisclosureObject deviceStorage, String dpsDisplayFormat, boolean isHidden, String framework, UsercentricsBoolean isDeactivated, UsercentricsBoolean isAutoUpdateAllowed, UsercentricsBoolean disableLegalBasis, boolean isEssential);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
