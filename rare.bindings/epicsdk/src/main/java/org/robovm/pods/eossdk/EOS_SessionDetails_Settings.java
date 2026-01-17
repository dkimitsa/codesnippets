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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_SessionDetails_Settings/*</name>*/ 
    extends /*<extends>*/Struct<EOS_SessionDetails_Settings>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_SessionDetails_SettingsPtr extends Ptr<EOS_SessionDetails_Settings, EOS_SessionDetails_SettingsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_SessionDetails_Settings() {}
    public EOS_SessionDetails_Settings(int ApiVersion, BytePtr BucketId, int NumPublicConnections, int bAllowJoinInProgress, EOS_EOnlineSessionPermissionLevel PermissionLevel, int bInvitesAllowed, int bSanctionsEnabled, IntPtr AllowedPlatformIds, int AllowedPlatformIdsCount) {
        this.setApiVersion(ApiVersion);
        this.setBucketId(BucketId);
        this.setNumPublicConnections(NumPublicConnections);
        this.setBAllowJoinInProgress(bAllowJoinInProgress);
        this.setPermissionLevel(PermissionLevel);
        this.setBInvitesAllowed(bInvitesAllowed);
        this.setBSanctionsEnabled(bSanctionsEnabled);
        this.setAllowedPlatformIds(AllowedPlatformIds);
        this.setAllowedPlatformIdsCount(AllowedPlatformIdsCount);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_SessionDetails_Settings setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getBucketId();
    @StructMember(1) public native EOS_SessionDetails_Settings setBucketId(BytePtr BucketId);
    @StructMember(2) public native int getNumPublicConnections();
    @StructMember(2) public native EOS_SessionDetails_Settings setNumPublicConnections(int NumPublicConnections);
    @StructMember(3) public native int getBAllowJoinInProgress();
    @StructMember(3) public native EOS_SessionDetails_Settings setBAllowJoinInProgress(int bAllowJoinInProgress);
    @StructMember(4) public native EOS_EOnlineSessionPermissionLevel getPermissionLevel();
    @StructMember(4) public native EOS_SessionDetails_Settings setPermissionLevel(EOS_EOnlineSessionPermissionLevel PermissionLevel);
    @StructMember(5) public native int getBInvitesAllowed();
    @StructMember(5) public native EOS_SessionDetails_Settings setBInvitesAllowed(int bInvitesAllowed);
    @StructMember(6) public native int getBSanctionsEnabled();
    @StructMember(6) public native EOS_SessionDetails_Settings setBSanctionsEnabled(int bSanctionsEnabled);
    @StructMember(7) public native IntPtr getAllowedPlatformIds();
    @StructMember(7) public native EOS_SessionDetails_Settings setAllowedPlatformIds(IntPtr AllowedPlatformIds);
    @StructMember(8) public native int getAllowedPlatformIdsCount();
    @StructMember(8) public native EOS_SessionDetails_Settings setAllowedPlatformIdsCount(int AllowedPlatformIdsCount);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
