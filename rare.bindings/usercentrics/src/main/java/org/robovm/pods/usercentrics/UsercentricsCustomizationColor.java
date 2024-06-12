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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsCustomizationColor/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsCustomizationColorPtr extends Ptr<UsercentricsCustomizationColor, UsercentricsCustomizationColorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsCustomizationColor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsCustomizationColor() {}
    protected UsercentricsCustomizationColor(Handle h, long handle) { super(h, handle); }
    protected UsercentricsCustomizationColor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPrimary:acceptBtnText:acceptBtnBackground:denyBtnText:denyBtnBackground:saveBtnText:saveBtnBackground:linkIcon:linkFont:text:layerBackground:overlay:toggleInactiveBackground:toggleInactiveIcon:toggleActiveBackground:toggleActiveIcon:toggleDisabledBackground:toggleDisabledIcon:secondLayerTab:tabsBorderColor:ccpaButtonColor:ccpaButtonTextColor:")
    public UsercentricsCustomizationColor(String primary, String acceptBtnText, String acceptBtnBackground, String denyBtnText, String denyBtnBackground, String saveBtnText, String saveBtnBackground, String linkIcon, String linkFont, String text, String layerBackground, String overlay, String toggleInactiveBackground, String toggleInactiveIcon, String toggleActiveBackground, String toggleActiveIcon, String toggleDisabledBackground, String toggleDisabledIcon, String secondLayerTab, String tabsBorderColor, String ccpaButtonColor, String ccpaButtonTextColor) { super((SkipInit) null); initObject(init(primary, acceptBtnText, acceptBtnBackground, denyBtnText, denyBtnBackground, saveBtnText, saveBtnBackground, linkIcon, linkFont, text, layerBackground, overlay, toggleInactiveBackground, toggleInactiveIcon, toggleActiveBackground, toggleActiveIcon, toggleDisabledBackground, toggleDisabledIcon, secondLayerTab, tabsBorderColor, ccpaButtonColor, ccpaButtonTextColor)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "acceptBtnBackground")
    public native String getAcceptBtnBackground();
    @Property(selector = "acceptBtnText")
    public native String getAcceptBtnText();
    @Property(selector = "ccpaButtonColor")
    public native String getCcpaButtonColor();
    @Property(selector = "ccpaButtonTextColor")
    public native String getCcpaButtonTextColor();
    @Property(selector = "denyBtnBackground")
    public native String getDenyBtnBackground();
    @Property(selector = "denyBtnText")
    public native String getDenyBtnText();
    @Property(selector = "layerBackground")
    public native String getLayerBackground();
    @Property(selector = "linkFont")
    public native String getLinkFont();
    @Property(selector = "linkIcon")
    public native String getLinkIcon();
    @Property(selector = "overlay")
    public native String getOverlay();
    @Property(selector = "primary")
    public native String getPrimary();
    @Property(selector = "saveBtnBackground")
    public native String getSaveBtnBackground();
    @Property(selector = "saveBtnText")
    public native String getSaveBtnText();
    @Property(selector = "secondLayerTab")
    public native String getSecondLayerTab();
    @Property(selector = "tabsBorderColor")
    public native String getTabsBorderColor();
    @Property(selector = "text")
    public native String getText();
    @Property(selector = "toggleActiveBackground")
    public native String getToggleActiveBackground();
    @Property(selector = "toggleActiveIcon")
    public native String getToggleActiveIcon();
    @Property(selector = "toggleDisabledBackground")
    public native String getToggleDisabledBackground();
    @Property(selector = "toggleDisabledIcon")
    public native String getToggleDisabledIcon();
    @Property(selector = "toggleInactiveBackground")
    public native String getToggleInactiveBackground();
    @Property(selector = "toggleInactiveIcon")
    public native String getToggleInactiveIcon();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPrimary:acceptBtnText:acceptBtnBackground:denyBtnText:denyBtnBackground:saveBtnText:saveBtnBackground:linkIcon:linkFont:text:layerBackground:overlay:toggleInactiveBackground:toggleInactiveIcon:toggleActiveBackground:toggleActiveIcon:toggleDisabledBackground:toggleDisabledIcon:secondLayerTab:tabsBorderColor:ccpaButtonColor:ccpaButtonTextColor:")
    protected native @Pointer long init(String primary, String acceptBtnText, String acceptBtnBackground, String denyBtnText, String denyBtnBackground, String saveBtnText, String saveBtnBackground, String linkIcon, String linkFont, String text, String layerBackground, String overlay, String toggleInactiveBackground, String toggleInactiveIcon, String toggleActiveBackground, String toggleActiveIcon, String toggleDisabledBackground, String toggleDisabledIcon, String secondLayerTab, String tabsBorderColor, String ccpaButtonColor, String ccpaButtonTextColor);
    @Method(selector = "doCopyPrimary:acceptBtnText:acceptBtnBackground:denyBtnText:denyBtnBackground:saveBtnText:saveBtnBackground:linkIcon:linkFont:text:layerBackground:overlay:toggleInactiveBackground:toggleInactiveIcon:toggleActiveBackground:toggleActiveIcon:toggleDisabledBackground:toggleDisabledIcon:secondLayerTab:tabsBorderColor:ccpaButtonColor:ccpaButtonTextColor:")
    public native UsercentricsCustomizationColor doCopy(String primary, String acceptBtnText, String acceptBtnBackground, String denyBtnText, String denyBtnBackground, String saveBtnText, String saveBtnBackground, String linkIcon, String linkFont, String text, String layerBackground, String overlay, String toggleInactiveBackground, String toggleInactiveIcon, String toggleActiveBackground, String toggleActiveIcon, String toggleDisabledBackground, String toggleDisabledIcon, String secondLayerTab, String tabsBorderColor, String ccpaButtonColor, String ccpaButtonTextColor);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
