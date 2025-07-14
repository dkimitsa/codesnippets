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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("AnswerRvm")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Answer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AnswerPtr extends Ptr<Answer, AnswerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Answer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected Answer() {}
    protected Answer(Handle h, long handle) { super(h, handle); }
    protected Answer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "questionId")
    public native @MachineSizedSInt long getQuestionId();
    @Property(selector = "questionCode")
    public native String getQuestionCode();
    @Property(selector = "questionType")
    public native String getQuestionType();
    @Property(selector = "questionText")
    public native String getQuestionText();
    @Property(selector = "sortOrder")
    public native @MachineSizedSInt long getSortOrder();
    @Property(selector = "isRequired")
    public native boolean isRequired();
    @Property(selector = "value")
    public native NSObject getValue();
    @Property(selector = "skipped")
    public native boolean isSkipped();
    @Property(selector = "sectionId")
    public native NSNumber getSectionId();
    @Property(selector = "sectionTitle")
    public native String getSectionTitle();
    @Property(selector = "timeSpentSeconds")
    public native NSNumber getTimeSpentSeconds();
    @Property(selector = "answeredAt")
    public native String getAnsweredAt();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
