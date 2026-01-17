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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Auth_Credentials/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Auth_Credentials>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Auth_CredentialsPtr extends Ptr<EOS_Auth_Credentials, EOS_Auth_CredentialsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Auth_Credentials() {}
    public EOS_Auth_Credentials(int ApiVersion, BytePtr Id, BytePtr Token, EOS_ELoginCredentialType Type, VoidPtr SystemAuthCredentialsOptions, EOS_EExternalCredentialType ExternalType) {
        this.setApiVersion(ApiVersion);
        this.setId(Id);
        this.setToken(Token);
        this.setType(Type);
        this.setSystemAuthCredentialsOptions(SystemAuthCredentialsOptions);
        this.setExternalType(ExternalType);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Auth_Credentials setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getId();
    @StructMember(1) public native EOS_Auth_Credentials setId(BytePtr Id);
    @StructMember(2) public native BytePtr getToken();
    @StructMember(2) public native EOS_Auth_Credentials setToken(BytePtr Token);
    @StructMember(3) public native EOS_ELoginCredentialType getType();
    @StructMember(3) public native EOS_Auth_Credentials setType(EOS_ELoginCredentialType Type);
    @StructMember(4) public native VoidPtr getSystemAuthCredentialsOptions();
    @StructMember(4) public native EOS_Auth_Credentials setSystemAuthCredentialsOptions(VoidPtr SystemAuthCredentialsOptions);
    @StructMember(5) public native EOS_EExternalCredentialType getExternalType();
    @StructMember(5) public native EOS_Auth_Credentials setExternalType(EOS_EExternalCredentialType ExternalType);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
