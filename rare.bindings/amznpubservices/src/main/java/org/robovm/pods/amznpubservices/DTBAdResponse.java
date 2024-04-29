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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DTBAdResponse/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DTBAdResponsePtr extends Ptr<DTBAdResponse, DTBAdResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DTBAdResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public DTBAdResponse() {}
    protected DTBAdResponse(Handle h, long handle) { super(h, handle); }
    protected DTBAdResponse(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bidId")
    public native String getBidId();
    @Property(selector = "setBidId:")
    public native void setBidId(String v);
    @Property(selector = "isVideo")
    public native boolean isVideo();
    @Property(selector = "setIsVideo:")
    public native void setIsVideo(boolean v);
    @Property(selector = "kvp")
    public native NSDictionary<?, ?> getKvp();
    @Property(selector = "setKvp:")
    public native void setKvp(NSDictionary<?, ?> v);
    @Property(selector = "skAdNetworkParams")
    public native NSDictionary<?, ?> getSkAdNetworkParams();
    @Property(selector = "setSkAdNetworkParams:")
    public native void setSkAdNetworkParams(NSDictionary<?, ?> v);
    @Property(selector = "clickTrackersArray")
    public native NSArray<?> getClickTrackersArray();
    @Property(selector = "setClickTrackersArray:")
    public native void setClickTrackersArray(NSArray<?> v);
    @Property(selector = "dtbAdLoader")
    public native DTBAdLoader getDtbAdLoader();
    @Property(selector = "setDtbAdLoader:")
    public native void setDtbAdLoader(DTBAdLoader v);
    @Property(selector = "videoSkipAfterDurationInSeconds")
    public native @MachineSizedSInt long getVideoSkipAfterDurationInSeconds();
    @Property(selector = "videoInventoryType")
    public native String getVideoInventoryType();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addDTBPricePoint:")
    public native void addDTBPricePoint(NSObject pp);
    @Method(selector = "crid")
    public native String crid();
    @Method(selector = "hostname")
    public native String hostname();
    @Method(selector = "adSizes")
    public native NSArray<?> adSizes();
    @Deprecated
    @Method(selector = "pricePoints:")
    public native String pricePoints(DTBAdSize adSize);
    @Deprecated
    @Method(selector = "defaultPricePoints")
    public native String defaultPricePoints();
    @Method(selector = "adSize")
    public native DTBAdSize adSize();
    @Method(selector = "customTargeting")
    public native NSDictionary<NSString, NSString> customTargeting();
    @Method(selector = "getAdLoader")
    public native DTBAdLoader getAdLoader();
    @Method(selector = "bidInfo")
    public native String bidInfo();
    @Method(selector = "amznSlots")
    public native String amznSlots();
    @Method(selector = "mediationHints:")
    public native NSDictionary<?, ?> mediationHints(boolean isSmartBanner);
    @Method(selector = "mediationHints")
    public native NSDictionary<?, ?> mediationHints();
    @Method(selector = "setHostName:")
    public native void setHostName(String hostName);
    @Method(selector = "setCrid:")
    public native void setCrid(String crid);
    /*</methods>*/
}
