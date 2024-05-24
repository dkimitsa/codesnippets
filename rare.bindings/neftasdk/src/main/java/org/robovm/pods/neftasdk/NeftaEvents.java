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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("NeftaSDK.NeftaEvents")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NeftaEvents/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NeftaEventsPtr extends Ptr<NeftaEvents, NeftaEventsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NeftaEvents.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NeftaEvents() {}
    protected NeftaEvents(Handle h, long handle) { super(h, handle); }
    protected NeftaEvents(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "AddProgressionEventWithStatus:type:source:")
    public native void AddProgressionEvent(ProgressionStatus status, ProgressionType type, ProgressionSource source);
    @Method(selector = "AddProgressionEventWithStatus:type:source:name:value:")
    public native void AddProgressionEvent(ProgressionStatus status, ProgressionType type, ProgressionSource source, String name, @MachineSizedSInt long value);
    @Method(selector = "AddProgressionEventWithStatus:type:source:name:value:customPayload:")
    public native void AddProgressionEvent(ProgressionStatus status, ProgressionType type, ProgressionSource source, String name, @MachineSizedSInt long value, String customPayload);
    @Method(selector = "AddReceiveEventWithCategory:method:")
    public native void AddReceiveEvent(ResourceCategory category, ReceiveMethod method);
    @Method(selector = "AddReceiveEventWithCategory:method:name:quantity:")
    public native void AddReceiveEvent(ResourceCategory category, ReceiveMethod method, String name, @MachineSizedSInt long quantity);
    @Method(selector = "AddReceiveEventWithCategory:method:name:quantity:customPayload:")
    public native void AddReceiveEvent(ResourceCategory category, ReceiveMethod method, String name, @MachineSizedSInt long quantity, String customPayload);
    @Method(selector = "AddSpendEventWithCategory:method:")
    public native void AddSpendEvent(ResourceCategory category, SpendMethod method);
    @Method(selector = "AddSpendEventWithCategory:method:name:quantity:")
    public native void AddSpendEvent(ResourceCategory category, SpendMethod method, String name, @MachineSizedSInt long quantity);
    @Method(selector = "AddSpendEventWithCategory:method:name:quantity:customPayload:")
    public native void AddSpendEvent(ResourceCategory category, SpendMethod method, String name, @MachineSizedSInt long quantity, String customPayload);
    @Method(selector = "AddSessionEventWithCategory:")
    public native void AddSessionEvent(SessionCategory category);
    @Method(selector = "AddSessionEventWithCategory:name:value:customPayload:log:")
    public native void AddSessionEvent(SessionCategory category, String name, @MachineSizedSInt long value, String customPayload, boolean log);
    /*</methods>*/
}
