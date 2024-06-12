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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsServiceConsentTemplate/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*/implements UsercentricsConsentTemplate/*</implements>*/ {

    /*<ptr>*/public static class UsercentricsServiceConsentTemplatePtr extends Ptr<UsercentricsServiceConsentTemplate, UsercentricsServiceConsentTemplatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsServiceConsentTemplate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsServiceConsentTemplate() {}
    protected UsercentricsServiceConsentTemplate(Handle h, long handle) { super(h, handle); }
    protected UsercentricsServiceConsentTemplate(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIsDeactivated:defaultConsentStatus:templateId:version:categorySlug:description:isHidden:subConsents:isAutoUpdateAllowed:legalBasisList:disableLegalBasis:")
    public UsercentricsServiceConsentTemplate(UsercentricsBoolean isDeactivated, UsercentricsBoolean defaultConsentStatus, String templateId, String version, String categorySlug, String description, boolean isHidden, NSArray<UsercentricsSubConsentTemplate> subConsents, UsercentricsBoolean isAutoUpdateAllowed, NSArray<NSString> legalBasisList, UsercentricsBoolean disableLegalBasis) { super((SkipInit) null); initObject(init(isDeactivated, defaultConsentStatus, templateId, version, categorySlug, description, isHidden, subConsents, isAutoUpdateAllowed, legalBasisList, disableLegalBasis)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "categorySlug")
    public native String getCategorySlug();
    @Property(selector = "defaultConsentStatus")
    public native UsercentricsBoolean getDefaultConsentStatus();
    @Property(selector = "description_")
    public native String getDescription_();
    @Property(selector = "disableLegalBasis")
    public native UsercentricsBoolean getDisableLegalBasis();
    @Property(selector = "isAutoUpdateAllowed")
    public native UsercentricsBoolean getIsAutoUpdateAllowed();
    @Property(selector = "isDeactivated")
    public native UsercentricsBoolean getIsDeactivated();
    @Property(selector = "isHidden")
    public native boolean isHidden();
    @Property(selector = "legalBasisList")
    public native NSArray<NSString> getLegalBasisList();
    @Property(selector = "subConsents")
    public native NSArray<UsercentricsSubConsentTemplate> getSubConsents();
    @Property(selector = "templateId")
    public native String getTemplateId();
    @Property(selector = "version")
    public native String getVersion();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIsDeactivated:defaultConsentStatus:templateId:version:categorySlug:description:isHidden:subConsents:isAutoUpdateAllowed:legalBasisList:disableLegalBasis:")
    protected native @Pointer long init(UsercentricsBoolean isDeactivated, UsercentricsBoolean defaultConsentStatus, String templateId, String version, String categorySlug, String description, boolean isHidden, NSArray<UsercentricsSubConsentTemplate> subConsents, UsercentricsBoolean isAutoUpdateAllowed, NSArray<NSString> legalBasisList, UsercentricsBoolean disableLegalBasis);
    @Method(selector = "doCopyIsDeactivated:defaultConsentStatus:templateId:version:categorySlug:description:isHidden:subConsents:isAutoUpdateAllowed:legalBasisList:disableLegalBasis:")
    public native UsercentricsServiceConsentTemplate doCopy(UsercentricsBoolean isDeactivated, UsercentricsBoolean defaultConsentStatus, String templateId, String version, String categorySlug, String description, boolean isHidden, NSArray<UsercentricsSubConsentTemplate> subConsents, UsercentricsBoolean isAutoUpdateAllowed, NSArray<NSString> legalBasisList, UsercentricsBoolean disableLegalBasis);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
