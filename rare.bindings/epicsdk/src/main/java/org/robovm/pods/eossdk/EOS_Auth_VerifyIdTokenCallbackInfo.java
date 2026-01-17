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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Auth_VerifyIdTokenCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Auth_VerifyIdTokenCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Auth_VerifyIdTokenCallbackInfoPtr extends Ptr<EOS_Auth_VerifyIdTokenCallbackInfo, EOS_Auth_VerifyIdTokenCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Auth_VerifyIdTokenCallbackInfo() {}
    public EOS_Auth_VerifyIdTokenCallbackInfo(EOS_EResult ResultCode, VoidPtr ClientData, BytePtr ApplicationId, BytePtr ClientId, BytePtr ProductId, BytePtr SandboxId, BytePtr DeploymentId, BytePtr DisplayName, int bIsExternalAccountInfoPresent, EOS_EExternalAccountType ExternalAccountIdType, BytePtr ExternalAccountId, BytePtr ExternalAccountDisplayName, BytePtr Platform) {
        this.setResultCode(ResultCode);
        this.setClientData(ClientData);
        this.setApplicationId(ApplicationId);
        this.setClientId(ClientId);
        this.setProductId(ProductId);
        this.setSandboxId(SandboxId);
        this.setDeploymentId(DeploymentId);
        this.setDisplayName(DisplayName);
        this.setBIsExternalAccountInfoPresent(bIsExternalAccountInfoPresent);
        this.setExternalAccountIdType(ExternalAccountIdType);
        this.setExternalAccountId(ExternalAccountId);
        this.setExternalAccountDisplayName(ExternalAccountDisplayName);
        this.setPlatform(Platform);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native EOS_EResult getResultCode();
    @StructMember(0) public native EOS_Auth_VerifyIdTokenCallbackInfo setResultCode(EOS_EResult ResultCode);
    @StructMember(1) public native VoidPtr getClientData();
    @StructMember(1) public native EOS_Auth_VerifyIdTokenCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(2) public native BytePtr getApplicationId();
    @StructMember(2) public native EOS_Auth_VerifyIdTokenCallbackInfo setApplicationId(BytePtr ApplicationId);
    @StructMember(3) public native BytePtr getClientId();
    @StructMember(3) public native EOS_Auth_VerifyIdTokenCallbackInfo setClientId(BytePtr ClientId);
    @StructMember(4) public native BytePtr getProductId();
    @StructMember(4) public native EOS_Auth_VerifyIdTokenCallbackInfo setProductId(BytePtr ProductId);
    @StructMember(5) public native BytePtr getSandboxId();
    @StructMember(5) public native EOS_Auth_VerifyIdTokenCallbackInfo setSandboxId(BytePtr SandboxId);
    @StructMember(6) public native BytePtr getDeploymentId();
    @StructMember(6) public native EOS_Auth_VerifyIdTokenCallbackInfo setDeploymentId(BytePtr DeploymentId);
    @StructMember(7) public native BytePtr getDisplayName();
    @StructMember(7) public native EOS_Auth_VerifyIdTokenCallbackInfo setDisplayName(BytePtr DisplayName);
    @StructMember(8) public native int getBIsExternalAccountInfoPresent();
    @StructMember(8) public native EOS_Auth_VerifyIdTokenCallbackInfo setBIsExternalAccountInfoPresent(int bIsExternalAccountInfoPresent);
    @StructMember(9) public native EOS_EExternalAccountType getExternalAccountIdType();
    @StructMember(9) public native EOS_Auth_VerifyIdTokenCallbackInfo setExternalAccountIdType(EOS_EExternalAccountType ExternalAccountIdType);
    @StructMember(10) public native BytePtr getExternalAccountId();
    @StructMember(10) public native EOS_Auth_VerifyIdTokenCallbackInfo setExternalAccountId(BytePtr ExternalAccountId);
    @StructMember(11) public native BytePtr getExternalAccountDisplayName();
    @StructMember(11) public native EOS_Auth_VerifyIdTokenCallbackInfo setExternalAccountDisplayName(BytePtr ExternalAccountDisplayName);
    @StructMember(12) public native BytePtr getPlatform();
    @StructMember(12) public native EOS_Auth_VerifyIdTokenCallbackInfo setPlatform(BytePtr Platform);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
