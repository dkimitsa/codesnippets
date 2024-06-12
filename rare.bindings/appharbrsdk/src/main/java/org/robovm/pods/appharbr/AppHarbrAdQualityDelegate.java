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
package org.robovm.pods.appharbr;

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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/AppHarbrAdQualityDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "didAdIncidentWithAd:adFormat:blockReasons:reportReasons:creativeId:adNetworkSdk:unitId:timestamp:")
    void didAdIncident(NSObject ad, AHAdFormat adFormat, NSArray<NSString> blockReasons, NSArray<NSString> reportReasons, String creativeId, AdSdk adNetworkSdk, String unitId, double timestamp);
    @Method(selector = "didAdIncidentOnDisplayWithAd:adFormat:blockReasons:reportReasons:creativeId:adNetworkSdk:unitId:timestamp:")
    void didAdIncidentOnDisplay(NSObject ad, AHAdFormat adFormat, NSArray<NSString> blockReasons, NSArray<NSString> reportReasons, String creativeId, AdSdk adNetworkSdk, String unitId, double timestamp);
    @Method(selector = "didAdVerifiedWithAd:adFormat:adNetworkSdk:timestamp:")
    void didAdVerified(NSObject ad, AHAdFormat adFormat, AdSdk adNetworkSdk, double timestamp);
    @Method(selector = "didAdNotVerifiedWithAd:adFormat:error:adNetworkSdk:timestamp:")
    void didAdNotVerified(NSObject ad, AHAdFormat adFormat, NSError error, AdSdk adNetworkSdk, double timestamp);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
