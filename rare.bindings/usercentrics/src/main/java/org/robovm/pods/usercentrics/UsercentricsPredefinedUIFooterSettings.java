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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUIFooterSettings/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUIFooterSettingsPtr extends Ptr<UsercentricsPredefinedUIFooterSettings, UsercentricsPredefinedUIFooterSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUIFooterSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUIFooterSettings() {}
    protected UsercentricsPredefinedUIFooterSettings(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUIFooterSettings(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPoweredBy:optOutToggle:optOutToggleInitialValue:buttons:buttonsLandscape:")
    public UsercentricsPredefinedUIFooterSettings(UsercentricsPredefinedUIFooterEntry poweredBy, UsercentricsPredefinedUIFooterEntry optOutToggle, boolean optOutToggleInitialValue, NSArray<?> buttons, NSArray<?> buttonsLandscape) { super((SkipInit) null); initObject(init(poweredBy, optOutToggle, optOutToggleInitialValue, buttons, buttonsLandscape)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "buttons")
    public native NSArray<?> getButtons();
    @Property(selector = "buttonsLandscape")
    public native NSArray<?> getButtonsLandscape();
    @Property(selector = "optOutToggle")
    public native UsercentricsPredefinedUIFooterEntry getOptOutToggle();
    @Property(selector = "optOutToggleInitialValue")
    public native boolean isOptOutToggleInitialValue();
    @Property(selector = "poweredBy")
    public native UsercentricsPredefinedUIFooterEntry getPoweredBy();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPoweredBy:optOutToggle:optOutToggleInitialValue:buttons:buttonsLandscape:")
    protected native @Pointer long init(UsercentricsPredefinedUIFooterEntry poweredBy, UsercentricsPredefinedUIFooterEntry optOutToggle, boolean optOutToggleInitialValue, NSArray<?> buttons, NSArray<?> buttonsLandscape);
    /*</methods>*/
}
