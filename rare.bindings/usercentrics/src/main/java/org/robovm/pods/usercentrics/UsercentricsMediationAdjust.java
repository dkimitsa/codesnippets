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
package org.robovm.pods.usercentrics;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UsercentricsUsercentricsMediationAdjust")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsMediationAdjust/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsMediationAdjustPtr extends Ptr<UsercentricsMediationAdjust, UsercentricsMediationAdjustPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsMediationAdjust.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsMediationAdjust() {}
    protected UsercentricsMediationAdjust(Handle h, long handle) { super(h, handle); }
    protected UsercentricsMediationAdjust(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adjustTemplateId")
    public native String getAdjustTemplateId();
    @Property(selector = "setAdjustTemplateId:")
    public native void setAdjustTemplateId(String v);
    @Property(selector = "appleAdsTemplateId")
    public native String getAppleAdsTemplateId();
    @Property(selector = "setAppleAdsTemplateId:")
    public native void setAppleAdsTemplateId(String v);
    @Property(selector = "facebookTemplateId")
    public native String getFacebookTemplateId();
    @Property(selector = "setFacebookTemplateId:")
    public native void setFacebookTemplateId(String v);
    @Property(selector = "googleAdsTemplateId")
    public native String getGoogleAdsTemplateId();
    @Property(selector = "setGoogleAdsTemplateId:")
    public native void setGoogleAdsTemplateId(String v);
    @Property(selector = "googleMarketingPlatformTemplateId")
    public native String getGoogleMarketingPlatformTemplateId();
    @Property(selector = "setGoogleMarketingPlatformTemplateId:")
    public native void setGoogleMarketingPlatformTemplateId(String v);
    @Property(selector = "snapchatTemplateId")
    public native String getSnapchatTemplateId();
    @Property(selector = "setSnapchatTemplateId:")
    public native void setSnapchatTemplateId(String v);
    @Property(selector = "tencentTemplateId")
    public native String getTencentTemplateId();
    @Property(selector = "setTencentTemplateId:")
    public native void setTencentTemplateId(String v);
    @Property(selector = "tikTokSanTemplateId")
    public native String getTikTokSanTemplateId();
    @Property(selector = "setTikTokSanTemplateId:")
    public native void setTikTokSanTemplateId(String v);
    @Property(selector = "twitterTemplateId")
    public native String getTwitterTemplateId();
    @Property(selector = "setTwitterTemplateId:")
    public native void setTwitterTemplateId(String v);
    @Property(selector = "yahooGeminiTemplateId")
    public native String getYahooGeminiTemplateId();
    @Property(selector = "setYahooGeminiTemplateId:")
    public native void setYahooGeminiTemplateId(String v);
    @Property(selector = "yahooJapanSearchTemplateId")
    public native String getYahooJapanSearchTemplateId();
    @Property(selector = "setYahooJapanSearchTemplateId:")
    public native void setYahooJapanSearchTemplateId(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "adjust")
    public static native UsercentricsMediationAdjust adjust();
    /*</methods>*/
}
