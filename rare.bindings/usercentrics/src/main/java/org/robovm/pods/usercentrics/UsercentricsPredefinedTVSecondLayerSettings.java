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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedTVSecondLayerSettings/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedTVSecondLayerSettingsPtr extends Ptr<UsercentricsPredefinedTVSecondLayerSettings, UsercentricsPredefinedTVSecondLayerSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedTVSecondLayerSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedTVSecondLayerSettings() {}
    protected UsercentricsPredefinedTVSecondLayerSettings(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedTVSecondLayerSettings(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:save:denyAll:toggleLocalizations:content:")
    public UsercentricsPredefinedTVSecondLayerSettings(String title, String save, String denyAll, UsercentricsPredefinedUIToggleLocalizations toggleLocalizations, UsercentricsPredefinedTVSecondLayerSettingsContent content) { super((SkipInit) null); initObject(init(title, save, denyAll, toggleLocalizations, content)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "content")
    public native UsercentricsPredefinedTVSecondLayerSettingsContent getContent();
    @Property(selector = "denyAll")
    public native String getDenyAll();
    @Property(selector = "save")
    public native String getSave();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "toggleLocalizations")
    public native UsercentricsPredefinedUIToggleLocalizations getToggleLocalizations();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:save:denyAll:toggleLocalizations:content:")
    protected native @Pointer long init(String title, String save, String denyAll, UsercentricsPredefinedUIToggleLocalizations toggleLocalizations, UsercentricsPredefinedTVSecondLayerSettingsContent content);
    /*</methods>*/
}
