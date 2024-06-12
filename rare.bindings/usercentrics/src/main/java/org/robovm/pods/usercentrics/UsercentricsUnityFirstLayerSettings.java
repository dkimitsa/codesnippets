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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsUnityFirstLayerSettings/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsUnityFirstLayerSettingsPtr extends Ptr<UsercentricsUnityFirstLayerSettings, UsercentricsUnityFirstLayerSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsUnityFirstLayerSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsUnityFirstLayerSettings() {}
    protected UsercentricsUnityFirstLayerSettings(Handle h, long handle) { super(h, handle); }
    protected UsercentricsUnityFirstLayerSettings(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:description:additionalInfo:resurfaceNote:vendorListLinkTitle:manageSettingsLinkTitle:purposesLabel:featuresLabel:acceptAllButton:denyAllButton:saveButton:")
    public UsercentricsUnityFirstLayerSettings(String title, String description, String additionalInfo, String resurfaceNote, String vendorListLinkTitle, String manageSettingsLinkTitle, String purposesLabel, String featuresLabel, String acceptAllButton, String denyAllButton, String saveButton) { super((SkipInit) null); initObject(init(title, description, additionalInfo, resurfaceNote, vendorListLinkTitle, manageSettingsLinkTitle, purposesLabel, featuresLabel, acceptAllButton, denyAllButton, saveButton)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "acceptAllButton")
    public native String getAcceptAllButton();
    @Property(selector = "additionalInfo")
    public native String getAdditionalInfo();
    @Property(selector = "denyAllButton")
    public native String getDenyAllButton();
    @Property(selector = "description_")
    public native String getDescription_();
    @Property(selector = "featuresLabel")
    public native String getFeaturesLabel();
    @Property(selector = "manageSettingsLinkTitle")
    public native String getManageSettingsLinkTitle();
    @Property(selector = "purposesLabel")
    public native String getPurposesLabel();
    @Property(selector = "resurfaceNote")
    public native String getResurfaceNote();
    @Property(selector = "saveButton")
    public native String getSaveButton();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "vendorListLinkTitle")
    public native String getVendorListLinkTitle();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:description:additionalInfo:resurfaceNote:vendorListLinkTitle:manageSettingsLinkTitle:purposesLabel:featuresLabel:acceptAllButton:denyAllButton:saveButton:")
    protected native @Pointer long init(String title, String description, String additionalInfo, String resurfaceNote, String vendorListLinkTitle, String manageSettingsLinkTitle, String purposesLabel, String featuresLabel, String acceptAllButton, String denyAllButton, String saveButton);
    @Method(selector = "doCopyTitle:description:additionalInfo:resurfaceNote:vendorListLinkTitle:manageSettingsLinkTitle:purposesLabel:featuresLabel:acceptAllButton:denyAllButton:saveButton:")
    public native UsercentricsUnityFirstLayerSettings doCopy(String title, String description, String additionalInfo, String resurfaceNote, String vendorListLinkTitle, String manageSettingsLinkTitle, String purposesLabel, String featuresLabel, String acceptAllButton, String denyAllButton, String saveButton);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
