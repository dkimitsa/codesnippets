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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_P2P_OnIncomingPacketQueueFullInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_P2P_OnIncomingPacketQueueFullInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_P2P_OnIncomingPacketQueueFullInfoPtr extends Ptr<EOS_P2P_OnIncomingPacketQueueFullInfo, EOS_P2P_OnIncomingPacketQueueFullInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_P2P_OnIncomingPacketQueueFullInfo() {}
    public EOS_P2P_OnIncomingPacketQueueFullInfo(VoidPtr ClientData, long PacketQueueMaxSizeBytes, long PacketQueueCurrentSizeBytes, EOS_ProductUserIdDetails OverflowPacketLocalUserId, byte OverflowPacketChannel, int OverflowPacketSizeBytes) {
        this.setClientData(ClientData);
        this.setPacketQueueMaxSizeBytes(PacketQueueMaxSizeBytes);
        this.setPacketQueueCurrentSizeBytes(PacketQueueCurrentSizeBytes);
        this.setOverflowPacketLocalUserId(OverflowPacketLocalUserId);
        this.setOverflowPacketChannel(OverflowPacketChannel);
        this.setOverflowPacketSizeBytes(OverflowPacketSizeBytes);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native VoidPtr getClientData();
    @StructMember(0) public native EOS_P2P_OnIncomingPacketQueueFullInfo setClientData(VoidPtr ClientData);
    @StructMember(1) public native long getPacketQueueMaxSizeBytes();
    @StructMember(1) public native EOS_P2P_OnIncomingPacketQueueFullInfo setPacketQueueMaxSizeBytes(long PacketQueueMaxSizeBytes);
    @StructMember(2) public native long getPacketQueueCurrentSizeBytes();
    @StructMember(2) public native EOS_P2P_OnIncomingPacketQueueFullInfo setPacketQueueCurrentSizeBytes(long PacketQueueCurrentSizeBytes);
    @StructMember(3) public native EOS_ProductUserIdDetails getOverflowPacketLocalUserId();
    @StructMember(3) public native EOS_P2P_OnIncomingPacketQueueFullInfo setOverflowPacketLocalUserId(EOS_ProductUserIdDetails OverflowPacketLocalUserId);
    @StructMember(4) public native byte getOverflowPacketChannel();
    @StructMember(4) public native EOS_P2P_OnIncomingPacketQueueFullInfo setOverflowPacketChannel(byte OverflowPacketChannel);
    @StructMember(5) public native int getOverflowPacketSizeBytes();
    @StructMember(5) public native EOS_P2P_OnIncomingPacketQueueFullInfo setOverflowPacketSizeBytes(int OverflowPacketSizeBytes);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
