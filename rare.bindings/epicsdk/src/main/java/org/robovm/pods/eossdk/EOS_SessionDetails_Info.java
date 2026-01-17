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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_SessionDetails_Info/*</name>*/ 
    extends /*<extends>*/Struct<EOS_SessionDetails_Info>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_SessionDetails_InfoPtr extends Ptr<EOS_SessionDetails_Info, EOS_SessionDetails_InfoPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_SessionDetails_Info.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_SessionDetails_Info() {}
    public EOS_SessionDetails_Info(int ApiVersion, BytePtr SessionId, BytePtr HostAddress, int NumOpenPublicConnections, EOS_SessionDetails_Settings Settings, EOS_ProductUserIdDetails OwnerUserId, BytePtr OwnerServerClientId) {
        this.setApiVersion(ApiVersion);
        this.setSessionId(SessionId);
        this.setHostAddress(HostAddress);
        this.setNumOpenPublicConnections(NumOpenPublicConnections);
        this.setSettings(Settings);
        this.setOwnerUserId(OwnerUserId);
        this.setOwnerServerClientId(OwnerServerClientId);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_SessionDetails_Info setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getSessionId();
    @StructMember(1) public native EOS_SessionDetails_Info setSessionId(BytePtr SessionId);
    @StructMember(2) public native BytePtr getHostAddress();
    @StructMember(2) public native EOS_SessionDetails_Info setHostAddress(BytePtr HostAddress);
    @StructMember(3) public native int getNumOpenPublicConnections();
    @StructMember(3) public native EOS_SessionDetails_Info setNumOpenPublicConnections(int NumOpenPublicConnections);
    @StructMember(4) public native EOS_SessionDetails_Settings getSettings();
    @StructMember(4) public native EOS_SessionDetails_Info setSettings(EOS_SessionDetails_Settings Settings);
    @StructMember(5) public native EOS_ProductUserIdDetails getOwnerUserId();
    @StructMember(5) public native EOS_SessionDetails_Info setOwnerUserId(EOS_ProductUserIdDetails OwnerUserId);
    @StructMember(6) public native BytePtr getOwnerServerClientId();
    @StructMember(6) public native EOS_SessionDetails_Info setOwnerServerClientId(BytePtr OwnerServerClientId);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_SessionDetails_Info_Release", optional=true)
    public native void release();
    /*</methods>*/
}
