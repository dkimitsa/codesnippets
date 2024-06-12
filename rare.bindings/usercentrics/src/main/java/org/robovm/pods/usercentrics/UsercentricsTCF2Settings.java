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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsTCF2Settings/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsTCF2SettingsPtr extends Ptr<UsercentricsTCF2Settings, UsercentricsTCF2SettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsTCF2Settings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsTCF2Settings() {}
    protected UsercentricsTCF2Settings(Handle h, long handle) { super(h, handle); }
    protected UsercentricsTCF2Settings(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFirstLayerTitle:secondLayerTitle:tabsPurposeLabel:tabsVendorsLabel:labelsFeatures:labelsIabVendors:labelsNonIabPurposes:labelsNonIabVendors:labelsPurposes:vendorFeatures:vendorLegitimateInterestPurposes:vendorPurpose:vendorSpecialFeatures:vendorSpecialPurposes:togglesConsentToggleLabel:togglesLegIntToggleLabel:buttonsAcceptAllLabel:buttonsDenyAllLabel:buttonsSaveLabel:linksManageSettingsLabel:linksVendorListLinkLabel:togglesSpecialFeaturesToggleOn:togglesSpecialFeaturesToggleOff:firstLayerMobileVariant:firstLayerHideToggles:secondLayerHideToggles:hideLegitimateInterestToggles:categoriesOfDataLabel:dataRetentionPeriodLabel:legitimateInterestLabel:version:examplesLabel:cmpId:cmpVersion:showDataSharedOutsideEUText:dataSharedOutsideEUText:vendorIdsOutsideEUList:firstLayerHideButtonDeny:secondLayerHideButtonDeny:publisherCountryCode:purposeOneTreatment:selectedVendorIds:gdprApplies:selectedStacks:scope:disabledSpecialFeatures:firstLayerShowDescriptions:hideNonIabOnFirstLayer:resurfacePeriodEnded:resurfacePurposeChanged:resurfaceVendorAdded:firstLayerDescription:firstLayerAdditionalInfo:secondLayerDescription:appLayerNoteResurface:firstLayerNoteResurface:changedPurposes:acmV2Enabled:selectedATPIds:resurfaceATPListChanged:")
    public UsercentricsTCF2Settings(String firstLayerTitle, String secondLayerTitle, String tabsPurposeLabel, String tabsVendorsLabel, String labelsFeatures, String labelsIabVendors, String labelsNonIabPurposes, String labelsNonIabVendors, String labelsPurposes, String vendorFeatures, String vendorLegitimateInterestPurposes, String vendorPurpose, String vendorSpecialFeatures, String vendorSpecialPurposes, String togglesConsentToggleLabel, String togglesLegIntToggleLabel, String buttonsAcceptAllLabel, String buttonsDenyAllLabel, String buttonsSaveLabel, String linksManageSettingsLabel, String linksVendorListLinkLabel, String togglesSpecialFeaturesToggleOn, String togglesSpecialFeaturesToggleOff, UsercentricsFirstLayerMobileVariant firstLayerMobileVariant, boolean firstLayerHideToggles, boolean secondLayerHideToggles, boolean hideLegitimateInterestToggles, String categoriesOfDataLabel, String dataRetentionPeriodLabel, String legitimateInterestLabel, String version, String examplesLabel, int cmpId, int cmpVersion, boolean showDataSharedOutsideEUText, String dataSharedOutsideEUText, NSArray<UsercentricsInt> vendorIdsOutsideEUList, UsercentricsBoolean firstLayerHideButtonDeny, boolean secondLayerHideButtonDeny, String publisherCountryCode, boolean purposeOneTreatment, NSArray<UsercentricsInt> selectedVendorIds, boolean gdprApplies, NSArray<UsercentricsInt> selectedStacks, UsercentricsTCF2Scope scope, NSArray<UsercentricsInt> disabledSpecialFeatures, boolean firstLayerShowDescriptions, boolean hideNonIabOnFirstLayer, boolean resurfacePeriodEnded, boolean resurfacePurposeChanged, boolean resurfaceVendorAdded, String firstLayerDescription, String firstLayerAdditionalInfo, String secondLayerDescription, String appLayerNoteResurface, String firstLayerNoteResurface, UsercentricsTCF2ChangedPurposes changedPurposes, boolean acmV2Enabled, NSArray<UsercentricsInt> selectedATPIds, boolean resurfaceATPListChanged) { super((SkipInit) null); initObject(init(firstLayerTitle, secondLayerTitle, tabsPurposeLabel, tabsVendorsLabel, labelsFeatures, labelsIabVendors, labelsNonIabPurposes, labelsNonIabVendors, labelsPurposes, vendorFeatures, vendorLegitimateInterestPurposes, vendorPurpose, vendorSpecialFeatures, vendorSpecialPurposes, togglesConsentToggleLabel, togglesLegIntToggleLabel, buttonsAcceptAllLabel, buttonsDenyAllLabel, buttonsSaveLabel, linksManageSettingsLabel, linksVendorListLinkLabel, togglesSpecialFeaturesToggleOn, togglesSpecialFeaturesToggleOff, firstLayerMobileVariant, firstLayerHideToggles, secondLayerHideToggles, hideLegitimateInterestToggles, categoriesOfDataLabel, dataRetentionPeriodLabel, legitimateInterestLabel, version, examplesLabel, cmpId, cmpVersion, showDataSharedOutsideEUText, dataSharedOutsideEUText, vendorIdsOutsideEUList, firstLayerHideButtonDeny, secondLayerHideButtonDeny, publisherCountryCode, purposeOneTreatment, selectedVendorIds, gdprApplies, selectedStacks, scope, disabledSpecialFeatures, firstLayerShowDescriptions, hideNonIabOnFirstLayer, resurfacePeriodEnded, resurfacePurposeChanged, resurfaceVendorAdded, firstLayerDescription, firstLayerAdditionalInfo, secondLayerDescription, appLayerNoteResurface, firstLayerNoteResurface, changedPurposes, acmV2Enabled, selectedATPIds, resurfaceATPListChanged)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "acmV2Enabled")
    public native boolean isAcmV2Enabled();
    @Property(selector = "appLayerNoteResurface")
    public native String getAppLayerNoteResurface();
    @Property(selector = "buttonsAcceptAllLabel")
    public native String getButtonsAcceptAllLabel();
    @Property(selector = "buttonsDenyAllLabel")
    public native String getButtonsDenyAllLabel();
    @Property(selector = "buttonsSaveLabel")
    public native String getButtonsSaveLabel();
    @Property(selector = "categoriesOfDataLabel")
    public native String getCategoriesOfDataLabel();
    @Property(selector = "changedPurposes")
    public native UsercentricsTCF2ChangedPurposes getChangedPurposes();
    @Property(selector = "cmpId")
    public native int getCmpId();
    @Property(selector = "cmpVersion")
    public native int getCmpVersion();
    @Property(selector = "dataRetentionPeriodLabel")
    public native String getDataRetentionPeriodLabel();
    @Property(selector = "dataSharedOutsideEUText")
    public native String getDataSharedOutsideEUText();
    @Property(selector = "disabledSpecialFeatures")
    public native NSArray<UsercentricsInt> getDisabledSpecialFeatures();
    @Property(selector = "examplesLabel")
    public native String getExamplesLabel();
    @Property(selector = "firstLayerAdditionalInfo")
    public native String getFirstLayerAdditionalInfo();
    @Property(selector = "firstLayerDescription")
    public native String getFirstLayerDescription();
    @Property(selector = "firstLayerHideButtonDeny")
    public native UsercentricsBoolean getFirstLayerHideButtonDeny();
    @Property(selector = "firstLayerHideToggles")
    public native boolean isFirstLayerHideToggles();
    @Property(selector = "firstLayerMobileVariant")
    public native UsercentricsFirstLayerMobileVariant getFirstLayerMobileVariant();
    @Property(selector = "firstLayerNoteResurface")
    public native String getFirstLayerNoteResurface();
    @Property(selector = "firstLayerShowDescriptions")
    public native boolean isFirstLayerShowDescriptions();
    @Property(selector = "firstLayerTitle")
    public native String getFirstLayerTitle();
    @Property(selector = "gdprApplies")
    public native boolean isGdprApplies();
    @Property(selector = "hideLegitimateInterestToggles")
    public native boolean isHideLegitimateInterestToggles();
    @Property(selector = "hideNonIabOnFirstLayer")
    public native boolean isHideNonIabOnFirstLayer();
    @Property(selector = "isServiceSpecific")
    public native boolean isServiceSpecific();
    @Property(selector = "labelsFeatures")
    public native String getLabelsFeatures();
    @Property(selector = "labelsIabVendors")
    public native String getLabelsIabVendors();
    @Property(selector = "labelsNonIabPurposes")
    public native String getLabelsNonIabPurposes();
    @Property(selector = "labelsNonIabVendors")
    public native String getLabelsNonIabVendors();
    @Property(selector = "labelsPurposes")
    public native String getLabelsPurposes();
    @Property(selector = "legitimateInterestLabel")
    public native String getLegitimateInterestLabel();
    @Property(selector = "linksManageSettingsLabel")
    public native String getLinksManageSettingsLabel();
    @Property(selector = "linksVendorListLinkLabel")
    public native String getLinksVendorListLinkLabel();
    @Property(selector = "publisherCountryCode")
    public native String getPublisherCountryCode();
    @Property(selector = "purposeOneTreatment")
    public native boolean isPurposeOneTreatment();
    @Property(selector = "resurfaceATPListChanged")
    public native boolean isResurfaceATPListChanged();
    @Property(selector = "resurfacePeriodEnded")
    public native boolean isResurfacePeriodEnded();
    @Property(selector = "resurfacePurposeChanged")
    public native boolean isResurfacePurposeChanged();
    @Property(selector = "resurfaceVendorAdded")
    public native boolean isResurfaceVendorAdded();
    @Property(selector = "scope")
    public native UsercentricsTCF2Scope getScope();
    @Property(selector = "secondLayerDescription")
    public native String getSecondLayerDescription();
    @Property(selector = "secondLayerHideButtonDeny")
    public native boolean isSecondLayerHideButtonDeny();
    @Property(selector = "secondLayerHideToggles")
    public native boolean isSecondLayerHideToggles();
    @Property(selector = "secondLayerTitle")
    public native String getSecondLayerTitle();
    @Property(selector = "selectedATPIds")
    public native NSArray<UsercentricsInt> getSelectedATPIds();
    @Property(selector = "selectedStacks")
    public native NSArray<UsercentricsInt> getSelectedStacks();
    @Property(selector = "selectedVendorIds")
    public native NSArray<UsercentricsInt> getSelectedVendorIds();
    @Property(selector = "showDataSharedOutsideEUText")
    public native boolean isShowDataSharedOutsideEUText();
    @Property(selector = "tabsPurposeLabel")
    public native String getTabsPurposeLabel();
    @Property(selector = "tabsVendorsLabel")
    public native String getTabsVendorsLabel();
    @Property(selector = "togglesConsentToggleLabel")
    public native String getTogglesConsentToggleLabel();
    @Property(selector = "togglesLegIntToggleLabel")
    public native String getTogglesLegIntToggleLabel();
    @Property(selector = "togglesSpecialFeaturesToggleOff")
    public native String getTogglesSpecialFeaturesToggleOff();
    @Property(selector = "togglesSpecialFeaturesToggleOn")
    public native String getTogglesSpecialFeaturesToggleOn();
    @Property(selector = "useGranularChoice")
    public native boolean isUseGranularChoice();
    @Property(selector = "vendorFeatures")
    public native String getVendorFeatures();
    @Property(selector = "vendorIdsOutsideEUList")
    public native NSArray<UsercentricsInt> getVendorIdsOutsideEUList();
    @Property(selector = "vendorLegitimateInterestPurposes")
    public native String getVendorLegitimateInterestPurposes();
    @Property(selector = "vendorPurpose")
    public native String getVendorPurpose();
    @Property(selector = "vendorSpecialFeatures")
    public native String getVendorSpecialFeatures();
    @Property(selector = "vendorSpecialPurposes")
    public native String getVendorSpecialPurposes();
    @Property(selector = "version")
    public native String getVersion();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFirstLayerTitle:secondLayerTitle:tabsPurposeLabel:tabsVendorsLabel:labelsFeatures:labelsIabVendors:labelsNonIabPurposes:labelsNonIabVendors:labelsPurposes:vendorFeatures:vendorLegitimateInterestPurposes:vendorPurpose:vendorSpecialFeatures:vendorSpecialPurposes:togglesConsentToggleLabel:togglesLegIntToggleLabel:buttonsAcceptAllLabel:buttonsDenyAllLabel:buttonsSaveLabel:linksManageSettingsLabel:linksVendorListLinkLabel:togglesSpecialFeaturesToggleOn:togglesSpecialFeaturesToggleOff:firstLayerMobileVariant:firstLayerHideToggles:secondLayerHideToggles:hideLegitimateInterestToggles:categoriesOfDataLabel:dataRetentionPeriodLabel:legitimateInterestLabel:version:examplesLabel:cmpId:cmpVersion:showDataSharedOutsideEUText:dataSharedOutsideEUText:vendorIdsOutsideEUList:firstLayerHideButtonDeny:secondLayerHideButtonDeny:publisherCountryCode:purposeOneTreatment:selectedVendorIds:gdprApplies:selectedStacks:scope:disabledSpecialFeatures:firstLayerShowDescriptions:hideNonIabOnFirstLayer:resurfacePeriodEnded:resurfacePurposeChanged:resurfaceVendorAdded:firstLayerDescription:firstLayerAdditionalInfo:secondLayerDescription:appLayerNoteResurface:firstLayerNoteResurface:changedPurposes:acmV2Enabled:selectedATPIds:resurfaceATPListChanged:")
    protected native @Pointer long init(String firstLayerTitle, String secondLayerTitle, String tabsPurposeLabel, String tabsVendorsLabel, String labelsFeatures, String labelsIabVendors, String labelsNonIabPurposes, String labelsNonIabVendors, String labelsPurposes, String vendorFeatures, String vendorLegitimateInterestPurposes, String vendorPurpose, String vendorSpecialFeatures, String vendorSpecialPurposes, String togglesConsentToggleLabel, String togglesLegIntToggleLabel, String buttonsAcceptAllLabel, String buttonsDenyAllLabel, String buttonsSaveLabel, String linksManageSettingsLabel, String linksVendorListLinkLabel, String togglesSpecialFeaturesToggleOn, String togglesSpecialFeaturesToggleOff, UsercentricsFirstLayerMobileVariant firstLayerMobileVariant, boolean firstLayerHideToggles, boolean secondLayerHideToggles, boolean hideLegitimateInterestToggles, String categoriesOfDataLabel, String dataRetentionPeriodLabel, String legitimateInterestLabel, String version, String examplesLabel, int cmpId, int cmpVersion, boolean showDataSharedOutsideEUText, String dataSharedOutsideEUText, NSArray<UsercentricsInt> vendorIdsOutsideEUList, UsercentricsBoolean firstLayerHideButtonDeny, boolean secondLayerHideButtonDeny, String publisherCountryCode, boolean purposeOneTreatment, NSArray<UsercentricsInt> selectedVendorIds, boolean gdprApplies, NSArray<UsercentricsInt> selectedStacks, UsercentricsTCF2Scope scope, NSArray<UsercentricsInt> disabledSpecialFeatures, boolean firstLayerShowDescriptions, boolean hideNonIabOnFirstLayer, boolean resurfacePeriodEnded, boolean resurfacePurposeChanged, boolean resurfaceVendorAdded, String firstLayerDescription, String firstLayerAdditionalInfo, String secondLayerDescription, String appLayerNoteResurface, String firstLayerNoteResurface, UsercentricsTCF2ChangedPurposes changedPurposes, boolean acmV2Enabled, NSArray<UsercentricsInt> selectedATPIds, boolean resurfaceATPListChanged);
    @Method(selector = "doCopyFirstLayerTitle:secondLayerTitle:tabsPurposeLabel:tabsVendorsLabel:labelsFeatures:labelsIabVendors:labelsNonIabPurposes:labelsNonIabVendors:labelsPurposes:vendorFeatures:vendorLegitimateInterestPurposes:vendorPurpose:vendorSpecialFeatures:vendorSpecialPurposes:togglesConsentToggleLabel:togglesLegIntToggleLabel:buttonsAcceptAllLabel:buttonsDenyAllLabel:buttonsSaveLabel:linksManageSettingsLabel:linksVendorListLinkLabel:togglesSpecialFeaturesToggleOn:togglesSpecialFeaturesToggleOff:firstLayerMobileVariant:firstLayerHideToggles:secondLayerHideToggles:hideLegitimateInterestToggles:categoriesOfDataLabel:dataRetentionPeriodLabel:legitimateInterestLabel:version:examplesLabel:cmpId:cmpVersion:showDataSharedOutsideEUText:dataSharedOutsideEUText:vendorIdsOutsideEUList:firstLayerHideButtonDeny:secondLayerHideButtonDeny:publisherCountryCode:purposeOneTreatment:selectedVendorIds:gdprApplies:selectedStacks:scope:disabledSpecialFeatures:firstLayerShowDescriptions:hideNonIabOnFirstLayer:resurfacePeriodEnded:resurfacePurposeChanged:resurfaceVendorAdded:firstLayerDescription:firstLayerAdditionalInfo:secondLayerDescription:appLayerNoteResurface:firstLayerNoteResurface:changedPurposes:acmV2Enabled:selectedATPIds:resurfaceATPListChanged:")
    public native UsercentricsTCF2Settings doCopy(String firstLayerTitle, String secondLayerTitle, String tabsPurposeLabel, String tabsVendorsLabel, String labelsFeatures, String labelsIabVendors, String labelsNonIabPurposes, String labelsNonIabVendors, String labelsPurposes, String vendorFeatures, String vendorLegitimateInterestPurposes, String vendorPurpose, String vendorSpecialFeatures, String vendorSpecialPurposes, String togglesConsentToggleLabel, String togglesLegIntToggleLabel, String buttonsAcceptAllLabel, String buttonsDenyAllLabel, String buttonsSaveLabel, String linksManageSettingsLabel, String linksVendorListLinkLabel, String togglesSpecialFeaturesToggleOn, String togglesSpecialFeaturesToggleOff, UsercentricsFirstLayerMobileVariant firstLayerMobileVariant, boolean firstLayerHideToggles, boolean secondLayerHideToggles, boolean hideLegitimateInterestToggles, String categoriesOfDataLabel, String dataRetentionPeriodLabel, String legitimateInterestLabel, String version, String examplesLabel, int cmpId, int cmpVersion, boolean showDataSharedOutsideEUText, String dataSharedOutsideEUText, NSArray<UsercentricsInt> vendorIdsOutsideEUList, UsercentricsBoolean firstLayerHideButtonDeny, boolean secondLayerHideButtonDeny, String publisherCountryCode, boolean purposeOneTreatment, NSArray<UsercentricsInt> selectedVendorIds, boolean gdprApplies, NSArray<UsercentricsInt> selectedStacks, UsercentricsTCF2Scope scope, NSArray<UsercentricsInt> disabledSpecialFeatures, boolean firstLayerShowDescriptions, boolean hideNonIabOnFirstLayer, boolean resurfacePeriodEnded, boolean resurfacePurposeChanged, boolean resurfaceVendorAdded, String firstLayerDescription, String firstLayerAdditionalInfo, String secondLayerDescription, String appLayerNoteResurface, String firstLayerNoteResurface, UsercentricsTCF2ChangedPurposes changedPurposes, boolean acmV2Enabled, NSArray<UsercentricsInt> selectedATPIds, boolean resurfaceATPListChanged);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
