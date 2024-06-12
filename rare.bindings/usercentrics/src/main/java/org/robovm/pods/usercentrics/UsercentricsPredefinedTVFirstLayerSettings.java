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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedTVFirstLayerSettings/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedTVFirstLayerSettingsPtr extends Ptr<UsercentricsPredefinedTVFirstLayerSettings, UsercentricsPredefinedTVFirstLayerSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedTVFirstLayerSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedTVFirstLayerSettings() {}
    protected UsercentricsPredefinedTVFirstLayerSettings(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedTVFirstLayerSettings(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:content:logoUrl:primaryActions:secondaryActions:")
    public UsercentricsPredefinedTVFirstLayerSettings(String title, String content, String logoUrl, NSArray<UsercentricsPredefinedTVActionButton> primaryActions, NSArray<UsercentricsPredefinedTVActionButton> secondaryActions) { super((SkipInit) null); initObject(init(title, content, logoUrl, primaryActions, secondaryActions)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "content")
    public native String getContent();
    @Property(selector = "logoUrl")
    public native String getLogoUrl();
    @Property(selector = "primaryActions")
    public native NSArray<UsercentricsPredefinedTVActionButton> getPrimaryActions();
    @Property(selector = "secondaryActions")
    public native NSArray<UsercentricsPredefinedTVActionButton> getSecondaryActions();
    @Property(selector = "title")
    public native String getTitle();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:content:logoUrl:primaryActions:secondaryActions:")
    protected native @Pointer long init(String title, String content, String logoUrl, NSArray<UsercentricsPredefinedTVActionButton> primaryActions, NSArray<UsercentricsPredefinedTVActionButton> secondaryActions);
    /*</methods>*/
}
