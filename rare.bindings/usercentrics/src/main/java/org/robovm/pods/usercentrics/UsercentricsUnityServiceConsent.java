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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsUnityServiceConsent/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsUnityServiceConsentPtr extends Ptr<UsercentricsUnityServiceConsent, UsercentricsUnityServiceConsentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsUnityServiceConsent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsUnityServiceConsent() {}
    protected UsercentricsUnityServiceConsent(Handle h, long handle) { super(h, handle); }
    protected UsercentricsUnityServiceConsent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithServiceConsent:")
    public UsercentricsUnityServiceConsent(UsercentricsServiceConsent serviceConsent) { super((SkipInit) null); initObject(init(serviceConsent)); }
    @Method(selector = "initWithTemplateId:status:history:dataProcessor:version:isEssential:_type:")
    public UsercentricsUnityServiceConsent(String templateId, boolean status, NSArray<UsercentricsConsentHistoryEntry> history, String dataProcessor, String version, boolean isEssential, String _type) { super((SkipInit) null); initObject(init(templateId, status, history, dataProcessor, version, isEssential, _type)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "_type")
    public native String get_type();
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
    @Property(selector = "version")
    public native String getVersion();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithServiceConsent:")
    protected native @Pointer long init(UsercentricsServiceConsent serviceConsent);
    @Method(selector = "initWithTemplateId:status:history:dataProcessor:version:isEssential:_type:")
    protected native @Pointer long init(String templateId, boolean status, NSArray<UsercentricsConsentHistoryEntry> history, String dataProcessor, String version, boolean isEssential, String _type);
    @Method(selector = "doCopyTemplateId:status:history:dataProcessor:version:isEssential:_type:")
    public native UsercentricsUnityServiceConsent doCopy(String templateId, boolean status, NSArray<UsercentricsConsentHistoryEntry> history, String dataProcessor, String version, boolean isEssential, String _type);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
