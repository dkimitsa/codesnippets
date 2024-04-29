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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/APSStoreKit/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class APSStoreKitPtr extends Ptr<APSStoreKit, APSStoreKitPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(APSStoreKit.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public APSStoreKit() {}
    protected APSStoreKit(Handle h, long handle) { super(h, handle); }
    protected APSStoreKit(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "processEvent:options:")
    public static native void processEvent(String eventName, String options);
    @Method(selector = "shouldUseMockResponse")
    public static native boolean shouldUseMockResponse();
    @Method(selector = "mockResponseDictionary")
    public static native NSDictionary<NSString, ?> mockResponseDictionary();
    @Method(selector = "addSkadnParamsIfExists:")
    public static native void addSkadnParamsIfExists(NSMutableDictionary<?, ?> params);
    @Method(selector = "parseSKAdNetworkParamsFromAAXResponse:")
    public static native NSDictionary<?, ?> parseSKAdNetworkParamsFromAAXResponse(NSDictionary<?, ?> rawResponseSKAdnDictionary);
    @Method(selector = "sendSKAdNetworkChecksumPacketIfNeededForPhase2")
    public static native void sendSKAdNetworkChecksumPacketIfNeededForPhase2();
    @Method(selector = "skadnHelper:withInfo:")
    public static native void skadnHelper(String label, String info);
    /*</methods>*/
}
