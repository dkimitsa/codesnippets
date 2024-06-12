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
package org.robovm.pods.usercentrics;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UsercentricsUsercentricsAnalyticsEventType")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsAnalyticsEventType/*</name>*/ 
    extends /*<extends>*/UsercentricsKotlinEnum<UsercentricsAnalyticsEventType>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsAnalyticsEventTypePtr extends Ptr<UsercentricsAnalyticsEventType, UsercentricsAnalyticsEventTypePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsAnalyticsEventType.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsAnalyticsEventType() {}
    protected UsercentricsAnalyticsEventType(Handle h, long handle) { super(h, handle); }
    protected UsercentricsAnalyticsEventType(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "cmpShown")
    public static native UsercentricsAnalyticsEventType getCmpShown();
    @Property(selector = "acceptAllFirstLayer")
    public static native UsercentricsAnalyticsEventType getAcceptAllFirstLayer();
    @Property(selector = "denyAllFirstLayer")
    public static native UsercentricsAnalyticsEventType getDenyAllFirstLayer();
    @Property(selector = "saveFirstLayer")
    public static native UsercentricsAnalyticsEventType getSaveFirstLayer();
    @Property(selector = "acceptAllSecondLayer")
    public static native UsercentricsAnalyticsEventType getAcceptAllSecondLayer();
    @Property(selector = "denyAllSecondLayer")
    public static native UsercentricsAnalyticsEventType getDenyAllSecondLayer();
    @Property(selector = "saveSecondLayer")
    public static native UsercentricsAnalyticsEventType getSaveSecondLayer();
    @Property(selector = "imprintLink")
    public static native UsercentricsAnalyticsEventType getImprintLink();
    @Property(selector = "moreInformationLink")
    public static native UsercentricsAnalyticsEventType getMoreInformationLink();
    @Property(selector = "privacyPolicyLink")
    public static native UsercentricsAnalyticsEventType getPrivacyPolicyLink();
    @Property(selector = "ccpaTogglesOn")
    public static native UsercentricsAnalyticsEventType getCcpaTogglesOn();
    @Property(selector = "ccpaTogglesOff")
    public static native UsercentricsAnalyticsEventType getCcpaTogglesOff();
    @Property(selector = "entries")
    public static native NSArray<UsercentricsAnalyticsEventType> getEntries();
    @Property(selector = "value")
    public native int getValue();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "values")
    public static native UsercentricsKotlinArray<UsercentricsAnalyticsEventType> values();
    /*</methods>*/
}
