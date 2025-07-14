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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DonkeyAdsSDKKit.SurveyViewController")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SurveyViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SurveyViewControllerPtr extends Ptr<SurveyViewController, SurveyViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SurveyViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SurveyViewController() {}
    protected SurveyViewController(Handle h, long handle) { super(h, handle); }
    protected SurveyViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNibName:bundle:")
    public SurveyViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public SurveyViewController(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "rvm_noop")
    public native void rvm_noop();
    @Method(selector = "rvm_setSurvey:")
    public native void rvm_setSurvey(Survey survey);
    @Method(selector = "rvm_getSurveyStartTime")
    public native NSDate rvm_getSurveyStartTime();
    @Method(selector = "RVM_EXTRA_SURVEY_ID")
    public static native String RVM_EXTRA_SURVEY_ID();
    @Method(selector = "RVM_EXTRA_REPORTING_KEY")
    public static native String RVM_EXTRA_REPORTING_KEY();
    @Method(selector = "RVM_EXTRA_CUSTOM_REWARD")
    public static native String RVM_EXTRA_CUSTOM_REWARD();
    @Method(selector = "RVM_EXTRA_THEME_OVERRIDE")
    public static native String RVM_EXTRA_THEME_OVERRIDE();
    @Method(selector = "RVM_EXTRA_ORIENTATION_OVERRIDE")
    public static native String RVM_EXTRA_ORIENTATION_OVERRIDE();
    /*</methods>*/
}
