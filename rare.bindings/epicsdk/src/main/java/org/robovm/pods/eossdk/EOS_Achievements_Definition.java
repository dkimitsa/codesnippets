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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Achievements_Definition/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Achievements_Definition>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Achievements_DefinitionPtr extends Ptr<EOS_Achievements_Definition, EOS_Achievements_DefinitionPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_Achievements_Definition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Achievements_Definition() {}
    public EOS_Achievements_Definition(int ApiVersion, BytePtr AchievementId, BytePtr DisplayName, BytePtr Description, BytePtr LockedDisplayName, BytePtr LockedDescription, BytePtr HiddenDescription, BytePtr CompletionDescription, BytePtr UnlockedIconId, BytePtr LockedIconId, int bIsHidden, int StatThresholdsCount, EOS_Achievements_StatThresholds StatThresholds) {
        this.setApiVersion(ApiVersion);
        this.setAchievementId(AchievementId);
        this.setDisplayName(DisplayName);
        this.setDescription(Description);
        this.setLockedDisplayName(LockedDisplayName);
        this.setLockedDescription(LockedDescription);
        this.setHiddenDescription(HiddenDescription);
        this.setCompletionDescription(CompletionDescription);
        this.setUnlockedIconId(UnlockedIconId);
        this.setLockedIconId(LockedIconId);
        this.setBIsHidden(bIsHidden);
        this.setStatThresholdsCount(StatThresholdsCount);
        this.setStatThresholds(StatThresholds);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Achievements_Definition setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getAchievementId();
    @StructMember(1) public native EOS_Achievements_Definition setAchievementId(BytePtr AchievementId);
    @StructMember(2) public native BytePtr getDisplayName();
    @StructMember(2) public native EOS_Achievements_Definition setDisplayName(BytePtr DisplayName);
    @StructMember(3) public native BytePtr getDescription();
    @StructMember(3) public native EOS_Achievements_Definition setDescription(BytePtr Description);
    @StructMember(4) public native BytePtr getLockedDisplayName();
    @StructMember(4) public native EOS_Achievements_Definition setLockedDisplayName(BytePtr LockedDisplayName);
    @StructMember(5) public native BytePtr getLockedDescription();
    @StructMember(5) public native EOS_Achievements_Definition setLockedDescription(BytePtr LockedDescription);
    @StructMember(6) public native BytePtr getHiddenDescription();
    @StructMember(6) public native EOS_Achievements_Definition setHiddenDescription(BytePtr HiddenDescription);
    @StructMember(7) public native BytePtr getCompletionDescription();
    @StructMember(7) public native EOS_Achievements_Definition setCompletionDescription(BytePtr CompletionDescription);
    @StructMember(8) public native BytePtr getUnlockedIconId();
    @StructMember(8) public native EOS_Achievements_Definition setUnlockedIconId(BytePtr UnlockedIconId);
    @StructMember(9) public native BytePtr getLockedIconId();
    @StructMember(9) public native EOS_Achievements_Definition setLockedIconId(BytePtr LockedIconId);
    @StructMember(10) public native int getBIsHidden();
    @StructMember(10) public native EOS_Achievements_Definition setBIsHidden(int bIsHidden);
    @StructMember(11) public native int getStatThresholdsCount();
    @StructMember(11) public native EOS_Achievements_Definition setStatThresholdsCount(int StatThresholdsCount);
    @StructMember(12) public native EOS_Achievements_StatThresholds getStatThresholds();
    @StructMember(12) public native EOS_Achievements_Definition setStatThresholds(EOS_Achievements_StatThresholds StatThresholds);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_Achievements_Definition_Release", optional=true)
    public native void release();
    /*</methods>*/
}
