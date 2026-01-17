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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_AntiCheatCommon_LogPlayerUseWeaponData/*</name>*/ 
    extends /*<extends>*/Struct<EOS_AntiCheatCommon_LogPlayerUseWeaponData>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_AntiCheatCommon_LogPlayerUseWeaponDataPtr extends Ptr<EOS_AntiCheatCommon_LogPlayerUseWeaponData, EOS_AntiCheatCommon_LogPlayerUseWeaponDataPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_AntiCheatCommon_LogPlayerUseWeaponData() {}
    public EOS_AntiCheatCommon_LogPlayerUseWeaponData(VoidPtr PlayerHandle, EOS_AntiCheatCommon_Vec3f PlayerPosition, EOS_AntiCheatCommon_Quat PlayerViewRotation, int bIsPlayerViewZoomed, int bIsMeleeAttack, BytePtr WeaponName) {
        this.setPlayerHandle(PlayerHandle);
        this.setPlayerPosition(PlayerPosition);
        this.setPlayerViewRotation(PlayerViewRotation);
        this.setBIsPlayerViewZoomed(bIsPlayerViewZoomed);
        this.setBIsMeleeAttack(bIsMeleeAttack);
        this.setWeaponName(WeaponName);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native VoidPtr getPlayerHandle();
    @StructMember(0) public native EOS_AntiCheatCommon_LogPlayerUseWeaponData setPlayerHandle(VoidPtr PlayerHandle);
    @StructMember(1) public native EOS_AntiCheatCommon_Vec3f getPlayerPosition();
    @StructMember(1) public native EOS_AntiCheatCommon_LogPlayerUseWeaponData setPlayerPosition(EOS_AntiCheatCommon_Vec3f PlayerPosition);
    @StructMember(2) public native EOS_AntiCheatCommon_Quat getPlayerViewRotation();
    @StructMember(2) public native EOS_AntiCheatCommon_LogPlayerUseWeaponData setPlayerViewRotation(EOS_AntiCheatCommon_Quat PlayerViewRotation);
    @StructMember(3) public native int getBIsPlayerViewZoomed();
    @StructMember(3) public native EOS_AntiCheatCommon_LogPlayerUseWeaponData setBIsPlayerViewZoomed(int bIsPlayerViewZoomed);
    @StructMember(4) public native int getBIsMeleeAttack();
    @StructMember(4) public native EOS_AntiCheatCommon_LogPlayerUseWeaponData setBIsMeleeAttack(int bIsMeleeAttack);
    @StructMember(5) public native BytePtr getWeaponName();
    @StructMember(5) public native EOS_AntiCheatCommon_LogPlayerUseWeaponData setWeaponName(BytePtr WeaponName);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
