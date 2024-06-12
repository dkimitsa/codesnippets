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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUIProcessingCompany/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUIProcessingCompanyPtr extends Ptr<UsercentricsPredefinedUIProcessingCompany, UsercentricsPredefinedUIProcessingCompanyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUIProcessingCompany.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUIProcessingCompany() {}
    protected UsercentricsPredefinedUIProcessingCompany(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUIProcessingCompany(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAddress:dataProtectionOfficer:name:")
    public UsercentricsPredefinedUIProcessingCompany(String address, String dataProtectionOfficer, String name) { super((SkipInit) null); initObject(init(address, dataProtectionOfficer, name)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "address")
    public native String getAddress();
    @Property(selector = "dataProtectionOfficer")
    public native String getDataProtectionOfficer();
    @Property(selector = "name")
    public native String getName();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAddress:dataProtectionOfficer:name:")
    protected native @Pointer long init(String address, String dataProtectionOfficer, String name);
    @Method(selector = "doCopyAddress:dataProtectionOfficer:name:")
    public native UsercentricsPredefinedUIProcessingCompany doCopy(String address, String dataProtectionOfficer, String name);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
