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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UsercentricsUsercentricsMediation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsMediation/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsMediationPtr extends Ptr<UsercentricsMediation, UsercentricsMediationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsMediation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsMediation() {}
    protected UsercentricsMediation(Handle h, long handle) { super(h, handle); }
    protected UsercentricsMediation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "appLovinTemplateId")
    public native String getAppLovinTemplateId();
    @Property(selector = "setAppLovinTemplateId:")
    public native void setAppLovinTemplateId(String v);
    @Property(selector = "chartboostTemplateId")
    public native String getChartboostTemplateId();
    @Property(selector = "setChartboostTemplateId:")
    public native void setChartboostTemplateId(String v);
    @Property(selector = "crashlyticsTemplateId")
    public native String getCrashlyticsTemplateId();
    @Property(selector = "setCrashlyticsTemplateId:")
    public native void setCrashlyticsTemplateId(String v);
    @Property(selector = "firebaseAdvertisingTemplateId")
    public native String getFirebaseAdvertisingTemplateId();
    @Property(selector = "setFirebaseAdvertisingTemplateId:")
    public native void setFirebaseAdvertisingTemplateId(String v);
    @Property(selector = "firebaseTemplateId")
    public native String getFirebaseTemplateId();
    @Property(selector = "setFirebaseTemplateId:")
    public native void setFirebaseTemplateId(String v);
    @Property(selector = "ironSourceTemplateId")
    public native String getIronSourceTemplateId();
    @Property(selector = "setIronSourceTemplateId:")
    public native void setIronSourceTemplateId(String v);
    @Property(selector = "unityAdsTemplateId")
    public native String getUnityAdsTemplateId();
    @Property(selector = "setUnityAdsTemplateId:")
    public native void setUnityAdsTemplateId(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "usercentricsMediation")
    public static native UsercentricsMediation usercentricsMediation();
    /*</methods>*/
}
