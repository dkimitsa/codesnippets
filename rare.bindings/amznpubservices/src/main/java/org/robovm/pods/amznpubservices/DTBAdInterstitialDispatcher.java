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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DTBAdInterstitialDispatcher/*</name>*/ 
    extends /*<extends>*/DTBAdDispatcher/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DTBAdInterstitialDispatcherPtr extends Ptr<DTBAdInterstitialDispatcher, DTBAdInterstitialDispatcherPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DTBAdInterstitialDispatcher.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected DTBAdInterstitialDispatcher() {}
    protected DTBAdInterstitialDispatcher(Handle h, long handle) { super(h, handle); }
    protected DTBAdInterstitialDispatcher(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDelegate:")
    public DTBAdInterstitialDispatcher(DTBAdInterstitialDispatcherDelegate delegate) { super((SkipInit) null); initObject(init(delegate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native DTBAdInterstitialDispatcherDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(DTBAdInterstitialDispatcherDelegate v);
    @Property(selector = "interstitialLoaded")
    public native boolean isInterstitialLoaded();
    @Property(selector = "setInterstitialLoaded:")
    public native void setInterstitialLoaded(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDelegate:")
    protected native @Pointer long init(DTBAdInterstitialDispatcherDelegate delegate);
    @Method(selector = "fetchAd:")
    public native void fetchAd(String bidInfo);
    @Method(selector = "fetchAdWithParameters:")
    public native void fetchAd(NSDictionary<?, ?> params);
    @Method(selector = "fetchAd:params:")
    public native void fetchAd(String bidInfo, NSDictionary<?, ?> params);
    @Method(selector = "showFromController:")
    public native void showFromController(UIViewController controller);
    @Method(selector = "interstitialWillAppear")
    public native void interstitialWillAppear();
    @Method(selector = "interstitialDidAppear")
    public native void interstitialDidAppear();
    @Method(selector = "interstitialWillDisappear")
    public native void interstitialWillDisappear();
    @Method(selector = "interstitialDidDisappear")
    public native void interstitialDidDisappear();
    @Method(selector = "showInterstitialFromController:")
    public static native void showInterstitialFromController(UIViewController controller);
    /*</methods>*/
}
