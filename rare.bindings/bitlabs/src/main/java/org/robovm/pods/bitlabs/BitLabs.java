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
package org.robovm.pods.bitlabs;

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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC7BitLabs7BitLabs")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BitLabs/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BitLabsPtr extends Ptr<BitLabs, BitLabsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BitLabs.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BitLabs() {}
    protected BitLabs(Handle h, long handle) { super(h, handle); }
    protected BitLabs(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="BitLabsVersionNumber", optional=true)
    public static native double getVersionNumber();
    @GlobalValue(symbol="BitLabsVersionString", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String getVersionString();
    
    @Method(selector = "configureWithToken:uid:")
    public native void configure(String token, String uid);
    @Method(selector = "requestTrackingAuthorization")
    public native void requestTrackingAuthorization();
    @Method(selector = "setTags:")
    public native void setTags(NSDictionary<NSString, ?> tags);
    @Method(selector = "addTagWithKey:value:")
    public native void addTag(String key, String value);
    @Method(selector = "checkSurveys:")
    public native void checkSurveys(@Block VoidBooleanBlock completionHandler);
    @Method(selector = "getSurveys:")
    public native void getSurveys(@Block VoidBlock1<NSArray<Survey>> completionHandler);
    @Method(selector = "getLeaderboard:")
    public native void getLeaderboard(@Block VoidBlock1<GetLeaderboardResponse> completionHandler);
    @Method(selector = "setRewardCompletionHandler:")
    public native void setRewardCompletionHandler(@Block VoidFloatBlock rewardCompletionHandler);
    @Method(selector = "launchOfferWallWithParent:")
    public native void launchOfferWall(UIViewController parent);
    @Method(selector = "getColor")
    public native NSArray<NSString> getColor();
    @Method(selector = "getCurrencyIconUrl")
    public native String getCurrencyIconUrl();
    @Method(selector = "getBonusPercentage")
    public native double getBonusPercentage();
    @Method(selector = "shared")
    public static native BitLabs shared();
    /*</methods>*/
}
