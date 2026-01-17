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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Auth_LoginCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Auth_LoginCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Auth_LoginCallbackInfoPtr extends Ptr<EOS_Auth_LoginCallbackInfo, EOS_Auth_LoginCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Auth_LoginCallbackInfo() {}
    public EOS_Auth_LoginCallbackInfo(EOS_EResult ResultCode, VoidPtr ClientData, EOS_EpicAccountIdDetails LocalUserId, EOS_Auth_PinGrantInfo PinGrantInfo, EOS_ContinuanceTokenDetails ContinuanceToken, EOS_Auth_AccountFeatureRestrictedInfo AccountFeatureRestrictedInfo_DEPRECATED, EOS_EpicAccountIdDetails SelectedAccountId) {
        this.setResultCode(ResultCode);
        this.setClientData(ClientData);
        this.setLocalUserId(LocalUserId);
        this.setPinGrantInfo(PinGrantInfo);
        this.setContinuanceToken(ContinuanceToken);
        this.setAccountFeatureRestrictedInfo_DEPRECATED(AccountFeatureRestrictedInfo_DEPRECATED);
        this.setSelectedAccountId(SelectedAccountId);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native EOS_EResult getResultCode();
    @StructMember(0) public native EOS_Auth_LoginCallbackInfo setResultCode(EOS_EResult ResultCode);
    @StructMember(1) public native VoidPtr getClientData();
    @StructMember(1) public native EOS_Auth_LoginCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(2) public native EOS_EpicAccountIdDetails getLocalUserId();
    @StructMember(2) public native EOS_Auth_LoginCallbackInfo setLocalUserId(EOS_EpicAccountIdDetails LocalUserId);
    @StructMember(3) public native EOS_Auth_PinGrantInfo getPinGrantInfo();
    @StructMember(3) public native EOS_Auth_LoginCallbackInfo setPinGrantInfo(EOS_Auth_PinGrantInfo PinGrantInfo);
    @StructMember(4) public native EOS_ContinuanceTokenDetails getContinuanceToken();
    @StructMember(4) public native EOS_Auth_LoginCallbackInfo setContinuanceToken(EOS_ContinuanceTokenDetails ContinuanceToken);
    @StructMember(5) public native EOS_Auth_AccountFeatureRestrictedInfo getAccountFeatureRestrictedInfo_DEPRECATED();
    @StructMember(5) public native EOS_Auth_LoginCallbackInfo setAccountFeatureRestrictedInfo_DEPRECATED(EOS_Auth_AccountFeatureRestrictedInfo AccountFeatureRestrictedInfo_DEPRECATED);
    @StructMember(6) public native EOS_EpicAccountIdDetails getSelectedAccountId();
    @StructMember(6) public native EOS_Auth_LoginCallbackInfo setSelectedAccountId(EOS_EpicAccountIdDetails SelectedAccountId);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
