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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("SurveySummaryRvm")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SurveySummary/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SurveySummaryPtr extends Ptr<SurveySummary, SurveySummaryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SurveySummary.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SurveySummary() {}
    protected SurveySummary(Handle h, long handle) { super(h, handle); }
    protected SurveySummary(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "surveyId")
    public native @MachineSizedSInt long getSurveyId();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "sumaryDescription")
    public native String getSumaryDescription();
    @Property(selector = "totalQuestions")
    public native @MachineSizedSInt long getTotalQuestions();
    @Property(selector = "totalSections")
    public native @MachineSizedSInt long getTotalSections();
    @Property(selector = "rewardPoints")
    public native @MachineSizedSInt long getRewardPoints();
    @Property(selector = "estimatedDurationMinutes")
    public native NSNumber getEstimatedDurationMinutes();
    @Property(selector = "languageCode")
    public native String getLanguageCode();
    @Property(selector = "externalKey")
    public native String getExternalKey();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
