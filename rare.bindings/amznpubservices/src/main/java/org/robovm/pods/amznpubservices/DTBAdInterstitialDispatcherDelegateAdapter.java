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
package org.robovm.pods.amznpubservices;

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
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DTBAdInterstitialDispatcherDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements DTBAdInterstitialDispatcherDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("interstitialDidLoad:")
    public void interstitialDidLoad(DTBAdInterstitialDispatcher interstitial) {}
    @NotImplemented("interstitial:didFailToLoadAdWithErrorCode:")
    public void didFailToLoadAd(DTBAdInterstitialDispatcher interstitial, DTBAdErrorCode errorCode) {}
    @NotImplemented("interstitialWillPresentScreen:")
    public void interstitialWillPresentScreen(DTBAdInterstitialDispatcher interstitial) {}
    @NotImplemented("interstitialDidPresentScreen:")
    public void interstitialDidPresentScreen(DTBAdInterstitialDispatcher interstitial) {}
    @NotImplemented("interstitialWillDismissScreen:")
    public void interstitialWillDismissScreen(DTBAdInterstitialDispatcher interstitial) {}
    @NotImplemented("interstitialDidDismissScreen:")
    public void interstitialDidDismissScreen(DTBAdInterstitialDispatcher interstitial) {}
    @NotImplemented("interstitialWillLeaveApplication:")
    public void interstitialWillLeaveApplication(DTBAdInterstitialDispatcher interstitial) {}
    @NotImplemented("showFromRootViewController:")
    public void showFromRootViewController(UIViewController controller) {}
    @NotImplemented("impressionFired")
    public void impressionFired() {}
    @NotImplemented("videoPlaybackCompleted:")
    public void videoPlaybackCompleted(DTBAdInterstitialDispatcher interstitial) {}
    @NotImplemented("adClicked")
    public void adClicked() {}
    @NotImplemented("adDidThrowError")
    public void adDidThrowError() {}
    /*</methods>*/
}
