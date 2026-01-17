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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_CustomInvites_RequestToJoinReceivedCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_CustomInvites_RequestToJoinReceivedCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_CustomInvites_RequestToJoinReceivedCallbackInfoPtr extends Ptr<EOS_CustomInvites_RequestToJoinReceivedCallbackInfo, EOS_CustomInvites_RequestToJoinReceivedCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_CustomInvites_RequestToJoinReceivedCallbackInfo() {}
    public EOS_CustomInvites_RequestToJoinReceivedCallbackInfo(VoidPtr ClientData, EOS_ProductUserIdDetails FromUserId, EOS_ProductUserIdDetails ToUserId) {
        this.setClientData(ClientData);
        this.setFromUserId(FromUserId);
        this.setToUserId(ToUserId);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native VoidPtr getClientData();
    @StructMember(0) public native EOS_CustomInvites_RequestToJoinReceivedCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(1) public native EOS_ProductUserIdDetails getFromUserId();
    @StructMember(1) public native EOS_CustomInvites_RequestToJoinReceivedCallbackInfo setFromUserId(EOS_ProductUserIdDetails FromUserId);
    @StructMember(2) public native EOS_ProductUserIdDetails getToUserId();
    @StructMember(2) public native EOS_CustomInvites_RequestToJoinReceivedCallbackInfo setToUserId(EOS_ProductUserIdDetails ToUserId);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
