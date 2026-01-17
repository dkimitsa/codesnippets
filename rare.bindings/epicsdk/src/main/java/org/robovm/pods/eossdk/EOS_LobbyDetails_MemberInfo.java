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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_LobbyDetails_MemberInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_LobbyDetails_MemberInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_LobbyDetails_MemberInfoPtr extends Ptr<EOS_LobbyDetails_MemberInfo, EOS_LobbyDetails_MemberInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_LobbyDetails_MemberInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_LobbyDetails_MemberInfo() {}
    public EOS_LobbyDetails_MemberInfo(int ApiVersion, EOS_ProductUserIdDetails UserId, int Platform, int bAllowsCrossplay) {
        this.setApiVersion(ApiVersion);
        this.setUserId(UserId);
        this.setPlatform(Platform);
        this.setBAllowsCrossplay(bAllowsCrossplay);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_LobbyDetails_MemberInfo setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_ProductUserIdDetails getUserId();
    @StructMember(1) public native EOS_LobbyDetails_MemberInfo setUserId(EOS_ProductUserIdDetails UserId);
    @StructMember(2) public native int getPlatform();
    @StructMember(2) public native EOS_LobbyDetails_MemberInfo setPlatform(int Platform);
    @StructMember(3) public native int getBAllowsCrossplay();
    @StructMember(3) public native EOS_LobbyDetails_MemberInfo setBAllowsCrossplay(int bAllowsCrossplay);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_LobbyDetails_MemberInfo_Release", optional=true)
    public native void release();
    /*</methods>*/
}
