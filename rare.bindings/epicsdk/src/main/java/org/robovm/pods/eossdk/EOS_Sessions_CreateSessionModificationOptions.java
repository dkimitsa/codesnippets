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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Sessions_CreateSessionModificationOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Sessions_CreateSessionModificationOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Sessions_CreateSessionModificationOptionsPtr extends Ptr<EOS_Sessions_CreateSessionModificationOptions, EOS_Sessions_CreateSessionModificationOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Sessions_CreateSessionModificationOptions() {}
    public EOS_Sessions_CreateSessionModificationOptions(int ApiVersion, BytePtr SessionName, BytePtr BucketId, int MaxPlayers, EOS_ProductUserIdDetails LocalUserId, int bPresenceEnabled, BytePtr SessionId, int bSanctionsEnabled, IntPtr AllowedPlatformIds, int AllowedPlatformIdsCount) {
        this.setApiVersion(ApiVersion);
        this.setSessionName(SessionName);
        this.setBucketId(BucketId);
        this.setMaxPlayers(MaxPlayers);
        this.setLocalUserId(LocalUserId);
        this.setBPresenceEnabled(bPresenceEnabled);
        this.setSessionId(SessionId);
        this.setBSanctionsEnabled(bSanctionsEnabled);
        this.setAllowedPlatformIds(AllowedPlatformIds);
        this.setAllowedPlatformIdsCount(AllowedPlatformIdsCount);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Sessions_CreateSessionModificationOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getSessionName();
    @StructMember(1) public native EOS_Sessions_CreateSessionModificationOptions setSessionName(BytePtr SessionName);
    @StructMember(2) public native BytePtr getBucketId();
    @StructMember(2) public native EOS_Sessions_CreateSessionModificationOptions setBucketId(BytePtr BucketId);
    @StructMember(3) public native int getMaxPlayers();
    @StructMember(3) public native EOS_Sessions_CreateSessionModificationOptions setMaxPlayers(int MaxPlayers);
    @StructMember(4) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(4) public native EOS_Sessions_CreateSessionModificationOptions setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    @StructMember(5) public native int getBPresenceEnabled();
    @StructMember(5) public native EOS_Sessions_CreateSessionModificationOptions setBPresenceEnabled(int bPresenceEnabled);
    @StructMember(6) public native BytePtr getSessionId();
    @StructMember(6) public native EOS_Sessions_CreateSessionModificationOptions setSessionId(BytePtr SessionId);
    @StructMember(7) public native int getBSanctionsEnabled();
    @StructMember(7) public native EOS_Sessions_CreateSessionModificationOptions setBSanctionsEnabled(int bSanctionsEnabled);
    @StructMember(8) public native IntPtr getAllowedPlatformIds();
    @StructMember(8) public native EOS_Sessions_CreateSessionModificationOptions setAllowedPlatformIds(IntPtr AllowedPlatformIds);
    @StructMember(9) public native int getAllowedPlatformIdsCount();
    @StructMember(9) public native EOS_Sessions_CreateSessionModificationOptions setAllowedPlatformIdsCount(int AllowedPlatformIdsCount);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
