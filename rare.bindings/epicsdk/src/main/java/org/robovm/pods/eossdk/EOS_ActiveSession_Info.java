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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_ActiveSession_Info/*</name>*/ 
    extends /*<extends>*/Struct<EOS_ActiveSession_Info>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_ActiveSession_InfoPtr extends Ptr<EOS_ActiveSession_Info, EOS_ActiveSession_InfoPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_ActiveSession_Info.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_ActiveSession_Info() {}
    public EOS_ActiveSession_Info(int ApiVersion, BytePtr SessionName, EOS_ProductUserIdDetails LocalUserId, EOS_EOnlineSessionState State, EOS_SessionDetails_Info SessionDetails) {
        this.setApiVersion(ApiVersion);
        this.setSessionName(SessionName);
        this.setLocalUserId(LocalUserId);
        this.setState(State);
        this.setSessionDetails(SessionDetails);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_ActiveSession_Info setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getSessionName();
    @StructMember(1) public native EOS_ActiveSession_Info setSessionName(BytePtr SessionName);
    @StructMember(2) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(2) public native EOS_ActiveSession_Info setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    @StructMember(3) public native EOS_EOnlineSessionState getState();
    @StructMember(3) public native EOS_ActiveSession_Info setState(EOS_EOnlineSessionState State);
    @StructMember(4) public native EOS_SessionDetails_Info getSessionDetails();
    @StructMember(4) public native EOS_ActiveSession_Info setSessionDetails(EOS_SessionDetails_Info SessionDetails);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_ActiveSession_Info_Release", optional=true)
    public native void release();
    /*</methods>*/
}
