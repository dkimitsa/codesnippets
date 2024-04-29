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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DTBAdLoader/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DTBAdLoaderPtr extends Ptr<DTBAdLoader, DTBAdLoaderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DTBAdLoader.class); }/*</bind>*/
    /*<constants>*/
    public static class Constants {
        public static final String A9_BID_ID_KEY = "amzn_b";
        public static final String A9_HOST_KEY = "amzn_h";
        public static final String A9_PRICE_POINTS_KEY = "amznslots";
        public static final String A9_VID_KEY = "amzn_vid";
        public static final String A9_SKADN_KEY = "amzn_skadn";
        public static final String APS_VIDEO_FLAG = "isv";
        public static final String APS_VIDEO_TYPE = "vtype";
        public static final String APS_VIDEO_SKIP_AFTER = "skipafter";
        public static final String APS_APP_KEY = "appkey";
    }
    /*</constants>*/
    /*<constructors>*/
    public DTBAdLoader() {}
    protected DTBAdLoader(Handle h, long handle) { super(h, handle); }
    protected DTBAdLoader(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "slotGroup")
    public native String getSlotGroup();
    @Property(selector = "setSlotGroup:")
    public native void setSlotGroup(String v);
    @Property(selector = "correlationId")
    public native String getCorrelationId();
    @Property(selector = "setCorrelationId:")
    public native void setCorrelationId(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setAdSizes:")
    public native void setAdSizes(NSArray<?> adSizes);
    @Method(selector = "putCustomTarget:withKey:")
    public native void putCustomTarget(String value, String key);
    @Method(selector = "loadAd:")
    public native void loadAd(DTBAdCallback callback);
    @Method(selector = "loadSmartBanner:")
    public native NSError loadSmartBanner(DTBAdCallback callback);
    @Method(selector = "setAutoRefresh")
    public native void setAutoRefresh();
    @Method(selector = "stop")
    public native void stop();
    @Method(selector = "setAutoRefresh:")
    public native void setAutoRefresh(int seconds);
    @Method(selector = "pauseAutorefresh")
    public native void pauseAutorefresh();
    @Method(selector = "resumeAutorefresh")
    public native void resumeAutorefresh();
    @Method(selector = "setRefreshFlag:")
    public native void setRefreshFlag(boolean flag);
    /*</methods>*/
}
