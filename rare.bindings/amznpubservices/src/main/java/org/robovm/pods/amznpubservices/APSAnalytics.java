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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/APSAnalytics/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class APSAnalyticsPtr extends Ptr<APSAnalytics, APSAnalyticsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(APSAnalytics.class); }/*</bind>*/
    /*<constants>*/
    public static final int EXCEPTION_LOG_SIZE = 2048;
    public static final String TRUNCATE_SEPARATOR = "...";
    public static final String EMPTY_STRING = "";
    public static final String MANUFACTURER = "Apple";
    public static final String HW_MACHINE = "hw.machine";
    public static final String TYPE_EXCEPTION = "Exception";
    public static final String TYPE_LOG = "Log";
    public static final String SEVERITY_FATAL = "Fatal";
    public static final String SEVERITY_ERROR = "Error";
    public static final String SEVERITY_INFO = "Info";
    public static final String SEVERITY_WARN = "Warn";
    public static final String SEVERITY_DEBUG = "Debug";
    public static final String SDK_VERSION = "1.0";
    public static final int SAMPLING_LOWER_LIMIT = 0;
    public static final int SAMPLING_UPPER_LIMIT = 100;
    public static final int DEFAULT_SAMPLING_RATE = 1;
    public static final int ADDITIONAL_DETAILS_DICT_LIMIT = 20;
    public static final int ADDITIONAL_VALUE_SIZE_LIMIT = 100;
    public static final String CONTENT_TYPE_HEADER = "Content-Type";
    public static final String CONTENT_TYPE_VALUE = "application/json";
    public static final String API_HEADER = "x-api-key";
    public static final String HTTP_POST_METHOD = "POST";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final int SOCK_TIMEOUT = 10000;
    /*</constants>*/
    /*<constructors>*/
    public APSAnalytics() {}
    protected APSAnalytics(Handle h, long handle) { super(h, handle); }
    protected APSAnalytics(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "version")
    public static native String getVersion();
    @Property(selector = "sdkVersion")
    public static native String getSdkVersion();
    @Property(selector = "setSdkVersion:")
    public static native void setSdkVersion(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="APS_ANALYTICS_DEFAULT_API_KEY", optional=true)
    public static native String DEFAULT_API_KEY();
    @GlobalValue(symbol="APS_ANALYTICS_HTTP_URL", optional=true)
    public static native String HTTP_URL();
    @GlobalValue(symbol="APS_ANALYTICS_GAMMA_HTTP_URL", optional=true)
    public static native String GAMMA_HTTP_URL();
    @GlobalValue(symbol="APS_ANALYTICS_BETA_HTTP_URL", optional=true)
    public static native String BETA_HTTP_URL();
    
    @Method(selector = "init:")
    public static native void init(String appName);
    @Method(selector = "init:samplingRate:")
    public static native void init(String appName, @MachineSizedSInt long samplingRate);
    @Method(selector = "init:samplingRate:apiKey:")
    public static native void init(String appName, @MachineSizedSInt long samplingRate, String apikey);
    @Method(selector = "setApiKey:")
    public static native void setApiKey(String apiKey);
    @Method(selector = "setSamplingRate:")
    public static native void setSamplingRate(@MachineSizedSInt long samplingRate);
    @Method(selector = "setEndpointUrl:")
    public static native void setEndpointUrl(String httpUrl);
    @Method(selector = "setAdapterVersion:")
    public static native void setAdapterVersion(String adapterVersion);
    @Method(selector = "logEvent:eventType:errorDetails:exception:")
    public static native void logEvent(APSEventSeverity severity, APSEventType eventType, String errorDetails, NSException exception);
    @Method(selector = "logEvent:eventType:exception:")
    public static native void logEvent(APSEventSeverity severity, APSEventType eventType, NSException exception);
    @Method(selector = "logEvent:eventType:errorDetails:")
    public static native void logEvent(APSEventSeverity severity, APSEventType eventType, String errorDetails);
    @Method(selector = "addAdditionalDetails:value:")
    public static native void addAdditionalDetails(String key, String value);
    @Method(selector = "removeAdditionalDetails:")
    public static native void removeAdditionalDetails(String key);
    @Method(selector = "getAdditionalDetails")
    public static native String getAdditionalDetails();
    @Method(selector = "isInitialized")
    public static native boolean isInitialized();
    @Method(selector = "isSamplingAllowed")
    public static native boolean isSamplingAllowed();
    @Method(selector = "getAppName")
    public static native String getAppName();
    @Method(selector = "getApiKey")
    public static native String getApiKey();
    @Method(selector = "getEndpointUrl")
    public static native String getEndpointUrl();
    /*</methods>*/
}
