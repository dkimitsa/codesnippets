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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsVendorUrl/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsVendorUrlPtr extends Ptr<UsercentricsVendorUrl, UsercentricsVendorUrlPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsVendorUrl.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsVendorUrl() {}
    protected UsercentricsVendorUrl(Handle h, long handle) { super(h, handle); }
    protected UsercentricsVendorUrl(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLangId:privacy:legIntClaim:")
    public UsercentricsVendorUrl(String langId, String privacy, String legIntClaim) { super((SkipInit) null); initObject(init(langId, privacy, legIntClaim)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "langId")
    public native String getLangId();
    @Property(selector = "legIntClaim")
    public native String getLegIntClaim();
    @Property(selector = "privacy")
    public native String getPrivacy();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLangId:privacy:legIntClaim:")
    protected native @Pointer long init(String langId, String privacy, String legIntClaim);
    @Method(selector = "doCopyLangId:privacy:legIntClaim:")
    public native UsercentricsVendorUrl doCopy(String langId, String privacy, String legIntClaim);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
