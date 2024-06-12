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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsConsentApplied/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsConsentAppliedPtr extends Ptr<UsercentricsConsentApplied, UsercentricsConsentAppliedPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsConsentApplied.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsConsentApplied() {}
    protected UsercentricsConsentApplied(Handle h, long handle) { super(h, handle); }
    protected UsercentricsConsentApplied(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:templateId:consent:mediated:")
    public UsercentricsConsentApplied(String name, String templateId, boolean consent, boolean mediated) { super((SkipInit) null); initObject(init(name, templateId, consent, mediated)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "consent")
    public native boolean isConsent();
    @Property(selector = "mediated")
    public native boolean isMediated();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "templateId")
    public native String getTemplateId();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:templateId:consent:mediated:")
    protected native @Pointer long init(String name, String templateId, boolean consent, boolean mediated);
    @Method(selector = "doCopyName:templateId:consent:mediated:")
    public native UsercentricsConsentApplied doCopy(String name, String templateId, boolean consent, boolean mediated);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
