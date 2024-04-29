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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/APSEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class APSEventPtr extends Ptr<APSEvent, APSEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(APSEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public APSEvent() {}
    protected APSEvent(Handle h, long handle) { super(h, handle); }
    protected APSEvent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSeverity:eventType:")
    public APSEvent(APSEventSeverity severity, APSEventType eventType) { super((SkipInit) null); initObject(init(severity, eventType)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "version")
    public native String getVersion();
    @Property(selector = "setVersion:")
    public native void setVersion(String v);
    @Property(selector = "eventType")
    public native String getEventType();
    @Property(selector = "setEventType:")
    public native void setEventType(String v);
    @Property(selector = "timestamp")
    public native String getTimestamp();
    @Property(selector = "setTimestamp:")
    public native void setTimestamp(String v);
    @Property(selector = "severity")
    public native String getSeverity();
    @Property(selector = "setSeverity:")
    public native void setSeverity(String v);
    @Property(selector = "pkgName")
    public native String getPkgName();
    @Property(selector = "setPkgName:")
    public native void setPkgName(String v);
    @Property(selector = "osName")
    public native String getOsName();
    @Property(selector = "setOsName:")
    public native void setOsName(String v);
    @Property(selector = "osVersion")
    public native String getOsVersion();
    @Property(selector = "setOsVersion:")
    public native void setOsVersion(String v);
    @Property(selector = "deviceManufacturer")
    public native String getDeviceManufacturer();
    @Property(selector = "setDeviceManufacturer:")
    public native void setDeviceManufacturer(String v);
    @Property(selector = "deviceModel")
    public native String getDeviceModel();
    @Property(selector = "setDeviceModel:")
    public native void setDeviceModel(String v);
    @Property(selector = "configVersion")
    public native String getConfigVersion();
    @Property(selector = "setConfigVersion:")
    public native void setConfigVersion(String v);
    @Property(selector = "errorDetails")
    public native String getErrorDetails();
    @Property(selector = "setErrorDetails:")
    public native void setErrorDetails(String v);
    @Property(selector = "exceptionLog")
    public native String getExceptionLog();
    @Property(selector = "setExceptionLog:")
    public native void setExceptionLog(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSeverity:eventType:")
    protected native @Pointer long init(APSEventSeverity severity, APSEventType eventType);
    @Method(selector = "setEventTypeValue:")
    public native void setEventTypeValue(APSEventType eventType);
    @Method(selector = "setEventSeverityValue:")
    public native void setEventSeverityValue(APSEventSeverity severity);
    @Method(selector = "setExceptionDetailValue:")
    public native void setExceptionDetailValue(NSException exception);
    @Method(selector = "setTimestampValue:")
    public native void setTimestampValue(@MachineSizedSInt long timestamp);
    @Method(selector = "setErrorDetailsValue:")
    public native void setErrorDetailsValue(String errorDetails);
    @Method(selector = "toJsonData")
    public native NSData toJsonData();
    @Method(selector = "deviceModelVersion")
    public native String deviceModelVersion();
    /*</methods>*/
}
