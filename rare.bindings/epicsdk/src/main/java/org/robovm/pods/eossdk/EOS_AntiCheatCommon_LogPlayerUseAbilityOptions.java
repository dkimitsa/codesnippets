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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_AntiCheatCommon_LogPlayerUseAbilityOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_AntiCheatCommon_LogPlayerUseAbilityOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_AntiCheatCommon_LogPlayerUseAbilityOptionsPtr extends Ptr<EOS_AntiCheatCommon_LogPlayerUseAbilityOptions, EOS_AntiCheatCommon_LogPlayerUseAbilityOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_AntiCheatCommon_LogPlayerUseAbilityOptions() {}
    public EOS_AntiCheatCommon_LogPlayerUseAbilityOptions(int ApiVersion, VoidPtr PlayerHandle, int AbilityId, int AbilityDurationMs, int AbilityCooldownMs) {
        this.setApiVersion(ApiVersion);
        this.setPlayerHandle(PlayerHandle);
        this.setAbilityId(AbilityId);
        this.setAbilityDurationMs(AbilityDurationMs);
        this.setAbilityCooldownMs(AbilityCooldownMs);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_AntiCheatCommon_LogPlayerUseAbilityOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native VoidPtr getPlayerHandle();
    @StructMember(1) public native EOS_AntiCheatCommon_LogPlayerUseAbilityOptions setPlayerHandle(VoidPtr PlayerHandle);
    @StructMember(2) public native int getAbilityId();
    @StructMember(2) public native EOS_AntiCheatCommon_LogPlayerUseAbilityOptions setAbilityId(int AbilityId);
    @StructMember(3) public native int getAbilityDurationMs();
    @StructMember(3) public native EOS_AntiCheatCommon_LogPlayerUseAbilityOptions setAbilityDurationMs(int AbilityDurationMs);
    @StructMember(4) public native int getAbilityCooldownMs();
    @StructMember(4) public native EOS_AntiCheatCommon_LogPlayerUseAbilityOptions setAbilityCooldownMs(int AbilityCooldownMs);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
