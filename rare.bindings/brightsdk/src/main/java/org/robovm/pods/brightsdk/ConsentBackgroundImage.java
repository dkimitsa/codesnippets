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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("brdsdk.ConsentBackgroundImage")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ConsentBackgroundImage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ConsentBackgroundImagePtr extends Ptr<ConsentBackgroundImage, ConsentBackgroundImagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ConsentBackgroundImage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ConsentBackgroundImage() {}
    protected ConsentBackgroundImage(Handle h, long handle) { super(h, handle); }
    protected ConsentBackgroundImage(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPortrait:landscape:scaleMode:")
    public ConsentBackgroundImage(UIImage portrait, UIImage landscape, UIViewContentMode scaleMode) { super((SkipInit) null); initObject(init(portrait, landscape, scaleMode)); }
    @Method(selector = "initWithPortraitName:landscapeName:scaleMode:in:")
    public ConsentBackgroundImage(String portraitName, String landscapeName, UIViewContentMode scaleMode, NSBundle bundle) { super((SkipInit) null); initObject(init(portraitName, landscapeName, scaleMode, bundle)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "portrait")
    public native UIImage getPortrait();
    @Property(selector = "landscape")
    public native UIImage getLandscape();
    @Property(selector = "scaleMode")
    public native UIViewContentMode getScaleMode();
    @Property(selector = "description")
    public native String getDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPortrait:landscape:scaleMode:")
    protected native @Pointer long init(UIImage portrait, UIImage landscape, UIViewContentMode scaleMode);
    @Method(selector = "initWithPortraitName:landscapeName:scaleMode:in:")
    protected native @Pointer long init(String portraitName, String landscapeName, UIViewContentMode scaleMode, NSBundle bundle);
    /*</methods>*/
}
