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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Lobby_JoinLobbyOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Lobby_JoinLobbyOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Lobby_JoinLobbyOptionsPtr extends Ptr<EOS_Lobby_JoinLobbyOptions, EOS_Lobby_JoinLobbyOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Lobby_JoinLobbyOptions() {}
    public EOS_Lobby_JoinLobbyOptions(int ApiVersion, EOS_LobbyDetailsHandle LobbyDetailsHandle, EOS_ProductUserIdDetails LocalUserId, int bPresenceEnabled, EOS_Lobby_LocalRTCOptions LocalRTCOptions, int bCrossplayOptOut, EOS_ELobbyRTCRoomJoinActionType RTCRoomJoinActionType) {
        this.setApiVersion(ApiVersion);
        this.setLobbyDetailsHandle(LobbyDetailsHandle);
        this.setLocalUserId(LocalUserId);
        this.setBPresenceEnabled(bPresenceEnabled);
        this.setLocalRTCOptions(LocalRTCOptions);
        this.setBCrossplayOptOut(bCrossplayOptOut);
        this.setRTCRoomJoinActionType(RTCRoomJoinActionType);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Lobby_JoinLobbyOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_LobbyDetailsHandle getLobbyDetailsHandle();
    @StructMember(1) public native EOS_Lobby_JoinLobbyOptions setLobbyDetailsHandle(EOS_LobbyDetailsHandle LobbyDetailsHandle);
    @StructMember(2) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(2) public native EOS_Lobby_JoinLobbyOptions setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    @StructMember(3) public native int getBPresenceEnabled();
    @StructMember(3) public native EOS_Lobby_JoinLobbyOptions setBPresenceEnabled(int bPresenceEnabled);
    @StructMember(4) public native EOS_Lobby_LocalRTCOptions getLocalRTCOptions();
    @StructMember(4) public native EOS_Lobby_JoinLobbyOptions setLocalRTCOptions(EOS_Lobby_LocalRTCOptions LocalRTCOptions);
    @StructMember(5) public native int getBCrossplayOptOut();
    @StructMember(5) public native EOS_Lobby_JoinLobbyOptions setBCrossplayOptOut(int bCrossplayOptOut);
    @StructMember(6) public native EOS_ELobbyRTCRoomJoinActionType getRTCRoomJoinActionType();
    @StructMember(6) public native EOS_Lobby_JoinLobbyOptions setRTCRoomJoinActionType(EOS_ELobbyRTCRoomJoinActionType RTCRoomJoinActionType);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
