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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_AntiCheatCommon_LogPlayerTakeDamageOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_AntiCheatCommon_LogPlayerTakeDamageOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_AntiCheatCommon_LogPlayerTakeDamageOptionsPtr extends Ptr<EOS_AntiCheatCommon_LogPlayerTakeDamageOptions, EOS_AntiCheatCommon_LogPlayerTakeDamageOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_AntiCheatCommon_LogPlayerTakeDamageOptions() {}
    public EOS_AntiCheatCommon_LogPlayerTakeDamageOptions(int ApiVersion, VoidPtr VictimPlayerHandle, EOS_AntiCheatCommon_Vec3f VictimPlayerPosition, EOS_AntiCheatCommon_Quat VictimPlayerViewRotation, VoidPtr AttackerPlayerHandle, EOS_AntiCheatCommon_Vec3f AttackerPlayerPosition, EOS_AntiCheatCommon_Quat AttackerPlayerViewRotation, int bIsHitscanAttack, int bHasLineOfSight, int bIsCriticalHit, int HitBoneId_DEPRECATED, float DamageTaken, float HealthRemaining, EOS_EAntiCheatCommonPlayerTakeDamageSource DamageSource, EOS_EAntiCheatCommonPlayerTakeDamageType DamageType, EOS_EAntiCheatCommonPlayerTakeDamageResult DamageResult, EOS_AntiCheatCommon_LogPlayerUseWeaponData PlayerUseWeaponData, int TimeSincePlayerUseWeaponMs, EOS_AntiCheatCommon_Vec3f DamagePosition, EOS_AntiCheatCommon_Vec3f AttackerPlayerViewPosition) {
        this.setApiVersion(ApiVersion);
        this.setVictimPlayerHandle(VictimPlayerHandle);
        this.setVictimPlayerPosition(VictimPlayerPosition);
        this.setVictimPlayerViewRotation(VictimPlayerViewRotation);
        this.setAttackerPlayerHandle(AttackerPlayerHandle);
        this.setAttackerPlayerPosition(AttackerPlayerPosition);
        this.setAttackerPlayerViewRotation(AttackerPlayerViewRotation);
        this.setBIsHitscanAttack(bIsHitscanAttack);
        this.setBHasLineOfSight(bHasLineOfSight);
        this.setBIsCriticalHit(bIsCriticalHit);
        this.setHitBoneId_DEPRECATED(HitBoneId_DEPRECATED);
        this.setDamageTaken(DamageTaken);
        this.setHealthRemaining(HealthRemaining);
        this.setDamageSource(DamageSource);
        this.setDamageType(DamageType);
        this.setDamageResult(DamageResult);
        this.setPlayerUseWeaponData(PlayerUseWeaponData);
        this.setTimeSincePlayerUseWeaponMs(TimeSincePlayerUseWeaponMs);
        this.setDamagePosition(DamagePosition);
        this.setAttackerPlayerViewPosition(AttackerPlayerViewPosition);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native VoidPtr getVictimPlayerHandle();
    @StructMember(1) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setVictimPlayerHandle(VoidPtr VictimPlayerHandle);
    @StructMember(2) public native EOS_AntiCheatCommon_Vec3f getVictimPlayerPosition();
    @StructMember(2) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setVictimPlayerPosition(EOS_AntiCheatCommon_Vec3f VictimPlayerPosition);
    @StructMember(3) public native EOS_AntiCheatCommon_Quat getVictimPlayerViewRotation();
    @StructMember(3) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setVictimPlayerViewRotation(EOS_AntiCheatCommon_Quat VictimPlayerViewRotation);
    @StructMember(4) public native VoidPtr getAttackerPlayerHandle();
    @StructMember(4) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setAttackerPlayerHandle(VoidPtr AttackerPlayerHandle);
    @StructMember(5) public native EOS_AntiCheatCommon_Vec3f getAttackerPlayerPosition();
    @StructMember(5) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setAttackerPlayerPosition(EOS_AntiCheatCommon_Vec3f AttackerPlayerPosition);
    @StructMember(6) public native EOS_AntiCheatCommon_Quat getAttackerPlayerViewRotation();
    @StructMember(6) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setAttackerPlayerViewRotation(EOS_AntiCheatCommon_Quat AttackerPlayerViewRotation);
    @StructMember(7) public native int getBIsHitscanAttack();
    @StructMember(7) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setBIsHitscanAttack(int bIsHitscanAttack);
    @StructMember(8) public native int getBHasLineOfSight();
    @StructMember(8) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setBHasLineOfSight(int bHasLineOfSight);
    @StructMember(9) public native int getBIsCriticalHit();
    @StructMember(9) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setBIsCriticalHit(int bIsCriticalHit);
    @StructMember(10) public native int getHitBoneId_DEPRECATED();
    @StructMember(10) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setHitBoneId_DEPRECATED(int HitBoneId_DEPRECATED);
    @StructMember(11) public native float getDamageTaken();
    @StructMember(11) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setDamageTaken(float DamageTaken);
    @StructMember(12) public native float getHealthRemaining();
    @StructMember(12) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setHealthRemaining(float HealthRemaining);
    @StructMember(13) public native EOS_EAntiCheatCommonPlayerTakeDamageSource getDamageSource();
    @StructMember(13) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setDamageSource(EOS_EAntiCheatCommonPlayerTakeDamageSource DamageSource);
    @StructMember(14) public native EOS_EAntiCheatCommonPlayerTakeDamageType getDamageType();
    @StructMember(14) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setDamageType(EOS_EAntiCheatCommonPlayerTakeDamageType DamageType);
    @StructMember(15) public native EOS_EAntiCheatCommonPlayerTakeDamageResult getDamageResult();
    @StructMember(15) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setDamageResult(EOS_EAntiCheatCommonPlayerTakeDamageResult DamageResult);
    @StructMember(16) public native EOS_AntiCheatCommon_LogPlayerUseWeaponData getPlayerUseWeaponData();
    @StructMember(16) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setPlayerUseWeaponData(EOS_AntiCheatCommon_LogPlayerUseWeaponData PlayerUseWeaponData);
    @StructMember(17) public native int getTimeSincePlayerUseWeaponMs();
    @StructMember(17) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setTimeSincePlayerUseWeaponMs(int TimeSincePlayerUseWeaponMs);
    @StructMember(18) public native EOS_AntiCheatCommon_Vec3f getDamagePosition();
    @StructMember(18) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setDamagePosition(EOS_AntiCheatCommon_Vec3f DamagePosition);
    @StructMember(19) public native EOS_AntiCheatCommon_Vec3f getAttackerPlayerViewPosition();
    @StructMember(19) public native EOS_AntiCheatCommon_LogPlayerTakeDamageOptions setAttackerPlayerViewPosition(EOS_AntiCheatCommon_Vec3f AttackerPlayerViewPosition);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
