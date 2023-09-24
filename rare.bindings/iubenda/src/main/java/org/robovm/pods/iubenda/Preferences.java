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
package org.robovm.pods.iubenda;

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
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC7iubenda11Preferences")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Preferences/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PreferencesPtr extends Ptr<Preferences, PreferencesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Preferences.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected Preferences() {}
    protected Preferences(Handle h, long handle) { super(h, handle); }
    protected Preferences(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "consent")
    public native boolean isConsent();
    @Property(selector = "setConsent:")
    public native void setConsent(boolean v);
    @Property(selector = "gdprApplies")
    public native boolean isGdprApplies();
    @Property(selector = "setGdprApplies:")
    public native void setGdprApplies(boolean v);
    @Property(selector = "googleAdsPersonalized")
    public native boolean isGoogleAdsPersonalized();
    @Property(selector = "setGoogleAdsPersonalized:")
    public native void setGoogleAdsPersonalized(boolean v);
    @Property(selector = "tcf")
    public native String getTcf();
    @Property(selector = "setTcf:")
    public native void setTcf(String v);
    @Property(selector = "tcfv2")
    public native String getTcfv2();
    @Property(selector = "setTcfv2:")
    public native void setTcfv2(String v);
    @Property(selector = "purposes")
    public native NSDictionary<NSString, NSNumber> getPurposes();
    @Property(selector = "setPurposes:")
    public native void setPurposes(NSDictionary<NSString, NSNumber> v);
    @Property(selector = "tcfv2InAppTCData")
    public native TCF2Data getTcfv2InAppTCData();
    @Property(selector = "setTcfv2InAppTCData:")
    public native void setTcfv2InAppTCData(TCF2Data v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
