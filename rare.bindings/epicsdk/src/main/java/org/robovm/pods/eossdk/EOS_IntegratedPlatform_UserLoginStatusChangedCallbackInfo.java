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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_IntegratedPlatform_UserLoginStatusChangedCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_IntegratedPlatform_UserLoginStatusChangedCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_IntegratedPlatform_UserLoginStatusChangedCallbackInfoPtr extends Ptr<EOS_IntegratedPlatform_UserLoginStatusChangedCallbackInfo, EOS_IntegratedPlatform_UserLoginStatusChangedCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_IntegratedPlatform_UserLoginStatusChangedCallbackInfo() {}
    public EOS_IntegratedPlatform_UserLoginStatusChangedCallbackInfo(VoidPtr ClientData, BytePtr PlatformType, BytePtr LocalPlatformUserId, EOS_EpicAccountIdDetails AccountId, EOS_ProductUserIdDetails ProductUserId, EOS_ELoginStatus PreviousLoginStatus, EOS_ELoginStatus CurrentLoginStatus) {
        this.setClientData(ClientData);
        this.setPlatformType(PlatformType);
        this.setLocalPlatformUserId(LocalPlatformUserId);
        this.setAccountId(AccountId);
        this.setProductUserId(ProductUserId);
        this.setPreviousLoginStatus(PreviousLoginStatus);
        this.setCurrentLoginStatus(CurrentLoginStatus);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native VoidPtr getClientData();
    @StructMember(0) public native EOS_IntegratedPlatform_UserLoginStatusChangedCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(1) public native BytePtr getPlatformType();
    @StructMember(1) public native EOS_IntegratedPlatform_UserLoginStatusChangedCallbackInfo setPlatformType(BytePtr PlatformType);
    @StructMember(2) public native BytePtr getLocalPlatformUserId();
    @StructMember(2) public native EOS_IntegratedPlatform_UserLoginStatusChangedCallbackInfo setLocalPlatformUserId(BytePtr LocalPlatformUserId);
    @StructMember(3) public native EOS_EpicAccountIdDetails getAccountId();
    @StructMember(3) public native EOS_IntegratedPlatform_UserLoginStatusChangedCallbackInfo setAccountId(EOS_EpicAccountIdDetails AccountId);
    @StructMember(4) public native EOS_ProductUserIdDetails getProductUserId();
    @StructMember(4) public native EOS_IntegratedPlatform_UserLoginStatusChangedCallbackInfo setProductUserId(EOS_ProductUserIdDetails ProductUserId);
    @StructMember(5) public native EOS_ELoginStatus getPreviousLoginStatus();
    @StructMember(5) public native EOS_IntegratedPlatform_UserLoginStatusChangedCallbackInfo setPreviousLoginStatus(EOS_ELoginStatus PreviousLoginStatus);
    @StructMember(6) public native EOS_ELoginStatus getCurrentLoginStatus();
    @StructMember(6) public native EOS_IntegratedPlatform_UserLoginStatusChangedCallbackInfo setCurrentLoginStatus(EOS_ELoginStatus CurrentLoginStatus);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
