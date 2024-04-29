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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/DTBAdInterstitialDispatcherDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "interstitialDidLoad:")
    void interstitialDidLoad(DTBAdInterstitialDispatcher interstitial);
    @Method(selector = "interstitial:didFailToLoadAdWithErrorCode:")
    void didFailToLoadAd(DTBAdInterstitialDispatcher interstitial, DTBAdErrorCode errorCode);
    @Method(selector = "interstitialWillPresentScreen:")
    void interstitialWillPresentScreen(DTBAdInterstitialDispatcher interstitial);
    @Method(selector = "interstitialDidPresentScreen:")
    void interstitialDidPresentScreen(DTBAdInterstitialDispatcher interstitial);
    @Method(selector = "interstitialWillDismissScreen:")
    void interstitialWillDismissScreen(DTBAdInterstitialDispatcher interstitial);
    @Method(selector = "interstitialDidDismissScreen:")
    void interstitialDidDismissScreen(DTBAdInterstitialDispatcher interstitial);
    @Method(selector = "interstitialWillLeaveApplication:")
    void interstitialWillLeaveApplication(DTBAdInterstitialDispatcher interstitial);
    @Method(selector = "showFromRootViewController:")
    void showFromRootViewController(UIViewController controller);
    @Method(selector = "impressionFired")
    void impressionFired();
    @Method(selector = "videoPlaybackCompleted:")
    void videoPlaybackCompleted(DTBAdInterstitialDispatcher interstitial);
    @Method(selector = "adClicked")
    void adClicked();
    @Method(selector = "adDidThrowError")
    void adDidThrowError();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
