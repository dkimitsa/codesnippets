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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_AntiCheatClient_RegisterPeerOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_AntiCheatClient_RegisterPeerOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_AntiCheatClient_RegisterPeerOptionsPtr extends Ptr<EOS_AntiCheatClient_RegisterPeerOptions, EOS_AntiCheatClient_RegisterPeerOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_AntiCheatClient_RegisterPeerOptions() {}
    public EOS_AntiCheatClient_RegisterPeerOptions(int ApiVersion, VoidPtr PeerHandle, EOS_EAntiCheatCommonClientType ClientType, EOS_EAntiCheatCommonClientPlatform ClientPlatform, int AuthenticationTimeout, BytePtr AccountId_DEPRECATED, BytePtr IpAddress, EOS_ProductUserIdDetails PeerProductUserId) {
        this.setApiVersion(ApiVersion);
        this.setPeerHandle(PeerHandle);
        this.setClientType(ClientType);
        this.setClientPlatform(ClientPlatform);
        this.setAuthenticationTimeout(AuthenticationTimeout);
        this.setAccountId_DEPRECATED(AccountId_DEPRECATED);
        this.setIpAddress(IpAddress);
        this.setPeerProductUserId(PeerProductUserId);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_AntiCheatClient_RegisterPeerOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native VoidPtr getPeerHandle();
    @StructMember(1) public native EOS_AntiCheatClient_RegisterPeerOptions setPeerHandle(VoidPtr PeerHandle);
    @StructMember(2) public native EOS_EAntiCheatCommonClientType getClientType();
    @StructMember(2) public native EOS_AntiCheatClient_RegisterPeerOptions setClientType(EOS_EAntiCheatCommonClientType ClientType);
    @StructMember(3) public native EOS_EAntiCheatCommonClientPlatform getClientPlatform();
    @StructMember(3) public native EOS_AntiCheatClient_RegisterPeerOptions setClientPlatform(EOS_EAntiCheatCommonClientPlatform ClientPlatform);
    @StructMember(4) public native int getAuthenticationTimeout();
    @StructMember(4) public native EOS_AntiCheatClient_RegisterPeerOptions setAuthenticationTimeout(int AuthenticationTimeout);
    @StructMember(5) public native BytePtr getAccountId_DEPRECATED();
    @StructMember(5) public native EOS_AntiCheatClient_RegisterPeerOptions setAccountId_DEPRECATED(BytePtr AccountId_DEPRECATED);
    @StructMember(6) public native BytePtr getIpAddress();
    @StructMember(6) public native EOS_AntiCheatClient_RegisterPeerOptions setIpAddress(BytePtr IpAddress);
    @StructMember(7) public native EOS_ProductUserIdDetails getPeerProductUserId();
    @StructMember(7) public native EOS_AntiCheatClient_RegisterPeerOptions setPeerProductUserId(EOS_ProductUserIdDetails PeerProductUserId);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
