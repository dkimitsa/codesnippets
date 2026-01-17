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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_AntiCheatServer_RegisterClientOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_AntiCheatServer_RegisterClientOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_AntiCheatServer_RegisterClientOptionsPtr extends Ptr<EOS_AntiCheatServer_RegisterClientOptions, EOS_AntiCheatServer_RegisterClientOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_AntiCheatServer_RegisterClientOptions() {}
    public EOS_AntiCheatServer_RegisterClientOptions(int ApiVersion, VoidPtr ClientHandle, EOS_EAntiCheatCommonClientType ClientType, EOS_EAntiCheatCommonClientPlatform ClientPlatform, BytePtr AccountId_DEPRECATED, BytePtr IpAddress, EOS_ProductUserIdDetails UserId, int Reserved01) {
        this.setApiVersion(ApiVersion);
        this.setClientHandle(ClientHandle);
        this.setClientType(ClientType);
        this.setClientPlatform(ClientPlatform);
        this.setAccountId_DEPRECATED(AccountId_DEPRECATED);
        this.setIpAddress(IpAddress);
        this.setUserId(UserId);
        this.setReserved01(Reserved01);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_AntiCheatServer_RegisterClientOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native VoidPtr getClientHandle();
    @StructMember(1) public native EOS_AntiCheatServer_RegisterClientOptions setClientHandle(VoidPtr ClientHandle);
    @StructMember(2) public native EOS_EAntiCheatCommonClientType getClientType();
    @StructMember(2) public native EOS_AntiCheatServer_RegisterClientOptions setClientType(EOS_EAntiCheatCommonClientType ClientType);
    @StructMember(3) public native EOS_EAntiCheatCommonClientPlatform getClientPlatform();
    @StructMember(3) public native EOS_AntiCheatServer_RegisterClientOptions setClientPlatform(EOS_EAntiCheatCommonClientPlatform ClientPlatform);
    @StructMember(4) public native BytePtr getAccountId_DEPRECATED();
    @StructMember(4) public native EOS_AntiCheatServer_RegisterClientOptions setAccountId_DEPRECATED(BytePtr AccountId_DEPRECATED);
    @StructMember(5) public native BytePtr getIpAddress();
    @StructMember(5) public native EOS_AntiCheatServer_RegisterClientOptions setIpAddress(BytePtr IpAddress);
    @StructMember(6) public native EOS_ProductUserIdDetails getUserId();
    @StructMember(6) public native EOS_AntiCheatServer_RegisterClientOptions setUserId(EOS_ProductUserIdDetails UserId);
    @StructMember(7) public native int getReserved01();
    @StructMember(7) public native EOS_AntiCheatServer_RegisterClientOptions setReserved01(int Reserved01);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
