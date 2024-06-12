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
package org.robovm.pods.usercentrics;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsTCFDecisionUILayer/*</name>*/ 
    extends /*<extends>*/UsercentricsKotlinEnum<UsercentricsTCFDecisionUILayer>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsTCFDecisionUILayerPtr extends Ptr<UsercentricsTCFDecisionUILayer, UsercentricsTCFDecisionUILayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsTCFDecisionUILayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsTCFDecisionUILayer() {}
    protected UsercentricsTCFDecisionUILayer(Handle h, long handle) { super(h, handle); }
    protected UsercentricsTCFDecisionUILayer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "firstLayer")
    public static native UsercentricsTCFDecisionUILayer getFirstLayer();
    @Property(selector = "secondLayer")
    public static native UsercentricsTCFDecisionUILayer getSecondLayer();
    @Property(selector = "entries")
    public static native NSArray<UsercentricsTCFDecisionUILayer> getEntries();
    @Property(selector = "value")
    public native int getValue();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "values")
    public static native UsercentricsKotlinArray<UsercentricsTCFDecisionUILayer> values();
    /*</methods>*/
}
