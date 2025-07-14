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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DonkeyAdsSDKKitRvm.AnswerStateRvm")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AnswerState/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AnswerStatePtr extends Ptr<AnswerState, AnswerStatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AnswerState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AnswerState() {}
    protected AnswerState(Handle h, long handle) { super(h, handle); }
    protected AnswerState(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "answers")
    public native NSDictionary<NSString, ?> getAnswers();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    @Method(selector = "setAnswerWithQuestionId:answer:")
    public native void setAnswer(String questionId, NSObject answer);
    @Method(selector = "getAnswerWithQuestionId:")
    public native NSObject getAnswer(String questionId);
    @Method(selector = "hasAnswerWithQuestionId:")
    public native boolean hasAnswer(String questionId);
    @Method(selector = "getAnsweredQuestionIds")
    public native NSArray<NSString> getAnsweredQuestionIds();
    @Method(selector = "getAnswerCount")
    public native @MachineSizedSInt long getAnswerCount();
    @Method(selector = "clearAllAnswers")
    public native void clearAllAnswers();
    @Method(selector = "removeAnswerWithQuestionId:")
    public native void removeAnswer(String questionId);
    @Method(selector = "getCompletionPercentageFor:")
    public native double getCompletionPercentageFor(Survey survey);
    @Method(selector = "areAllRequiredQuestionsAnsweredFor:")
    public native boolean areAllRequiredQuestionsAnsweredFor(Survey survey);
    @Method(selector = "toSubmissionFormat")
    public native NSDictionary<NSString, ?> toSubmissionFormat();
    @Method(selector = "loadAnswersFrom:")
    public native void loadAnswersFrom(NSDictionary<NSString, ?> dictionary);
    @Method(selector = "clone")
    public native AnswerState clone();
    @Method(selector = "startQuestionTimingWithQuestionId:")
    public native void startQuestionTiming(String questionId);
    @Method(selector = "stopQuestionTimingWithQuestionId:")
    public native void stopQuestionTiming(String questionId);
    @Method(selector = "getQuestionTimeSpentWithQuestionId:")
    public native NSNumber getQuestionTimeSpent(String questionId);
    @Method(selector = "setAnswerTimestampWithQuestionId:timestamp:")
    public native void setAnswerTimestamp(String questionId, NSDate timestamp);
    @Method(selector = "getAnswerTimestampWithQuestionId:")
    public native NSDate getAnswerTimestamp(String questionId);
    @Method(selector = "setAnswerWithTimingWithQuestionId:answer:")
    public native void setAnswerWithTiming(String questionId, NSObject answer);
    /*</methods>*/
}
