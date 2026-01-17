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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_RTC_ParticipantStatusChangedCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_RTC_ParticipantStatusChangedCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_RTC_ParticipantStatusChangedCallbackInfoPtr extends Ptr<EOS_RTC_ParticipantStatusChangedCallbackInfo, EOS_RTC_ParticipantStatusChangedCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_RTC_ParticipantStatusChangedCallbackInfo() {}
    public EOS_RTC_ParticipantStatusChangedCallbackInfo(VoidPtr ClientData, EOS_ProductUserIdDetails LocalUserId, BytePtr RoomName, EOS_ProductUserIdDetails ParticipantId, EOS_ERTCParticipantStatus ParticipantStatus, int ParticipantMetadataCount, EOS_RTC_ParticipantMetadata ParticipantMetadata, int bParticipantInBlocklist) {
        this.setClientData(ClientData);
        this.setLocalUserId(LocalUserId);
        this.setRoomName(RoomName);
        this.setParticipantId(ParticipantId);
        this.setParticipantStatus(ParticipantStatus);
        this.setParticipantMetadataCount(ParticipantMetadataCount);
        this.setParticipantMetadata(ParticipantMetadata);
        this.setBParticipantInBlocklist(bParticipantInBlocklist);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native VoidPtr getClientData();
    @StructMember(0) public native EOS_RTC_ParticipantStatusChangedCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(1) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(1) public native EOS_RTC_ParticipantStatusChangedCallbackInfo setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    @StructMember(2) public native BytePtr getRoomName();
    @StructMember(2) public native EOS_RTC_ParticipantStatusChangedCallbackInfo setRoomName(BytePtr RoomName);
    @StructMember(3) public native EOS_ProductUserIdDetails getParticipantId();
    @StructMember(3) public native EOS_RTC_ParticipantStatusChangedCallbackInfo setParticipantId(EOS_ProductUserIdDetails ParticipantId);
    @StructMember(4) public native EOS_ERTCParticipantStatus getParticipantStatus();
    @StructMember(4) public native EOS_RTC_ParticipantStatusChangedCallbackInfo setParticipantStatus(EOS_ERTCParticipantStatus ParticipantStatus);
    @StructMember(5) public native int getParticipantMetadataCount();
    @StructMember(5) public native EOS_RTC_ParticipantStatusChangedCallbackInfo setParticipantMetadataCount(int ParticipantMetadataCount);
    @StructMember(6) public native EOS_RTC_ParticipantMetadata getParticipantMetadata();
    @StructMember(6) public native EOS_RTC_ParticipantStatusChangedCallbackInfo setParticipantMetadata(EOS_RTC_ParticipantMetadata ParticipantMetadata);
    @StructMember(7) public native int getBParticipantInBlocklist();
    @StructMember(7) public native EOS_RTC_ParticipantStatusChangedCallbackInfo setBParticipantInBlocklist(int bParticipantInBlocklist);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
