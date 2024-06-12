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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UsercentricsUsercentricsShadedColor")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsShadedColor/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsShadedColorPtr extends Ptr<UsercentricsShadedColor, UsercentricsShadedColorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsShadedColor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsShadedColor() {}
    protected UsercentricsShadedColor(Handle h, long handle) { super(h, handle); }
    protected UsercentricsShadedColor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithColor100:color80:color16:color2:")
    public UsercentricsShadedColor(String color100, String color80, String color16, String color2) { super((SkipInit) null); initObject(init(color100, color80, color16, color2)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "color100")
    public native String getColor100();
    @Property(selector = "color16")
    public native String getColor16();
    @Property(selector = "color2")
    public native String getColor2();
    @Property(selector = "color80")
    public native String getColor80();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithColor100:color80:color16:color2:")
    protected native @Pointer long init(String color100, String color80, String color16, String color2);
    @Method(selector = "doCopyColor100:color80:color16:color2:")
    public native UsercentricsShadedColor doCopy(String color100, String color80, String color16, String color2);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
