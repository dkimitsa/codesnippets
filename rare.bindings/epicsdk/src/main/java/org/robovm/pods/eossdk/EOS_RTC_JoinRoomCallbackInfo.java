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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_RTC_JoinRoomCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_RTC_JoinRoomCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_RTC_JoinRoomCallbackInfoPtr extends Ptr<EOS_RTC_JoinRoomCallbackInfo, EOS_RTC_JoinRoomCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_RTC_JoinRoomCallbackInfo() {}
    public EOS_RTC_JoinRoomCallbackInfo(EOS_EResult ResultCode, VoidPtr ClientData, EOS_ProductUserIdDetails LocalUserId, BytePtr RoomName, int RoomOptionsCount, EOS_RTC_Option RoomOptions) {
        this.setResultCode(ResultCode);
        this.setClientData(ClientData);
        this.setLocalUserId(LocalUserId);
        this.setRoomName(RoomName);
        this.setRoomOptionsCount(RoomOptionsCount);
        this.setRoomOptions(RoomOptions);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native EOS_EResult getResultCode();
    @StructMember(0) public native EOS_RTC_JoinRoomCallbackInfo setResultCode(EOS_EResult ResultCode);
    @StructMember(1) public native VoidPtr getClientData();
    @StructMember(1) public native EOS_RTC_JoinRoomCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(2) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(2) public native EOS_RTC_JoinRoomCallbackInfo setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    @StructMember(3) public native BytePtr getRoomName();
    @StructMember(3) public native EOS_RTC_JoinRoomCallbackInfo setRoomName(BytePtr RoomName);
    @StructMember(4) public native int getRoomOptionsCount();
    @StructMember(4) public native EOS_RTC_JoinRoomCallbackInfo setRoomOptionsCount(int RoomOptionsCount);
    @StructMember(5) public native EOS_RTC_Option getRoomOptions();
    @StructMember(5) public native EOS_RTC_JoinRoomCallbackInfo setRoomOptions(EOS_RTC_Option RoomOptions);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
