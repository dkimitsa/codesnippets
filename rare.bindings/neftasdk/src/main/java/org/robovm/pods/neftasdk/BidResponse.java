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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("NeftaSDK.BidResponse")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BidResponse/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BidResponsePtr extends Ptr<BidResponse, BidResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BidResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BidResponse() {}
    protected BidResponse(Handle h, long handle) { super(h, handle); }
    protected BidResponse(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "_id")
    public native String getId();
    @Property(selector = "set_id:")
    public native void setId(String v);
    @Property(selector = "_impressionId")
    public native String getImpressionId();
    @Property(selector = "set_impressionId:")
    public native void setImpressionId(String v);
    @Property(selector = "_price")
    public native float getPrice();
    @Property(selector = "set_price:")
    public native void setPrice(float v);
    @Property(selector = "_winNoticeUrl")
    public native String getWinNoticeUrl();
    @Property(selector = "set_winNoticeUrl:")
    public native void setWinNoticeUrl(String v);
    @Property(selector = "_adMarkup")
    public native String getAdMarkup();
    @Property(selector = "set_adMarkup:")
    public native void setAdMarkup(String v);
    @Property(selector = "_adMarkupType")
    public native AdMarkupTypes getAdMarkupType();
    @Property(selector = "set_adMarkupType:")
    public native void setAdMarkupType(AdMarkupTypes v);
    @Property(selector = "_campaignId")
    public native String getCampaignId();
    @Property(selector = "set_campaignId:")
    public native void setCampaignId(String v);
    @Property(selector = "_creativeQualityCheck")
    public native boolean isCreativeQualityCheck();
    @Property(selector = "set_creativeQualityCheck:")
    public native void setCreativeQualityCheck(boolean v);
    @Property(selector = "_trackingClickUrl")
    public native String getTrackingClickUrl();
    @Property(selector = "set_trackingClickUrl:")
    public native void setTrackingClickUrl(String v);
    @Property(selector = "_redirectClickUrl")
    public native String getRedirectClickUrl();
    @Property(selector = "set_redirectClickUrl:")
    public native void setRedirectClickUrl(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
