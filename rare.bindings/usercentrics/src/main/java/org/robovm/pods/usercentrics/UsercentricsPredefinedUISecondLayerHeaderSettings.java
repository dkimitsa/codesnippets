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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUISecondLayerHeaderSettings/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*/implements UsercentricsPredefinedUIHeaderSettings/*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUISecondLayerHeaderSettingsPtr extends Ptr<UsercentricsPredefinedUISecondLayerHeaderSettings, UsercentricsPredefinedUISecondLayerHeaderSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUISecondLayerHeaderSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUISecondLayerHeaderSettings() {}
    protected UsercentricsPredefinedUISecondLayerHeaderSettings(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUISecondLayerHeaderSettings(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:contentDescription:links:logoPosition:logoURL:language:firstLayerCloseLink:firstLayerCloseIcon:")
    public UsercentricsPredefinedUISecondLayerHeaderSettings(String title, String contentDescription, NSArray<UsercentricsPredefinedUILink> links, UsercentricsFirstLayerLogoPosition logoPosition, String logoURL, UsercentricsPredefinedUILanguageSettings language, String firstLayerCloseLink, UsercentricsBoolean firstLayerCloseIcon) { super((SkipInit) null); initObject(init(title, contentDescription, links, logoPosition, logoURL, language, firstLayerCloseLink, firstLayerCloseIcon)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "contentDescription")
    public native String getContentDescription();
    @Property(selector = "firstLayerCloseIcon")
    public native UsercentricsBoolean getFirstLayerCloseIcon();
    @Property(selector = "firstLayerCloseLink")
    public native String getFirstLayerCloseLink();
    @Property(selector = "language")
    public native UsercentricsPredefinedUILanguageSettings getLanguage();
    @Property(selector = "links")
    public native NSArray<UsercentricsPredefinedUILink> getLinks();
    @Property(selector = "logoPosition")
    public native UsercentricsFirstLayerLogoPosition getLogoPosition();
    @Property(selector = "logoURL")
    public native String getLogoURL();
    @Property(selector = "title")
    public native String getTitle();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:contentDescription:links:logoPosition:logoURL:language:firstLayerCloseLink:firstLayerCloseIcon:")
    protected native @Pointer long init(String title, String contentDescription, NSArray<UsercentricsPredefinedUILink> links, UsercentricsFirstLayerLogoPosition logoPosition, String logoURL, UsercentricsPredefinedUILanguageSettings language, String firstLayerCloseLink, UsercentricsBoolean firstLayerCloseIcon);
    /*</methods>*/
}
