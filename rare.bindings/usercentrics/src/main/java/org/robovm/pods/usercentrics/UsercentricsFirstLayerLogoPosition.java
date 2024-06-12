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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsFirstLayerLogoPosition/*</name>*/ 
    extends /*<extends>*/UsercentricsKotlinEnum<UsercentricsFirstLayerLogoPosition>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsFirstLayerLogoPositionPtr extends Ptr<UsercentricsFirstLayerLogoPosition, UsercentricsFirstLayerLogoPositionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsFirstLayerLogoPosition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsFirstLayerLogoPosition() {}
    protected UsercentricsFirstLayerLogoPosition(Handle h, long handle) { super(h, handle); }
    protected UsercentricsFirstLayerLogoPosition(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "left")
    public static native UsercentricsFirstLayerLogoPosition getLeft();
    @Property(selector = "center")
    public static native UsercentricsFirstLayerLogoPosition getCenter();
    @Property(selector = "right")
    public static native UsercentricsFirstLayerLogoPosition getRight();
    @Property(selector = "entries")
    public static native NSArray<UsercentricsFirstLayerLogoPosition> getEntries();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "values")
    public static native UsercentricsKotlinArray<UsercentricsFirstLayerLogoPosition> values();
    /*</methods>*/
}
