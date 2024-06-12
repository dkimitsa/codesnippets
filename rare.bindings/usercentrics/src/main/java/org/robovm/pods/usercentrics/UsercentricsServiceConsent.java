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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UsercentricsUsercentricsServiceConsent")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsServiceConsent/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsServiceConsentPtr extends Ptr<UsercentricsServiceConsent, UsercentricsServiceConsentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsServiceConsent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsServiceConsent() {}
    protected UsercentricsServiceConsent(Handle h, long handle) { super(h, handle); }
    protected UsercentricsServiceConsent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTemplateId:status:history:type:dataProcessor:version:isEssential:")
    public UsercentricsServiceConsent(String templateId, boolean status, NSArray<UsercentricsConsentHistoryEntry> history, UsercentricsConsentType type, String dataProcessor, String version, boolean isEssential) { super((SkipInit) null); initObject(init(templateId, status, history, type, dataProcessor, version, isEssential)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dataProcessor")
    public native String getDataProcessor();
    @Property(selector = "history")
    public native NSArray<UsercentricsConsentHistoryEntry> getHistory();
    @Property(selector = "isEssential")
    public native boolean isEssential();
    @Property(selector = "status")
    public native boolean isStatus();
    @Property(selector = "templateId")
    public native String getTemplateId();
    @Property(selector = "type")
    public native UsercentricsConsentType getType();
    @Property(selector = "version")
    public native String getVersion();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTemplateId:status:history:type:dataProcessor:version:isEssential:")
    protected native @Pointer long init(String templateId, boolean status, NSArray<UsercentricsConsentHistoryEntry> history, UsercentricsConsentType type, String dataProcessor, String version, boolean isEssential);
    @Method(selector = "doCopyTemplateId:status:history:type:dataProcessor:version:isEssential:")
    public native UsercentricsServiceConsent doCopy(String templateId, boolean status, NSArray<UsercentricsConsentHistoryEntry> history, UsercentricsConsentType type, String dataProcessor, String version, boolean isEssential);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
