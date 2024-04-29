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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/APSCacheManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class APSCacheManagerPtr extends Ptr<APSCacheManager, APSCacheManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(APSCacheManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public APSCacheManager() {}
    protected APSCacheManager(Handle h, long handle) { super(h, handle); }
    protected APSCacheManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addAdMobCacheWithRequestId:cacheData:")
    public static native void addAdMobCache(String requestId, APSCacheData cacheData);
    @Method(selector = "removeExpiredAdMobCaches")
    public static native void removeExpiredAdMobCaches();
    @Method(selector = "removeAdMobCacheWithRequestId:")
    public static native void removeAdMobCache(String requestId);
    @Method(selector = "getAdMobCacheDataDictionary")
    public static native NSMutableDictionary<?, ?> getAdMobCacheDataDictionary();
    @Method(selector = "getAdMobCacheWithRequestId:")
    public static native APSCacheData getAdMobCache(String requestId);
    @Method(selector = "containsAutoRefreshRequestId:")
    public static native boolean containsAutoRefreshRequestId(String requestId);
    @Method(selector = "addAutoRefreshId:")
    public static native void addAutoRefreshId(String requestId);
    /*</methods>*/
}
