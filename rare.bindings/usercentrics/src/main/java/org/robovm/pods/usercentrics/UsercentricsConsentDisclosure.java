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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsConsentDisclosure/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsConsentDisclosurePtr extends Ptr<UsercentricsConsentDisclosure, UsercentricsConsentDisclosurePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsConsentDisclosure.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsConsentDisclosure() {}
    protected UsercentricsConsentDisclosure(Handle h, long handle) { super(h, handle); }
    protected UsercentricsConsentDisclosure(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:type:name:maxAgeSeconds:cookieRefresh:purposes:domain:description:")
    public UsercentricsConsentDisclosure(String identifier, UsercentricsConsentDisclosureType type, String name, UsercentricsLong maxAgeSeconds, boolean cookieRefresh, NSArray<UsercentricsInt> purposes, String domain, String description) { super((SkipInit) null); initObject(init(identifier, type, name, maxAgeSeconds, cookieRefresh, purposes, domain, description)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "cookieRefresh")
    public native boolean isCookieRefresh();
    @Property(selector = "description_")
    public native String getDescription_();
    @Property(selector = "domain")
    public native String getDomain();
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "maxAgeSeconds")
    public native UsercentricsLong getMaxAgeSeconds();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "purposes")
    public native NSArray<UsercentricsInt> getPurposes();
    @Property(selector = "type")
    public native UsercentricsConsentDisclosureType getType();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:type:name:maxAgeSeconds:cookieRefresh:purposes:domain:description:")
    protected native @Pointer long init(String identifier, UsercentricsConsentDisclosureType type, String name, UsercentricsLong maxAgeSeconds, boolean cookieRefresh, NSArray<UsercentricsInt> purposes, String domain, String description);
    @Method(selector = "doCopyIdentifier:type:name:maxAgeSeconds:cookieRefresh:purposes:domain:description:")
    public native UsercentricsConsentDisclosure doCopy(String identifier, UsercentricsConsentDisclosureType type, String name, UsercentricsLong maxAgeSeconds, boolean cookieRefresh, NSArray<UsercentricsInt> purposes, String domain, String description);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
