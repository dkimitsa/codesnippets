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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Lobby_LobbyMemberStatusReceivedCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Lobby_LobbyMemberStatusReceivedCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Lobby_LobbyMemberStatusReceivedCallbackInfoPtr extends Ptr<EOS_Lobby_LobbyMemberStatusReceivedCallbackInfo, EOS_Lobby_LobbyMemberStatusReceivedCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Lobby_LobbyMemberStatusReceivedCallbackInfo() {}
    public EOS_Lobby_LobbyMemberStatusReceivedCallbackInfo(VoidPtr ClientData, BytePtr LobbyId, EOS_ProductUserIdDetails TargetUserId, EOS_ELobbyMemberStatus CurrentStatus) {
        this.setClientData(ClientData);
        this.setLobbyId(LobbyId);
        this.setTargetUserId(TargetUserId);
        this.setCurrentStatus(CurrentStatus);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native VoidPtr getClientData();
    @StructMember(0) public native EOS_Lobby_LobbyMemberStatusReceivedCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(1) public native BytePtr getLobbyId();
    @StructMember(1) public native EOS_Lobby_LobbyMemberStatusReceivedCallbackInfo setLobbyId(BytePtr LobbyId);
    @StructMember(2) public native EOS_ProductUserIdDetails getTargetUserId();
    @StructMember(2) public native EOS_Lobby_LobbyMemberStatusReceivedCallbackInfo setTargetUserId(EOS_ProductUserIdDetails TargetUserId);
    @StructMember(3) public native EOS_ELobbyMemberStatus getCurrentStatus();
    @StructMember(3) public native EOS_Lobby_LobbyMemberStatusReceivedCallbackInfo setCurrentStatus(EOS_ELobbyMemberStatus CurrentStatus);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
