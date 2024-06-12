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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsTCF2ChangedPurposes/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsTCF2ChangedPurposesPtr extends Ptr<UsercentricsTCF2ChangedPurposes, UsercentricsTCF2ChangedPurposesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsTCF2ChangedPurposes.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsTCF2ChangedPurposes() {}
    protected UsercentricsTCF2ChangedPurposes(Handle h, long handle) { super(h, handle); }
    protected UsercentricsTCF2ChangedPurposes(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPurposes:legIntPurposes:notAllowedPurposes:")
    public UsercentricsTCF2ChangedPurposes(NSArray<UsercentricsInt> purposes, NSArray<UsercentricsInt> legIntPurposes, NSArray<UsercentricsInt> notAllowedPurposes) { super((SkipInit) null); initObject(init(purposes, legIntPurposes, notAllowedPurposes)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "legIntPurposes")
    public native NSArray<UsercentricsInt> getLegIntPurposes();
    @Property(selector = "notAllowedPurposes")
    public native NSArray<UsercentricsInt> getNotAllowedPurposes();
    @Property(selector = "purposes")
    public native NSArray<UsercentricsInt> getPurposes();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPurposes:legIntPurposes:notAllowedPurposes:")
    protected native @Pointer long init(NSArray<UsercentricsInt> purposes, NSArray<UsercentricsInt> legIntPurposes, NSArray<UsercentricsInt> notAllowedPurposes);
    @Method(selector = "doCopyPurposes:legIntPurposes:notAllowedPurposes:")
    public native UsercentricsTCF2ChangedPurposes doCopy(NSArray<UsercentricsInt> purposes, NSArray<UsercentricsInt> legIntPurposes, NSArray<UsercentricsInt> notAllowedPurposes);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
