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
package org.robovm.pods.brightsdk;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("brdsdk.ConsentFontsInfo")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ConsentFontsInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ConsentFontsInfoPtr extends Ptr<ConsentFontsInfo, ConsentFontsInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ConsentFontsInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ConsentFontsInfo() {}
    protected ConsentFontsInfo(Handle h, long handle) { super(h, handle); }
    protected ConsentFontsInfo(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitleText:mainText:licenseText:iconsText:buttonsText:")
    public ConsentFontsInfo(UIFont titleText, UIFont mainText, UIFont licenseText, UIFont iconsText, UIFont buttonsText) { super((SkipInit) null); initObject(init(titleText, mainText, licenseText, iconsText, buttonsText)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitleText:mainText:licenseText:iconsText:buttonsText:")
    protected native @Pointer long init(UIFont titleText, UIFont mainText, UIFont licenseText, UIFont iconsText, UIFont buttonsText);
    @Method(selector = "setTitleTextWithNameOrPath:size:")
    public native ConsentFontsInfo setTitleText(String nameOrPath, @MachineSizedFloat double size);
    @Method(selector = "setMainTextWithNameOrPath:size:")
    public native ConsentFontsInfo setMainText(String nameOrPath, @MachineSizedFloat double size);
    @Method(selector = "setLicenseTextWithNameOrPath:size:")
    public native ConsentFontsInfo setLicenseText(String nameOrPath, @MachineSizedFloat double size);
    @Method(selector = "setIconsTextWithNameOrPath:size:")
    public native ConsentFontsInfo setIconsText(String nameOrPath, @MachineSizedFloat double size);
    @Method(selector = "setButtonsTextWithNameOrPath:size:")
    public native ConsentFontsInfo setButtonsText(String nameOrPath, @MachineSizedFloat double size);
    @Method(selector = "empty")
    public static native ConsentFontsInfo empty();
    /*</methods>*/
}
