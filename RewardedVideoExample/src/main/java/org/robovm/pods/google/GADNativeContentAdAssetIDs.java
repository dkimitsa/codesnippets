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
package org.robovm.pods.google;

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
import org.robovm.apple.storekit.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADNativeContentAdAssetIDs/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(GADNativeContentAdAssetIDs.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="GADNativeContentHeadlineAsset", optional=true)
    public static native String Headline();
    @GlobalValue(symbol="GADNativeContentBodyAsset", optional=true)
    public static native String Body();
    @GlobalValue(symbol="GADNativeContentCallToActionAsset", optional=true)
    public static native String CallToAction();
    @GlobalValue(symbol="GADNativeContentAdvertiserAsset", optional=true)
    public static native String Advertiser();
    @GlobalValue(symbol="GADNativeContentImageAsset", optional=true)
    public static native String Image();
    @GlobalValue(symbol="GADNativeContentLogoAsset", optional=true)
    public static native String Logo();
    @GlobalValue(symbol="GADNativeContentAttributionIconAsset", optional=true)
    public static native String AttributionIcon();
    @GlobalValue(symbol="GADNativeContentAttributionTextAsset", optional=true)
    public static native String AttributionText();
    @GlobalValue(symbol="GADNativeContentMediaViewAsset", optional=true)
    public static native String MediaView();
    @GlobalValue(symbol="GADNativeContentAdChoicesViewAsset", optional=true)
    public static native String AdChoicesView();
    @GlobalValue(symbol="GADNativeContentBackgroundAsset", optional=true)
    public static native String Background();
    /*</methods>*/
}
