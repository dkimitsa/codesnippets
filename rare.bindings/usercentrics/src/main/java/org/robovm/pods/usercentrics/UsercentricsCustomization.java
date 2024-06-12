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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UsercentricsUsercentricsCustomization")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsCustomization/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsCustomizationPtr extends Ptr<UsercentricsCustomization, UsercentricsCustomizationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsCustomization.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsCustomization() {}
    protected UsercentricsCustomization(Handle h, long handle) { super(h, handle); }
    protected UsercentricsCustomization(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLogoUrl:borderRadiusLayer:borderRadiusButton:overlayOpacity:font:color:logoAltTag:")
    public UsercentricsCustomization(String logoUrl, UsercentricsInt borderRadiusLayer, UsercentricsInt borderRadiusButton, UsercentricsFloat overlayOpacity, UsercentricsCustomizationFont font, UsercentricsCustomizationColor color, String logoAltTag) { super((SkipInit) null); initObject(init(logoUrl, borderRadiusLayer, borderRadiusButton, overlayOpacity, font, color, logoAltTag)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "borderRadiusButton")
    public native UsercentricsInt getBorderRadiusButton();
    @Property(selector = "borderRadiusLayer")
    public native UsercentricsInt getBorderRadiusLayer();
    @Property(selector = "color")
    public native UsercentricsCustomizationColor getColor();
    @Property(selector = "font")
    public native UsercentricsCustomizationFont getFont();
    @Property(selector = "logoAltTag")
    public native String getLogoAltTag();
    @Property(selector = "logoUrl")
    public native String getLogoUrl();
    @Property(selector = "overlayOpacity")
    public native UsercentricsFloat getOverlayOpacity();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLogoUrl:borderRadiusLayer:borderRadiusButton:overlayOpacity:font:color:logoAltTag:")
    protected native @Pointer long init(String logoUrl, UsercentricsInt borderRadiusLayer, UsercentricsInt borderRadiusButton, UsercentricsFloat overlayOpacity, UsercentricsCustomizationFont font, UsercentricsCustomizationColor color, String logoAltTag);
    @Method(selector = "doCopyLogoUrl:borderRadiusLayer:borderRadiusButton:overlayOpacity:font:color:logoAltTag:")
    public native UsercentricsCustomization doCopy(String logoUrl, UsercentricsInt borderRadiusLayer, UsercentricsInt borderRadiusButton, UsercentricsFloat overlayOpacity, UsercentricsCustomizationFont font, UsercentricsCustomizationColor color, String logoAltTag);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
