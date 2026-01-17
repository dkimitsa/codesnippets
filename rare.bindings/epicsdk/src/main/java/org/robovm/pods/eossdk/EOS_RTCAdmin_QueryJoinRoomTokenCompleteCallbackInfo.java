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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_RTCAdmin_QueryJoinRoomTokenCompleteCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_RTCAdmin_QueryJoinRoomTokenCompleteCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_RTCAdmin_QueryJoinRoomTokenCompleteCallbackInfoPtr extends Ptr<EOS_RTCAdmin_QueryJoinRoomTokenCompleteCallbackInfo, EOS_RTCAdmin_QueryJoinRoomTokenCompleteCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_RTCAdmin_QueryJoinRoomTokenCompleteCallbackInfo() {}
    public EOS_RTCAdmin_QueryJoinRoomTokenCompleteCallbackInfo(EOS_EResult ResultCode, VoidPtr ClientData, BytePtr RoomName, BytePtr ClientBaseUrl, int QueryId, int TokenCount) {
        this.setResultCode(ResultCode);
        this.setClientData(ClientData);
        this.setRoomName(RoomName);
        this.setClientBaseUrl(ClientBaseUrl);
        this.setQueryId(QueryId);
        this.setTokenCount(TokenCount);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native EOS_EResult getResultCode();
    @StructMember(0) public native EOS_RTCAdmin_QueryJoinRoomTokenCompleteCallbackInfo setResultCode(EOS_EResult ResultCode);
    @StructMember(1) public native VoidPtr getClientData();
    @StructMember(1) public native EOS_RTCAdmin_QueryJoinRoomTokenCompleteCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(2) public native BytePtr getRoomName();
    @StructMember(2) public native EOS_RTCAdmin_QueryJoinRoomTokenCompleteCallbackInfo setRoomName(BytePtr RoomName);
    @StructMember(3) public native BytePtr getClientBaseUrl();
    @StructMember(3) public native EOS_RTCAdmin_QueryJoinRoomTokenCompleteCallbackInfo setClientBaseUrl(BytePtr ClientBaseUrl);
    @StructMember(4) public native int getQueryId();
    @StructMember(4) public native EOS_RTCAdmin_QueryJoinRoomTokenCompleteCallbackInfo setQueryId(int QueryId);
    @StructMember(5) public native int getTokenCount();
    @StructMember(5) public native EOS_RTCAdmin_QueryJoinRoomTokenCompleteCallbackInfo setTokenCount(int TokenCount);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
