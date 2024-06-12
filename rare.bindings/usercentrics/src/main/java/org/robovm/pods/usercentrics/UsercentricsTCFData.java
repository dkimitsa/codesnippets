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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsTCFData/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsTCFDataPtr extends Ptr<UsercentricsTCFData, UsercentricsTCFDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsTCFData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsTCFData() {}
    protected UsercentricsTCFData(Handle h, long handle) { super(h, handle); }
    protected UsercentricsTCFData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFeatures:purposes:specialFeatures:specialPurposes:stacks:vendors:tcString:thirdPartyCount:")
    public UsercentricsTCFData(NSArray<UsercentricsTCFFeature> features, NSArray<UsercentricsTCFPurpose> purposes, NSArray<UsercentricsTCFSpecialFeature> specialFeatures, NSArray<UsercentricsTCFSpecialPurpose> specialPurposes, NSArray<UsercentricsTCFStack> stacks, NSArray<UsercentricsTCFVendor> vendors, String tcString, int thirdPartyCount) { super((SkipInit) null); initObject(init(features, purposes, specialFeatures, specialPurposes, stacks, vendors, tcString, thirdPartyCount)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "features")
    public native NSArray<UsercentricsTCFFeature> getFeatures();
    @Property(selector = "purposes")
    public native NSArray<UsercentricsTCFPurpose> getPurposes();
    @Property(selector = "specialFeatures")
    public native NSArray<UsercentricsTCFSpecialFeature> getSpecialFeatures();
    @Property(selector = "specialPurposes")
    public native NSArray<UsercentricsTCFSpecialPurpose> getSpecialPurposes();
    @Property(selector = "stacks")
    public native NSArray<UsercentricsTCFStack> getStacks();
    @Property(selector = "tcString")
    public native String getTcString();
    @Property(selector = "thirdPartyCount")
    public native int getThirdPartyCount();
    @Property(selector = "vendors")
    public native NSArray<UsercentricsTCFVendor> getVendors();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFeatures:purposes:specialFeatures:specialPurposes:stacks:vendors:tcString:thirdPartyCount:")
    protected native @Pointer long init(NSArray<UsercentricsTCFFeature> features, NSArray<UsercentricsTCFPurpose> purposes, NSArray<UsercentricsTCFSpecialFeature> specialFeatures, NSArray<UsercentricsTCFSpecialPurpose> specialPurposes, NSArray<UsercentricsTCFStack> stacks, NSArray<UsercentricsTCFVendor> vendors, String tcString, int thirdPartyCount);
    @Method(selector = "doCopyFeatures:purposes:specialFeatures:specialPurposes:stacks:vendors:tcString:thirdPartyCount:")
    public native UsercentricsTCFData doCopy(NSArray<UsercentricsTCFFeature> features, NSArray<UsercentricsTCFPurpose> purposes, NSArray<UsercentricsTCFSpecialFeature> specialFeatures, NSArray<UsercentricsTCFSpecialPurpose> specialPurposes, NSArray<UsercentricsTCFStack> stacks, NSArray<UsercentricsTCFVendor> vendors, String tcString, int thirdPartyCount);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
