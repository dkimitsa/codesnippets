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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Achievements_QueryDefinitionsOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Achievements_QueryDefinitionsOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Achievements_QueryDefinitionsOptionsPtr extends Ptr<EOS_Achievements_QueryDefinitionsOptions, EOS_Achievements_QueryDefinitionsOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Achievements_QueryDefinitionsOptions() {}
    public EOS_Achievements_QueryDefinitionsOptions(int ApiVersion, EOS_ProductUserIdDetails LocalUserId, EOS_EpicAccountIdDetails EpicUserId_DEPRECATED, BytePtr.BytePtrPtr HiddenAchievementIds_DEPRECATED, int HiddenAchievementsCount_DEPRECATED) {
        this.setApiVersion(ApiVersion);
        this.setLocalUserId(LocalUserId);
        this.setEpicUserId_DEPRECATED(EpicUserId_DEPRECATED);
        this.setHiddenAchievementIds_DEPRECATED(HiddenAchievementIds_DEPRECATED);
        this.setHiddenAchievementsCount_DEPRECATED(HiddenAchievementsCount_DEPRECATED);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Achievements_QueryDefinitionsOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(1) public native EOS_Achievements_QueryDefinitionsOptions setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    @StructMember(2) public native EOS_EpicAccountIdDetails getEpicUserId_DEPRECATED();
    @StructMember(2) public native EOS_Achievements_QueryDefinitionsOptions setEpicUserId_DEPRECATED(EOS_EpicAccountIdDetails EpicUserId_DEPRECATED);
    @StructMember(3) public native BytePtr.BytePtrPtr getHiddenAchievementIds_DEPRECATED();
    @StructMember(3) public native EOS_Achievements_QueryDefinitionsOptions setHiddenAchievementIds_DEPRECATED(BytePtr.BytePtrPtr HiddenAchievementIds_DEPRECATED);
    @StructMember(4) public native int getHiddenAchievementsCount_DEPRECATED();
    @StructMember(4) public native EOS_Achievements_QueryDefinitionsOptions setHiddenAchievementsCount_DEPRECATED(int HiddenAchievementsCount_DEPRECATED);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
