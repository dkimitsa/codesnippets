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
package org.robovm.pods.iubenda;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC7iubenda23IubendaCMPConfiguration")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IubendaCMPConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IubendaCMPConfigurationPtr extends Ptr<IubendaCMPConfiguration, IubendaCMPConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IubendaCMPConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IubendaCMPConfiguration() {}
    protected IubendaCMPConfiguration(Handle h, long handle) { super(h, handle); }
    protected IubendaCMPConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "csVersion")
    public native String getCsVersion();
    @Property(selector = "setCsVersion:")
    public native void setCsVersion(String v);
    @Property(selector = "gdprEnabled")
    public native boolean isGdprEnabled();
    @Property(selector = "setGdprEnabled:")
    public native void setGdprEnabled(boolean v);
    @Property(selector = "forceConsent")
    public native boolean isForceConsent();
    @Property(selector = "setForceConsent:")
    public native void setForceConsent(boolean v);
    @Property(selector = "googleAds")
    public native boolean isGoogleAds();
    @Property(selector = "setGoogleAds:")
    public native void setGoogleAds(boolean v);
    @Property(selector = "applyStyles")
    public native boolean isApplyStyles();
    @Property(selector = "setApplyStyles:")
    public native void setApplyStyles(boolean v);
    @Property(selector = "acceptIfDismissed")
    public native boolean isAcceptIfDismissed();
    @Property(selector = "setAcceptIfDismissed:")
    public native void setAcceptIfDismissed(boolean v);
    @Property(selector = "preventDismissWhenLoaded")
    public native boolean isPreventDismissWhenLoaded();
    @Property(selector = "setPreventDismissWhenLoaded:")
    public native void setPreventDismissWhenLoaded(boolean v);
    @Property(selector = "skipNoticeWhenOffline")
    public native boolean isSkipNoticeWhenOffline();
    @Property(selector = "setSkipNoticeWhenOffline:")
    public native void setSkipNoticeWhenOffline(boolean v);
    @Property(selector = "siteId")
    public native String getSiteId();
    @Property(selector = "setSiteId:")
    public native void setSiteId(String v);
    @Property(selector = "cookiePolicyId")
    public native String getCookiePolicyId();
    @Property(selector = "setCookiePolicyId:")
    public native void setCookiePolicyId(String v);
    @Property(selector = "cssUrl")
    public native String getCssUrl();
    @Property(selector = "setCssUrl:")
    public native void setCssUrl(String v);
    @Property(selector = "cssFile")
    public native String getCssFile();
    @Property(selector = "setCssFile:")
    public native void setCssFile(String v);
    @Property(selector = "cssContent")
    public native String getCssContent();
    @Property(selector = "setCssContent:")
    public native void setCssContent(String v);
    @Property(selector = "jsonFile")
    public native String getJsonFile();
    @Property(selector = "setJsonFile:")
    public native void setJsonFile(String v);
    @Property(selector = "jsonContent")
    public native String getJsonContent();
    @Property(selector = "setJsonContent:")
    public native void setJsonContent(String v);
    @Property(selector = "dismissColor")
    public native UIColor getDismissColor();
    @Property(selector = "setDismissColor:")
    public native void setDismissColor(UIColor v);
    @Property(selector = "bannerPosition")
    public native BannerPosition getBannerPosition();
    @Property(selector = "setBannerPosition:")
    public native void setBannerPosition(BannerPosition v);
    @Property(selector = "portraitWidth")
    public native @MachineSizedSInt long getPortraitWidth();
    @Property(selector = "setPortraitWidth:")
    public native void setPortraitWidth(@MachineSizedSInt long v);
    @Property(selector = "portraitHeight")
    public native @MachineSizedSInt long getPortraitHeight();
    @Property(selector = "setPortraitHeight:")
    public native void setPortraitHeight(@MachineSizedSInt long v);
    @Property(selector = "landscapeWidth")
    public native @MachineSizedSInt long getLandscapeWidth();
    @Property(selector = "setLandscapeWidth:")
    public native void setLandscapeWidth(@MachineSizedSInt long v);
    @Property(selector = "landscapeHeight")
    public native @MachineSizedSInt long getLandscapeHeight();
    @Property(selector = "setLandscapeHeight:")
    public native void setLandscapeHeight(@MachineSizedSInt long v);
    @Property(selector = "proxyUrl")
    public native String getProxyUrl();
    @Property(selector = "setProxyUrl:")
    public native void setProxyUrl(String v);
    @Property(selector = "automaticHandlingOfAtt")
    public native boolean isAutomaticHandlingOfAtt();
    @Property(selector = "setAutomaticHandlingOfAtt:")
    public native void setAutomaticHandlingOfAtt(boolean v);
    @Property(selector = "description")
    public native String getDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
