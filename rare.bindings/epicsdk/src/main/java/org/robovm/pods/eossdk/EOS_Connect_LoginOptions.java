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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Connect_LoginOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Connect_LoginOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Connect_LoginOptionsPtr extends Ptr<EOS_Connect_LoginOptions, EOS_Connect_LoginOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Connect_LoginOptions() {}
    public EOS_Connect_LoginOptions(int ApiVersion, EOS_Connect_Credentials Credentials, EOS_Connect_UserLoginInfo UserLoginInfo) {
        this.setApiVersion(ApiVersion);
        this.setCredentials(Credentials);
        this.setUserLoginInfo(UserLoginInfo);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Connect_LoginOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_Connect_Credentials getCredentials();
    @StructMember(1) public native EOS_Connect_LoginOptions setCredentials(EOS_Connect_Credentials Credentials);
    @StructMember(2) public native EOS_Connect_UserLoginInfo getUserLoginInfo();
    @StructMember(2) public native EOS_Connect_LoginOptions setUserLoginInfo(EOS_Connect_UserLoginInfo UserLoginInfo);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
