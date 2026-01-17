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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_AuthHandle/*</name>*/ 
    extends /*<extends>*/NativeObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_AuthHandlePtr extends Ptr<EOS_AuthHandle, EOS_AuthHandlePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_AuthHandle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected EOS_AuthHandle() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_Auth_IdToken_Release", optional=true)
    public static native void idToken_Release(EOS_Auth_IdToken IdToken);
    @Bridge(symbol="EOS_Auth_Login", optional=true)
    public native void login(EOS_Auth_LoginOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Auth_Logout", optional=true)
    public native void logout(EOS_Auth_LogoutOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Auth_LinkAccount", optional=true)
    public native void linkAccount(EOS_Auth_LinkAccountOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Auth_DeletePersistentAuth", optional=true)
    public native void deletePersistentAuth(EOS_Auth_DeletePersistentAuthOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Auth_VerifyUserAuth", optional=true)
    public native void verifyUserAuth(EOS_Auth_VerifyUserAuthOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Auth_GetLoggedInAccountsCount", optional=true)
    public native int getLoggedInAccountsCount();
    @Bridge(symbol="EOS_Auth_GetLoggedInAccountByIndex", optional=true)
    public native EOS_EpicAccountIdDetails getLoggedInAccountByIndex(int Index);
    @Bridge(symbol="EOS_Auth_GetLoginStatus", optional=true)
    public native EOS_ELoginStatus getLoginStatus(EOS_EpicAccountIdDetails LocalUserId);
    @Bridge(symbol="EOS_Auth_CopyUserAuthToken", optional=true)
    public native EOS_EResult copyUserAuthToken(EOS_Auth_CopyUserAuthTokenOptions Options, EOS_EpicAccountIdDetails LocalUserId, EOS_Auth_Token.EOS_Auth_TokenPtr OutUserAuthToken);
    @Bridge(symbol="EOS_Auth_CopyIdToken", optional=true)
    public native EOS_EResult copyIdToken(EOS_Auth_CopyIdTokenOptions Options, EOS_Auth_IdToken.EOS_Auth_IdTokenPtr OutIdToken);
    @Bridge(symbol="EOS_Auth_QueryIdToken", optional=true)
    public native void queryIdToken(EOS_Auth_QueryIdTokenOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Auth_VerifyIdToken", optional=true)
    public native void verifyIdToken(EOS_Auth_VerifyIdTokenOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Auth_GetSelectedAccountId", optional=true)
    public native EOS_EResult getSelectedAccountId(EOS_EpicAccountIdDetails LocalUserId, EOS_EpicAccountIdDetails.EOS_EpicAccountIdDetailsPtr OutSelectedAccountId);
    @Bridge(symbol="EOS_Auth_GetMergedAccountsCount", optional=true)
    public native int getMergedAccountsCount(EOS_EpicAccountIdDetails LocalUserId);
    @Bridge(symbol="EOS_Auth_GetMergedAccountByIndex", optional=true)
    public native EOS_EpicAccountIdDetails getMergedAccountByIndex(EOS_EpicAccountIdDetails LocalUserId, int Index);
    @Bridge(symbol="EOS_Auth_AddNotifyLoginStatusChanged", optional=true)
    public native long addNotifyLoginStatusChanged(EOS_Auth_AddNotifyLoginStatusChangedOptions Options, VoidPtr ClientData, FunctionPtr Notification);
    @Bridge(symbol="EOS_Auth_RemoveNotifyLoginStatusChanged", optional=true)
    public native void removeNotifyLoginStatusChanged(long InId);
    /*</methods>*/
}
