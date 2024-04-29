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
package org.robovm.pods.amznpubservices;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/APSInitConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class APSInitConfigPtr extends Ptr<APSInitConfig, APSInitConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(APSInitConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public APSInitConfig() {}
    protected APSInitConfig(Handle h, long handle) { super(h, handle); }
    protected APSInitConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "useGeolocation")
    public native boolean isUseGeolocation();
    @Property(selector = "setUseGeolocation:")
    public native void setUseGeolocation(boolean v);
    @Property(selector = "logLevel")
    public native APSLogLevel getLogLevel();
    @Property(selector = "setLogLevel:")
    public native void setLogLevel(APSLogLevel v);
    @Property(selector = "testMode")
    public native boolean isTestMode();
    @Property(selector = "setTestMode:")
    public native void setTestMode(boolean v);
    @Property(selector = "skAdNetworkTestMode")
    public native boolean isSkAdNetworkTestMode();
    @Property(selector = "setSkAdNetworkTestMode:")
    public native void setSkAdNetworkTestMode(boolean v);
    @Property(selector = "publisherExtendedIdFeatureEnabled")
    public native boolean isPublisherExtendedIdFeatureEnabled();
    @Property(selector = "setPublisherExtendedIdFeatureEnabled:")
    public native void setPublisherExtendedIdFeatureEnabled(boolean v);
    @Property(selector = "omidPartnerName")
    public native String getOmidPartnerName();
    @Property(selector = "setOmidPartnerName:")
    public native void setOmidPartnerName(String v);
    @Property(selector = "omidPartnerVersion")
    public native String getOmidPartnerVersion();
    @Property(selector = "setOmidPartnerVersion:")
    public native void setOmidPartnerVersion(String v);
    @Property(selector = "mraidPolicy")
    public native APSMraidPolicy getMraidPolicy();
    @Property(selector = "setMraidPolicy:")
    public native void setMraidPolicy(APSMraidPolicy v);
    @Property(selector = "mraidSupportedVersions")
    public native NSArray<NSString> getMraidSupportedVersions();
    @Property(selector = "setMraidSupportedVersions:")
    public native void setMraidSupportedVersions(NSArray<NSString> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="APSMraidVersion1_0", optional=true)
    public static native NSString APSMraidVersion1_0();
    @GlobalValue(symbol="APSMraidVersion2_0", optional=true)
    public static native NSString APSMraidVersion2_0();
    @GlobalValue(symbol="APSMraidVersion3_0", optional=true)
    public static native NSString APSMraidVersion3_0();
    
    
    /*</methods>*/
}
