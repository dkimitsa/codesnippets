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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsUnityDataRetention/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsUnityDataRetentionPtr extends Ptr<UsercentricsUnityDataRetention, UsercentricsUnityDataRetentionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsUnityDataRetention.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsUnityDataRetention() {}
    protected UsercentricsUnityDataRetention(Handle h, long handle) { super(h, handle); }
    protected UsercentricsUnityDataRetention(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDataRetention:")
    public UsercentricsUnityDataRetention(UsercentricsDataRetention dataRetention) { super((SkipInit) null); initObject(init(dataRetention)); }
    @Method(selector = "initWithPurposes:specialPurposes:_stdRetention:")
    public UsercentricsUnityDataRetention(UsercentricsRetentionPeriod purposes, UsercentricsRetentionPeriod specialPurposes, String _stdRetention) { super((SkipInit) null); initObject(init(purposes, specialPurposes, _stdRetention)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "_stdRetention")
    public native String get_stdRetention();
    @Property(selector = "purposes")
    public native UsercentricsRetentionPeriod getPurposes();
    @Property(selector = "specialPurposes")
    public native UsercentricsRetentionPeriod getSpecialPurposes();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDataRetention:")
    protected native @Pointer long init(UsercentricsDataRetention dataRetention);
    @Method(selector = "initWithPurposes:specialPurposes:_stdRetention:")
    protected native @Pointer long init(UsercentricsRetentionPeriod purposes, UsercentricsRetentionPeriod specialPurposes, String _stdRetention);
    @Method(selector = "doCopyPurposes:specialPurposes:_stdRetention:")
    public native UsercentricsUnityDataRetention doCopy(UsercentricsRetentionPeriod purposes, UsercentricsRetentionPeriod specialPurposes, String _stdRetention);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
