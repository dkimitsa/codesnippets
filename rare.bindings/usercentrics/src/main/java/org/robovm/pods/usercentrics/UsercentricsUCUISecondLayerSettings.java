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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsUCUISecondLayerSettings/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsUCUISecondLayerSettingsPtr extends Ptr<UsercentricsUCUISecondLayerSettings, UsercentricsUCUISecondLayerSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsUCUISecondLayerSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsUCUISecondLayerSettings() {}
    protected UsercentricsUCUISecondLayerSettings(Handle h, long handle) { super(h, handle); }
    protected UsercentricsUCUISecondLayerSettings(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithHeaderSettings:footerSettings:contentSettings:")
    public UsercentricsUCUISecondLayerSettings(UsercentricsPredefinedUIHeaderSettings headerSettings, UsercentricsPredefinedUIFooterSettings footerSettings, NSArray<UsercentricsPredefinedUITabSettings> contentSettings) { super((SkipInit) null); initObject(init(headerSettings, footerSettings, contentSettings)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "contentSettings")
    public native NSArray<UsercentricsPredefinedUITabSettings> getContentSettings();
    @Property(selector = "footerSettings")
    public native UsercentricsPredefinedUIFooterSettings getFooterSettings();
    @Property(selector = "headerSettings")
    public native UsercentricsPredefinedUIHeaderSettings getHeaderSettings();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithHeaderSettings:footerSettings:contentSettings:")
    protected native @Pointer long init(UsercentricsPredefinedUIHeaderSettings headerSettings, UsercentricsPredefinedUIFooterSettings footerSettings, NSArray<UsercentricsPredefinedUITabSettings> contentSettings);
    /*</methods>*/
}
