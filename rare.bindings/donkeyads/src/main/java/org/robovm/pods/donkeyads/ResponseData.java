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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("ResponseDataRvm")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ResponseData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ResponseDataPtr extends Ptr<ResponseData, ResponseDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ResponseData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ResponseData() {}
    protected ResponseData(Handle h, long handle) { super(h, handle); }
    protected ResponseData(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "surveyId")
    public native @MachineSizedSInt long getSurveyId();
    @Property(selector = "surveyExternalKey")
    public native String getSurveyExternalKey();
    @Property(selector = "surveyTitle")
    public native String getSurveyTitle();
    @Property(selector = "surveyVersion")
    public native @MachineSizedSInt long getSurveyVersion();
    @Property(selector = "appId")
    public native String getAppId();
    @Property(selector = "userId")
    public native String getUserId();
    @Property(selector = "sessionId")
    public native String getSessionId();
    @Property(selector = "ipAddress")
    public native String getIpAddress();
    @Property(selector = "userAgent")
    public native String getUserAgent();
    @Property(selector = "startedAt")
    public native String getStartedAt();
    @Property(selector = "endTime")
    public native String getEndTime();
    @Property(selector = "completionStatus")
    public native String getCompletionStatus();
    @Property(selector = "totalTimeSeconds")
    public native NSNumber getTotalTimeSeconds();
    @Property(selector = "deviceType")
    public native String getDeviceType();
    @Property(selector = "reportingKey")
    public native String getReportingKey();
    @Property(selector = "customReward")
    public native NSNumber getCustomReward();
    @Property(selector = "answers")
    public native NSArray<Answer> getAnswers();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
