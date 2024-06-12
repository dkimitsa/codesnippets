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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UsercentricsUsercentricsLabels")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsLabels/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsLabelsPtr extends Ptr<UsercentricsLabels, UsercentricsLabelsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsLabels.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsLabels() {}
    protected UsercentricsLabels(Handle h, long handle) { super(h, handle); }
    protected UsercentricsLabels(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBtnAcceptAll:btnDeny:btnSave:firstLayerTitle:accepted:denied:date:decision:dataCollectedList:dataCollectedInfo:locationOfProcessing:transferToThirdCountries:transferToThirdCountriesInfo:dataPurposes:dataPurposesInfo:dataRecipientsList:descriptionOfService:history:historyDescription:legalBasisList:legalBasisInfo:processingCompanyTitle:retentionPeriod:technologiesUsed:technologiesUsedInfo:cookiePolicyInfo:optOut:policyOf:imprintLinkText:privacyPolicyLinkText:categories:anyDomain:day:days:domain:duration:informationLoadingNotPossible:hour:hours:identifier:maximumAgeCookieStorage:minute:minutes:month:months:multipleDomains:no:nonCookieStorage:seconds:session:loadingStorageInformation:storageInformation:detailedStorageInformation:tryAgain:type:year:years:yes:storageInformationDescription:btnBannerReadMore:btnMore:more:linkToDpaInfo:second:consent:headerModal:secondLayerDescriptionHtml:secondLayerTitle:settings:subConsents:btnAccept:poweredBy:dataProtectionOfficer:nameOfProcessingCompany:btnBack:copy:copied:basic:advanced:processingCompany:name:explicit:implicit:btnMoreInfo:furtherInformationOptOut:cookiePolicyLinkText:noImplicit:yesImplicit:addressOfProcessingCompany:consentType:consents:language:less:notAvailable:technology:view:")
    public UsercentricsLabels(String btnAcceptAll, String btnDeny, String btnSave, String firstLayerTitle, String accepted, String denied, String date, String decision, String dataCollectedList, String dataCollectedInfo, String locationOfProcessing, String transferToThirdCountries, String transferToThirdCountriesInfo, String dataPurposes, String dataPurposesInfo, String dataRecipientsList, String descriptionOfService, String history, String historyDescription, String legalBasisList, String legalBasisInfo, String processingCompanyTitle, String retentionPeriod, String technologiesUsed, String technologiesUsedInfo, String cookiePolicyInfo, String optOut, String policyOf, String imprintLinkText, String privacyPolicyLinkText, String categories, String anyDomain, String day, String days, String domain, String duration, String informationLoadingNotPossible, String hour, String hours, String identifier, String maximumAgeCookieStorage, String minute, String minutes, String month, String months, String multipleDomains, String no, String nonCookieStorage, String seconds, String session, String loadingStorageInformation, String storageInformation, String detailedStorageInformation, String tryAgain, String type, String year, String years, String yes, String storageInformationDescription, String btnBannerReadMore, String btnMore, String more, String linkToDpaInfo, String second, String consent, String headerModal, String secondLayerDescriptionHtml, String secondLayerTitle, String settings, String subConsents, String btnAccept, String poweredBy, String dataProtectionOfficer, String nameOfProcessingCompany, String btnBack, String copy, String copied, String basic, String advanced, String processingCompany, String name, String explicit_, String implicit, String btnMoreInfo, String furtherInformationOptOut, String cookiePolicyLinkText, String noImplicit, String yesImplicit, String addressOfProcessingCompany, String consentType, String consents, String language, String less, String notAvailable, String technology, String view) { super((SkipInit) null); initObject(init(btnAcceptAll, btnDeny, btnSave, firstLayerTitle, accepted, denied, date, decision, dataCollectedList, dataCollectedInfo, locationOfProcessing, transferToThirdCountries, transferToThirdCountriesInfo, dataPurposes, dataPurposesInfo, dataRecipientsList, descriptionOfService, history, historyDescription, legalBasisList, legalBasisInfo, processingCompanyTitle, retentionPeriod, technologiesUsed, technologiesUsedInfo, cookiePolicyInfo, optOut, policyOf, imprintLinkText, privacyPolicyLinkText, categories, anyDomain, day, days, domain, duration, informationLoadingNotPossible, hour, hours, identifier, maximumAgeCookieStorage, minute, minutes, month, months, multipleDomains, no, nonCookieStorage, seconds, session, loadingStorageInformation, storageInformation, detailedStorageInformation, tryAgain, type, year, years, yes, storageInformationDescription, btnBannerReadMore, btnMore, more, linkToDpaInfo, second, consent, headerModal, secondLayerDescriptionHtml, secondLayerTitle, settings, subConsents, btnAccept, poweredBy, dataProtectionOfficer, nameOfProcessingCompany, btnBack, copy, copied, basic, advanced, processingCompany, name, explicit_, implicit, btnMoreInfo, furtherInformationOptOut, cookiePolicyLinkText, noImplicit, yesImplicit, addressOfProcessingCompany, consentType, consents, language, less, notAvailable, technology, view)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "accepted")
    public native String getAccepted();
    @Property(selector = "advanced")
    public native String getAdvanced();
    @Property(selector = "anyDomain")
    public native String getAnyDomain();
    @Property(selector = "basic")
    public native String getBasic();
    @Property(selector = "btnAccept")
    public native String getBtnAccept();
    @Property(selector = "btnAcceptAll")
    public native String getBtnAcceptAll();
    @Property(selector = "btnBack")
    public native String getBtnBack();
    @Property(selector = "btnBannerReadMore")
    public native String getBtnBannerReadMore();
    @Property(selector = "btnDeny")
    public native String getBtnDeny();
    @Property(selector = "btnMore")
    public native String getBtnMore();
    @Property(selector = "btnMoreInfo")
    public native String getBtnMoreInfo();
    @Property(selector = "btnSave")
    public native String getBtnSave();
    @Property(selector = "categories")
    public native String getCategories();
    @Property(selector = "consent")
    public native String getConsent();
    @Property(selector = "cookiePolicyInfo")
    public native String getCookiePolicyInfo();
    @Property(selector = "cookiePolicyLinkText")
    public native String getCookiePolicyLinkText();
    @Property(selector = "copied")
    public native String getCopied();
    @Property(selector = "doCopy")
    public native String getCopy();
    @Property(selector = "dataCollectedInfo")
    public native String getDataCollectedInfo();
    @Property(selector = "dataCollectedList")
    public native String getDataCollectedList();
    @Property(selector = "dataProtectionOfficer")
    public native String getDataProtectionOfficer();
    @Property(selector = "dataPurposes")
    public native String getDataPurposes();
    @Property(selector = "dataPurposesInfo")
    public native String getDataPurposesInfo();
    @Property(selector = "dataRecipientsList")
    public native String getDataRecipientsList();
    @Property(selector = "date")
    public native String getDate();
    @Property(selector = "day")
    public native String getDay();
    @Property(selector = "days")
    public native String getDays();
    @Property(selector = "decision")
    public native String getDecision();
    @Property(selector = "denied")
    public native String getDenied();
    @Property(selector = "descriptionOfService")
    public native String getDescriptionOfService();
    @Property(selector = "detailedStorageInformation")
    public native String getDetailedStorageInformation();
    @Property(selector = "domain")
    public native String getDomain();
    @Property(selector = "duration")
    public native String getDuration();
    @Property(selector = "explicit")
    public native String getExplicit_();
    @Property(selector = "firstLayerTitle")
    public native String getFirstLayerTitle();
    @Property(selector = "furtherInformationOptOut")
    public native String getFurtherInformationOptOut();
    @Property(selector = "headerModal")
    public native String getHeaderModal();
    @Property(selector = "history")
    public native String getHistory();
    @Property(selector = "historyDescription")
    public native String getHistoryDescription();
    @Property(selector = "hour")
    public native String getHour();
    @Property(selector = "hours")
    public native String getHours();
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "implicit")
    public native String getImplicit();
    @Property(selector = "imprintLinkText")
    public native String getImprintLinkText();
    @Property(selector = "informationLoadingNotPossible")
    public native String getInformationLoadingNotPossible();
    @Property(selector = "legalBasisInfo")
    public native String getLegalBasisInfo();
    @Property(selector = "legalBasisList")
    public native String getLegalBasisList();
    @Property(selector = "linkToDpaInfo")
    public native String getLinkToDpaInfo();
    @Property(selector = "loadingStorageInformation")
    public native String getLoadingStorageInformation();
    @Property(selector = "locationOfProcessing")
    public native String getLocationOfProcessing();
    @Property(selector = "maximumAgeCookieStorage")
    public native String getMaximumAgeCookieStorage();
    @Property(selector = "minute")
    public native String getMinute();
    @Property(selector = "minutes")
    public native String getMinutes();
    @Property(selector = "month")
    public native String getMonth();
    @Property(selector = "months")
    public native String getMonths();
    @Property(selector = "more")
    public native String getMore();
    @Property(selector = "multipleDomains")
    public native String getMultipleDomains();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "nameOfProcessingCompany")
    public native String getNameOfProcessingCompany();
    @Property(selector = "no")
    public native String getNo();
    @Property(selector = "noImplicit")
    public native String getNoImplicit();
    @Property(selector = "nonCookieStorage")
    public native String getNonCookieStorage();
    @Property(selector = "optOut")
    public native String getOptOut();
    @Property(selector = "policyOf")
    public native String getPolicyOf();
    @Property(selector = "poweredBy")
    public native String getPoweredBy();
    @Property(selector = "privacyPolicyLinkText")
    public native String getPrivacyPolicyLinkText();
    @Property(selector = "processingCompany")
    public native String getProcessingCompany();
    @Property(selector = "processingCompanyTitle")
    public native String getProcessingCompanyTitle();
    @Property(selector = "retentionPeriod")
    public native String getRetentionPeriod();
    @Property(selector = "second")
    public native String getSecond();
    @Property(selector = "secondLayerDescriptionHtml")
    public native String getSecondLayerDescriptionHtml();
    @Property(selector = "secondLayerTitle")
    public native String getSecondLayerTitle();
    @Property(selector = "seconds")
    public native String getSeconds();
    @Property(selector = "session")
    public native String getSession();
    @Property(selector = "settings")
    public native String getSettings();
    @Property(selector = "storageInformation")
    public native String getStorageInformation();
    @Property(selector = "storageInformationDescription")
    public native String getStorageInformationDescription();
    @Property(selector = "subConsents")
    public native String getSubConsents();
    @Property(selector = "technologiesUsed")
    public native String getTechnologiesUsed();
    @Property(selector = "technologiesUsedInfo")
    public native String getTechnologiesUsedInfo();
    @Property(selector = "transferToThirdCountries")
    public native String getTransferToThirdCountries();
    @Property(selector = "transferToThirdCountriesInfo")
    public native String getTransferToThirdCountriesInfo();
    @Property(selector = "tryAgain")
    public native String getTryAgain();
    @Property(selector = "type")
    public native String getType();
    @Property(selector = "year")
    public native String getYear();
    @Property(selector = "years")
    public native String getYears();
    @Property(selector = "yes")
    public native String getYes();
    @Property(selector = "yesImplicit")
    public native String getYesImplicit();
    @Property(selector = "secondLayerDescription")
    public native NSAttributedString getSecondLayerDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBtnAcceptAll:btnDeny:btnSave:firstLayerTitle:accepted:denied:date:decision:dataCollectedList:dataCollectedInfo:locationOfProcessing:transferToThirdCountries:transferToThirdCountriesInfo:dataPurposes:dataPurposesInfo:dataRecipientsList:descriptionOfService:history:historyDescription:legalBasisList:legalBasisInfo:processingCompanyTitle:retentionPeriod:technologiesUsed:technologiesUsedInfo:cookiePolicyInfo:optOut:policyOf:imprintLinkText:privacyPolicyLinkText:categories:anyDomain:day:days:domain:duration:informationLoadingNotPossible:hour:hours:identifier:maximumAgeCookieStorage:minute:minutes:month:months:multipleDomains:no:nonCookieStorage:seconds:session:loadingStorageInformation:storageInformation:detailedStorageInformation:tryAgain:type:year:years:yes:storageInformationDescription:btnBannerReadMore:btnMore:more:linkToDpaInfo:second:consent:headerModal:secondLayerDescriptionHtml:secondLayerTitle:settings:subConsents:btnAccept:poweredBy:dataProtectionOfficer:nameOfProcessingCompany:btnBack:copy:copied:basic:advanced:processingCompany:name:explicit:implicit:btnMoreInfo:furtherInformationOptOut:cookiePolicyLinkText:noImplicit:yesImplicit:addressOfProcessingCompany:consentType:consents:language:less:notAvailable:technology:view:")
    protected native @Pointer long init(String btnAcceptAll, String btnDeny, String btnSave, String firstLayerTitle, String accepted, String denied, String date, String decision, String dataCollectedList, String dataCollectedInfo, String locationOfProcessing, String transferToThirdCountries, String transferToThirdCountriesInfo, String dataPurposes, String dataPurposesInfo, String dataRecipientsList, String descriptionOfService, String history, String historyDescription, String legalBasisList, String legalBasisInfo, String processingCompanyTitle, String retentionPeriod, String technologiesUsed, String technologiesUsedInfo, String cookiePolicyInfo, String optOut, String policyOf, String imprintLinkText, String privacyPolicyLinkText, String categories, String anyDomain, String day, String days, String domain, String duration, String informationLoadingNotPossible, String hour, String hours, String identifier, String maximumAgeCookieStorage, String minute, String minutes, String month, String months, String multipleDomains, String no, String nonCookieStorage, String seconds, String session, String loadingStorageInformation, String storageInformation, String detailedStorageInformation, String tryAgain, String type, String year, String years, String yes, String storageInformationDescription, String btnBannerReadMore, String btnMore, String more, String linkToDpaInfo, String second, String consent, String headerModal, String secondLayerDescriptionHtml, String secondLayerTitle, String settings, String subConsents, String btnAccept, String poweredBy, String dataProtectionOfficer, String nameOfProcessingCompany, String btnBack, String copy, String copied, String basic, String advanced, String processingCompany, String name, String explicit_, String implicit, String btnMoreInfo, String furtherInformationOptOut, String cookiePolicyLinkText, String noImplicit, String yesImplicit, String addressOfProcessingCompany, String consentType, String consents, String language, String less, String notAvailable, String technology, String view);
    @Method(selector = "doCopyBtnAcceptAll:btnDeny:btnSave:firstLayerTitle:accepted:denied:date:decision:dataCollectedList:dataCollectedInfo:locationOfProcessing:transferToThirdCountries:transferToThirdCountriesInfo:dataPurposes:dataPurposesInfo:dataRecipientsList:descriptionOfService:history:historyDescription:legalBasisList:legalBasisInfo:processingCompanyTitle:retentionPeriod:technologiesUsed:technologiesUsedInfo:cookiePolicyInfo:optOut:policyOf:imprintLinkText:privacyPolicyLinkText:categories:anyDomain:day:days:domain:duration:informationLoadingNotPossible:hour:hours:identifier:maximumAgeCookieStorage:minute:minutes:month:months:multipleDomains:no:nonCookieStorage:seconds:session:loadingStorageInformation:storageInformation:detailedStorageInformation:tryAgain:type:year:years:yes:storageInformationDescription:btnBannerReadMore:btnMore:more:linkToDpaInfo:second:consent:headerModal:secondLayerDescriptionHtml:secondLayerTitle:settings:subConsents:btnAccept:poweredBy:dataProtectionOfficer:nameOfProcessingCompany:btnBack:copy:copied:basic:advanced:processingCompany:name:explicit:implicit:btnMoreInfo:furtherInformationOptOut:cookiePolicyLinkText:noImplicit:yesImplicit:addressOfProcessingCompany:consentType:consents:language:less:notAvailable:technology:view:")
    public native UsercentricsLabels doCopy(String btnAcceptAll, String btnDeny, String btnSave, String firstLayerTitle, String accepted, String denied, String date, String decision, String dataCollectedList, String dataCollectedInfo, String locationOfProcessing, String transferToThirdCountries, String transferToThirdCountriesInfo, String dataPurposes, String dataPurposesInfo, String dataRecipientsList, String descriptionOfService, String history, String historyDescription, String legalBasisList, String legalBasisInfo, String processingCompanyTitle, String retentionPeriod, String technologiesUsed, String technologiesUsedInfo, String cookiePolicyInfo, String optOut, String policyOf, String imprintLinkText, String privacyPolicyLinkText, String categories, String anyDomain, String day, String days, String domain, String duration, String informationLoadingNotPossible, String hour, String hours, String identifier, String maximumAgeCookieStorage, String minute, String minutes, String month, String months, String multipleDomains, String no, String nonCookieStorage, String seconds, String session, String loadingStorageInformation, String storageInformation, String detailedStorageInformation, String tryAgain, String type, String year, String years, String yes, String storageInformationDescription, String btnBannerReadMore, String btnMore, String more, String linkToDpaInfo, String second, String consent, String headerModal, String secondLayerDescriptionHtml, String secondLayerTitle, String settings, String subConsents, String btnAccept, String poweredBy, String dataProtectionOfficer, String nameOfProcessingCompany, String btnBack, String copy, String copied, String basic, String advanced, String processingCompany, String name, String explicit_, String implicit, String btnMoreInfo, String furtherInformationOptOut, String cookiePolicyLinkText, String noImplicit, String yesImplicit, String addressOfProcessingCompany, String consentType, String consents, String language, String less, String notAvailable, String technology, String view);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
