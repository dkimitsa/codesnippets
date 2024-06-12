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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsTCFPurpose/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsTCFPurposePtr extends Ptr<UsercentricsTCFPurpose, UsercentricsTCFPurposePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsTCFPurpose.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsTCFPurpose() {}
    protected UsercentricsTCFPurpose(Handle h, long handle) { super(h, handle); }
    protected UsercentricsTCFPurpose(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPurposeDescription:illustrations:id:name:consent:isPartOfASelectedStack:legitimateInterestConsent:showConsentToggle:showLegitimateInterestToggle:stackId:numberOfVendors:")
    public UsercentricsTCFPurpose(String purposeDescription, NSArray<NSString> illustrations, int id, String name, UsercentricsBoolean consent, boolean isPartOfASelectedStack, UsercentricsBoolean legitimateInterestConsent, boolean showConsentToggle, boolean showLegitimateInterestToggle, UsercentricsInt stackId, UsercentricsInt numberOfVendors) { super((SkipInit) null); initObject(init(purposeDescription, illustrations, id, name, consent, isPartOfASelectedStack, legitimateInterestConsent, showConsentToggle, showLegitimateInterestToggle, stackId, numberOfVendors)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "consent")
    public native UsercentricsBoolean getConsent();
    @Property(selector = "id")
    public native int getId();
    @Property(selector = "illustrations")
    public native NSArray<NSString> getIllustrations();
    @Property(selector = "isPartOfASelectedStack")
    public native boolean isPartOfASelectedStack();
    @Property(selector = "legitimateInterestConsent")
    public native UsercentricsBoolean getLegitimateInterestConsent();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "numberOfVendors")
    public native UsercentricsInt getNumberOfVendors();
    @Property(selector = "purposeDescription")
    public native String getPurposeDescription();
    @Property(selector = "showConsentToggle")
    public native boolean isShowConsentToggle();
    @Property(selector = "showLegitimateInterestToggle")
    public native boolean isShowLegitimateInterestToggle();
    @Property(selector = "stackId")
    public native UsercentricsInt getStackId();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPurposeDescription:illustrations:id:name:consent:isPartOfASelectedStack:legitimateInterestConsent:showConsentToggle:showLegitimateInterestToggle:stackId:numberOfVendors:")
    protected native @Pointer long init(String purposeDescription, NSArray<NSString> illustrations, int id, String name, UsercentricsBoolean consent, boolean isPartOfASelectedStack, UsercentricsBoolean legitimateInterestConsent, boolean showConsentToggle, boolean showLegitimateInterestToggle, UsercentricsInt stackId, UsercentricsInt numberOfVendors);
    @Method(selector = "doCopyPurposeDescription:illustrations:id:name:consent:isPartOfASelectedStack:legitimateInterestConsent:showConsentToggle:showLegitimateInterestToggle:stackId:numberOfVendors:")
    public native UsercentricsTCFPurpose doCopy(String purposeDescription, NSArray<NSString> illustrations, int id, String name, UsercentricsBoolean consent, boolean isPartOfASelectedStack, UsercentricsBoolean legitimateInterestConsent, boolean showConsentToggle, boolean showLegitimateInterestToggle, UsercentricsInt stackId, UsercentricsInt numberOfVendors);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
