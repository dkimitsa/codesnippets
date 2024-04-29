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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OMIDAmazonVASTProperties/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OMIDAmazonVASTPropertiesPtr extends Ptr<OMIDAmazonVASTProperties, OMIDAmazonVASTPropertiesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OMIDAmazonVASTProperties.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected OMIDAmazonVASTProperties() {}
    protected OMIDAmazonVASTProperties(Handle h, long handle) { super(h, handle); }
    protected OMIDAmazonVASTProperties(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSkipOffset:autoPlay:position:")
    public OMIDAmazonVASTProperties(@MachineSizedFloat double skipOffset, boolean autoPlay, OMIDPosition position) { super((SkipInit) null); initObject(init(skipOffset, autoPlay, position)); }
    @Method(selector = "initWithAutoPlay:position:")
    public OMIDAmazonVASTProperties(boolean autoPlay, OMIDPosition position) { super((SkipInit) null); initObject(init(autoPlay, position)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isSkippable")
    public native boolean isSkippable();
    @Property(selector = "skipOffset")
    public native @MachineSizedFloat double getSkipOffset();
    @Property(selector = "isAutoPlay")
    public native boolean isAutoPlay();
    @Property(selector = "position")
    public native OMIDPosition getPosition();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSkipOffset:autoPlay:position:")
    protected native @Pointer long init(@MachineSizedFloat double skipOffset, boolean autoPlay, OMIDPosition position);
    @Method(selector = "initWithAutoPlay:position:")
    protected native @Pointer long init(boolean autoPlay, OMIDPosition position);
    @Method(selector = "toJSON")
    public native NSDictionary<?, ?> toJSON();
    /*</methods>*/
}
