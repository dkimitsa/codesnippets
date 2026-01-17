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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_KWS_PermissionsUpdateReceivedCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_KWS_PermissionsUpdateReceivedCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_KWS_PermissionsUpdateReceivedCallbackInfoPtr extends Ptr<EOS_KWS_PermissionsUpdateReceivedCallbackInfo, EOS_KWS_PermissionsUpdateReceivedCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_KWS_PermissionsUpdateReceivedCallbackInfo() {}
    public EOS_KWS_PermissionsUpdateReceivedCallbackInfo(VoidPtr ClientData, EOS_ProductUserIdDetails LocalUserId, BytePtr KWSUserId, BytePtr DateOfBirth, int bIsMinor, BytePtr ParentEmail) {
        this.setClientData(ClientData);
        this.setLocalUserId(LocalUserId);
        this.setKWSUserId(KWSUserId);
        this.setDateOfBirth(DateOfBirth);
        this.setBIsMinor(bIsMinor);
        this.setParentEmail(ParentEmail);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native VoidPtr getClientData();
    @StructMember(0) public native EOS_KWS_PermissionsUpdateReceivedCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(1) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(1) public native EOS_KWS_PermissionsUpdateReceivedCallbackInfo setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    @StructMember(2) public native BytePtr getKWSUserId();
    @StructMember(2) public native EOS_KWS_PermissionsUpdateReceivedCallbackInfo setKWSUserId(BytePtr KWSUserId);
    @StructMember(3) public native BytePtr getDateOfBirth();
    @StructMember(3) public native EOS_KWS_PermissionsUpdateReceivedCallbackInfo setDateOfBirth(BytePtr DateOfBirth);
    @StructMember(4) public native int getBIsMinor();
    @StructMember(4) public native EOS_KWS_PermissionsUpdateReceivedCallbackInfo setBIsMinor(int bIsMinor);
    @StructMember(5) public native BytePtr getParentEmail();
    @StructMember(5) public native EOS_KWS_PermissionsUpdateReceivedCallbackInfo setParentEmail(BytePtr ParentEmail);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
