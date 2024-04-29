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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC8NeftaSDK9Placement")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Placement/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PlacementPtr extends Ptr<Placement, PlacementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Placement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected Placement() {}
    protected Placement(Handle h, long handle) { super(h, handle); }
    protected Placement(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "_id")
    public native String getId();
    @Property(selector = "set_id:")
    public native void setId(String v);
    @Property(selector = "_width")
    public native @MachineSizedSInt long getWidth();
    @Property(selector = "set_width:")
    public native void setWidth(@MachineSizedSInt long v);
    @Property(selector = "_height")
    public native @MachineSizedSInt long getHeight();
    @Property(selector = "set_height:")
    public native void setHeight(@MachineSizedSInt long v);
    @Property(selector = "_type")
    public native Types getType();
    @Property(selector = "set_type:")
    public native void setType(Types v);
    @Property(selector = "_availableBid")
    public native BidResponse getAvailableBid();
    @Property(selector = "set_availableBid:")
    public native void setAvailableBid(BidResponse v);
    @Property(selector = "_bufferBid")
    public native BidResponse getBufferBid();
    @Property(selector = "set_bufferBid:")
    public native void setBufferBid(BidResponse v);
    @Property(selector = "_renderedBid")
    public native BidResponse getRenderedBid();
    @Property(selector = "set_renderedBid:")
    public native void setRenderedBid(BidResponse v);
    @Property(selector = "_mode")
    public native Modes getMode();
    @Property(selector = "set_mode:")
    public native void setMode(Modes v);
    @Property(selector = "_bidTime")
    public native @MachineSizedUInt long getBidTime();
    @Property(selector = "set_bidTime:")
    public native void setBidTime(@MachineSizedUInt long v);
    @Property(selector = "_loadTime")
    public native @MachineSizedUInt long getLoadTime();
    @Property(selector = "set_loadTime:")
    public native void setLoadTime(@MachineSizedUInt long v);
    @Property(selector = "_showTime")
    public native @MachineSizedUInt long getShowTime();
    @Property(selector = "set_showTime:")
    public native void setShowTime(@MachineSizedUInt long v);
    @Property(selector = "_isHidden")
    public native boolean isHidden();
    @Property(selector = "set_isHidden:")
    public native void setIsHidden(boolean v);
    @Property(selector = "_isManualPosition")
    public native boolean isManualPosition();
    @Property(selector = "set_isManualPosition:")
    public native void setIsManualPosition(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "IsBidding")
    public native boolean IsBidding();
    @Method(selector = "IsLoading")
    public native boolean IsLoading();
    @Method(selector = "IsShowing")
    public native boolean IsShowing();
    @Method(selector = "CanLoad")
    public native boolean CanLoad();
    @Method(selector = "CanShow")
    public native boolean CanShow();
    /*</methods>*/
}
