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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUICustomization/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUICustomizationPtr extends Ptr<UsercentricsPredefinedUICustomization, UsercentricsPredefinedUICustomizationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUICustomization.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUICustomization() {}
    protected UsercentricsPredefinedUICustomization(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUICustomization(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithColor:font:logoUrl:cornerRadius:")
    public UsercentricsPredefinedUICustomization(UsercentricsPredefinedUICustomizationColor color, UsercentricsPredefinedUICustomizationFont font, String logoUrl, int cornerRadius) { super((SkipInit) null); initObject(init(color, font, logoUrl, cornerRadius)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "color")
    public native UsercentricsPredefinedUICustomizationColor getColor();
    @Property(selector = "cornerRadius")
    public native int getCornerRadius();
    @Property(selector = "font")
    public native UsercentricsPredefinedUICustomizationFont getFont();
    @Property(selector = "logoUrl")
    public native String getLogoUrl();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithColor:font:logoUrl:cornerRadius:")
    protected native @Pointer long init(UsercentricsPredefinedUICustomizationColor color, UsercentricsPredefinedUICustomizationFont font, String logoUrl, int cornerRadius);
    /*</methods>*/
}
