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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("SurveyNetworkClientRvm")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SurveyNetworkClient/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SurveyNetworkClientPtr extends Ptr<SurveyNetworkClient, SurveyNetworkClientPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SurveyNetworkClient.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SurveyNetworkClient() {}
    protected SurveyNetworkClient(Handle h, long handle) { super(h, handle); }
    protected SurveyNetworkClient(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "testMultipleEndpointsWithCompletion:")
    public native void testMultipleEndpoints(@Block VoidBlock1<NSDictionary<NSString, NSNumber>> completion);
    @Method(selector = "testConnectivityWithCompletion:")
    public native void testConnectivity(@Block VoidBooleanBlock completion);
    @Method(selector = "fetchSurveyWithExternalKey:apiToken:completion:")
    public native void fetchSurvey(String externalKey, String apiToken, @Block VoidBlock2<Survey, NSError> completion);
    @Method(selector = "listAvailableSurveysWithApiToken:completion:")
    public native void listAvailableSurveys(String apiToken, @Block VoidBlock2<NSArray<NSString>, NSError> completion);
    @Method(selector = "submitSurveyResponseWithResponse:apiToken:completion:")
    public native void submitSurveyResponse(SurveyResponse response, String apiToken, @Block VoidBlock1<NSError> completion);
    @Method(selector = "shared")
    public static native SurveyNetworkClient shared();
    /*</methods>*/
}
