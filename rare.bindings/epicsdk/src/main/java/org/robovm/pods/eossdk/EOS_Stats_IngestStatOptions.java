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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Stats_IngestStatOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Stats_IngestStatOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Stats_IngestStatOptionsPtr extends Ptr<EOS_Stats_IngestStatOptions, EOS_Stats_IngestStatOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Stats_IngestStatOptions() {}
    public EOS_Stats_IngestStatOptions(int ApiVersion, EOS_ProductUserIdDetails LocalUserId, EOS_Stats_IngestData Stats, int StatsCount, EOS_ProductUserIdDetails TargetUserId) {
        this.setApiVersion(ApiVersion);
        this.setLocalUserId(LocalUserId);
        this.setStats(Stats);
        this.setStatsCount(StatsCount);
        this.setTargetUserId(TargetUserId);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Stats_IngestStatOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(1) public native EOS_Stats_IngestStatOptions setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    @StructMember(2) public native EOS_Stats_IngestData getStats();
    @StructMember(2) public native EOS_Stats_IngestStatOptions setStats(EOS_Stats_IngestData Stats);
    @StructMember(3) public native int getStatsCount();
    @StructMember(3) public native EOS_Stats_IngestStatOptions setStatsCount(int StatsCount);
    @StructMember(4) public native EOS_ProductUserIdDetails getTargetUserId();
    @StructMember(4) public native EOS_Stats_IngestStatOptions setTargetUserId(EOS_ProductUserIdDetails TargetUserId);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
