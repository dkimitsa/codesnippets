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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUIServiceDetails/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUIServiceDetailsPtr extends Ptr<UsercentricsPredefinedUIServiceDetails, UsercentricsPredefinedUIServiceDetailsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUIServiceDetails.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUIServiceDetails() {}
    protected UsercentricsPredefinedUIServiceDetails(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUIServiceDetails(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithId:mainSwitchSettings:serviceContentSection:name:dataCollected:dataDistribution:dataPurposes:dataRecipients:serviceDescription:processingCompany:retentionPeriodDescription:technologiesUsed:urls:categoryLabel:consent:storageInformationContentSection:dpsDisplayFormat:_legalBasis:disableLegalBasis:")
    public UsercentricsPredefinedUIServiceDetails(String id, UsercentricsPredefinedUISwitchSettingsUI mainSwitchSettings, NSArray<UsercentricsPredefinedUIServiceContentSection> serviceContentSection, String name, NSArray<NSString> dataCollected, UsercentricsPredefinedUIDataDistribution dataDistribution, NSArray<NSString> dataPurposes, NSArray<NSString> dataRecipients, String serviceDescription, UsercentricsPredefinedUIProcessingCompany processingCompany, String retentionPeriodDescription, NSArray<NSString> technologiesUsed, UsercentricsPredefinedUIURLs urls, String categoryLabel, UsercentricsPredefinedUIServiceConsent consent, UsercentricsPredefinedUIServiceContentSection storageInformationContentSection, UsercentricsDpsDisplayFormat dpsDisplayFormat, NSArray<NSString> _legalBasis, boolean disableLegalBasis) { super((SkipInit) null); initObject(init(id, mainSwitchSettings, serviceContentSection, name, dataCollected, dataDistribution, dataPurposes, dataRecipients, serviceDescription, processingCompany, retentionPeriodDescription, technologiesUsed, urls, categoryLabel, consent, storageInformationContentSection, dpsDisplayFormat, _legalBasis, disableLegalBasis)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "categoryLabel")
    public native String getCategoryLabel();
    @Property(selector = "consent")
    public native UsercentricsPredefinedUIServiceConsent getConsent();
    @Property(selector = "dataCollected")
    public native NSArray<NSString> getDataCollected();
    @Property(selector = "dataDistribution")
    public native UsercentricsPredefinedUIDataDistribution getDataDistribution();
    @Property(selector = "dataPurposes")
    public native NSArray<NSString> getDataPurposes();
    @Property(selector = "dataRecipients")
    public native NSArray<NSString> getDataRecipients();
    @Property(selector = "dpsDisplayFormat")
    public native UsercentricsDpsDisplayFormat getDpsDisplayFormat();
    @Property(selector = "id")
    public native String getId();
    @Property(selector = "legalBasis")
    public native NSArray<NSString> getLegalBasis();
    @Property(selector = "mainSwitchSettings")
    public native UsercentricsPredefinedUISwitchSettingsUI getMainSwitchSettings();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "processingCompany")
    public native UsercentricsPredefinedUIProcessingCompany getProcessingCompany();
    @Property(selector = "retentionPeriodDescription")
    public native String getRetentionPeriodDescription();
    @Property(selector = "serviceContentSection")
    public native NSArray<UsercentricsPredefinedUIServiceContentSection> getServiceContentSection();
    @Property(selector = "serviceDescription")
    public native String getServiceDescription();
    @Property(selector = "storageInformationContentSection")
    public native UsercentricsPredefinedUIServiceContentSection getStorageInformationContentSection();
    @Property(selector = "technologiesUsed")
    public native NSArray<NSString> getTechnologiesUsed();
    @Property(selector = "urls")
    public native UsercentricsPredefinedUIURLs getUrls();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithId:mainSwitchSettings:serviceContentSection:name:dataCollected:dataDistribution:dataPurposes:dataRecipients:serviceDescription:processingCompany:retentionPeriodDescription:technologiesUsed:urls:categoryLabel:consent:storageInformationContentSection:dpsDisplayFormat:_legalBasis:disableLegalBasis:")
    protected native @Pointer long init(String id, UsercentricsPredefinedUISwitchSettingsUI mainSwitchSettings, NSArray<UsercentricsPredefinedUIServiceContentSection> serviceContentSection, String name, NSArray<NSString> dataCollected, UsercentricsPredefinedUIDataDistribution dataDistribution, NSArray<NSString> dataPurposes, NSArray<NSString> dataRecipients, String serviceDescription, UsercentricsPredefinedUIProcessingCompany processingCompany, String retentionPeriodDescription, NSArray<NSString> technologiesUsed, UsercentricsPredefinedUIURLs urls, String categoryLabel, UsercentricsPredefinedUIServiceConsent consent, UsercentricsPredefinedUIServiceContentSection storageInformationContentSection, UsercentricsDpsDisplayFormat dpsDisplayFormat, NSArray<NSString> _legalBasis, boolean disableLegalBasis);
    @Method(selector = "doCopyId:mainSwitchSettings:serviceContentSection:name:dataCollected:dataDistribution:dataPurposes:dataRecipients:serviceDescription:processingCompany:retentionPeriodDescription:technologiesUsed:urls:categoryLabel:consent:storageInformationContentSection:dpsDisplayFormat:_legalBasis:disableLegalBasis:")
    public native UsercentricsPredefinedUIServiceDetails doCopy(String id, UsercentricsPredefinedUISwitchSettingsUI mainSwitchSettings, NSArray<UsercentricsPredefinedUIServiceContentSection> serviceContentSection, String name, NSArray<NSString> dataCollected, UsercentricsPredefinedUIDataDistribution dataDistribution, NSArray<NSString> dataPurposes, NSArray<NSString> dataRecipients, String serviceDescription, UsercentricsPredefinedUIProcessingCompany processingCompany, String retentionPeriodDescription, NSArray<NSString> technologiesUsed, UsercentricsPredefinedUIURLs urls, String categoryLabel, UsercentricsPredefinedUIServiceConsent consent, UsercentricsPredefinedUIServiceContentSection storageInformationContentSection, UsercentricsDpsDisplayFormat dpsDisplayFormat, NSArray<NSString> _legalBasis, boolean disableLegalBasis);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
