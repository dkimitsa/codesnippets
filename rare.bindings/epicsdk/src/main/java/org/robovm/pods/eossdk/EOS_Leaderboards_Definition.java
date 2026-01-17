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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Leaderboards_Definition/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Leaderboards_Definition>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Leaderboards_DefinitionPtr extends Ptr<EOS_Leaderboards_Definition, EOS_Leaderboards_DefinitionPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_Leaderboards_Definition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Leaderboards_Definition() {}
    public EOS_Leaderboards_Definition(int ApiVersion, BytePtr LeaderboardId, BytePtr StatName, EOS_ELeaderboardAggregation Aggregation, long StartTime, long EndTime) {
        this.setApiVersion(ApiVersion);
        this.setLeaderboardId(LeaderboardId);
        this.setStatName(StatName);
        this.setAggregation(Aggregation);
        this.setStartTime(StartTime);
        this.setEndTime(EndTime);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Leaderboards_Definition setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getLeaderboardId();
    @StructMember(1) public native EOS_Leaderboards_Definition setLeaderboardId(BytePtr LeaderboardId);
    @StructMember(2) public native BytePtr getStatName();
    @StructMember(2) public native EOS_Leaderboards_Definition setStatName(BytePtr StatName);
    @StructMember(3) public native EOS_ELeaderboardAggregation getAggregation();
    @StructMember(3) public native EOS_Leaderboards_Definition setAggregation(EOS_ELeaderboardAggregation Aggregation);
    @StructMember(4) public native long getStartTime();
    @StructMember(4) public native EOS_Leaderboards_Definition setStartTime(long StartTime);
    @StructMember(5) public native long getEndTime();
    @StructMember(5) public native EOS_Leaderboards_Definition setEndTime(long EndTime);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_Leaderboards_Definition_Release", optional=true)
    public native void release();
    /*</methods>*/
}
