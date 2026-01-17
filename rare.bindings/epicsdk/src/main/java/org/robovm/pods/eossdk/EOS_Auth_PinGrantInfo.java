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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Auth_PinGrantInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Auth_PinGrantInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Auth_PinGrantInfoPtr extends Ptr<EOS_Auth_PinGrantInfo, EOS_Auth_PinGrantInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Auth_PinGrantInfo() {}
    public EOS_Auth_PinGrantInfo(int ApiVersion, BytePtr UserCode, BytePtr VerificationURI, int ExpiresIn, BytePtr VerificationURIComplete) {
        this.setApiVersion(ApiVersion);
        this.setUserCode(UserCode);
        this.setVerificationURI(VerificationURI);
        this.setExpiresIn(ExpiresIn);
        this.setVerificationURIComplete(VerificationURIComplete);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Auth_PinGrantInfo setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getUserCode();
    @StructMember(1) public native EOS_Auth_PinGrantInfo setUserCode(BytePtr UserCode);
    @StructMember(2) public native BytePtr getVerificationURI();
    @StructMember(2) public native EOS_Auth_PinGrantInfo setVerificationURI(BytePtr VerificationURI);
    @StructMember(3) public native int getExpiresIn();
    @StructMember(3) public native EOS_Auth_PinGrantInfo setExpiresIn(int ExpiresIn);
    @StructMember(4) public native BytePtr getVerificationURIComplete();
    @StructMember(4) public native EOS_Auth_PinGrantInfo setVerificationURIComplete(BytePtr VerificationURIComplete);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
