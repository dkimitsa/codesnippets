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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Achievements_UnlockedAchievement/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Achievements_UnlockedAchievement>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Achievements_UnlockedAchievementPtr extends Ptr<EOS_Achievements_UnlockedAchievement, EOS_Achievements_UnlockedAchievementPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_Achievements_UnlockedAchievement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Achievements_UnlockedAchievement() {}
    public EOS_Achievements_UnlockedAchievement(int ApiVersion, BytePtr AchievementId, long UnlockTime) {
        this.setApiVersion(ApiVersion);
        this.setAchievementId(AchievementId);
        this.setUnlockTime(UnlockTime);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Achievements_UnlockedAchievement setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getAchievementId();
    @StructMember(1) public native EOS_Achievements_UnlockedAchievement setAchievementId(BytePtr AchievementId);
    @StructMember(2) public native long getUnlockTime();
    @StructMember(2) public native EOS_Achievements_UnlockedAchievement setUnlockTime(long UnlockTime);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_Achievements_UnlockedAchievement_Release", optional=true)
    public native void release();
    /*</methods>*/
}
