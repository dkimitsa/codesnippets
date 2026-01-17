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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Leaderboards_QueryLeaderboardUserScoresOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Leaderboards_QueryLeaderboardUserScoresOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Leaderboards_QueryLeaderboardUserScoresOptionsPtr extends Ptr<EOS_Leaderboards_QueryLeaderboardUserScoresOptions, EOS_Leaderboards_QueryLeaderboardUserScoresOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Leaderboards_QueryLeaderboardUserScoresOptions() {}
    public EOS_Leaderboards_QueryLeaderboardUserScoresOptions(int ApiVersion, EOS_ProductUserIdDetails.EOS_ProductUserIdDetailsPtr UserIds, int UserIdsCount, EOS_Leaderboards_UserScoresQueryStatInfo StatInfo, int StatInfoCount, long StartTime, long EndTime, EOS_ProductUserIdDetails LocalUserId) {
        this.setApiVersion(ApiVersion);
        this.setUserIds(UserIds);
        this.setUserIdsCount(UserIdsCount);
        this.setStatInfo(StatInfo);
        this.setStatInfoCount(StatInfoCount);
        this.setStartTime(StartTime);
        this.setEndTime(EndTime);
        this.setLocalUserId(LocalUserId);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Leaderboards_QueryLeaderboardUserScoresOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_ProductUserIdDetails.EOS_ProductUserIdDetailsPtr getUserIds();
    @StructMember(1) public native EOS_Leaderboards_QueryLeaderboardUserScoresOptions setUserIds(EOS_ProductUserIdDetails.EOS_ProductUserIdDetailsPtr UserIds);
    @StructMember(2) public native int getUserIdsCount();
    @StructMember(2) public native EOS_Leaderboards_QueryLeaderboardUserScoresOptions setUserIdsCount(int UserIdsCount);
    @StructMember(3) public native EOS_Leaderboards_UserScoresQueryStatInfo getStatInfo();
    @StructMember(3) public native EOS_Leaderboards_QueryLeaderboardUserScoresOptions setStatInfo(EOS_Leaderboards_UserScoresQueryStatInfo StatInfo);
    @StructMember(4) public native int getStatInfoCount();
    @StructMember(4) public native EOS_Leaderboards_QueryLeaderboardUserScoresOptions setStatInfoCount(int StatInfoCount);
    @StructMember(5) public native long getStartTime();
    @StructMember(5) public native EOS_Leaderboards_QueryLeaderboardUserScoresOptions setStartTime(long StartTime);
    @StructMember(6) public native long getEndTime();
    @StructMember(6) public native EOS_Leaderboards_QueryLeaderboardUserScoresOptions setEndTime(long EndTime);
    @StructMember(7) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(7) public native EOS_Leaderboards_QueryLeaderboardUserScoresOptions setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
