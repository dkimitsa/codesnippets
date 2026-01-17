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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Ecom_QueryOwnershipCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Ecom_QueryOwnershipCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Ecom_QueryOwnershipCallbackInfoPtr extends Ptr<EOS_Ecom_QueryOwnershipCallbackInfo, EOS_Ecom_QueryOwnershipCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Ecom_QueryOwnershipCallbackInfo() {}
    public EOS_Ecom_QueryOwnershipCallbackInfo(EOS_EResult ResultCode, VoidPtr ClientData, EOS_EpicAccountIdDetails LocalUserId, EOS_Ecom_ItemOwnership ItemOwnership, int ItemOwnershipCount) {
        this.setResultCode(ResultCode);
        this.setClientData(ClientData);
        this.setLocalUserId(LocalUserId);
        this.setItemOwnership(ItemOwnership);
        this.setItemOwnershipCount(ItemOwnershipCount);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native EOS_EResult getResultCode();
    @StructMember(0) public native EOS_Ecom_QueryOwnershipCallbackInfo setResultCode(EOS_EResult ResultCode);
    @StructMember(1) public native VoidPtr getClientData();
    @StructMember(1) public native EOS_Ecom_QueryOwnershipCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(2) public native EOS_EpicAccountIdDetails getLocalUserId();
    @StructMember(2) public native EOS_Ecom_QueryOwnershipCallbackInfo setLocalUserId(EOS_EpicAccountIdDetails LocalUserId);
    @StructMember(3) public native EOS_Ecom_ItemOwnership getItemOwnership();
    @StructMember(3) public native EOS_Ecom_QueryOwnershipCallbackInfo setItemOwnership(EOS_Ecom_ItemOwnership ItemOwnership);
    @StructMember(4) public native int getItemOwnershipCount();
    @StructMember(4) public native EOS_Ecom_QueryOwnershipCallbackInfo setItemOwnershipCount(int ItemOwnershipCount);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
