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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUICardUI/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUICardUIPtr extends Ptr<UsercentricsPredefinedUICardUI, UsercentricsPredefinedUICardUIPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUICardUI.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUICardUI() {}
    protected UsercentricsPredefinedUICardUI(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUICardUI(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFeature:title:")
    public UsercentricsPredefinedUICardUI(UsercentricsTCFFeature feature, String title) { super((SkipInit) null); initObject(init(feature, title)); }
    @Method(selector = "initWithSpecialPurpose:title:")
    public UsercentricsPredefinedUICardUI(UsercentricsTCFSpecialPurpose specialPurpose, String title) { super((SkipInit) null); initObject(init(specialPurpose, title)); }
    @Method(selector = "initWithId:title:shortDescription:mainSwitchSettings:content:switchSettings:dependantSwitchSettings:")
    public UsercentricsPredefinedUICardUI(String id, String title, String shortDescription, UsercentricsPredefinedUISwitchSettingsUI mainSwitchSettings, UsercentricsPredefinedUICardContent content, NSArray<UsercentricsPredefinedUISwitchSettingsUI> switchSettings, NSArray<UsercentricsPredefinedUIDependantSwitchSettings> dependantSwitchSettings) { super((SkipInit) null); initObject(init(id, title, shortDescription, mainSwitchSettings, content, switchSettings, dependantSwitchSettings)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "content")
    public native UsercentricsPredefinedUICardContent getContent();
    @Property(selector = "dependantSwitchSettings")
    public native NSArray<UsercentricsPredefinedUIDependantSwitchSettings> getDependantSwitchSettings();
    @Property(selector = "id")
    public native String getId();
    @Property(selector = "mainSwitchSettings")
    public native UsercentricsPredefinedUISwitchSettingsUI getMainSwitchSettings();
    @Property(selector = "shortDescription")
    public native String getShortDescription();
    @Property(selector = "switchSettings")
    public native NSArray<UsercentricsPredefinedUISwitchSettingsUI> getSwitchSettings();
    @Property(selector = "title")
    public native String getTitle();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFeature:title:")
    protected native @Pointer long init(UsercentricsTCFFeature feature, String title);
    @Method(selector = "initWithSpecialPurpose:title:")
    protected native @Pointer long init(UsercentricsTCFSpecialPurpose specialPurpose, String title);
    @Method(selector = "initWithId:title:shortDescription:mainSwitchSettings:content:switchSettings:dependantSwitchSettings:")
    protected native @Pointer long init(String id, String title, String shortDescription, UsercentricsPredefinedUISwitchSettingsUI mainSwitchSettings, UsercentricsPredefinedUICardContent content, NSArray<UsercentricsPredefinedUISwitchSettingsUI> switchSettings, NSArray<UsercentricsPredefinedUIDependantSwitchSettings> dependantSwitchSettings);
    @Method(selector = "doCopyId:title:shortDescription:mainSwitchSettings:content:switchSettings:dependantSwitchSettings:")
    public native UsercentricsPredefinedUICardUI doCopy(String id, String title, String shortDescription, UsercentricsPredefinedUISwitchSettingsUI mainSwitchSettings, UsercentricsPredefinedUICardContent content, NSArray<UsercentricsPredefinedUISwitchSettingsUI> switchSettings, NSArray<UsercentricsPredefinedUIDependantSwitchSettings> dependantSwitchSettings);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
