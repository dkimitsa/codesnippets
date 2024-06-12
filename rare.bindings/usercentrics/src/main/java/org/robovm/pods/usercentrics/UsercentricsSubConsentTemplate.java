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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsSubConsentTemplate/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*/implements UsercentricsConsentTemplate/*</implements>*/ {

    /*<ptr>*/public static class UsercentricsSubConsentTemplatePtr extends Ptr<UsercentricsSubConsentTemplate, UsercentricsSubConsentTemplatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsSubConsentTemplate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsSubConsentTemplate() {}
    protected UsercentricsSubConsentTemplate(Handle h, long handle) { super(h, handle); }
    protected UsercentricsSubConsentTemplate(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIsDeactivated:defaultConsentStatus:templateId:version:categorySlug:description:isHidden:")
    public UsercentricsSubConsentTemplate(UsercentricsBoolean isDeactivated, UsercentricsBoolean defaultConsentStatus, String templateId, String version, String categorySlug, String description, boolean isHidden) { super((SkipInit) null); initObject(init(isDeactivated, defaultConsentStatus, templateId, version, categorySlug, description, isHidden)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "categorySlug")
    public native String getCategorySlug();
    @Property(selector = "defaultConsentStatus")
    public native UsercentricsBoolean getDefaultConsentStatus();
    @Property(selector = "description_")
    public native String getDescription_();
    @Property(selector = "isDeactivated")
    public native UsercentricsBoolean getIsDeactivated();
    @Property(selector = "isHidden")
    public native boolean isHidden();
    @Property(selector = "templateId")
    public native String getTemplateId();
    @Property(selector = "version")
    public native String getVersion();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIsDeactivated:defaultConsentStatus:templateId:version:categorySlug:description:isHidden:")
    protected native @Pointer long init(UsercentricsBoolean isDeactivated, UsercentricsBoolean defaultConsentStatus, String templateId, String version, String categorySlug, String description, boolean isHidden);
    @Method(selector = "doCopyIsDeactivated:defaultConsentStatus:templateId:version:categorySlug:description:isHidden:")
    public native UsercentricsSubConsentTemplate doCopy(UsercentricsBoolean isDeactivated, UsercentricsBoolean defaultConsentStatus, String templateId, String version, String categorySlug, String description, boolean isHidden);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
