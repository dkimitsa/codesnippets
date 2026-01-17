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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_UserInfo_BestDisplayName/*</name>*/ 
    extends /*<extends>*/Struct<EOS_UserInfo_BestDisplayName>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_UserInfo_BestDisplayNamePtr extends Ptr<EOS_UserInfo_BestDisplayName, EOS_UserInfo_BestDisplayNamePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_UserInfo_BestDisplayName.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_UserInfo_BestDisplayName() {}
    public EOS_UserInfo_BestDisplayName(int ApiVersion, EOS_EpicAccountIdDetails UserId, BytePtr DisplayName, BytePtr DisplayNameSanitized, BytePtr Nickname, int PlatformType) {
        this.setApiVersion(ApiVersion);
        this.setUserId(UserId);
        this.setDisplayName(DisplayName);
        this.setDisplayNameSanitized(DisplayNameSanitized);
        this.setNickname(Nickname);
        this.setPlatformType(PlatformType);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_UserInfo_BestDisplayName setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_EpicAccountIdDetails getUserId();
    @StructMember(1) public native EOS_UserInfo_BestDisplayName setUserId(EOS_EpicAccountIdDetails UserId);
    @StructMember(2) public native BytePtr getDisplayName();
    @StructMember(2) public native EOS_UserInfo_BestDisplayName setDisplayName(BytePtr DisplayName);
    @StructMember(3) public native BytePtr getDisplayNameSanitized();
    @StructMember(3) public native EOS_UserInfo_BestDisplayName setDisplayNameSanitized(BytePtr DisplayNameSanitized);
    @StructMember(4) public native BytePtr getNickname();
    @StructMember(4) public native EOS_UserInfo_BestDisplayName setNickname(BytePtr Nickname);
    @StructMember(5) public native int getPlatformType();
    @StructMember(5) public native EOS_UserInfo_BestDisplayName setPlatformType(int PlatformType);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_UserInfo_BestDisplayName_Release", optional=true)
    public native void release();
    /*</methods>*/
}
