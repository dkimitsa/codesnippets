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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Lobby_RTCRoomConnectionChangedCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Lobby_RTCRoomConnectionChangedCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Lobby_RTCRoomConnectionChangedCallbackInfoPtr extends Ptr<EOS_Lobby_RTCRoomConnectionChangedCallbackInfo, EOS_Lobby_RTCRoomConnectionChangedCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Lobby_RTCRoomConnectionChangedCallbackInfo() {}
    public EOS_Lobby_RTCRoomConnectionChangedCallbackInfo(VoidPtr ClientData, BytePtr LobbyId, EOS_ProductUserIdDetails LocalUserId, int bIsConnected, EOS_EResult DisconnectReason) {
        this.setClientData(ClientData);
        this.setLobbyId(LobbyId);
        this.setLocalUserId(LocalUserId);
        this.setBIsConnected(bIsConnected);
        this.setDisconnectReason(DisconnectReason);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native VoidPtr getClientData();
    @StructMember(0) public native EOS_Lobby_RTCRoomConnectionChangedCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(1) public native BytePtr getLobbyId();
    @StructMember(1) public native EOS_Lobby_RTCRoomConnectionChangedCallbackInfo setLobbyId(BytePtr LobbyId);
    @StructMember(2) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(2) public native EOS_Lobby_RTCRoomConnectionChangedCallbackInfo setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    @StructMember(3) public native int getBIsConnected();
    @StructMember(3) public native EOS_Lobby_RTCRoomConnectionChangedCallbackInfo setBIsConnected(int bIsConnected);
    @StructMember(4) public native EOS_EResult getDisconnectReason();
    @StructMember(4) public native EOS_Lobby_RTCRoomConnectionChangedCallbackInfo setDisconnectReason(EOS_EResult DisconnectReason);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
