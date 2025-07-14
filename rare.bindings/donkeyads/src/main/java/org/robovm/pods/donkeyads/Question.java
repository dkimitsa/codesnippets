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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("QuestionRvm")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Question/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class QuestionPtr extends Ptr<Question, QuestionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Question.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected Question() {}
    protected Question(Handle h, long handle) { super(h, handle); }
    protected Question(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "id")
    public native @MachineSizedSInt long getId();
    @Property(selector = "code")
    public native String getCode();
    @Property(selector = "body")
    public native String getBody();
    @Property(selector = "type")
    public native String getType();
    @Property(selector = "isRequired")
    public native boolean isRequired();
    @Property(selector = "sortOrder")
    public native @MachineSizedSInt long getSortOrder();
    @Property(selector = "sectionId")
    public native NSNumber getSectionId();
    @Property(selector = "minValue")
    public native NSNumber getMinValue();
    @Property(selector = "maxValue")
    public native NSNumber getMaxValue();
    @Property(selector = "scaleStart")
    public native NSNumber getScaleStart();
    @Property(selector = "scaleEnd")
    public native NSNumber getScaleEnd();
    @Property(selector = "options")
    public native NSArray<Option> getOptions();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getQuestionType")
    public native QuestionType getQuestionType();
    @Method(selector = "isChoiceQuestion")
    public native boolean isChoiceQuestion();
    @Method(selector = "isScaleQuestion")
    public native boolean isScaleQuestion();
    @Method(selector = "getScaleQuestionStart")
    public native @MachineSizedSInt long getScaleQuestionStart();
    @Method(selector = "getScaleQuestionEnd")
    public native @MachineSizedSInt long getScaleQuestionEnd();
    @Method(selector = "getOptionById:")
    public native Option getOptionById(@MachineSizedSInt long optionId);
    @Method(selector = "getOptionByValue:")
    public native Option getOptionByValue(String value);
    @Method(selector = "isValidAnswer:")
    public native boolean isValidAnswer(NSObject answerValue);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
