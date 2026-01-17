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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_KWS_GetPermissionByKeyOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_KWS_GetPermissionByKeyOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_KWS_GetPermissionByKeyOptionsPtr extends Ptr<EOS_KWS_GetPermissionByKeyOptions, EOS_KWS_GetPermissionByKeyOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_KWS_GetPermissionByKeyOptions() {}
    public EOS_KWS_GetPermissionByKeyOptions(int ApiVersion, EOS_ProductUserIdDetails LocalUserId, BytePtr Key) {
        this.setApiVersion(ApiVersion);
        this.setLocalUserId(LocalUserId);
        this.setKey(Key);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_KWS_GetPermissionByKeyOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(1) public native EOS_KWS_GetPermissionByKeyOptions setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    @StructMember(2) public native BytePtr getKey();
    @StructMember(2) public native EOS_KWS_GetPermissionByKeyOptions setKey(BytePtr Key);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
