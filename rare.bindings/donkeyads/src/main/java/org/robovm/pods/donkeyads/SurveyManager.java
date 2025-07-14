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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("SurveyManagerRvm")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SurveyManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SurveyManagerPtr extends Ptr<SurveyManager, SurveyManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SurveyManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SurveyManager() {}
    protected SurveyManager(Handle h, long handle) { super(h, handle); }
    protected SurveyManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "cacheSurvey:")
    public native void cacheSurvey(Survey survey);
    @Method(selector = "getCachedSurveyWithId:")
    public native Survey getCachedSurvey(String id);
    @Method(selector = "getAvailableSurveys")
    public native NSArray<SurveySummary> getAvailableSurveys();
    @Method(selector = "isSurveyAvailableWithId:")
    public native boolean isSurveyAvailable(String id);
    @Method(selector = "getCachedSurveyCount")
    public native @MachineSizedSInt long getCachedSurveyCount();
    @Method(selector = "getCachedSurveyIds")
    public native NSSet<NSString> getCachedSurveyIds();
    @Method(selector = "clearCache")
    public native void clearCache();
    @Method(selector = "shared")
    public static native SurveyManager shared();
    /*</methods>*/
}
