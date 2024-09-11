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
package org.robovm.pods.brightsdk;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("brdsdk.ConsentActionInfo")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ConsentActionInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ConsentActionInfoPtr extends Ptr<ConsentActionInfo, ConsentActionInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ConsentActionInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ConsentActionInfo() {}
    protected ConsentActionInfo(Handle h, long handle) { super(h, handle); }
    protected ConsentActionInfo(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBackgroundImage:textImage:backgroundColor:textColor:")
    public ConsentActionInfo(UIImage backgroundImage, UIImage textImage, UIColor backgroundColor, UIColor textColor) { super((SkipInit) null); initObject(init(backgroundImage, textImage, backgroundColor, textColor)); }
    @Method(selector = "initWithBackgroundName:textName:in:")
    public ConsentActionInfo(String backgroundName, String textName, NSBundle bundle) { super((SkipInit) null); initObject(init(backgroundName, textName, bundle)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "backgroundImage")
    public native UIImage getBackgroundImage();
    @Property(selector = "textImage")
    public native UIImage getTextImage();
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "textColor")
    public native UIColor getTextColor();
    @Property(selector = "description")
    public native String getDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBackgroundImage:textImage:backgroundColor:textColor:")
    protected native @Pointer long init(UIImage backgroundImage, UIImage textImage, UIColor backgroundColor, UIColor textColor);
    @Method(selector = "initWithBackgroundName:textName:in:")
    protected native @Pointer long init(String backgroundName, String textName, NSBundle bundle);
    /*</methods>*/
}
