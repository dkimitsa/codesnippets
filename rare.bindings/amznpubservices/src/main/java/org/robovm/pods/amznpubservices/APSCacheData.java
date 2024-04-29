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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/APSCacheData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class APSCacheDataPtr extends Ptr<APSCacheData, APSCacheDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(APSCacheData.class); }/*</bind>*/
    /*<constants>*/
    public static final int DEFAULT_ADMOB_AUTO_REFRESH_TIME_IN_SEC = 29;
    /*</constants>*/
    /*<constructors>*/
    public APSCacheData() {}
    protected APSCacheData(Handle h, long handle) { super(h, handle); }
    protected APSCacheData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRequestId:adLoaderReq:")
    public APSCacheData(String requestId, DTBAdLoader adLoaderReq) { super((SkipInit) null); initObject(init(requestId, adLoaderReq)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adLoaderReq")
    public native DTBAdLoader getAdLoaderReq();
    @Property(selector = "setAdLoaderReq:")
    public native void setAdLoaderReq(DTBAdLoader v);
    @Property(selector = "adResponse")
    public native DTBAdResponse getAdResponse();
    @Property(selector = "setAdResponse:")
    public native void setAdResponse(DTBAdResponse v);
    @Property(selector = "timestamp")
    public native NSNumber getTimestamp();
    @Property(selector = "setTimestamp:")
    public native void setTimestamp(NSNumber v);
    @Property(selector = "requestId")
    public native String getRequestId();
    @Property(selector = "setRequestId:")
    public native void setRequestId(String v);
    @Property(selector = "serverParameter")
    public native String getServerParameter();
    @Property(selector = "setServerParameter:")
    public native void setServerParameter(String v);
    @Property(selector = "request")
    public native NSObject getRequest();
    @Property(selector = "setRequest:")
    public native void setRequest(NSObject v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRequestId:adLoaderReq:")
    protected native @Pointer long init(String requestId, DTBAdLoader adLoaderReq);
    /*</methods>*/
}
