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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("AppHarbrSDK.AppHarbrConfigurationBuilder")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AppHarbrConfigurationBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AppHarbrConfigurationBuilderPtr extends Ptr<AppHarbrConfigurationBuilder, AppHarbrConfigurationBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AppHarbrConfigurationBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AppHarbrConfigurationBuilder() {}
    protected AppHarbrConfigurationBuilder(Handle h, long handle) { super(h, handle); }
    protected AppHarbrConfigurationBuilder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithApiKey:")
    public AppHarbrConfigurationBuilder(String apiKey) { super((SkipInit) null); initObject(init(apiKey)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithApiKey:")
    protected native @Pointer long init(String apiKey);
    @Method(selector = "appendTargetedAdNetworksWith:")
    public native AppHarbrConfigurationBuilder appendTargetedAdNetworks(AdSdk adNetwork);
    @Method(selector = "withMuteAd:")
    public native AppHarbrConfigurationBuilder withMuteAd(boolean muted);
    @Method(selector = "withInterstitialAdTimeLimit:")
    public native AppHarbrConfigurationBuilder withInterstitialAdTimeLimit(double seconds);
    @Method(selector = "withRewardedAdTimeLimit:")
    public native AppHarbrConfigurationBuilder withRewardedAdTimeLimit(double seconds);
    @Method(selector = "withIgnoreHouseCampaignCreativeIdsUsing:")
    public native AppHarbrConfigurationBuilder withIgnoreHouseCampaignCreativeIdsUsing(NSSet<NSString> creativeIds);
    @Method(selector = "withDebugConfig:")
    public native AppHarbrConfigurationBuilder withDebugConfig(AppHarbrSdkDebug debugConfig);
    @Method(selector = "build")
    public native AppHarbrConfiguration build();
    /*</methods>*/
}
