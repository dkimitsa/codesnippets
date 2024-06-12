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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUIViewSettings/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUIViewSettingsPtr extends Ptr<UsercentricsPredefinedUIViewSettings, UsercentricsPredefinedUIViewSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUIViewSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUIViewSettings() {}
    protected UsercentricsPredefinedUIViewSettings(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUIViewSettings(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCustomization:internationalizationLabels:firstLayerV2:secondLayerV2:")
    public UsercentricsPredefinedUIViewSettings(UsercentricsPredefinedUICustomization customization, UsercentricsPredefinedUILabels internationalizationLabels, UsercentricsUCUIFirstLayerSettings firstLayerV2, UsercentricsUCUISecondLayerSettings secondLayerV2) { super((SkipInit) null); initObject(init(customization, internationalizationLabels, firstLayerV2, secondLayerV2)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "customization")
    public native UsercentricsPredefinedUICustomization getCustomization();
    @Property(selector = "firstLayerV2")
    public native UsercentricsUCUIFirstLayerSettings getFirstLayerV2();
    @Property(selector = "internationalizationLabels")
    public native UsercentricsPredefinedUILabels getInternationalizationLabels();
    @Property(selector = "secondLayerV2")
    public native UsercentricsUCUISecondLayerSettings getSecondLayerV2();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCustomization:internationalizationLabels:firstLayerV2:secondLayerV2:")
    protected native @Pointer long init(UsercentricsPredefinedUICustomization customization, UsercentricsPredefinedUILabels internationalizationLabels, UsercentricsUCUIFirstLayerSettings firstLayerV2, UsercentricsUCUISecondLayerSettings secondLayerV2);
    /*</methods>*/
}
