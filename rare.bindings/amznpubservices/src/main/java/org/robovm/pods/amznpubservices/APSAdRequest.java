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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/APSAdRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class APSAdRequestPtr extends Ptr<APSAdRequest, APSAdRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(APSAdRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public APSAdRequest() {}
    protected APSAdRequest(Handle h, long handle) { super(h, handle); }
    protected APSAdRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSlotUUID:")
    public APSAdRequest(String slotUUID) { super((SkipInit) null); initObject(init(slotUUID)); }
    @Method(selector = "initWithAd:")
    public APSAdRequest(APSAd ad) { super((SkipInit) null); initObject(init(ad)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "autoRefresh")
    public native boolean isAutoRefresh();
    @Property(selector = "setAutoRefresh:")
    public native void setAutoRefresh(boolean v);
    @Property(selector = "autoRefreshDurationInSeconds")
    public native @MachineSizedSInt long getAutoRefreshDurationInSeconds();
    @Property(selector = "setAutoRefreshDurationInSeconds:")
    public native void setAutoRefreshDurationInSeconds(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSlotUUID:")
    protected native @Pointer long init(String slotUUID);
    @Method(selector = "initWithAd:")
    protected native @Pointer long init(APSAd ad);
    @Method(selector = "setAdFormat:")
    public native void setAdFormat(APSAdFormat adFormat);
    @Method(selector = "setAdFormat:withProperties:")
    public native void setAdFormat(APSAdFormat adFormat, APSAdFormatProperties properties);
    @Method(selector = "loadAdWithCompletionHandler:")
    public native void loadAd(@Block VoidBlock2<APSAd, NSError> completionHandler);
    @Method(selector = "setCustomTarget:forKey:")
    public native void setCustomTarget(String value, String key);
    @Method(selector = "stopAutoRefresh")
    public native void stopAutoRefresh();
    /*</methods>*/
}
