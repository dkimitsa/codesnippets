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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Achievements_DefinitionV2/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Achievements_DefinitionV2>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Achievements_DefinitionV2Ptr extends Ptr<EOS_Achievements_DefinitionV2, EOS_Achievements_DefinitionV2Ptr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_Achievements_DefinitionV2.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Achievements_DefinitionV2() {}
    public EOS_Achievements_DefinitionV2(int ApiVersion, BytePtr AchievementId, BytePtr UnlockedDisplayName, BytePtr UnlockedDescription, BytePtr LockedDisplayName, BytePtr LockedDescription, BytePtr FlavorText, BytePtr UnlockedIconURL, BytePtr LockedIconURL, int bIsHidden, int StatThresholdsCount, EOS_Achievements_StatThresholds StatThresholds) {
        this.setApiVersion(ApiVersion);
        this.setAchievementId(AchievementId);
        this.setUnlockedDisplayName(UnlockedDisplayName);
        this.setUnlockedDescription(UnlockedDescription);
        this.setLockedDisplayName(LockedDisplayName);
        this.setLockedDescription(LockedDescription);
        this.setFlavorText(FlavorText);
        this.setUnlockedIconURL(UnlockedIconURL);
        this.setLockedIconURL(LockedIconURL);
        this.setBIsHidden(bIsHidden);
        this.setStatThresholdsCount(StatThresholdsCount);
        this.setStatThresholds(StatThresholds);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Achievements_DefinitionV2 setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getAchievementId();
    @StructMember(1) public native EOS_Achievements_DefinitionV2 setAchievementId(BytePtr AchievementId);
    @StructMember(2) public native BytePtr getUnlockedDisplayName();
    @StructMember(2) public native EOS_Achievements_DefinitionV2 setUnlockedDisplayName(BytePtr UnlockedDisplayName);
    @StructMember(3) public native BytePtr getUnlockedDescription();
    @StructMember(3) public native EOS_Achievements_DefinitionV2 setUnlockedDescription(BytePtr UnlockedDescription);
    @StructMember(4) public native BytePtr getLockedDisplayName();
    @StructMember(4) public native EOS_Achievements_DefinitionV2 setLockedDisplayName(BytePtr LockedDisplayName);
    @StructMember(5) public native BytePtr getLockedDescription();
    @StructMember(5) public native EOS_Achievements_DefinitionV2 setLockedDescription(BytePtr LockedDescription);
    @StructMember(6) public native BytePtr getFlavorText();
    @StructMember(6) public native EOS_Achievements_DefinitionV2 setFlavorText(BytePtr FlavorText);
    @StructMember(7) public native BytePtr getUnlockedIconURL();
    @StructMember(7) public native EOS_Achievements_DefinitionV2 setUnlockedIconURL(BytePtr UnlockedIconURL);
    @StructMember(8) public native BytePtr getLockedIconURL();
    @StructMember(8) public native EOS_Achievements_DefinitionV2 setLockedIconURL(BytePtr LockedIconURL);
    @StructMember(9) public native int getBIsHidden();
    @StructMember(9) public native EOS_Achievements_DefinitionV2 setBIsHidden(int bIsHidden);
    @StructMember(10) public native int getStatThresholdsCount();
    @StructMember(10) public native EOS_Achievements_DefinitionV2 setStatThresholdsCount(int StatThresholdsCount);
    @StructMember(11) public native EOS_Achievements_StatThresholds getStatThresholds();
    @StructMember(11) public native EOS_Achievements_DefinitionV2 setStatThresholds(EOS_Achievements_StatThresholds StatThresholds);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_Achievements_DefinitionV2_Release", optional=true)
    public native void release();
    /*</methods>*/
}
