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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_AntiCheatCommon_LogGameRoundStartOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_AntiCheatCommon_LogGameRoundStartOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_AntiCheatCommon_LogGameRoundStartOptionsPtr extends Ptr<EOS_AntiCheatCommon_LogGameRoundStartOptions, EOS_AntiCheatCommon_LogGameRoundStartOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_AntiCheatCommon_LogGameRoundStartOptions() {}
    public EOS_AntiCheatCommon_LogGameRoundStartOptions(int ApiVersion, BytePtr SessionIdentifier, BytePtr LevelName, BytePtr ModeName, int RoundTimeSeconds, EOS_EAntiCheatCommonGameRoundCompetitionType CompetitionType) {
        this.setApiVersion(ApiVersion);
        this.setSessionIdentifier(SessionIdentifier);
        this.setLevelName(LevelName);
        this.setModeName(ModeName);
        this.setRoundTimeSeconds(RoundTimeSeconds);
        this.setCompetitionType(CompetitionType);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_AntiCheatCommon_LogGameRoundStartOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getSessionIdentifier();
    @StructMember(1) public native EOS_AntiCheatCommon_LogGameRoundStartOptions setSessionIdentifier(BytePtr SessionIdentifier);
    @StructMember(2) public native BytePtr getLevelName();
    @StructMember(2) public native EOS_AntiCheatCommon_LogGameRoundStartOptions setLevelName(BytePtr LevelName);
    @StructMember(3) public native BytePtr getModeName();
    @StructMember(3) public native EOS_AntiCheatCommon_LogGameRoundStartOptions setModeName(BytePtr ModeName);
    @StructMember(4) public native int getRoundTimeSeconds();
    @StructMember(4) public native EOS_AntiCheatCommon_LogGameRoundStartOptions setRoundTimeSeconds(int RoundTimeSeconds);
    @StructMember(5) public native EOS_EAntiCheatCommonGameRoundCompetitionType getCompetitionType();
    @StructMember(5) public native EOS_AntiCheatCommon_LogGameRoundStartOptions setCompetitionType(EOS_EAntiCheatCommonGameRoundCompetitionType CompetitionType);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
