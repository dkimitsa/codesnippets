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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Lobby_RejectInviteOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Lobby_RejectInviteOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Lobby_RejectInviteOptionsPtr extends Ptr<EOS_Lobby_RejectInviteOptions, EOS_Lobby_RejectInviteOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Lobby_RejectInviteOptions() {}
    public EOS_Lobby_RejectInviteOptions(int ApiVersion, BytePtr InviteId, EOS_ProductUserIdDetails LocalUserId) {
        this.setApiVersion(ApiVersion);
        this.setInviteId(InviteId);
        this.setLocalUserId(LocalUserId);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Lobby_RejectInviteOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getInviteId();
    @StructMember(1) public native EOS_Lobby_RejectInviteOptions setInviteId(BytePtr InviteId);
    @StructMember(2) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(2) public native EOS_Lobby_RejectInviteOptions setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
