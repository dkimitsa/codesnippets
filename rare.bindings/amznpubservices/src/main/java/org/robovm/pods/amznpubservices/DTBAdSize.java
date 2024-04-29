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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DTBAdSize/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DTBAdSizePtr extends Ptr<DTBAdSize, DTBAdSizePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DTBAdSize.class); }/*</bind>*/
    /*<constants>*/
    public static final int DTB_VIDEO_WIDTH = 640;
    public static final int DTB_VIDEO_HEIGHT = 390;
    /*</constants>*/
    /*<constructors>*/
    protected DTBAdSize() {}
    protected DTBAdSize(Handle h, long handle) { super(h, handle); }
    protected DTBAdSize(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initBannerAdSizeWithWidth:height:andSlotUUID:")
    public static  DTBAdSize createBannerAdSize(@MachineSizedSInt long width, @MachineSizedSInt long height, String slotUUID) {
       DTBAdSize res = new DTBAdSize((SkipInit) null);
       res.initObject(res.initBannerAdSizeWithWidth(width, height, slotUUID));
       return res;
    }
    @Method(selector = "initInterstitialAdSizeWithSlotUUID:")
    public static  DTBAdSize createInterstitialAdSize(String slotUUID) {
       DTBAdSize res = new DTBAdSize((SkipInit) null);
       res.initObject(res.initInterstitialAdSizeWithSlotUUID(slotUUID));
       return res;
    }
    @Method(selector = "initVideoAdSizeWithSlotUUID:")
    public static  DTBAdSize createVideoAdSize(String slotUUID) {
       DTBAdSize res = new DTBAdSize((SkipInit) null);
       res.initObject(res.initVideoAdSizeWithSlotUUID(slotUUID));
       return res;
    }
    @Method(selector = "initVideoAdSizeWithPlayerWidth:height:andSlotUUID:")
    public static  DTBAdSize createVideoAdSize(@MachineSizedSInt long width, @MachineSizedSInt long height, String slotUUID) {
       DTBAdSize res = new DTBAdSize((SkipInit) null);
       res.initObject(res.initVideoAdSizeWithPlayerWidth(width, height, slotUUID));
       return res;
    }
    @Method(selector = "initVideoAdSizeWithPlayerWidth:height:slotUUID:andPubSettings:")
    public static  DTBAdSize createVideoAdSize(@MachineSizedSInt long width, @MachineSizedSInt long height, String slotUUID, NSDictionary<?, ?> pubSettings) {
       DTBAdSize res = new DTBAdSize((SkipInit) null);
       res.initObject(res.initVideoAdSizeWithPlayerWidth(width, height, slotUUID, pubSettings));
       return res;
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adType")
    public native ADType getAdType();
    @Property(selector = "width")
    public native @MachineSizedSInt long getWidth();
    @Property(selector = "height")
    public native @MachineSizedSInt long getHeight();
    @Property(selector = "slotUUID")
    public native String getSlotUUID();
    @Property(selector = "pubSettings")
    public native NSDictionary<?, ?> getPubSettings();
    @Property(selector = "setPubSettings:")
    public native void setPubSettings(NSDictionary<?, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initBannerAdSizeWithWidth:height:andSlotUUID:")
    protected native @Pointer long initBannerAdSizeWithWidth(@MachineSizedSInt long width, @MachineSizedSInt long height, String slotUUID);
    @Method(selector = "initInterstitialAdSizeWithSlotUUID:")
    protected native @Pointer long initInterstitialAdSizeWithSlotUUID(String slotUUID);
    @Method(selector = "initVideoAdSizeWithSlotUUID:")
    protected native @Pointer long initVideoAdSizeWithSlotUUID(String slotUUID);
    @Method(selector = "initVideoAdSizeWithPlayerWidth:height:andSlotUUID:")
    protected native @Pointer long initVideoAdSizeWithPlayerWidth(@MachineSizedSInt long width, @MachineSizedSInt long height, String slotUUID);
    @Method(selector = "initVideoAdSizeWithPlayerWidth:height:slotUUID:andPubSettings:")
    protected native @Pointer long initVideoAdSizeWithPlayerWidth(@MachineSizedSInt long width, @MachineSizedSInt long height, String slotUUID, NSDictionary<?, ?> pubSettings);
    @Method(selector = "isInterstitialAd")
    public native boolean isInterstitialAd();
    /*</methods>*/
}
