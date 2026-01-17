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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_ConnectHandle/*</name>*/ 
    extends /*<extends>*/NativeObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_ConnectHandlePtr extends Ptr<EOS_ConnectHandle, EOS_ConnectHandlePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_ConnectHandle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected EOS_ConnectHandle() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_Connect_ExternalAccountInfo_Release", optional=true)
    public static native void externalAccountInfo_Release(EOS_Connect_ExternalAccountInfo ExternalAccountInfo);
    @Bridge(symbol="EOS_Connect_IdToken_Release", optional=true)
    public static native void idToken_Release(EOS_Connect_IdToken IdToken);
    @Bridge(symbol="EOS_Connect_Login", optional=true)
    public native void login(EOS_Connect_LoginOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Connect_Logout", optional=true)
    public native void logout(EOS_Connect_LogoutOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Connect_CreateUser", optional=true)
    public native void createUser(EOS_Connect_CreateUserOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Connect_LinkAccount", optional=true)
    public native void linkAccount(EOS_Connect_LinkAccountOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Connect_UnlinkAccount", optional=true)
    public native void unlinkAccount(EOS_Connect_UnlinkAccountOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Connect_CreateDeviceId", optional=true)
    public native void createDeviceId(EOS_Connect_CreateDeviceIdOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Connect_DeleteDeviceId", optional=true)
    public native void deleteDeviceId(EOS_Connect_DeleteDeviceIdOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Connect_TransferDeviceIdAccount", optional=true)
    public native void transferDeviceIdAccount(EOS_Connect_TransferDeviceIdAccountOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Connect_QueryExternalAccountMappings", optional=true)
    public native void queryExternalAccountMappings(EOS_Connect_QueryExternalAccountMappingsOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Connect_QueryProductUserIdMappings", optional=true)
    public native void queryProductUserIdMappings(EOS_Connect_QueryProductUserIdMappingsOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Connect_GetExternalAccountMapping", optional=true)
    public native EOS_ProductUserIdDetails getExternalAccountMapping(EOS_Connect_GetExternalAccountMappingsOptions Options);
    @Bridge(symbol="EOS_Connect_GetProductUserIdMapping", optional=true)
    public native EOS_EResult getProductUserIdMapping(EOS_Connect_GetProductUserIdMappingOptions Options, BytePtr OutBuffer, IntPtr InOutBufferLength);
    @Bridge(symbol="EOS_Connect_GetProductUserExternalAccountCount", optional=true)
    public native int getProductUserExternalAccountCount(EOS_Connect_GetProductUserExternalAccountCountOptions Options);
    @Bridge(symbol="EOS_Connect_CopyProductUserExternalAccountByIndex", optional=true)
    public native EOS_EResult copyProductUserExternalAccountByIndex(EOS_Connect_CopyProductUserExternalAccountByIndexOptions Options, EOS_Connect_ExternalAccountInfo.EOS_Connect_ExternalAccountInfoPtr OutExternalAccountInfo);
    @Bridge(symbol="EOS_Connect_CopyProductUserExternalAccountByAccountType", optional=true)
    public native EOS_EResult copyProductUserExternalAccountByAccountType(EOS_Connect_CopyProductUserExternalAccountByAccountTypeOptions Options, EOS_Connect_ExternalAccountInfo.EOS_Connect_ExternalAccountInfoPtr OutExternalAccountInfo);
    @Bridge(symbol="EOS_Connect_CopyProductUserExternalAccountByAccountId", optional=true)
    public native EOS_EResult copyProductUserExternalAccountByAccountId(EOS_Connect_CopyProductUserExternalAccountByAccountIdOptions Options, EOS_Connect_ExternalAccountInfo.EOS_Connect_ExternalAccountInfoPtr OutExternalAccountInfo);
    @Bridge(symbol="EOS_Connect_CopyProductUserInfo", optional=true)
    public native EOS_EResult copyProductUserInfo(EOS_Connect_CopyProductUserInfoOptions Options, EOS_Connect_ExternalAccountInfo.EOS_Connect_ExternalAccountInfoPtr OutExternalAccountInfo);
    @Bridge(symbol="EOS_Connect_GetLoggedInUsersCount", optional=true)
    public native int getLoggedInUsersCount();
    @Bridge(symbol="EOS_Connect_GetLoggedInUserByIndex", optional=true)
    public native EOS_ProductUserIdDetails getLoggedInUserByIndex(int Index);
    @Bridge(symbol="EOS_Connect_GetLoginStatus", optional=true)
    public native EOS_ELoginStatus getLoginStatus(EOS_ProductUserIdDetails LocalUserId);
    @Bridge(symbol="EOS_Connect_AddNotifyAuthExpiration", optional=true)
    public native long addNotifyAuthExpiration(EOS_Connect_AddNotifyAuthExpirationOptions Options, VoidPtr ClientData, FunctionPtr Notification);
    @Bridge(symbol="EOS_Connect_RemoveNotifyAuthExpiration", optional=true)
    public native void removeNotifyAuthExpiration(long InId);
    @Bridge(symbol="EOS_Connect_AddNotifyLoginStatusChanged", optional=true)
    public native long addNotifyLoginStatusChanged(EOS_Connect_AddNotifyLoginStatusChangedOptions Options, VoidPtr ClientData, FunctionPtr Notification);
    @Bridge(symbol="EOS_Connect_RemoveNotifyLoginStatusChanged", optional=true)
    public native void removeNotifyLoginStatusChanged(long InId);
    @Bridge(symbol="EOS_Connect_CopyIdToken", optional=true)
    public native EOS_EResult copyIdToken(EOS_Connect_CopyIdTokenOptions Options, EOS_Connect_IdToken.EOS_Connect_IdTokenPtr OutIdToken);
    @Bridge(symbol="EOS_Connect_VerifyIdToken", optional=true)
    public native void verifyIdToken(EOS_Connect_VerifyIdTokenOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    /*</methods>*/
}
