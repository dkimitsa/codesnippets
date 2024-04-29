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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/APSAdController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class APSAdControllerPtr extends Ptr<APSAdController, APSAdControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(APSAdController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected APSAdController() {}
    protected APSAdController(Handle h, long handle) { super(h, handle); }
    protected APSAdController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDelegate:")
    public APSAdController(APSAdDelegate delegate) { super((SkipInit) null); initObject(init(delegate)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDelegate:")
    protected native @Pointer long init(APSAdDelegate delegate);
    @Method(selector = "setAdFrame:")
    public native void setAdFrame(@ByVal CGRect frame);
    @Method(selector = "fetchAd:extras:")
    public native void fetchAd(APSAd ad, NSDictionary<?, ?> extras);
    @Method(selector = "showFromViewController:")
    public native void showFromViewController(UIViewController controller);
    /*</methods>*/
}
