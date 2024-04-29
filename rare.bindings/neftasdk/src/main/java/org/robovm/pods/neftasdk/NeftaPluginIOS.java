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
package org.robovm.pods.neftasdk;

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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC8NeftaSDK15NeftaPlugin_iOS")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NeftaPluginIOS/*</name>*/ 
    extends /*<extends>*/NeftaPlugin/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NeftaPluginIOSPtr extends Ptr<NeftaPluginIOS, NeftaPluginIOSPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NeftaPluginIOS.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NeftaPluginIOS() {}
    protected NeftaPluginIOS(Handle h, long handle) { super(h, handle); }
    protected NeftaPluginIOS(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="NeftaSDKVersionNumber", optional=true)
    public static native double getVersionNumber();
    @GlobalValue(symbol="NeftaSDKVersionString", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String getVersionString();
    
    @Method(selector = "PrepareRendererWithViewController:")
    public native void PrepareRenderer(UIViewController viewController);
    @Method(selector = "Mute:")
    public native void Mute(boolean mute);
    @Method(selector = "GetViewForPlacement:show:")
    public native UIView GetViewForPlacement(Placement placement, boolean show);
    @Method(selector = "_instance")
    public static native NeftaPluginIOS _instance();
    @Method(selector = "set_instance:")
    public static native void set_instance(NeftaPluginIOS value);
    @Method(selector = "EnableLogging:")
    public static native void EnableLogging(boolean enable);
    @Method(selector = "InitWithAppId:")
    public static native NeftaPluginIOS Init(String appId);
    @Method(selector = "Version")
    public static native String Version();
    @Method(selector = "OnLog")
    public static native @Block VoidBlock1<NSString> OnLog(String p0);
    @Method(selector = "setOnLog:")
    public static native void setOnLog(@Block VoidBlock1<NSString> value);
    /*</methods>*/
}
