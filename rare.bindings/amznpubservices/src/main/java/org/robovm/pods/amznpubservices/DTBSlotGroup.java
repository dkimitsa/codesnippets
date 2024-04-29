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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DTBSlotGroup/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DTBSlotGroupPtr extends Ptr<DTBSlotGroup, DTBSlotGroupPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DTBSlotGroup.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected DTBSlotGroup() {}
    protected DTBSlotGroup(Handle h, long handle) { super(h, handle); }
    protected DTBSlotGroup(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:")
    public DTBSlotGroup(String name) { super((SkipInit) null); initObject(init(name)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="NSStringFromSlotType", optional=true)
    public static native String toString(DTBSlotType slotType);
    @Bridge(symbol="slotTypeFromCGSize", optional=true)
    public static native DTBSlotType fromCGSize(@ByVal CGSize slotCGSize);
    
    @Method(selector = "initWithName:")
    protected native @Pointer long init(String name);
    @Method(selector = "addSize:")
    public native void addSize(DTBAdSize size);
    @Method(selector = "sizeByWidth:height:")
    public native DTBAdSize getSize(@MachineSizedSInt long width, @MachineSizedSInt long height);
    @Method(selector = "sizeByWidth:height:type:")
    public native DTBAdSize getSize(@MachineSizedSInt long width, @MachineSizedSInt long height, ADType type);
    @Method(selector = "sizeByUUID:")
    public native DTBAdSize getSize(String slotUUID);
    @Method(selector = "sizeBySlotType:")
    public native DTBAdSize sizeBySlotType(DTBSlotType type);
    /*</methods>*/
}
