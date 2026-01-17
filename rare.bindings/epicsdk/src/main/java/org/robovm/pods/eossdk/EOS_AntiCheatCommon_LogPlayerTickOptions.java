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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_AntiCheatCommon_LogPlayerTickOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_AntiCheatCommon_LogPlayerTickOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_AntiCheatCommon_LogPlayerTickOptionsPtr extends Ptr<EOS_AntiCheatCommon_LogPlayerTickOptions, EOS_AntiCheatCommon_LogPlayerTickOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_AntiCheatCommon_LogPlayerTickOptions() {}
    public EOS_AntiCheatCommon_LogPlayerTickOptions(int ApiVersion, VoidPtr PlayerHandle, EOS_AntiCheatCommon_Vec3f PlayerPosition, EOS_AntiCheatCommon_Quat PlayerViewRotation, int bIsPlayerViewZoomed, float PlayerHealth, EOS_EAntiCheatCommonPlayerMovementState PlayerMovementState, EOS_AntiCheatCommon_Vec3f PlayerViewPosition) {
        this.setApiVersion(ApiVersion);
        this.setPlayerHandle(PlayerHandle);
        this.setPlayerPosition(PlayerPosition);
        this.setPlayerViewRotation(PlayerViewRotation);
        this.setBIsPlayerViewZoomed(bIsPlayerViewZoomed);
        this.setPlayerHealth(PlayerHealth);
        this.setPlayerMovementState(PlayerMovementState);
        this.setPlayerViewPosition(PlayerViewPosition);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_AntiCheatCommon_LogPlayerTickOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native VoidPtr getPlayerHandle();
    @StructMember(1) public native EOS_AntiCheatCommon_LogPlayerTickOptions setPlayerHandle(VoidPtr PlayerHandle);
    @StructMember(2) public native EOS_AntiCheatCommon_Vec3f getPlayerPosition();
    @StructMember(2) public native EOS_AntiCheatCommon_LogPlayerTickOptions setPlayerPosition(EOS_AntiCheatCommon_Vec3f PlayerPosition);
    @StructMember(3) public native EOS_AntiCheatCommon_Quat getPlayerViewRotation();
    @StructMember(3) public native EOS_AntiCheatCommon_LogPlayerTickOptions setPlayerViewRotation(EOS_AntiCheatCommon_Quat PlayerViewRotation);
    @StructMember(4) public native int getBIsPlayerViewZoomed();
    @StructMember(4) public native EOS_AntiCheatCommon_LogPlayerTickOptions setBIsPlayerViewZoomed(int bIsPlayerViewZoomed);
    @StructMember(5) public native float getPlayerHealth();
    @StructMember(5) public native EOS_AntiCheatCommon_LogPlayerTickOptions setPlayerHealth(float PlayerHealth);
    @StructMember(6) public native EOS_EAntiCheatCommonPlayerMovementState getPlayerMovementState();
    @StructMember(6) public native EOS_AntiCheatCommon_LogPlayerTickOptions setPlayerMovementState(EOS_EAntiCheatCommonPlayerMovementState PlayerMovementState);
    @StructMember(7) public native EOS_AntiCheatCommon_Vec3f getPlayerViewPosition();
    @StructMember(7) public native EOS_AntiCheatCommon_LogPlayerTickOptions setPlayerViewPosition(EOS_AntiCheatCommon_Vec3f PlayerViewPosition);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
