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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UsercentricsUsercentricsSDK")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsSDK/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsSDKPtr extends Ptr<UsercentricsSDK, UsercentricsSDKPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsSDK.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UsercentricsSDK() {}
    protected UsercentricsSDK(Handle h, long handle) { super(h, handle); }
    protected UsercentricsSDK(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "acceptAllConsentType:")
    public native NSArray<UsercentricsServiceConsent> acceptAllConsentType(UsercentricsConsentType consentType);
    @Method(selector = "acceptAllForTCFFromLayer:consentType:")
    public native NSArray<UsercentricsServiceConsent> acceptAll(UsercentricsTCFDecisionUILayer fromLayer, UsercentricsConsentType consentType);
    @Method(selector = "changeLanguageLanguage:onSuccess:onFailure:")
    public native void changeLanguageLanguage(String language, @Block Runnable onSuccess, @Block VoidBlock1<NSError> onFailure);
    @Method(selector = "clearUserSessionOnSuccess:onError:")
    public native void clearUserSession(@Block VoidBlock1<UsercentricsReadyStatus> onSuccess, @Block VoidBlock1<NSError> onError);
    @Method(selector = "denyAllConsentType:")
    public native NSArray<UsercentricsServiceConsent> denyAllConsentType(UsercentricsConsentType consentType);
    @Method(selector = "denyAllForTCFFromLayer:consentType:")
    public native NSArray<UsercentricsServiceConsent> denyAll(UsercentricsTCFDecisionUILayer fromLayer, UsercentricsConsentType consentType);
    @Method(selector = "getABTestingVariant")
    public native String getABTestingVariant();
    @Method(selector = "getAdditionalConsentModeData")
    public native UsercentricsAdditionalConsentModeData getAdditionalConsentModeData();
    @Method(selector = "getCMPData")
    public native UsercentricsCMPData getCMPData();
    @Method(selector = "getConsents")
    public native NSArray<UsercentricsServiceConsent> getConsents();
    @Method(selector = "getControllerId")
    public native String getControllerId();
    @Method(selector = "getTCFDataCallback:")
    public native void getTCFDataCallback(@Block VoidBlock1<UsercentricsTCFData> callback);
    @Method(selector = "getUIApplicationPredefinedUIVariant:")
    public native UsercentricsPredefinedUIApplicationManager getUIApplicationPredefinedUIVariant(UsercentricsPredefinedUIVariant predefinedUIVariant);
    @Method(selector = "getUIFactoryHolderAbTestingVariant:predefinedUIVariant:callback:")
    public native void getUIFactoryHolderAbTestingVariant(String abTestingVariant, UsercentricsPredefinedUIVariant predefinedUIVariant, @Block VoidBlock1<UsercentricsPredefinedUIFactoryHolder> callback);
    @Method(selector = "getUSPData")
    public native UsercentricsCCPAData getUSPData();
    @Method(selector = "getUserSessionData")
    public native String getUserSessionData();
    @Method(selector = "restoreUserSessionControllerId:onSuccess:onFailure:")
    public native void restoreUserSessionControllerId(String controllerId, @Block VoidBlock1<UsercentricsReadyStatus> onSuccess, @Block VoidBlock1<NSError> onFailure);
    @Method(selector = "saveDecisionsDecisions:consentType:")
    public native NSArray<UsercentricsServiceConsent> saveDecisions(NSArray<UsercentricsUserDecision> decisions, UsercentricsConsentType consentType);
    @Method(selector = "saveDecisionsForTCFTcfDecisions:fromLayer:serviceDecisions:consentType:")
    public native NSArray<UsercentricsServiceConsent> saveDecisions(UsercentricsTCFUserDecisions tcfDecisions, UsercentricsTCFDecisionUILayer fromLayer, NSArray<UsercentricsUserDecision> serviceDecisions, UsercentricsConsentType consentType);
    @Method(selector = "saveOptOutForCCPAIsOptedOut:consentType:")
    public native NSArray<UsercentricsServiceConsent> saveOptOut(boolean isOptedOut, UsercentricsConsentType consentType);
    @Method(selector = "setABTestingVariantVariantName:")
    public native void setABTestingVariantVariantName(String variantName);
    @Method(selector = "setCMPIdId:")
    public native void setCMPIdId(int id);
    @Method(selector = "shouldCollectConsent")
    public native boolean shouldCollectConsent();
    @Method(selector = "trackEvent:")
    public native void trackEvent(UsercentricsAnalyticsEventType event);
    /*</methods>*/
}
