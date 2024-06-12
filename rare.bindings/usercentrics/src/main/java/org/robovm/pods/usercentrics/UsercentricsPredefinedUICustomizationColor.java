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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUICustomizationColor/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUICustomizationColorPtr extends Ptr<UsercentricsPredefinedUICustomizationColor, UsercentricsPredefinedUICustomizationColorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUICustomizationColor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUICustomizationColor() {}
    protected UsercentricsPredefinedUICustomizationColor(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUICustomizationColor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithText:acceptAllButton:denyAllButton:saveButton:okButton:manageButton:toggles:layerBackgroundColor:layerBackgroundSecondaryColor:linkColor:tabColor:baseOverlayColor:overlayOpacity:tabsBorderColor:")
    public UsercentricsPredefinedUICustomizationColor(UsercentricsShadedColor text, UsercentricsPredefinedUICustomizationColorButton acceptAllButton, UsercentricsPredefinedUICustomizationColorButton denyAllButton, UsercentricsPredefinedUICustomizationColorButton saveButton, UsercentricsPredefinedUICustomizationColorButton okButton, UsercentricsPredefinedUICustomizationColorButton manageButton, UsercentricsPredefinedUICustomizationColorToggles toggles, String layerBackgroundColor, String layerBackgroundSecondaryColor, String linkColor, String tabColor, String baseOverlayColor, double overlayOpacity, String tabsBorderColor) { super((SkipInit) null); initObject(init(text, acceptAllButton, denyAllButton, saveButton, okButton, manageButton, toggles, layerBackgroundColor, layerBackgroundSecondaryColor, linkColor, tabColor, baseOverlayColor, overlayOpacity, tabsBorderColor)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "acceptAllButton")
    public native UsercentricsPredefinedUICustomizationColorButton getAcceptAllButton();
    @Property(selector = "baseOverlayColor")
    public native String getBaseOverlayColor();
    @Property(selector = "denyAllButton")
    public native UsercentricsPredefinedUICustomizationColorButton getDenyAllButton();
    @Property(selector = "layerBackgroundColor")
    public native String getLayerBackgroundColor();
    @Property(selector = "layerBackgroundSecondaryColor")
    public native String getLayerBackgroundSecondaryColor();
    @Property(selector = "linkColor")
    public native String getLinkColor();
    @Property(selector = "manageButton")
    public native UsercentricsPredefinedUICustomizationColorButton getManageButton();
    @Property(selector = "okButton")
    public native UsercentricsPredefinedUICustomizationColorButton getOkButton();
    @Property(selector = "overlayOpacity")
    public native double getOverlayOpacity();
    @Property(selector = "saveButton")
    public native UsercentricsPredefinedUICustomizationColorButton getSaveButton();
    @Property(selector = "tabColor")
    public native String getTabColor();
    @Property(selector = "tabsBorderColor")
    public native String getTabsBorderColor();
    @Property(selector = "text")
    public native UsercentricsShadedColor getText();
    @Property(selector = "toggles")
    public native UsercentricsPredefinedUICustomizationColorToggles getToggles();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithText:acceptAllButton:denyAllButton:saveButton:okButton:manageButton:toggles:layerBackgroundColor:layerBackgroundSecondaryColor:linkColor:tabColor:baseOverlayColor:overlayOpacity:tabsBorderColor:")
    protected native @Pointer long init(UsercentricsShadedColor text, UsercentricsPredefinedUICustomizationColorButton acceptAllButton, UsercentricsPredefinedUICustomizationColorButton denyAllButton, UsercentricsPredefinedUICustomizationColorButton saveButton, UsercentricsPredefinedUICustomizationColorButton okButton, UsercentricsPredefinedUICustomizationColorButton manageButton, UsercentricsPredefinedUICustomizationColorToggles toggles, String layerBackgroundColor, String layerBackgroundSecondaryColor, String linkColor, String tabColor, String baseOverlayColor, double overlayOpacity, String tabsBorderColor);
    /*</methods>*/
}
