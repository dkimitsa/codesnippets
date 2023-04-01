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
package org.robovm.pods.yabbiads;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC8YabbiAds18YabbiConfiguration")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YabbiConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YabbiConfigurationPtr extends Ptr<YabbiConfiguration, YabbiConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YabbiConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected YabbiConfiguration() {}
    protected YabbiConfiguration(Handle h, long handle) { super(h, handle); }
    protected YabbiConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPublisherID:interstitialID:rewardedID:")
    public YabbiConfiguration(String publisherID, String interstitialID, String rewardedID) { super((SkipInit) null); initObject(init(publisherID, interstitialID, rewardedID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "publisherID")
    public native String getPublisherID();
    @Property(selector = "interstitialID")
    public native String getInterstitialID();
    @Property(selector = "rewardedID")
    public native String getRewardedID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPublisherID:interstitialID:rewardedID:")
    protected native @Pointer long init(String publisherID, String interstitialID, String rewardedID);
    /*</methods>*/
}
