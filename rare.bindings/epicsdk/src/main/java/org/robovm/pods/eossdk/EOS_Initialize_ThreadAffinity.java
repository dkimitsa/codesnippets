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
package org.robovm.pods.eossdk;

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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Initialize_ThreadAffinity/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Initialize_ThreadAffinity>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Initialize_ThreadAffinityPtr extends Ptr<EOS_Initialize_ThreadAffinity, EOS_Initialize_ThreadAffinityPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Initialize_ThreadAffinity() {}
    public EOS_Initialize_ThreadAffinity(int ApiVersion, long NetworkWork, long StorageIo, long WebSocketIo, long P2PIo, long HttpRequestIo, long RTCIo, long EmbeddedOverlayMainThread, long EmbeddedOverlayWorkerThreads) {
        this.setApiVersion(ApiVersion);
        this.setNetworkWork(NetworkWork);
        this.setStorageIo(StorageIo);
        this.setWebSocketIo(WebSocketIo);
        this.setP2PIo(P2PIo);
        this.setHttpRequestIo(HttpRequestIo);
        this.setRTCIo(RTCIo);
        this.setEmbeddedOverlayMainThread(EmbeddedOverlayMainThread);
        this.setEmbeddedOverlayWorkerThreads(EmbeddedOverlayWorkerThreads);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Initialize_ThreadAffinity setApiVersion(int ApiVersion);
    @StructMember(1) public native long getNetworkWork();
    @StructMember(1) public native EOS_Initialize_ThreadAffinity setNetworkWork(long NetworkWork);
    @StructMember(2) public native long getStorageIo();
    @StructMember(2) public native EOS_Initialize_ThreadAffinity setStorageIo(long StorageIo);
    @StructMember(3) public native long getWebSocketIo();
    @StructMember(3) public native EOS_Initialize_ThreadAffinity setWebSocketIo(long WebSocketIo);
    @StructMember(4) public native long getP2PIo();
    @StructMember(4) public native EOS_Initialize_ThreadAffinity setP2PIo(long P2PIo);
    @StructMember(5) public native long getHttpRequestIo();
    @StructMember(5) public native EOS_Initialize_ThreadAffinity setHttpRequestIo(long HttpRequestIo);
    @StructMember(6) public native long getRTCIo();
    @StructMember(6) public native EOS_Initialize_ThreadAffinity setRTCIo(long RTCIo);
    @StructMember(7) public native long getEmbeddedOverlayMainThread();
    @StructMember(7) public native EOS_Initialize_ThreadAffinity setEmbeddedOverlayMainThread(long EmbeddedOverlayMainThread);
    @StructMember(8) public native long getEmbeddedOverlayWorkerThreads();
    @StructMember(8) public native EOS_Initialize_ThreadAffinity setEmbeddedOverlayWorkerThreads(long EmbeddedOverlayWorkerThreads);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
