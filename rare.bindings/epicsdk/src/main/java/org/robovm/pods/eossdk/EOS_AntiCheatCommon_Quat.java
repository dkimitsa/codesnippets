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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_AntiCheatCommon_Quat/*</name>*/ 
    extends /*<extends>*/Struct<EOS_AntiCheatCommon_Quat>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_AntiCheatCommon_QuatPtr extends Ptr<EOS_AntiCheatCommon_Quat, EOS_AntiCheatCommon_QuatPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_AntiCheatCommon_Quat() {}
    public EOS_AntiCheatCommon_Quat(float w, float x, float y, float z) {
        this.setW(w);
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native float getW();
    @StructMember(0) public native EOS_AntiCheatCommon_Quat setW(float w);
    @StructMember(1) public native float getX();
    @StructMember(1) public native EOS_AntiCheatCommon_Quat setX(float x);
    @StructMember(2) public native float getY();
    @StructMember(2) public native EOS_AntiCheatCommon_Quat setY(float y);
    @StructMember(3) public native float getZ();
    @StructMember(3) public native EOS_AntiCheatCommon_Quat setZ(float z);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
