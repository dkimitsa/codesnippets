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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUICustomizationColorToggles/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUICustomizationColorTogglesPtr extends Ptr<UsercentricsPredefinedUICustomizationColorToggles, UsercentricsPredefinedUICustomizationColorTogglesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUICustomizationColorToggles.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUICustomizationColorToggles() {}
    protected UsercentricsPredefinedUICustomizationColorToggles(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUICustomizationColorToggles(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithActiveBackground:inactiveBackground:disabledBackground:activeIcon:inactiveIcon:disabledIcon:")
    public UsercentricsPredefinedUICustomizationColorToggles(String activeBackground, String inactiveBackground, String disabledBackground, String activeIcon, String inactiveIcon, String disabledIcon) { super((SkipInit) null); initObject(init(activeBackground, inactiveBackground, disabledBackground, activeIcon, inactiveIcon, disabledIcon)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "activeBackground")
    public native String getActiveBackground();
    @Property(selector = "activeIcon")
    public native String getActiveIcon();
    @Property(selector = "disabledBackground")
    public native String getDisabledBackground();
    @Property(selector = "disabledIcon")
    public native String getDisabledIcon();
    @Property(selector = "inactiveBackground")
    public native String getInactiveBackground();
    @Property(selector = "inactiveIcon")
    public native String getInactiveIcon();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithActiveBackground:inactiveBackground:disabledBackground:activeIcon:inactiveIcon:disabledIcon:")
    protected native @Pointer long init(String activeBackground, String inactiveBackground, String disabledBackground, String activeIcon, String inactiveIcon, String disabledIcon);
    /*</methods>*/
}
