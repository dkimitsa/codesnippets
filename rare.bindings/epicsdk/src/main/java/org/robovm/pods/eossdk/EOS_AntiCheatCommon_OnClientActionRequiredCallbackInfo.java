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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_AntiCheatCommon_OnClientActionRequiredCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_AntiCheatCommon_OnClientActionRequiredCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_AntiCheatCommon_OnClientActionRequiredCallbackInfoPtr extends Ptr<EOS_AntiCheatCommon_OnClientActionRequiredCallbackInfo, EOS_AntiCheatCommon_OnClientActionRequiredCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_AntiCheatCommon_OnClientActionRequiredCallbackInfo() {}
    public EOS_AntiCheatCommon_OnClientActionRequiredCallbackInfo(VoidPtr ClientData, VoidPtr ClientHandle, EOS_EAntiCheatCommonClientAction ClientAction, EOS_EAntiCheatCommonClientActionReason ActionReasonCode, BytePtr ActionReasonDetailsString) {
        this.setClientData(ClientData);
        this.setClientHandle(ClientHandle);
        this.setClientAction(ClientAction);
        this.setActionReasonCode(ActionReasonCode);
        this.setActionReasonDetailsString(ActionReasonDetailsString);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native VoidPtr getClientData();
    @StructMember(0) public native EOS_AntiCheatCommon_OnClientActionRequiredCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(1) public native VoidPtr getClientHandle();
    @StructMember(1) public native EOS_AntiCheatCommon_OnClientActionRequiredCallbackInfo setClientHandle(VoidPtr ClientHandle);
    @StructMember(2) public native EOS_EAntiCheatCommonClientAction getClientAction();
    @StructMember(2) public native EOS_AntiCheatCommon_OnClientActionRequiredCallbackInfo setClientAction(EOS_EAntiCheatCommonClientAction ClientAction);
    @StructMember(3) public native EOS_EAntiCheatCommonClientActionReason getActionReasonCode();
    @StructMember(3) public native EOS_AntiCheatCommon_OnClientActionRequiredCallbackInfo setActionReasonCode(EOS_EAntiCheatCommonClientActionReason ActionReasonCode);
    @StructMember(4) public native BytePtr getActionReasonDetailsString();
    @StructMember(4) public native EOS_AntiCheatCommon_OnClientActionRequiredCallbackInfo setActionReasonDetailsString(BytePtr ActionReasonDetailsString);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
