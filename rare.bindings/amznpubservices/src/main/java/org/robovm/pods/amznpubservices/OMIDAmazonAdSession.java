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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OMIDAmazonAdSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OMIDAmazonAdSessionPtr extends Ptr<OMIDAmazonAdSession, OMIDAmazonAdSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OMIDAmazonAdSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OMIDAmazonAdSession() {}
    protected OMIDAmazonAdSession(Handle h, long handle) { super(h, handle); }
    protected OMIDAmazonAdSession(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConfiguration:adSessionContext:error:")
    public OMIDAmazonAdSession(OMIDAmazonAdSessionConfiguration configuration, OMIDAmazonAdSessionContext context, NSError.NSErrorPtr error) { super((SkipInit) null); initObject(init(configuration, context, error)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "configuration")
    public native OMIDAmazonAdSessionConfiguration getConfiguration();
    @Property(selector = "mainAdView")
    public native UIView getMainAdView();
    @Property(selector = "setMainAdView:", strongRef = true)
    public native void setMainAdView(UIView v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithConfiguration:adSessionContext:error:")
    protected native @Pointer long init(OMIDAmazonAdSessionConfiguration configuration, OMIDAmazonAdSessionContext context, NSError.NSErrorPtr error);
    @Method(selector = "start")
    public native void start();
    @Method(selector = "finish")
    public native void finish();
    @Method(selector = "addFriendlyObstruction:purpose:detailedReason:error:")
    public native boolean addFriendlyObstruction(UIView friendlyObstruction, OMIDFriendlyObstructionType purpose, String detailedReason, NSError.NSErrorPtr error);
    @Method(selector = "removeFriendlyObstruction:")
    public native void removeFriendlyObstruction(UIView friendlyObstruction);
    @Method(selector = "removeAllFriendlyObstructions")
    public native void removeAllFriendlyObstructions();
    @Method(selector = "logErrorWithType:message:")
    public native void logError(OMIDErrorType errorType, String message);
    /*</methods>*/
}
