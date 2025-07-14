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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("SurveyRvm")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Survey/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SurveyPtr extends Ptr<Survey, SurveyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Survey.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected Survey() {}
    protected Survey(Handle h, long handle) { super(h, handle); }
    protected Survey(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "id")
    public native @MachineSizedSInt long getId();
    @Property(selector = "externalKey")
    public native String getExternalKey();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "surveyDescription")
    public native String getSurveyDescription();
    @Property(selector = "status")
    public native String getStatus();
    @Property(selector = "rewardPoints")
    public native @MachineSizedSInt long getRewardPoints();
    @Property(selector = "version")
    public native @MachineSizedSInt long getVersion();
    @Property(selector = "languageCode")
    public native String getLanguageCode();
    @Property(selector = "sections")
    public native NSArray<Section> getSections();
    @Property(selector = "questions")
    public native NSArray<Question> getQuestions();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getAllQuestions")
    public native NSArray<Question> getAllQuestions();
    @Method(selector = "getQuestionById:")
    public native Question getQuestionById(@MachineSizedSInt long questionId);
    @Method(selector = "getQuestionByCode:")
    public native Question getQuestionByCode(String questionCode);
    @Method(selector = "isActive")
    public native boolean isActive();
    @Method(selector = "getTotalQuestionCount")
    public native @MachineSizedSInt long getTotalQuestionCount();
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
