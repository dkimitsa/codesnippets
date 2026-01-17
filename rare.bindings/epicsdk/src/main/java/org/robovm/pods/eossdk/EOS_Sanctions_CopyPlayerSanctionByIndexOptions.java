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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Sanctions_CopyPlayerSanctionByIndexOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Sanctions_CopyPlayerSanctionByIndexOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Sanctions_CopyPlayerSanctionByIndexOptionsPtr extends Ptr<EOS_Sanctions_CopyPlayerSanctionByIndexOptions, EOS_Sanctions_CopyPlayerSanctionByIndexOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Sanctions_CopyPlayerSanctionByIndexOptions() {}
    public EOS_Sanctions_CopyPlayerSanctionByIndexOptions(int ApiVersion, EOS_ProductUserIdDetails TargetUserId, int SanctionIndex) {
        this.setApiVersion(ApiVersion);
        this.setTargetUserId(TargetUserId);
        this.setSanctionIndex(SanctionIndex);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Sanctions_CopyPlayerSanctionByIndexOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_ProductUserIdDetails getTargetUserId();
    @StructMember(1) public native EOS_Sanctions_CopyPlayerSanctionByIndexOptions setTargetUserId(EOS_ProductUserIdDetails TargetUserId);
    @StructMember(2) public native int getSanctionIndex();
    @StructMember(2) public native EOS_Sanctions_CopyPlayerSanctionByIndexOptions setSanctionIndex(int SanctionIndex);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
