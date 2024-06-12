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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UsercentricsUsercentricsOptions")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsOptions/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsOptionsPtr extends Ptr<UsercentricsOptions, UsercentricsOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UsercentricsOptions() {}
    protected UsercentricsOptions(Handle h, long handle) { super(h, handle); }
    protected UsercentricsOptions(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSettingsId:")
    public UsercentricsOptions(String settingsId) { super((SkipInit) null); initObject(init(settingsId)); }
    @Method(selector = "initWithSettingsId:defaultLanguage:version:timeoutMillis:loggerLevel:ruleSetId:consentMediation:")
    public UsercentricsOptions(String settingsId, String defaultLanguage, String version, long timeoutMillis, UsercentricsLoggerLevel loggerLevel, String ruleSetId, boolean consentMediation) { super((SkipInit) null); initObject(init(settingsId, defaultLanguage, version, timeoutMillis, loggerLevel, ruleSetId, consentMediation)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "consentMediation")
    public native boolean isConsentMediation();
    @Property(selector = "setConsentMediation:")
    public native void setConsentMediation(boolean v);
    @Property(selector = "defaultLanguage")
    public native String getDefaultLanguage();
    @Property(selector = "setDefaultLanguage:")
    public native void setDefaultLanguage(String v);
    @Property(selector = "loggerLevel")
    public native UsercentricsLoggerLevel getLoggerLevel();
    @Property(selector = "setLoggerLevel:")
    public native void setLoggerLevel(UsercentricsLoggerLevel v);
    @Property(selector = "networkMode")
    public native UsercentricsNetworkMode getNetworkMode();
    @Property(selector = "setNetworkMode:")
    public native void setNetworkMode(UsercentricsNetworkMode v);
    @Property(selector = "ruleSetId")
    public native String getRuleSetId();
    @Property(selector = "setRuleSetId:")
    public native void setRuleSetId(String v);
    @Property(selector = "settingsId")
    public native String getSettingsId();
    @Property(selector = "setSettingsId:")
    public native void setSettingsId(String v);
    @Property(selector = "timeoutMillis")
    public native long getTimeoutMillis();
    @Property(selector = "setTimeoutMillis:")
    public native void setTimeoutMillis(long v);
    @Property(selector = "version")
    public native String getVersion();
    @Property(selector = "setVersion:")
    public native void setVersion(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSettingsId:")
    protected native @Pointer long init(String settingsId);
    @Method(selector = "initWithSettingsId:defaultLanguage:version:timeoutMillis:loggerLevel:ruleSetId:consentMediation:")
    protected native @Pointer long init(String settingsId, String defaultLanguage, String version, long timeoutMillis, UsercentricsLoggerLevel loggerLevel, String ruleSetId, boolean consentMediation);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    /*</methods>*/
}
