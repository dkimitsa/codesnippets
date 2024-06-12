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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUIVariant/*</name>*/ 
    extends /*<extends>*/UsercentricsKotlinEnum<UsercentricsPredefinedUIVariant>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUIVariantPtr extends Ptr<UsercentricsPredefinedUIVariant, UsercentricsPredefinedUIVariantPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUIVariant.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUIVariant() {}
    protected UsercentricsPredefinedUIVariant(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUIVariant(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "secondLayer")
    public static native UsercentricsPredefinedUIVariant getSecondLayer();
    @Property(selector = "full")
    public static native UsercentricsPredefinedUIVariant getFull();
    @Property(selector = "sheet")
    public static native UsercentricsPredefinedUIVariant getSheet();
    @Property(selector = "popupCenter")
    public static native UsercentricsPredefinedUIVariant getPopupCenter();
    @Property(selector = "popupBottom")
    public static native UsercentricsPredefinedUIVariant getPopupBottom();
    @Property(selector = "entries")
    public static native NSArray<UsercentricsPredefinedUIVariant> getEntries();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "values")
    public static native UsercentricsKotlinArray<UsercentricsPredefinedUIVariant> values();
    /*</methods>*/
}
