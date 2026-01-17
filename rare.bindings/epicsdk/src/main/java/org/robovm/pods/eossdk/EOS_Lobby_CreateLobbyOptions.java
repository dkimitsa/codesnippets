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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Lobby_CreateLobbyOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Lobby_CreateLobbyOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Lobby_CreateLobbyOptionsPtr extends Ptr<EOS_Lobby_CreateLobbyOptions, EOS_Lobby_CreateLobbyOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Lobby_CreateLobbyOptions() {}
    public EOS_Lobby_CreateLobbyOptions(int ApiVersion, EOS_ProductUserIdDetails LocalUserId, int MaxLobbyMembers, EOS_ELobbyPermissionLevel PermissionLevel, int bPresenceEnabled, int bAllowInvites, BytePtr BucketId, int bDisableHostMigration, int bEnableRTCRoom, EOS_Lobby_LocalRTCOptions LocalRTCOptions, BytePtr LobbyId, int bEnableJoinById, int bRejoinAfterKickRequiresInvite, IntPtr AllowedPlatformIds, int AllowedPlatformIdsCount, int bCrossplayOptOut, EOS_ELobbyRTCRoomJoinActionType RTCRoomJoinActionType) {
        this.setApiVersion(ApiVersion);
        this.setLocalUserId(LocalUserId);
        this.setMaxLobbyMembers(MaxLobbyMembers);
        this.setPermissionLevel(PermissionLevel);
        this.setBPresenceEnabled(bPresenceEnabled);
        this.setBAllowInvites(bAllowInvites);
        this.setBucketId(BucketId);
        this.setBDisableHostMigration(bDisableHostMigration);
        this.setBEnableRTCRoom(bEnableRTCRoom);
        this.setLocalRTCOptions(LocalRTCOptions);
        this.setLobbyId(LobbyId);
        this.setBEnableJoinById(bEnableJoinById);
        this.setBRejoinAfterKickRequiresInvite(bRejoinAfterKickRequiresInvite);
        this.setAllowedPlatformIds(AllowedPlatformIds);
        this.setAllowedPlatformIdsCount(AllowedPlatformIdsCount);
        this.setBCrossplayOptOut(bCrossplayOptOut);
        this.setRTCRoomJoinActionType(RTCRoomJoinActionType);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Lobby_CreateLobbyOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(1) public native EOS_Lobby_CreateLobbyOptions setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    @StructMember(2) public native int getMaxLobbyMembers();
    @StructMember(2) public native EOS_Lobby_CreateLobbyOptions setMaxLobbyMembers(int MaxLobbyMembers);
    @StructMember(3) public native EOS_ELobbyPermissionLevel getPermissionLevel();
    @StructMember(3) public native EOS_Lobby_CreateLobbyOptions setPermissionLevel(EOS_ELobbyPermissionLevel PermissionLevel);
    @StructMember(4) public native int getBPresenceEnabled();
    @StructMember(4) public native EOS_Lobby_CreateLobbyOptions setBPresenceEnabled(int bPresenceEnabled);
    @StructMember(5) public native int getBAllowInvites();
    @StructMember(5) public native EOS_Lobby_CreateLobbyOptions setBAllowInvites(int bAllowInvites);
    @StructMember(6) public native BytePtr getBucketId();
    @StructMember(6) public native EOS_Lobby_CreateLobbyOptions setBucketId(BytePtr BucketId);
    @StructMember(7) public native int getBDisableHostMigration();
    @StructMember(7) public native EOS_Lobby_CreateLobbyOptions setBDisableHostMigration(int bDisableHostMigration);
    @StructMember(8) public native int getBEnableRTCRoom();
    @StructMember(8) public native EOS_Lobby_CreateLobbyOptions setBEnableRTCRoom(int bEnableRTCRoom);
    @StructMember(9) public native EOS_Lobby_LocalRTCOptions getLocalRTCOptions();
    @StructMember(9) public native EOS_Lobby_CreateLobbyOptions setLocalRTCOptions(EOS_Lobby_LocalRTCOptions LocalRTCOptions);
    @StructMember(10) public native BytePtr getLobbyId();
    @StructMember(10) public native EOS_Lobby_CreateLobbyOptions setLobbyId(BytePtr LobbyId);
    @StructMember(11) public native int getBEnableJoinById();
    @StructMember(11) public native EOS_Lobby_CreateLobbyOptions setBEnableJoinById(int bEnableJoinById);
    @StructMember(12) public native int getBRejoinAfterKickRequiresInvite();
    @StructMember(12) public native EOS_Lobby_CreateLobbyOptions setBRejoinAfterKickRequiresInvite(int bRejoinAfterKickRequiresInvite);
    @StructMember(13) public native IntPtr getAllowedPlatformIds();
    @StructMember(13) public native EOS_Lobby_CreateLobbyOptions setAllowedPlatformIds(IntPtr AllowedPlatformIds);
    @StructMember(14) public native int getAllowedPlatformIdsCount();
    @StructMember(14) public native EOS_Lobby_CreateLobbyOptions setAllowedPlatformIdsCount(int AllowedPlatformIdsCount);
    @StructMember(15) public native int getBCrossplayOptOut();
    @StructMember(15) public native EOS_Lobby_CreateLobbyOptions setBCrossplayOptOut(int bCrossplayOptOut);
    @StructMember(16) public native EOS_ELobbyRTCRoomJoinActionType getRTCRoomJoinActionType();
    @StructMember(16) public native EOS_Lobby_CreateLobbyOptions setRTCRoomJoinActionType(EOS_ELobbyRTCRoomJoinActionType RTCRoomJoinActionType);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
