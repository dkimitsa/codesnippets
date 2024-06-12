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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUIAriaLabels/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUIAriaLabelsPtr extends Ptr<UsercentricsPredefinedUIAriaLabels, UsercentricsPredefinedUIAriaLabelsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUIAriaLabels.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUIAriaLabels() {}
    protected UsercentricsPredefinedUIAriaLabels(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUIAriaLabels(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAcceptAllButton:ccpaButton:ccpaMoreInformation:closeButton:collapse:cookiePolicyButton:copyControllerId:denyAllButton:expand:fullscreenButton:imprintButton:languageSelector:privacyButton:privacyPolicyButton:saveButton:serviceInCategoryDetails:servicesInCategory:tabButton:usercentricsCMPButtons:usercentricsCMPContent:usercentricsCMPHeader:usercentricsCMPUI:usercentricsCard:usercentricsList:vendorConsentToggle:vendorDetailedStorageInformation:vendorLegIntToggle:logoAltTag:")
    public UsercentricsPredefinedUIAriaLabels(String acceptAllButton, String ccpaButton, String ccpaMoreInformation, String closeButton, String collapse, String cookiePolicyButton, String copyControllerId, String denyAllButton, String expand, String fullscreenButton, String imprintButton, String languageSelector, String privacyButton, String privacyPolicyButton, String saveButton, String serviceInCategoryDetails, String servicesInCategory, String tabButton, String usercentricsCMPButtons, String usercentricsCMPContent, String usercentricsCMPHeader, String usercentricsCMPUI, String usercentricsCard, String usercentricsList, String vendorConsentToggle, String vendorDetailedStorageInformation, String vendorLegIntToggle, String logoAltTag) { super((SkipInit) null); initObject(init(acceptAllButton, ccpaButton, ccpaMoreInformation, closeButton, collapse, cookiePolicyButton, copyControllerId, denyAllButton, expand, fullscreenButton, imprintButton, languageSelector, privacyButton, privacyPolicyButton, saveButton, serviceInCategoryDetails, servicesInCategory, tabButton, usercentricsCMPButtons, usercentricsCMPContent, usercentricsCMPHeader, usercentricsCMPUI, usercentricsCard, usercentricsList, vendorConsentToggle, vendorDetailedStorageInformation, vendorLegIntToggle, logoAltTag)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "acceptAllButton")
    public native String getAcceptAllButton();
    @Property(selector = "ccpaButton")
    public native String getCcpaButton();
    @Property(selector = "ccpaMoreInformation")
    public native String getCcpaMoreInformation();
    @Property(selector = "closeButton")
    public native String getCloseButton();
    @Property(selector = "collapse")
    public native String getCollapse();
    @Property(selector = "cookiePolicyButton")
    public native String getCookiePolicyButton();
    @Property(selector = "doCopyControllerId")
    public native String getCopyControllerId();
    @Property(selector = "denyAllButton")
    public native String getDenyAllButton();
    @Property(selector = "expand")
    public native String getExpand();
    @Property(selector = "fullscreenButton")
    public native String getFullscreenButton();
    @Property(selector = "imprintButton")
    public native String getImprintButton();
    @Property(selector = "languageSelector")
    public native String getLanguageSelector();
    @Property(selector = "logoAltTag")
    public native String getLogoAltTag();
    @Property(selector = "privacyButton")
    public native String getPrivacyButton();
    @Property(selector = "privacyPolicyButton")
    public native String getPrivacyPolicyButton();
    @Property(selector = "saveButton")
    public native String getSaveButton();
    @Property(selector = "serviceInCategoryDetails")
    public native String getServiceInCategoryDetails();
    @Property(selector = "servicesInCategory")
    public native String getServicesInCategory();
    @Property(selector = "tabButton")
    public native String getTabButton();
    @Property(selector = "usercentricsCMPButtons")
    public native String getUsercentricsCMPButtons();
    @Property(selector = "usercentricsCMPContent")
    public native String getUsercentricsCMPContent();
    @Property(selector = "usercentricsCMPHeader")
    public native String getUsercentricsCMPHeader();
    @Property(selector = "usercentricsCMPUI")
    public native String getUsercentricsCMPUI();
    @Property(selector = "usercentricsCard")
    public native String getUsercentricsCard();
    @Property(selector = "usercentricsList")
    public native String getUsercentricsList();
    @Property(selector = "vendorConsentToggle")
    public native String getVendorConsentToggle();
    @Property(selector = "vendorDetailedStorageInformation")
    public native String getVendorDetailedStorageInformation();
    @Property(selector = "vendorLegIntToggle")
    public native String getVendorLegIntToggle();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAcceptAllButton:ccpaButton:ccpaMoreInformation:closeButton:collapse:cookiePolicyButton:copyControllerId:denyAllButton:expand:fullscreenButton:imprintButton:languageSelector:privacyButton:privacyPolicyButton:saveButton:serviceInCategoryDetails:servicesInCategory:tabButton:usercentricsCMPButtons:usercentricsCMPContent:usercentricsCMPHeader:usercentricsCMPUI:usercentricsCard:usercentricsList:vendorConsentToggle:vendorDetailedStorageInformation:vendorLegIntToggle:logoAltTag:")
    protected native @Pointer long init(String acceptAllButton, String ccpaButton, String ccpaMoreInformation, String closeButton, String collapse, String cookiePolicyButton, String copyControllerId, String denyAllButton, String expand, String fullscreenButton, String imprintButton, String languageSelector, String privacyButton, String privacyPolicyButton, String saveButton, String serviceInCategoryDetails, String servicesInCategory, String tabButton, String usercentricsCMPButtons, String usercentricsCMPContent, String usercentricsCMPHeader, String usercentricsCMPUI, String usercentricsCard, String usercentricsList, String vendorConsentToggle, String vendorDetailedStorageInformation, String vendorLegIntToggle, String logoAltTag);
    /*</methods>*/
}
