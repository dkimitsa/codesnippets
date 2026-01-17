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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Connect_VerifyIdTokenCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Connect_VerifyIdTokenCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Connect_VerifyIdTokenCallbackInfoPtr extends Ptr<EOS_Connect_VerifyIdTokenCallbackInfo, EOS_Connect_VerifyIdTokenCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Connect_VerifyIdTokenCallbackInfo() {}
    public EOS_Connect_VerifyIdTokenCallbackInfo(EOS_EResult ResultCode, VoidPtr ClientData, EOS_ProductUserIdDetails ProductUserId, int bIsAccountInfoPresent, EOS_EExternalAccountType AccountIdType, BytePtr AccountId, BytePtr Platform, BytePtr DeviceType, BytePtr ClientId, BytePtr ProductId, BytePtr SandboxId, BytePtr DeploymentId) {
        this.setResultCode(ResultCode);
        this.setClientData(ClientData);
        this.setProductUserId(ProductUserId);
        this.setBIsAccountInfoPresent(bIsAccountInfoPresent);
        this.setAccountIdType(AccountIdType);
        this.setAccountId(AccountId);
        this.setPlatform(Platform);
        this.setDeviceType(DeviceType);
        this.setClientId(ClientId);
        this.setProductId(ProductId);
        this.setSandboxId(SandboxId);
        this.setDeploymentId(DeploymentId);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native EOS_EResult getResultCode();
    @StructMember(0) public native EOS_Connect_VerifyIdTokenCallbackInfo setResultCode(EOS_EResult ResultCode);
    @StructMember(1) public native VoidPtr getClientData();
    @StructMember(1) public native EOS_Connect_VerifyIdTokenCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(2) public native EOS_ProductUserIdDetails getProductUserId();
    @StructMember(2) public native EOS_Connect_VerifyIdTokenCallbackInfo setProductUserId(EOS_ProductUserIdDetails ProductUserId);
    @StructMember(3) public native int getBIsAccountInfoPresent();
    @StructMember(3) public native EOS_Connect_VerifyIdTokenCallbackInfo setBIsAccountInfoPresent(int bIsAccountInfoPresent);
    @StructMember(4) public native EOS_EExternalAccountType getAccountIdType();
    @StructMember(4) public native EOS_Connect_VerifyIdTokenCallbackInfo setAccountIdType(EOS_EExternalAccountType AccountIdType);
    @StructMember(5) public native BytePtr getAccountId();
    @StructMember(5) public native EOS_Connect_VerifyIdTokenCallbackInfo setAccountId(BytePtr AccountId);
    @StructMember(6) public native BytePtr getPlatform();
    @StructMember(6) public native EOS_Connect_VerifyIdTokenCallbackInfo setPlatform(BytePtr Platform);
    @StructMember(7) public native BytePtr getDeviceType();
    @StructMember(7) public native EOS_Connect_VerifyIdTokenCallbackInfo setDeviceType(BytePtr DeviceType);
    @StructMember(8) public native BytePtr getClientId();
    @StructMember(8) public native EOS_Connect_VerifyIdTokenCallbackInfo setClientId(BytePtr ClientId);
    @StructMember(9) public native BytePtr getProductId();
    @StructMember(9) public native EOS_Connect_VerifyIdTokenCallbackInfo setProductId(BytePtr ProductId);
    @StructMember(10) public native BytePtr getSandboxId();
    @StructMember(10) public native EOS_Connect_VerifyIdTokenCallbackInfo setSandboxId(BytePtr SandboxId);
    @StructMember(11) public native BytePtr getDeploymentId();
    @StructMember(11) public native EOS_Connect_VerifyIdTokenCallbackInfo setDeploymentId(BytePtr DeploymentId);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
