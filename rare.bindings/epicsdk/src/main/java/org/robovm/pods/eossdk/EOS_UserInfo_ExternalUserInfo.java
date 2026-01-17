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
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_UserInfo_ExternalUserInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_UserInfo_ExternalUserInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_UserInfo_ExternalUserInfoPtr extends Ptr<EOS_UserInfo_ExternalUserInfo, EOS_UserInfo_ExternalUserInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_UserInfo_ExternalUserInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_UserInfo_ExternalUserInfo() {}
    public EOS_UserInfo_ExternalUserInfo(int ApiVersion, EOS_EExternalAccountType AccountType, BytePtr AccountId, BytePtr DisplayName, BytePtr DisplayNameSanitized) {
        this.setApiVersion(ApiVersion);
        this.setAccountType(AccountType);
        this.setAccountId(AccountId);
        this.setDisplayName(DisplayName);
        this.setDisplayNameSanitized(DisplayNameSanitized);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_UserInfo_ExternalUserInfo setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_EExternalAccountType getAccountType();
    @StructMember(1) public native EOS_UserInfo_ExternalUserInfo setAccountType(EOS_EExternalAccountType AccountType);
    @StructMember(2) public native BytePtr getAccountId();
    @StructMember(2) public native EOS_UserInfo_ExternalUserInfo setAccountId(BytePtr AccountId);
    @StructMember(3) public native BytePtr getDisplayName();
    @StructMember(3) public native EOS_UserInfo_ExternalUserInfo setDisplayName(BytePtr DisplayName);
    @StructMember(4) public native BytePtr getDisplayNameSanitized();
    @StructMember(4) public native EOS_UserInfo_ExternalUserInfo setDisplayNameSanitized(BytePtr DisplayNameSanitized);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_UserInfo_ExternalUserInfo_Release", optional=true)
    public native void release();
    /*</methods>*/
}
