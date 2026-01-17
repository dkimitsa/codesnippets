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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Lobby_SendLobbyNativeInviteRequestedCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Lobby_SendLobbyNativeInviteRequestedCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Lobby_SendLobbyNativeInviteRequestedCallbackInfoPtr extends Ptr<EOS_Lobby_SendLobbyNativeInviteRequestedCallbackInfo, EOS_Lobby_SendLobbyNativeInviteRequestedCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Lobby_SendLobbyNativeInviteRequestedCallbackInfo() {}
    public EOS_Lobby_SendLobbyNativeInviteRequestedCallbackInfo(VoidPtr ClientData, long UiEventId, EOS_ProductUserIdDetails LocalUserId, BytePtr TargetNativeAccountType, BytePtr TargetUserNativeAccountId, BytePtr LobbyId) {
        this.setClientData(ClientData);
        this.setUiEventId(UiEventId);
        this.setLocalUserId(LocalUserId);
        this.setTargetNativeAccountType(TargetNativeAccountType);
        this.setTargetUserNativeAccountId(TargetUserNativeAccountId);
        this.setLobbyId(LobbyId);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native VoidPtr getClientData();
    @StructMember(0) public native EOS_Lobby_SendLobbyNativeInviteRequestedCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(1) public native long getUiEventId();
    @StructMember(1) public native EOS_Lobby_SendLobbyNativeInviteRequestedCallbackInfo setUiEventId(long UiEventId);
    @StructMember(2) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(2) public native EOS_Lobby_SendLobbyNativeInviteRequestedCallbackInfo setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    @StructMember(3) public native BytePtr getTargetNativeAccountType();
    @StructMember(3) public native EOS_Lobby_SendLobbyNativeInviteRequestedCallbackInfo setTargetNativeAccountType(BytePtr TargetNativeAccountType);
    @StructMember(4) public native BytePtr getTargetUserNativeAccountId();
    @StructMember(4) public native EOS_Lobby_SendLobbyNativeInviteRequestedCallbackInfo setTargetUserNativeAccountId(BytePtr TargetUserNativeAccountId);
    @StructMember(5) public native BytePtr getLobbyId();
    @StructMember(5) public native EOS_Lobby_SendLobbyNativeInviteRequestedCallbackInfo setLobbyId(BytePtr LobbyId);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
