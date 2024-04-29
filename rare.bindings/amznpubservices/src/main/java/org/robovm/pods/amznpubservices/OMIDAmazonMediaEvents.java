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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OMIDAmazonMediaEvents/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OMIDAmazonMediaEventsPtr extends Ptr<OMIDAmazonMediaEvents, OMIDAmazonMediaEventsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OMIDAmazonMediaEvents.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OMIDAmazonMediaEvents() {}
    protected OMIDAmazonMediaEvents(Handle h, long handle) { super(h, handle); }
    protected OMIDAmazonMediaEvents(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdSession:error:")
    public OMIDAmazonMediaEvents(OMIDAmazonAdSession session, NSError.NSErrorPtr error) { super((SkipInit) null); initObject(init(session, error)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdSession:error:")
    protected native @Pointer long init(OMIDAmazonAdSession session, NSError.NSErrorPtr error);
    @Method(selector = "startWithDuration:mediaPlayerVolume:")
    public native void start(@MachineSizedFloat double duration, @MachineSizedFloat double mediaPlayerVolume);
    @Method(selector = "firstQuartile")
    public native void firstQuartile();
    @Method(selector = "midpoint")
    public native void midpoint();
    @Method(selector = "thirdQuartile")
    public native void thirdQuartile();
    @Method(selector = "complete")
    public native void complete();
    @Method(selector = "pause")
    public native void pause();
    @Method(selector = "resume")
    public native void resume();
    @Method(selector = "skipped")
    public native void skipped();
    @Method(selector = "bufferStart")
    public native void bufferStart();
    @Method(selector = "bufferFinish")
    public native void bufferFinish();
    @Method(selector = "volumeChangeTo:")
    public native void volumeChangeTo(@MachineSizedFloat double playerVolume);
    @Method(selector = "playerStateChangeTo:")
    public native void playerStateChangeTo(OMIDPlayerState playerState);
    @Method(selector = "adUserInteractionWithType:")
    public native void adUserInteraction(OMIDInteractionType interactionType);
    /*</methods>*/
}
