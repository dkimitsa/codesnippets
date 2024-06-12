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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsSecondLayerVariant/*</name>*/ 
    extends /*<extends>*/UsercentricsKotlinEnum<UsercentricsSecondLayerVariant>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsSecondLayerVariantPtr extends Ptr<UsercentricsSecondLayerVariant, UsercentricsSecondLayerVariantPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsSecondLayerVariant.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsSecondLayerVariant() {}
    protected UsercentricsSecondLayerVariant(Handle h, long handle) { super(h, handle); }
    protected UsercentricsSecondLayerVariant(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "center")
    public static native UsercentricsSecondLayerVariant getCenter();
    @Property(selector = "side")
    public static native UsercentricsSecondLayerVariant getSide();
    @Property(selector = "entries")
    public static native NSArray<UsercentricsSecondLayerVariant> getEntries();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "values")
    public static native UsercentricsKotlinArray<UsercentricsSecondLayerVariant> values();
    /*</methods>*/
}
