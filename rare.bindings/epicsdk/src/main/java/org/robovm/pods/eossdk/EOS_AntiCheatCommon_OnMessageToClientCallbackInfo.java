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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_AntiCheatCommon_OnMessageToClientCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_AntiCheatCommon_OnMessageToClientCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_AntiCheatCommon_OnMessageToClientCallbackInfoPtr extends Ptr<EOS_AntiCheatCommon_OnMessageToClientCallbackInfo, EOS_AntiCheatCommon_OnMessageToClientCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_AntiCheatCommon_OnMessageToClientCallbackInfo() {}
    public EOS_AntiCheatCommon_OnMessageToClientCallbackInfo(VoidPtr ClientData, VoidPtr ClientHandle, VoidPtr MessageData, int MessageDataSizeBytes) {
        this.setClientData(ClientData);
        this.setClientHandle(ClientHandle);
        this.setMessageData(MessageData);
        this.setMessageDataSizeBytes(MessageDataSizeBytes);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native VoidPtr getClientData();
    @StructMember(0) public native EOS_AntiCheatCommon_OnMessageToClientCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(1) public native VoidPtr getClientHandle();
    @StructMember(1) public native EOS_AntiCheatCommon_OnMessageToClientCallbackInfo setClientHandle(VoidPtr ClientHandle);
    @StructMember(2) public native VoidPtr getMessageData();
    @StructMember(2) public native EOS_AntiCheatCommon_OnMessageToClientCallbackInfo setMessageData(VoidPtr MessageData);
    @StructMember(3) public native int getMessageDataSizeBytes();
    @StructMember(3) public native EOS_AntiCheatCommon_OnMessageToClientCallbackInfo setMessageDataSizeBytes(int MessageDataSizeBytes);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
