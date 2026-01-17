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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_RTC_BlockParticipantOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_RTC_BlockParticipantOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_RTC_BlockParticipantOptionsPtr extends Ptr<EOS_RTC_BlockParticipantOptions, EOS_RTC_BlockParticipantOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_RTC_BlockParticipantOptions() {}
    public EOS_RTC_BlockParticipantOptions(int ApiVersion, EOS_ProductUserIdDetails LocalUserId, BytePtr RoomName, EOS_ProductUserIdDetails ParticipantId, int bBlocked) {
        this.setApiVersion(ApiVersion);
        this.setLocalUserId(LocalUserId);
        this.setRoomName(RoomName);
        this.setParticipantId(ParticipantId);
        this.setBBlocked(bBlocked);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_RTC_BlockParticipantOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(1) public native EOS_RTC_BlockParticipantOptions setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    @StructMember(2) public native BytePtr getRoomName();
    @StructMember(2) public native EOS_RTC_BlockParticipantOptions setRoomName(BytePtr RoomName);
    @StructMember(3) public native EOS_ProductUserIdDetails getParticipantId();
    @StructMember(3) public native EOS_RTC_BlockParticipantOptions setParticipantId(EOS_ProductUserIdDetails ParticipantId);
    @StructMember(4) public native int getBBlocked();
    @StructMember(4) public native EOS_RTC_BlockParticipantOptions setBBlocked(int bBlocked);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
