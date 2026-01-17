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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Stats_Stat/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Stats_Stat>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Stats_StatPtr extends Ptr<EOS_Stats_Stat, EOS_Stats_StatPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_Stats_Stat.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Stats_Stat() {}
    public EOS_Stats_Stat(int ApiVersion, BytePtr Name, long StartTime, long EndTime, int Value) {
        this.setApiVersion(ApiVersion);
        this.setName(Name);
        this.setStartTime(StartTime);
        this.setEndTime(EndTime);
        this.setValue(Value);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Stats_Stat setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getName();
    @StructMember(1) public native EOS_Stats_Stat setName(BytePtr Name);
    @StructMember(2) public native long getStartTime();
    @StructMember(2) public native EOS_Stats_Stat setStartTime(long StartTime);
    @StructMember(3) public native long getEndTime();
    @StructMember(3) public native EOS_Stats_Stat setEndTime(long EndTime);
    @StructMember(4) public native int getValue();
    @StructMember(4) public native EOS_Stats_Stat setValue(int Value);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_Stats_Stat_Release", optional=true)
    public native void release();
    /*</methods>*/
}
