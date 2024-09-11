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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("brdsdk.ColorSettings")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ColorSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ColorSettingsPtr extends Ptr<ColorSettings, ColorSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ColorSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ColorSettings() {}
    protected ColorSettings(Handle h, long handle) { super(h, handle); }
    protected ColorSettings(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBackground_color:title_color:consent_text_color:consent_links_color:privacy_text_color:privacy_links_color:qr_foreground_color:qr_background_color:icons_foreground_color:icons_background_color:")
    public ColorSettings(UIColor background_color, UIColor title_color, UIColor consent_text_color, UIColor consent_links_color, UIColor privacy_text_color, UIColor privacy_links_color, UIColor qr_foreground_color, UIColor qr_background_color, UIColor icons_foreground_color, UIColor icons_background_color) { super((SkipInit) null); initObject(init(background_color, title_color, consent_text_color, consent_links_color, privacy_text_color, privacy_links_color, qr_foreground_color, qr_background_color, icons_foreground_color, icons_background_color)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBackground_color:title_color:consent_text_color:consent_links_color:privacy_text_color:privacy_links_color:qr_foreground_color:qr_background_color:icons_foreground_color:icons_background_color:")
    protected native @Pointer long init(UIColor background_color, UIColor title_color, UIColor consent_text_color, UIColor consent_links_color, UIColor privacy_text_color, UIColor privacy_links_color, UIColor qr_foreground_color, UIColor qr_background_color, UIColor icons_foreground_color, UIColor icons_background_color);
    /*</methods>*/
}
