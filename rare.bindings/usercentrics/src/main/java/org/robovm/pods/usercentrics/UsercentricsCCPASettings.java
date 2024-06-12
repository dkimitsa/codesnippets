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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsCCPASettings/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsCCPASettingsPtr extends Ptr<UsercentricsCCPASettings, UsercentricsCCPASettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsCCPASettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsCCPASettings() {}
    protected UsercentricsCCPASettings(Handle h, long handle) { super(h, handle); }
    protected UsercentricsCCPASettings(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithOptOutNoticeLabel:btnSave:firstLayerTitle:secondLayerTitle:secondLayerDescription:btnMoreInfo:firstLayerMobileVariant:isActive:region:showOnPageLoad:reshowAfterDays:iabAgreementExists:removeDoNotSellToggle:appFirstLayerDescription:firstLayerMobileDescriptionIsActive:firstLayerMobileDescription:secondLayerHideLanguageSwitch:")
    public UsercentricsCCPASettings(String optOutNoticeLabel, String btnSave, String firstLayerTitle, String secondLayerTitle, String secondLayerDescription, String btnMoreInfo, UsercentricsFirstLayerMobileVariant firstLayerMobileVariant, boolean isActive, UsercentricsCCPARegion region, boolean showOnPageLoad, int reshowAfterDays, boolean iabAgreementExists, boolean removeDoNotSellToggle, String appFirstLayerDescription, boolean firstLayerMobileDescriptionIsActive, String firstLayerMobileDescription, boolean secondLayerHideLanguageSwitch) { super((SkipInit) null); initObject(init(optOutNoticeLabel, btnSave, firstLayerTitle, secondLayerTitle, secondLayerDescription, btnMoreInfo, firstLayerMobileVariant, isActive, region, showOnPageLoad, reshowAfterDays, iabAgreementExists, removeDoNotSellToggle, appFirstLayerDescription, firstLayerMobileDescriptionIsActive, firstLayerMobileDescription, secondLayerHideLanguageSwitch)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "appFirstLayerDescription")
    public native String getAppFirstLayerDescription();
    @Property(selector = "btnMoreInfo")
    public native String getBtnMoreInfo();
    @Property(selector = "btnSave")
    public native String getBtnSave();
    @Property(selector = "firstLayerMobileDescription")
    public native String getFirstLayerMobileDescription();
    @Property(selector = "firstLayerMobileDescriptionIsActive")
    public native boolean isFirstLayerMobileDescriptionIsActive();
    @Property(selector = "firstLayerMobileVariant")
    public native UsercentricsFirstLayerMobileVariant getFirstLayerMobileVariant();
    @Property(selector = "firstLayerTitle")
    public native String getFirstLayerTitle();
    @Property(selector = "iabAgreementExists")
    public native boolean isIabAgreementExists();
    @Property(selector = "isActive")
    public native boolean isActive();
    @Property(selector = "optOutNoticeLabel")
    public native String getOptOutNoticeLabel();
    @Property(selector = "region")
    public native UsercentricsCCPARegion getRegion();
    @Property(selector = "removeDoNotSellToggle")
    public native boolean isRemoveDoNotSellToggle();
    @Property(selector = "reshowAfterDays")
    public native int getReshowAfterDays();
    @Property(selector = "secondLayerDescription")
    public native String getSecondLayerDescription();
    @Property(selector = "secondLayerHideLanguageSwitch")
    public native boolean isSecondLayerHideLanguageSwitch();
    @Property(selector = "secondLayerTitle")
    public native String getSecondLayerTitle();
    @Property(selector = "showOnPageLoad")
    public native boolean isShowOnPageLoad();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithOptOutNoticeLabel:btnSave:firstLayerTitle:secondLayerTitle:secondLayerDescription:btnMoreInfo:firstLayerMobileVariant:isActive:region:showOnPageLoad:reshowAfterDays:iabAgreementExists:removeDoNotSellToggle:appFirstLayerDescription:firstLayerMobileDescriptionIsActive:firstLayerMobileDescription:secondLayerHideLanguageSwitch:")
    protected native @Pointer long init(String optOutNoticeLabel, String btnSave, String firstLayerTitle, String secondLayerTitle, String secondLayerDescription, String btnMoreInfo, UsercentricsFirstLayerMobileVariant firstLayerMobileVariant, boolean isActive, UsercentricsCCPARegion region, boolean showOnPageLoad, int reshowAfterDays, boolean iabAgreementExists, boolean removeDoNotSellToggle, String appFirstLayerDescription, boolean firstLayerMobileDescriptionIsActive, String firstLayerMobileDescription, boolean secondLayerHideLanguageSwitch);
    @Method(selector = "doCopyOptOutNoticeLabel:btnSave:firstLayerTitle:secondLayerTitle:secondLayerDescription:btnMoreInfo:firstLayerMobileVariant:isActive:region:showOnPageLoad:reshowAfterDays:iabAgreementExists:removeDoNotSellToggle:appFirstLayerDescription:firstLayerMobileDescriptionIsActive:firstLayerMobileDescription:secondLayerHideLanguageSwitch:")
    public native UsercentricsCCPASettings doCopy(String optOutNoticeLabel, String btnSave, String firstLayerTitle, String secondLayerTitle, String secondLayerDescription, String btnMoreInfo, UsercentricsFirstLayerMobileVariant firstLayerMobileVariant, boolean isActive, UsercentricsCCPARegion region, boolean showOnPageLoad, int reshowAfterDays, boolean iabAgreementExists, boolean removeDoNotSellToggle, String appFirstLayerDescription, boolean firstLayerMobileDescriptionIsActive, String firstLayerMobileDescription, boolean secondLayerHideLanguageSwitch);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
