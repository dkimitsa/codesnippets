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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Achievements_PlayerAchievement/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Achievements_PlayerAchievement>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Achievements_PlayerAchievementPtr extends Ptr<EOS_Achievements_PlayerAchievement, EOS_Achievements_PlayerAchievementPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_Achievements_PlayerAchievement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Achievements_PlayerAchievement() {}
    public EOS_Achievements_PlayerAchievement(int ApiVersion, BytePtr AchievementId, double Progress, long UnlockTime, int StatInfoCount, EOS_Achievements_PlayerStatInfo StatInfo, BytePtr DisplayName, BytePtr Description, BytePtr IconURL, BytePtr FlavorText) {
        this.setApiVersion(ApiVersion);
        this.setAchievementId(AchievementId);
        this.setProgress(Progress);
        this.setUnlockTime(UnlockTime);
        this.setStatInfoCount(StatInfoCount);
        this.setStatInfo(StatInfo);
        this.setDisplayName(DisplayName);
        this.setDescription(Description);
        this.setIconURL(IconURL);
        this.setFlavorText(FlavorText);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Achievements_PlayerAchievement setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getAchievementId();
    @StructMember(1) public native EOS_Achievements_PlayerAchievement setAchievementId(BytePtr AchievementId);
    @StructMember(2) public native double getProgress();
    @StructMember(2) public native EOS_Achievements_PlayerAchievement setProgress(double Progress);
    @StructMember(3) public native long getUnlockTime();
    @StructMember(3) public native EOS_Achievements_PlayerAchievement setUnlockTime(long UnlockTime);
    @StructMember(4) public native int getStatInfoCount();
    @StructMember(4) public native EOS_Achievements_PlayerAchievement setStatInfoCount(int StatInfoCount);
    @StructMember(5) public native EOS_Achievements_PlayerStatInfo getStatInfo();
    @StructMember(5) public native EOS_Achievements_PlayerAchievement setStatInfo(EOS_Achievements_PlayerStatInfo StatInfo);
    @StructMember(6) public native BytePtr getDisplayName();
    @StructMember(6) public native EOS_Achievements_PlayerAchievement setDisplayName(BytePtr DisplayName);
    @StructMember(7) public native BytePtr getDescription();
    @StructMember(7) public native EOS_Achievements_PlayerAchievement setDescription(BytePtr Description);
    @StructMember(8) public native BytePtr getIconURL();
    @StructMember(8) public native EOS_Achievements_PlayerAchievement setIconURL(BytePtr IconURL);
    @StructMember(9) public native BytePtr getFlavorText();
    @StructMember(9) public native EOS_Achievements_PlayerAchievement setFlavorText(BytePtr FlavorText);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_Achievements_PlayerAchievement_Release", optional=true)
    public native void release();
    /*</methods>*/
}
