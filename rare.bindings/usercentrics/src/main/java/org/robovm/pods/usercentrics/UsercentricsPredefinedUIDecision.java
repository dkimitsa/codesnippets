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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUIDecision/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUIDecisionPtr extends Ptr<UsercentricsPredefinedUIDecision, UsercentricsPredefinedUIDecisionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUIDecision.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUIDecision() {}
    protected UsercentricsPredefinedUIDecision(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUIDecision(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithServiceId:values:")
    public UsercentricsPredefinedUIDecision(String serviceId, NSDictionary<NSString, UsercentricsBoolean> values) { super((SkipInit) null); initObject(init(serviceId, values)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "serviceId")
    public native String getServiceId();
    @Property(selector = "values")
    public native NSDictionary<NSString, UsercentricsBoolean> getValues();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithServiceId:values:")
    protected native @Pointer long init(String serviceId, NSDictionary<NSString, UsercentricsBoolean> values);
    @Method(selector = "consent")
    public native UsercentricsBoolean consent();
    @Method(selector = "doCopyServiceId:values:")
    public native UsercentricsPredefinedUIDecision doCopy(String serviceId, NSDictionary<NSString, UsercentricsBoolean> values);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "legitimateInterest")
    public native UsercentricsBoolean legitimateInterest();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
