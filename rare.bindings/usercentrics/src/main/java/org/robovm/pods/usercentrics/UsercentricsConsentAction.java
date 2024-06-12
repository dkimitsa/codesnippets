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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UsercentricsUsercentricsConsentAction")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsConsentAction/*</name>*/ 
    extends /*<extends>*/UsercentricsKotlinEnum<UsercentricsConsentAction>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsConsentActionPtr extends Ptr<UsercentricsConsentAction, UsercentricsConsentActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsConsentAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsConsentAction() {}
    protected UsercentricsConsentAction(Handle h, long handle) { super(h, handle); }
    protected UsercentricsConsentAction(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "acceptAllServices")
    public static native UsercentricsConsentAction getAcceptAllServices();
    @Property(selector = "denyAllServices")
    public static native UsercentricsConsentAction getDenyAllServices();
    @Property(selector = "essentialChange")
    public static native UsercentricsConsentAction getEssentialChange();
    @Property(selector = "initialPageLoad")
    public static native UsercentricsConsentAction getInitialPageLoad();
    @Property(selector = "nonEuRegion")
    public static native UsercentricsConsentAction getNonEuRegion();
    @Property(selector = "sessionRestored")
    public static native UsercentricsConsentAction getSessionRestored();
    @Property(selector = "tcfStringChange")
    public static native UsercentricsConsentAction getTcfStringChange();
    @Property(selector = "updateServices")
    public static native UsercentricsConsentAction getUpdateServices();
    @Property(selector = "entries")
    public static native NSArray<UsercentricsConsentAction> getEntries();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getType")
    public native UsercentricsConsentType getType();
    @Method(selector = "values")
    public static native UsercentricsKotlinArray<UsercentricsConsentAction> values();
    /*</methods>*/
}
