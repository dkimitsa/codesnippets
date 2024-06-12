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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsTCFUserDecisions/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsTCFUserDecisionsPtr extends Ptr<UsercentricsTCFUserDecisions, UsercentricsTCFUserDecisionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsTCFUserDecisions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsTCFUserDecisions() {}
    protected UsercentricsTCFUserDecisions(Handle h, long handle) { super(h, handle); }
    protected UsercentricsTCFUserDecisions(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPurposes:specialFeatures:vendors:adTechProviders:")
    public UsercentricsTCFUserDecisions(NSArray<UsercentricsTCFUserDecisionOnPurpose> purposes, NSArray<UsercentricsTCFUserDecisionOnSpecialFeature> specialFeatures, NSArray<UsercentricsTCFUserDecisionOnVendor> vendors, NSArray<UsercentricsAdTechProviderDecision> adTechProviders) { super((SkipInit) null); initObject(init(purposes, specialFeatures, vendors, adTechProviders)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adTechProviders")
    public native NSArray<UsercentricsAdTechProviderDecision> getAdTechProviders();
    @Property(selector = "purposes")
    public native NSArray<UsercentricsTCFUserDecisionOnPurpose> getPurposes();
    @Property(selector = "specialFeatures")
    public native NSArray<UsercentricsTCFUserDecisionOnSpecialFeature> getSpecialFeatures();
    @Property(selector = "vendors")
    public native NSArray<UsercentricsTCFUserDecisionOnVendor> getVendors();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPurposes:specialFeatures:vendors:adTechProviders:")
    protected native @Pointer long init(NSArray<UsercentricsTCFUserDecisionOnPurpose> purposes, NSArray<UsercentricsTCFUserDecisionOnSpecialFeature> specialFeatures, NSArray<UsercentricsTCFUserDecisionOnVendor> vendors, NSArray<UsercentricsAdTechProviderDecision> adTechProviders);
    @Method(selector = "doCopyPurposes:specialFeatures:vendors:adTechProviders:")
    public native UsercentricsTCFUserDecisions doCopy(NSArray<UsercentricsTCFUserDecisionOnPurpose> purposes, NSArray<UsercentricsTCFUserDecisionOnSpecialFeature> specialFeatures, NSArray<UsercentricsTCFUserDecisionOnVendor> vendors, NSArray<UsercentricsAdTechProviderDecision> adTechProviders);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
