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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_RTCAdmin_UserToken/*</name>*/ 
    extends /*<extends>*/Struct<EOS_RTCAdmin_UserToken>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_RTCAdmin_UserTokenPtr extends Ptr<EOS_RTCAdmin_UserToken, EOS_RTCAdmin_UserTokenPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_RTCAdmin_UserToken.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_RTCAdmin_UserToken() {}
    public EOS_RTCAdmin_UserToken(int ApiVersion, EOS_ProductUserIdDetails ProductUserId, BytePtr Token) {
        this.setApiVersion(ApiVersion);
        this.setProductUserId(ProductUserId);
        this.setToken(Token);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_RTCAdmin_UserToken setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_ProductUserIdDetails getProductUserId();
    @StructMember(1) public native EOS_RTCAdmin_UserToken setProductUserId(EOS_ProductUserIdDetails ProductUserId);
    @StructMember(2) public native BytePtr getToken();
    @StructMember(2) public native EOS_RTCAdmin_UserToken setToken(BytePtr Token);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_RTCAdmin_UserToken_Release", optional=true)
    public native void release();
    /*</methods>*/
}
