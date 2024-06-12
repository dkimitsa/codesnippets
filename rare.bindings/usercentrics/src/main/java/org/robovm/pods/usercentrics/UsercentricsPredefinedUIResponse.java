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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUIResponse/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUIResponsePtr extends Ptr<UsercentricsPredefinedUIResponse, UsercentricsPredefinedUIResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUIResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUIResponse() {}
    protected UsercentricsPredefinedUIResponse(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUIResponse(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithUserInteraction:consents:controllerId:")
    public UsercentricsPredefinedUIResponse(UsercentricsPredefinedUIInteraction userInteraction, NSArray<UsercentricsServiceConsent> consents, String controllerId) { super((SkipInit) null); initObject(init(userInteraction, consents, controllerId)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "consents")
    public native NSArray<UsercentricsServiceConsent> getConsents();
    @Property(selector = "controllerId")
    public native String getControllerId();
    @Property(selector = "userInteraction")
    public native UsercentricsPredefinedUIInteraction getUserInteraction();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithUserInteraction:consents:controllerId:")
    protected native @Pointer long init(UsercentricsPredefinedUIInteraction userInteraction, NSArray<UsercentricsServiceConsent> consents, String controllerId);
    @Method(selector = "doCopyUserInteraction:consents:controllerId:")
    public native UsercentricsPredefinedUIResponse doCopy(UsercentricsPredefinedUIInteraction userInteraction, NSArray<UsercentricsServiceConsent> consents, String controllerId);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
