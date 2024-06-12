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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsVariantsSettings/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsVariantsSettingsPtr extends Ptr<UsercentricsVariantsSettings, UsercentricsVariantsSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsVariantsSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsVariantsSettings() {}
    protected UsercentricsVariantsSettings(Handle h, long handle) { super(h, handle); }
    protected UsercentricsVariantsSettings(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEnabled:experimentsJson:activateWith:")
    public UsercentricsVariantsSettings(boolean enabled, String experimentsJson, String activateWith) { super((SkipInit) null); initObject(init(enabled, experimentsJson, activateWith)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "activateWith")
    public native String getActivateWith();
    @Property(selector = "enabled")
    public native boolean isEnabled();
    @Property(selector = "experimentsJson")
    public native String getExperimentsJson();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEnabled:experimentsJson:activateWith:")
    protected native @Pointer long init(boolean enabled, String experimentsJson, String activateWith);
    @Method(selector = "doCopyEnabled:experimentsJson:activateWith:")
    public native UsercentricsVariantsSettings doCopy(boolean enabled, String experimentsJson, String activateWith);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
