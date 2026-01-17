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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_CustomInvites_CustomInviteRejectedCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_CustomInvites_CustomInviteRejectedCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_CustomInvites_CustomInviteRejectedCallbackInfoPtr extends Ptr<EOS_CustomInvites_CustomInviteRejectedCallbackInfo, EOS_CustomInvites_CustomInviteRejectedCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_CustomInvites_CustomInviteRejectedCallbackInfo() {}
    public EOS_CustomInvites_CustomInviteRejectedCallbackInfo(VoidPtr ClientData, EOS_ProductUserIdDetails TargetUserId, EOS_ProductUserIdDetails LocalUserId, BytePtr CustomInviteId, BytePtr Payload) {
        this.setClientData(ClientData);
        this.setTargetUserId(TargetUserId);
        this.setLocalUserId(LocalUserId);
        this.setCustomInviteId(CustomInviteId);
        this.setPayload(Payload);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native VoidPtr getClientData();
    @StructMember(0) public native EOS_CustomInvites_CustomInviteRejectedCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(1) public native EOS_ProductUserIdDetails getTargetUserId();
    @StructMember(1) public native EOS_CustomInvites_CustomInviteRejectedCallbackInfo setTargetUserId(EOS_ProductUserIdDetails TargetUserId);
    @StructMember(2) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(2) public native EOS_CustomInvites_CustomInviteRejectedCallbackInfo setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    @StructMember(3) public native BytePtr getCustomInviteId();
    @StructMember(3) public native EOS_CustomInvites_CustomInviteRejectedCallbackInfo setCustomInviteId(BytePtr CustomInviteId);
    @StructMember(4) public native BytePtr getPayload();
    @StructMember(4) public native EOS_CustomInvites_CustomInviteRejectedCallbackInfo setPayload(BytePtr Payload);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
