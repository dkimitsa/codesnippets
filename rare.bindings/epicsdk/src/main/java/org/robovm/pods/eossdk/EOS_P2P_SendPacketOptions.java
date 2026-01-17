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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_P2P_SendPacketOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_P2P_SendPacketOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_P2P_SendPacketOptionsPtr extends Ptr<EOS_P2P_SendPacketOptions, EOS_P2P_SendPacketOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_P2P_SendPacketOptions() {}
    public EOS_P2P_SendPacketOptions(int ApiVersion, EOS_ProductUserIdDetails LocalUserId, EOS_ProductUserIdDetails RemoteUserId, EOS_P2P_SocketId SocketId, byte Channel, int DataLengthBytes, VoidPtr Data, int bAllowDelayedDelivery, EOS_EPacketReliability Reliability, int bDisableAutoAcceptConnection) {
        this.setApiVersion(ApiVersion);
        this.setLocalUserId(LocalUserId);
        this.setRemoteUserId(RemoteUserId);
        this.setSocketId(SocketId);
        this.setChannel(Channel);
        this.setDataLengthBytes(DataLengthBytes);
        this.setData(Data);
        this.setBAllowDelayedDelivery(bAllowDelayedDelivery);
        this.setReliability(Reliability);
        this.setBDisableAutoAcceptConnection(bDisableAutoAcceptConnection);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_P2P_SendPacketOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(1) public native EOS_P2P_SendPacketOptions setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    @StructMember(2) public native EOS_ProductUserIdDetails getRemoteUserId();
    @StructMember(2) public native EOS_P2P_SendPacketOptions setRemoteUserId(EOS_ProductUserIdDetails RemoteUserId);
    @StructMember(3) public native EOS_P2P_SocketId getSocketId();
    @StructMember(3) public native EOS_P2P_SendPacketOptions setSocketId(EOS_P2P_SocketId SocketId);
    @StructMember(4) public native byte getChannel();
    @StructMember(4) public native EOS_P2P_SendPacketOptions setChannel(byte Channel);
    @StructMember(5) public native int getDataLengthBytes();
    @StructMember(5) public native EOS_P2P_SendPacketOptions setDataLengthBytes(int DataLengthBytes);
    @StructMember(6) public native VoidPtr getData();
    @StructMember(6) public native EOS_P2P_SendPacketOptions setData(VoidPtr Data);
    @StructMember(7) public native int getBAllowDelayedDelivery();
    @StructMember(7) public native EOS_P2P_SendPacketOptions setBAllowDelayedDelivery(int bAllowDelayedDelivery);
    @StructMember(8) public native EOS_EPacketReliability getReliability();
    @StructMember(8) public native EOS_P2P_SendPacketOptions setReliability(EOS_EPacketReliability Reliability);
    @StructMember(9) public native int getBDisableAutoAcceptConnection();
    @StructMember(9) public native EOS_P2P_SendPacketOptions setBDisableAutoAcceptConnection(int bDisableAutoAcceptConnection);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
