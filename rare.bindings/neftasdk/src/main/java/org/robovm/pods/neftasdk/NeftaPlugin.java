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
package org.robovm.pods.neftasdk;

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
import org.robovm.apple.webkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC8NeftaSDK11NeftaPlugin")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NeftaPlugin/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NeftaPluginPtr extends Ptr<NeftaPlugin, NeftaPluginPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NeftaPlugin.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NeftaPlugin() {}
    protected NeftaPlugin(Handle h, long handle) { super(h, handle); }
    protected NeftaPlugin(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "Events")
    public native NeftaEvents getEvents();
    @Property(selector = "setEvents:")
    public native void setEvents(NeftaEvents v);
    @Property(selector = "OnReady")
    public native @Block VoidBlock1<NSDictionary<NSString, Placement>> getOnReady();
    @Property(selector = "setOnReady:")
    public native void setOnReady(@Block VoidBlock1<NSDictionary<NSString, Placement>> v);
    @Property(selector = "OnBid")
    public native @Block VoidBlock2<Placement, BidResponse> getOnBid();
    @Property(selector = "setOnBid:")
    public native void setOnBid(@Block VoidBlock2<Placement, BidResponse> v);
    @Property(selector = "OnLoadStart")
    public native @Block VoidBlock1<Placement> getOnLoadStart();
    @Property(selector = "setOnLoadStart:")
    public native void setOnLoadStart(@Block VoidBlock1<Placement> v);
    @Property(selector = "OnLoadFail")
    public native @Block VoidBlock2<Placement, NSString> getOnLoadFail();
    @Property(selector = "setOnLoadFail:")
    public native void setOnLoadFail(@Block VoidBlock2<Placement, NSString> v);
    @Property(selector = "OnLoad")
    public native @Block VoidBlock1<Placement> getOnLoad();
    @Property(selector = "setOnLoad:")
    public native void setOnLoad(@Block VoidBlock1<Placement> v);
    @Property(selector = "OnShow")
    public native @Block("(,@MachineSizedSInt,@MachineSizedSInt)") VoidBlock3<Placement, Long, Long> getOnShow();
    @Property(selector = "setOnShow:")
    public native void setOnShow(@Block("(,@MachineSizedSInt,@MachineSizedSInt)") VoidBlock3<Placement, Long, Long> v);
    @Property(selector = "OnBannerChange")
    public native @Block("(,@MachineSizedSInt,@MachineSizedSInt)") VoidBlock3<Placement, Long, Long> getOnBannerChange();
    @Property(selector = "setOnBannerChange:")
    public native void setOnBannerChange(@Block("(,@MachineSizedSInt,@MachineSizedSInt)") VoidBlock3<Placement, Long, Long> v);
    @Property(selector = "OnClick")
    public native @Block VoidBlock1<Placement> getOnClick();
    @Property(selector = "setOnClick:")
    public native void setOnClick(@Block VoidBlock1<Placement> v);
    @Property(selector = "OnClose")
    public native @Block VoidBlock1<Placement> getOnClose();
    @Property(selector = "setOnClose:")
    public native void setOnClose(@Block VoidBlock1<Placement> v);
    @Property(selector = "OnReward")
    public native @Block VoidBlock1<Placement> getOnReward();
    @Property(selector = "setOnReward:")
    public native void setOnReward(@Block VoidBlock1<Placement> v);
    @Property(selector = "IOnReady")
    public native @Block VoidBlock1<NSString> getIOnReady();
    @Property(selector = "setIOnReady:")
    public native void setIOnReady(@Block VoidBlock1<NSString> v);
    @Property(selector = "IOnBid")
    public native @Block VoidBlock2<NSString, Float> getIOnBid();
    @Property(selector = "setIOnBid:")
    public native void setIOnBid(@Block VoidBlock2<NSString, Float> v);
    @Property(selector = "IOnLoadStart")
    public native @Block VoidBlock1<NSString> getIOnLoadStart();
    @Property(selector = "setIOnLoadStart:")
    public native void setIOnLoadStart(@Block VoidBlock1<NSString> v);
    @Property(selector = "IOnLoadFail")
    public native @Block VoidBlock2<NSString, NSString> getIOnLoadFail();
    @Property(selector = "setIOnLoadFail:")
    public native void setIOnLoadFail(@Block VoidBlock2<NSString, NSString> v);
    @Property(selector = "IOnLoad")
    public native @Block VoidBlock1<NSString> getIOnLoad();
    @Property(selector = "setIOnLoad:")
    public native void setIOnLoad(@Block VoidBlock1<NSString> v);
    @Property(selector = "IOnShow")
    public native @Block("(,@MachineSizedSInt,@MachineSizedSInt)") VoidBlock3<NSString, Long, Long> getIOnShow();
    @Property(selector = "setIOnShow:")
    public native void setIOnShow(@Block("(,@MachineSizedSInt,@MachineSizedSInt)") VoidBlock3<NSString, Long, Long> v);
    @Property(selector = "IOnBannerChange")
    public native @Block("(,@MachineSizedSInt,@MachineSizedSInt)") VoidBlock3<NSString, Long, Long> getIOnBannerChange();
    @Property(selector = "setIOnBannerChange:")
    public native void setIOnBannerChange(@Block("(,@MachineSizedSInt,@MachineSizedSInt)") VoidBlock3<NSString, Long, Long> v);
    @Property(selector = "IOnClick")
    public native @Block VoidBlock1<NSString> getIOnClick();
    @Property(selector = "setIOnClick:")
    public native void setIOnClick(@Block VoidBlock1<NSString> v);
    @Property(selector = "IOnClose")
    public native @Block VoidBlock1<NSString> getIOnClose();
    @Property(selector = "setIOnClose:")
    public native void setIOnClose(@Block VoidBlock1<NSString> v);
    @Property(selector = "IOnReward")
    public native @Block VoidBlock1<NSString> getIOnReward();
    @Property(selector = "setIOnReward:")
    public native void setIOnReward(@Block VoidBlock1<NSString> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "RecordWithEvent:")
    public native void Record(String event);
    @Method(selector = "EnableAds:")
    public native void EnableAds(boolean enable);
    @Method(selector = "EnableBannerWithEnable:")
    public native void EnableBanner(boolean enable);
    @Method(selector = "EnableBannerWithId:enable:")
    public native void EnableBanner(String id, boolean enable);
    @Method(selector = "SetPublisherUserIdWithId:")
    public native void SetPublisherUserId(String id);
    @Method(selector = "SetPlacementModeWithType:mode:")
    public native void SetPlacementMode(Types type, Modes mode);
    @Method(selector = "SetPlacementModeWithId:mode:")
    public native void SetPlacementMode(String id, Modes mode);
    @Method(selector = "BidWithType:")
    public native void Bid(Types type);
    @Method(selector = "BidWithId:")
    public native void Bid(String id);
    @Method(selector = "LoadWithType:")
    public native void Load(Types type);
    @Method(selector = "LoadWithId:")
    public native void Load(String id);
    @Method(selector = "IsReadyWithType:")
    public native boolean IsReady(Types type);
    @Method(selector = "IsReadyWithId:")
    public native boolean IsReady(String id);
    @Method(selector = "ShowWithType:")
    public native void Show(Types type);
    @Method(selector = "ShowWithId:")
    public native void Show(String id);
    @Method(selector = "ShowMainWithId:")
    public native void ShowMain(String id);
    @Method(selector = "Close")
    public native void Close();
    @Method(selector = "CloseWithId:")
    public native void Close(String id);
    @Method(selector = "Mute:")
    public native void Mute(boolean mute);
    @Method(selector = "GetNuidWithPresent:")
    public native String GetNuid(boolean present);
    @Method(selector = "GetViewForPlacement:show:")
    public native UIView GetViewForPlacement(Placement placement, boolean show);
    @Method(selector = "Version")
    public static native String Version();
    @Method(selector = "OnLog")
    public static native @Block VoidBlock1<NSString> OnLog(String p0);
    @Method(selector = "setOnLog:")
    public static native void setOnLog(@Block VoidBlock1<NSString> value);
    /*</methods>*/
}
