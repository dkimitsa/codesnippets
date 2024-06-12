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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUIApplicationManager/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUIApplicationManagerPtr extends Ptr<UsercentricsPredefinedUIApplicationManager, UsercentricsPredefinedUIApplicationManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUIApplicationManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUIApplicationManager() {}
    protected UsercentricsPredefinedUIApplicationManager(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUIApplicationManager(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConsentManager:logger:cookieInformationService:bannerViewDataService:")
    public UsercentricsPredefinedUIApplicationManager(UsercentricsPredefinedUIConsentManager consentManager, UsercentricsLogger logger, UsercentricsCookieInformationService cookieInformationService, UsercentricsBannerViewDataService bannerViewDataService) { super((SkipInit) null); initObject(init(consentManager, logger, cookieInformationService, bannerViewDataService)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bannerViewDataService")
    public native UsercentricsBannerViewDataService getBannerViewDataService();
    @Property(selector = "consentManager")
    public native UsercentricsPredefinedUIConsentManager getConsentManager();
    @Property(selector = "cookieInformationService")
    public native UsercentricsCookieInformationService getCookieInformationService();
    @Property(selector = "logger")
    public native UsercentricsLogger getLogger();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithConsentManager:logger:cookieInformationService:bannerViewDataService:")
    protected native @Pointer long init(UsercentricsPredefinedUIConsentManager consentManager, UsercentricsLogger logger, UsercentricsCookieInformationService cookieInformationService, UsercentricsBannerViewDataService bannerViewDataService);
    /*</methods>*/
}
