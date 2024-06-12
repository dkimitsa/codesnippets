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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUILanguage/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUILanguagePtr extends Ptr<UsercentricsPredefinedUILanguage, UsercentricsPredefinedUILanguagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUILanguage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUILanguage() {}
    protected UsercentricsPredefinedUILanguage(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUILanguage(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIsoCode:")
    public UsercentricsPredefinedUILanguage(String isoCode) { super((SkipInit) null); initObject(init(isoCode)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fullName")
    public native String getFullName();
    @Property(selector = "isoCode")
    public native String getIsoCode();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIsoCode:")
    protected native @Pointer long init(String isoCode);
    @Method(selector = "doCopyIsoCode:")
    public native UsercentricsPredefinedUILanguage doCopyIsoCode(String isoCode);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
