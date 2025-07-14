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
package org.robovm.pods.donkeyads;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("SurveySDKRvm")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SurveySDK/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SurveySDKPtr extends Ptr<SurveySDK, SurveySDKPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SurveySDK.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SurveySDK() {}
    protected SurveySDK(Handle h, long handle) { super(h, handle); }
    protected SurveySDK(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "SurveyErrorDomain")
    public static native String SurveyErrorDomain();
    @Method(selector = "getCurrentSurveyStartTime")
    public static native NSDate getCurrentSurveyStartTime();
    @Method(selector = "initialize:apiToken:")
    public static native void initialize(NSObject context, String apiToken);
    @Method(selector = "setLifecycleListener:")
    public static native void setLifecycleListener(SurveyLifecycleListener listener);
    @Method(selector = "testNetworkConnectivityWithCallback:")
    public static native void testNetworkConnectivity(@Block VoidBooleanBlock callback);
    @Method(selector = "debugNetworkConnectivityWithCallback:")
    public static native void debugNetworkConnectivity(@Block VoidBlock1<NSDictionary<NSString, NSNumber>> callback);
    @Method(selector = "fetchSurveyFromBackendWithExternalKey:skipConnectivityTest:callback:")
    public static native void fetchSurveyFromBackend(String externalKey, boolean skipConnectivityTest, @Block VoidBlock2<Survey, NSError> callback);
    @Method(selector = "listAvailableSurveysWithCallback:")
    public static native void listAvailableSurveys(@Block VoidBlock2<NSArray<NSString>, NSError> callback);
    @Method(selector = "getAvailableSurveys")
    public static native NSArray<SurveySummary> getAvailableSurveys();
    @Method(selector = "isSurveyAvailable:")
    public static native boolean isSurveyAvailable(String surveyId);
    @Method(selector = "createTestSurvey")
    public static native void createTestSurvey();
    @Method(selector = "startSurveyFrom:surveyId:reportingKey:customReward:themeOverride:orientationOverride:")
    public static native void startSurveyFromSurveyId(UIViewController viewController, String surveyId, String reportingKey, NSNumber customReward, String themeOverride, String orientationOverride);
    @Method(selector = "startSurveyFrom:externalKey:reportingKey:customReward:themeOverride:orientationOverride:")
    public static native void startSurveyFromExternalKey(UIViewController viewController, String externalKey, String reportingKey, NSNumber customReward, String themeOverride, String orientationOverride);
    @Method(selector = "clearCache")
    public static native void clearCache();
    @Method(selector = "getCachedSurveyCount")
    public static native @MachineSizedSInt long getCachedSurveyCount();
    @Method(selector = "getCachedSurveyIds")
    public static native NSSet<NSString> getCachedSurveyIds();
    @Method(selector = "setLanguage:")
    public static native void setLanguage(String languageCode);
    @Method(selector = "resetLanguageToDefault")
    public static native void resetLanguageToDefault();
    @Method(selector = "getCurrentLanguage")
    public static native String getCurrentLanguage();
    @Method(selector = "submitSurveyResponse:completion:")
    public static native void submitSurveyResponse(SurveyResponse response, @Block VoidBlock1<NSError> completion);
    @Method(selector = "createSurveyResponseWithSurvey:answers:reportingKey:customReward:startTime:userId:")
    public static native SurveyResponse createSurveyResponse(Survey survey, NSDictionary<NSString, ?> answers, String reportingKey, NSNumber customReward, NSDate startTime, String userId);
    @Method(selector = "createSurveyResponseWithSurvey:answerState:reportingKey:customReward:startTime:userId:")
    public static native SurveyResponse createSurveyResponse(Survey survey, AnswerState answerState, String reportingKey, NSNumber customReward, NSDate startTime, String userId);
    /*</methods>*/
}
