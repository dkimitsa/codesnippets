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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUIServiceConsent/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUIServiceConsentPtr extends Ptr<UsercentricsPredefinedUIServiceConsent, UsercentricsPredefinedUIServiceConsentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUIServiceConsent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUIServiceConsent() {}
    protected UsercentricsPredefinedUIServiceConsent(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUIServiceConsent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithHistory:status:")
    public UsercentricsPredefinedUIServiceConsent(NSArray<UsercentricsPredefinedUIHistoryEntry> history, boolean status) { super((SkipInit) null); initObject(init(history, status)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "history")
    public native NSArray<UsercentricsPredefinedUIHistoryEntry> getHistory();
    @Property(selector = "status")
    public native boolean isStatus();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithHistory:status:")
    protected native @Pointer long init(NSArray<UsercentricsPredefinedUIHistoryEntry> history, boolean status);
    @Method(selector = "doCopyHistory:status:")
    public native UsercentricsPredefinedUIServiceConsent doCopy(NSArray<UsercentricsPredefinedUIHistoryEntry> history, boolean status);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
