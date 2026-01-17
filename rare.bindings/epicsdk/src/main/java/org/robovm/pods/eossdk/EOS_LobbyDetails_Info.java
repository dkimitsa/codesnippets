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
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_LobbyDetails_Info/*</name>*/ 
    extends /*<extends>*/Struct<EOS_LobbyDetails_Info>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_LobbyDetails_InfoPtr extends Ptr<EOS_LobbyDetails_Info, EOS_LobbyDetails_InfoPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_LobbyDetails_Info.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_LobbyDetails_Info() {}
    public EOS_LobbyDetails_Info(int ApiVersion, BytePtr LobbyId, EOS_ProductUserIdDetails LobbyOwnerUserId, EOS_ELobbyPermissionLevel PermissionLevel, int AvailableSlots, int MaxMembers, int bAllowInvites, BytePtr BucketId, int bAllowHostMigration, int bRTCRoomEnabled, int bAllowJoinById, int bRejoinAfterKickRequiresInvite, int bPresenceEnabled, IntPtr AllowedPlatformIds, int AllowedPlatformIdsCount) {
        this.setApiVersion(ApiVersion);
        this.setLobbyId(LobbyId);
        this.setLobbyOwnerUserId(LobbyOwnerUserId);
        this.setPermissionLevel(PermissionLevel);
        this.setAvailableSlots(AvailableSlots);
        this.setMaxMembers(MaxMembers);
        this.setBAllowInvites(bAllowInvites);
        this.setBucketId(BucketId);
        this.setBAllowHostMigration(bAllowHostMigration);
        this.setBRTCRoomEnabled(bRTCRoomEnabled);
        this.setBAllowJoinById(bAllowJoinById);
        this.setBRejoinAfterKickRequiresInvite(bRejoinAfterKickRequiresInvite);
        this.setBPresenceEnabled(bPresenceEnabled);
        this.setAllowedPlatformIds(AllowedPlatformIds);
        this.setAllowedPlatformIdsCount(AllowedPlatformIdsCount);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_LobbyDetails_Info setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getLobbyId();
    @StructMember(1) public native EOS_LobbyDetails_Info setLobbyId(BytePtr LobbyId);
    @StructMember(2) public native EOS_ProductUserIdDetails getLobbyOwnerUserId();
    @StructMember(2) public native EOS_LobbyDetails_Info setLobbyOwnerUserId(EOS_ProductUserIdDetails LobbyOwnerUserId);
    @StructMember(3) public native EOS_ELobbyPermissionLevel getPermissionLevel();
    @StructMember(3) public native EOS_LobbyDetails_Info setPermissionLevel(EOS_ELobbyPermissionLevel PermissionLevel);
    @StructMember(4) public native int getAvailableSlots();
    @StructMember(4) public native EOS_LobbyDetails_Info setAvailableSlots(int AvailableSlots);
    @StructMember(5) public native int getMaxMembers();
    @StructMember(5) public native EOS_LobbyDetails_Info setMaxMembers(int MaxMembers);
    @StructMember(6) public native int getBAllowInvites();
    @StructMember(6) public native EOS_LobbyDetails_Info setBAllowInvites(int bAllowInvites);
    @StructMember(7) public native BytePtr getBucketId();
    @StructMember(7) public native EOS_LobbyDetails_Info setBucketId(BytePtr BucketId);
    @StructMember(8) public native int getBAllowHostMigration();
    @StructMember(8) public native EOS_LobbyDetails_Info setBAllowHostMigration(int bAllowHostMigration);
    @StructMember(9) public native int getBRTCRoomEnabled();
    @StructMember(9) public native EOS_LobbyDetails_Info setBRTCRoomEnabled(int bRTCRoomEnabled);
    @StructMember(10) public native int getBAllowJoinById();
    @StructMember(10) public native EOS_LobbyDetails_Info setBAllowJoinById(int bAllowJoinById);
    @StructMember(11) public native int getBRejoinAfterKickRequiresInvite();
    @StructMember(11) public native EOS_LobbyDetails_Info setBRejoinAfterKickRequiresInvite(int bRejoinAfterKickRequiresInvite);
    @StructMember(12) public native int getBPresenceEnabled();
    @StructMember(12) public native EOS_LobbyDetails_Info setBPresenceEnabled(int bPresenceEnabled);
    @StructMember(13) public native IntPtr getAllowedPlatformIds();
    @StructMember(13) public native EOS_LobbyDetails_Info setAllowedPlatformIds(IntPtr AllowedPlatformIds);
    @StructMember(14) public native int getAllowedPlatformIdsCount();
    @StructMember(14) public native EOS_LobbyDetails_Info setAllowedPlatformIdsCount(int AllowedPlatformIdsCount);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_LobbyDetails_Info_Release", optional=true)
    public native void release();
    /*</methods>*/
}
