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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OMIDAmazonAdSessionConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OMIDAmazonAdSessionConfigurationPtr extends Ptr<OMIDAmazonAdSessionConfiguration, OMIDAmazonAdSessionConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OMIDAmazonAdSessionConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OMIDAmazonAdSessionConfiguration() {}
    protected OMIDAmazonAdSessionConfiguration(Handle h, long handle) { super(h, handle); }
    protected OMIDAmazonAdSessionConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCreativeType:impressionType:impressionOwner:mediaEventsOwner:isolateVerificationScripts:error:")
    public OMIDAmazonAdSessionConfiguration(OMIDCreativeType creativeType, OMIDImpressionType impressionType, OMIDOwner impressionOwner, OMIDOwner mediaEventsOwner, boolean isolateVerificationScripts, NSError.NSErrorPtr error) { super((SkipInit) null); initObject(init(creativeType, impressionType, impressionOwner, mediaEventsOwner, isolateVerificationScripts, error)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "creativeType")
    public native OMIDCreativeType getCreativeType();
    @Property(selector = "setCreativeType:")
    public native void setCreativeType(OMIDCreativeType v);
    @Property(selector = "impressionType")
    public native OMIDImpressionType getImpressionType();
    @Property(selector = "setImpressionType:")
    public native void setImpressionType(OMIDImpressionType v);
    @Property(selector = "impressionOwner")
    public native OMIDOwner getImpressionOwner();
    @Property(selector = "setImpressionOwner:")
    public native void setImpressionOwner(OMIDOwner v);
    @Property(selector = "mediaEventsOwner")
    public native OMIDOwner getMediaEventsOwner();
    @Property(selector = "setMediaEventsOwner:")
    public native void setMediaEventsOwner(OMIDOwner v);
    @Property(selector = "isolateVerificationScripts")
    public native boolean isIsolateVerificationScripts();
    @Property(selector = "setIsolateVerificationScripts:")
    public native void setIsolateVerificationScripts(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCreativeType:impressionType:impressionOwner:mediaEventsOwner:isolateVerificationScripts:error:")
    protected native @Pointer long init(OMIDCreativeType creativeType, OMIDImpressionType impressionType, OMIDOwner impressionOwner, OMIDOwner mediaEventsOwner, boolean isolateVerificationScripts, NSError.NSErrorPtr error);
    /*</methods>*/
}
