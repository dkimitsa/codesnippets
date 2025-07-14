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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("ImpressionHasherRvm")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ImpressionHasher/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ImpressionHasherPtr extends Ptr<ImpressionHasher, ImpressionHasherPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ImpressionHasher.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ImpressionHasher() {}
    protected ImpressionHasher(Handle h, long handle) { super(h, handle); }
    protected ImpressionHasher(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "generateImpressionHashWithAssetId:timestamp:")
    public static native String generateImpressionHash(String assetId, NSDate timestamp);
    @Method(selector = "isValidHash:")
    public static native boolean isValidHash(String hash);
    @Method(selector = "extractAssetIdFrom:")
    public static native String extractAssetIdFrom(String hash);
    @Method(selector = "extractTimestampFrom:")
    public static native NSDate extractTimestampFrom(String hash);
    @Method(selector = "runBasicTests")
    public static native boolean runBasicTests();
    /*</methods>*/
}
