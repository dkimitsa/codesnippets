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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Connect_ExternalAccountInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Connect_ExternalAccountInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Connect_ExternalAccountInfoPtr extends Ptr<EOS_Connect_ExternalAccountInfo, EOS_Connect_ExternalAccountInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Connect_ExternalAccountInfo() {}
    public EOS_Connect_ExternalAccountInfo(int ApiVersion, EOS_ProductUserIdDetails ProductUserId, BytePtr DisplayName, BytePtr AccountId, EOS_EExternalAccountType AccountIdType, long LastLoginTime) {
        this.setApiVersion(ApiVersion);
        this.setProductUserId(ProductUserId);
        this.setDisplayName(DisplayName);
        this.setAccountId(AccountId);
        this.setAccountIdType(AccountIdType);
        this.setLastLoginTime(LastLoginTime);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Connect_ExternalAccountInfo setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_ProductUserIdDetails getProductUserId();
    @StructMember(1) public native EOS_Connect_ExternalAccountInfo setProductUserId(EOS_ProductUserIdDetails ProductUserId);
    @StructMember(2) public native BytePtr getDisplayName();
    @StructMember(2) public native EOS_Connect_ExternalAccountInfo setDisplayName(BytePtr DisplayName);
    @StructMember(3) public native BytePtr getAccountId();
    @StructMember(3) public native EOS_Connect_ExternalAccountInfo setAccountId(BytePtr AccountId);
    @StructMember(4) public native EOS_EExternalAccountType getAccountIdType();
    @StructMember(4) public native EOS_Connect_ExternalAccountInfo setAccountIdType(EOS_EExternalAccountType AccountIdType);
    @StructMember(5) public native long getLastLoginTime();
    @StructMember(5) public native EOS_Connect_ExternalAccountInfo setLastLoginTime(long LastLoginTime);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
