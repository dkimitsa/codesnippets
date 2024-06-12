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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsTCFUserDecisionOnSpecialFeature/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*/implements UsercentricsBaseTCFUserDecision/*</implements>*/ {

    /*<ptr>*/public static class UsercentricsTCFUserDecisionOnSpecialFeaturePtr extends Ptr<UsercentricsTCFUserDecisionOnSpecialFeature, UsercentricsTCFUserDecisionOnSpecialFeaturePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsTCFUserDecisionOnSpecialFeature.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsTCFUserDecisionOnSpecialFeature() {}
    protected UsercentricsTCFUserDecisionOnSpecialFeature(Handle h, long handle) { super(h, handle); }
    protected UsercentricsTCFUserDecisionOnSpecialFeature(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithId:consent:")
    public UsercentricsTCFUserDecisionOnSpecialFeature(int id, UsercentricsBoolean consent) { super((SkipInit) null); initObject(init(id, consent)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "consent")
    public native UsercentricsBoolean getConsent();
    @Property(selector = "setConsent:")
    public native void setConsent(UsercentricsBoolean v);
    @Property(selector = "id")
    public native int getId();
    @Property(selector = "setId:")
    public native void setId(int v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithId:consent:")
    protected native @Pointer long init(int id, UsercentricsBoolean consent);
    @Method(selector = "doCopyId:consent:")
    public native UsercentricsTCFUserDecisionOnSpecialFeature doCopy(int id, UsercentricsBoolean consent);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
