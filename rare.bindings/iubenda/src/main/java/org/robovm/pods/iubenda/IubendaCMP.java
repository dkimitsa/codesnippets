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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC7iubenda10IubendaCMP")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IubendaCMP/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IubendaCMPPtr extends Ptr<IubendaCMP, IubendaCMPPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IubendaCMP.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IubendaCMP() {}
    protected IubendaCMP(Handle h, long handle) { super(h, handle); }
    protected IubendaCMP(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initializeWith:")
    public static native void initialize(IubendaCMPConfiguration config);
    @Method(selector = "isConsentExpired")
    public static native boolean isConsentExpired();
    @Method(selector = "expireAfter")
    public static native boolean expireAfter();
    @Method(selector = "storage")
    public static native CMPStorage storage();
    /**
     * @deprecated Use accept
     */
    @Deprecated
    @Method(selector = "acceptDefaultConsent")
    public static native void acceptDefaultConsent();
    @Method(selector = "accept")
    public static native void accept();
    @Method(selector = "reject")
    public static native void reject();
    /**
     * @deprecated Use openTcfPreferencesFrom:
     */
    @Deprecated
    @Method(selector = "showConsentPreferencesFrom:")
    public static native void showConsentPreferencesFrom(UIViewController fromViewController);
    @Method(selector = "openTcfPreferencesFrom:")
    public static native void openTcfPreferencesFrom(UIViewController fromViewController);
    /**
     * @deprecated Use openCookiePolicyFrom:
     */
    @Deprecated
    @Method(selector = "showCookiePolicyFrom:")
    public static native void showCookiePolicyFrom(UIViewController fromViewController);
    @Method(selector = "openCookiePolicyFrom:")
    public static native void openCookiePolicyFrom(UIViewController fromViewController);
    /**
     * @deprecated Use openTcfVendorsPreferencesFrom:
     */
    @Deprecated
    @Method(selector = "showVendorsPreferencesFrom:")
    public static native void showVendorsPreferencesFrom(UIViewController fromViewController);
    @Method(selector = "openTcfVendorsPreferencesFrom:")
    public static native void openTcfVendorsPreferencesFrom(UIViewController fromViewController);
    @Method(selector = "saveConsentWithPreferences:timestamp:")
    public static native void saveConsent(String json, NSDate timestamp);
    @Method(selector = "clearData")
    public static native void clearData();
    /**
     * @deprecated Use isConsentGiven
     */
    @Deprecated
    @Method(selector = "hasConsent")
    public static native boolean hasConsent();
    @Method(selector = "askConsentFrom:")
    public static native void askConsentFrom(UIViewController fromViewController);
    @Method(selector = "shouldGetConsent")
    public static native boolean shouldGetConsent();
    @Deprecated
    @Method(selector = "isGooglePersonalized")
    public static native boolean isGooglePersonalized();
    @Method(selector = "isPurposeEnabledWithId:")
    public static native boolean isPurposeEnabled(@MachineSizedSInt long id);
    @Method(selector = "isConsentGiven")
    public static native boolean isConsentGiven();
    /**
     * @deprecated Use openPreferencesFrom:
     */
    @Deprecated
    @Method(selector = "editConsentFrom:")
    public static native void editConsentFrom(UIViewController fromViewController);
    @Method(selector = "openPreferencesFrom:")
    public static native void openPreferencesFrom(UIViewController fromViewController);
    @Method(selector = "getPreferencesJson")
    public static native String getPreferencesJson();
    @Method(selector = "canOpenPreferences")
    public static native boolean canOpenPreferences();
    @Method(selector = "requestAttConsentFrom:callback:")
    public static native void requestAttConsent(UIViewController fromViewController, @Block VoidBlock1<ATTStatus> callback);
    @Method(selector = "getATTStatusFrom:callback:")
    public static native void getATTStatus(UIViewController fromViewController, @Block VoidBlock1<ATTStatus> callback);
    /*</methods>*/
}
