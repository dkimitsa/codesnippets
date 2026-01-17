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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Auth_Token/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Auth_Token>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Auth_TokenPtr extends Ptr<EOS_Auth_Token, EOS_Auth_TokenPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_Auth_Token.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Auth_Token() {}
    public EOS_Auth_Token(int ApiVersion, BytePtr App, BytePtr ClientId, EOS_EpicAccountIdDetails AccountId, BytePtr AccessToken, double ExpiresIn, BytePtr ExpiresAt, EOS_EAuthTokenType AuthType, BytePtr RefreshToken, double RefreshExpiresIn, BytePtr RefreshExpiresAt) {
        this.setApiVersion(ApiVersion);
        this.setApp(App);
        this.setClientId(ClientId);
        this.setAccountId(AccountId);
        this.setAccessToken(AccessToken);
        this.setExpiresIn(ExpiresIn);
        this.setExpiresAt(ExpiresAt);
        this.setAuthType(AuthType);
        this.setRefreshToken(RefreshToken);
        this.setRefreshExpiresIn(RefreshExpiresIn);
        this.setRefreshExpiresAt(RefreshExpiresAt);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Auth_Token setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getApp();
    @StructMember(1) public native EOS_Auth_Token setApp(BytePtr App);
    @StructMember(2) public native BytePtr getClientId();
    @StructMember(2) public native EOS_Auth_Token setClientId(BytePtr ClientId);
    @StructMember(3) public native EOS_EpicAccountIdDetails getAccountId();
    @StructMember(3) public native EOS_Auth_Token setAccountId(EOS_EpicAccountIdDetails AccountId);
    @StructMember(4) public native BytePtr getAccessToken();
    @StructMember(4) public native EOS_Auth_Token setAccessToken(BytePtr AccessToken);
    @StructMember(5) public native double getExpiresIn();
    @StructMember(5) public native EOS_Auth_Token setExpiresIn(double ExpiresIn);
    @StructMember(6) public native BytePtr getExpiresAt();
    @StructMember(6) public native EOS_Auth_Token setExpiresAt(BytePtr ExpiresAt);
    @StructMember(7) public native EOS_EAuthTokenType getAuthType();
    @StructMember(7) public native EOS_Auth_Token setAuthType(EOS_EAuthTokenType AuthType);
    @StructMember(8) public native BytePtr getRefreshToken();
    @StructMember(8) public native EOS_Auth_Token setRefreshToken(BytePtr RefreshToken);
    @StructMember(9) public native double getRefreshExpiresIn();
    @StructMember(9) public native EOS_Auth_Token setRefreshExpiresIn(double RefreshExpiresIn);
    @StructMember(10) public native BytePtr getRefreshExpiresAt();
    @StructMember(10) public native EOS_Auth_Token setRefreshExpiresAt(BytePtr RefreshExpiresAt);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_Auth_Token_Release", optional=true)
    public native void release();
    /*</methods>*/
}
