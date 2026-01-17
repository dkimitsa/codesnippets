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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_AntiCheatCommon_LogEventParamPair_ParamValue/*</name>*/ 
    extends /*<extends>*/Struct<EOS_AntiCheatCommon_LogEventParamPair_ParamValue>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_AntiCheatCommon_LogEventParamPair_ParamValuePtr extends Ptr<EOS_AntiCheatCommon_LogEventParamPair_ParamValue, EOS_AntiCheatCommon_LogEventParamPair_ParamValuePtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_AntiCheatCommon_LogEventParamPair_ParamValue() {}
    public EOS_AntiCheatCommon_LogEventParamPair_ParamValue(VoidPtr ClientHandle, BytePtr String, int UInt32, int Int32, long UInt64, long Int64, EOS_AntiCheatCommon_Vec3f Vec3f, EOS_AntiCheatCommon_Quat Quat, float Float) {
        this.setClientHandle(ClientHandle);
        this.setString(String);
        this.setUInt32(UInt32);
        this.setInt32(Int32);
        this.setUInt64(UInt64);
        this.setInt64(Int64);
        this.setVec3f(Vec3f);
        this.setQuat(Quat);
        this.setFloat(Float);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native VoidPtr getClientHandle();
    @StructMember(0) public native EOS_AntiCheatCommon_LogEventParamPair_ParamValue setClientHandle(VoidPtr ClientHandle);
    @StructMember(0) public native BytePtr getString();
    @StructMember(0) public native EOS_AntiCheatCommon_LogEventParamPair_ParamValue setString(BytePtr String);
    @StructMember(0) public native int getUInt32();
    @StructMember(0) public native EOS_AntiCheatCommon_LogEventParamPair_ParamValue setUInt32(int UInt32);
    @StructMember(0) public native int getInt32();
    @StructMember(0) public native EOS_AntiCheatCommon_LogEventParamPair_ParamValue setInt32(int Int32);
    @StructMember(0) public native long getUInt64();
    @StructMember(0) public native EOS_AntiCheatCommon_LogEventParamPair_ParamValue setUInt64(long UInt64);
    @StructMember(0) public native long getInt64();
    @StructMember(0) public native EOS_AntiCheatCommon_LogEventParamPair_ParamValue setInt64(long Int64);
    @StructMember(0) public native @ByVal EOS_AntiCheatCommon_Vec3f getVec3f();
    @StructMember(0) public native EOS_AntiCheatCommon_LogEventParamPair_ParamValue setVec3f(@ByVal EOS_AntiCheatCommon_Vec3f Vec3f);
    @StructMember(0) public native @ByVal EOS_AntiCheatCommon_Quat getQuat();
    @StructMember(0) public native EOS_AntiCheatCommon_LogEventParamPair_ParamValue setQuat(@ByVal EOS_AntiCheatCommon_Quat Quat);
    @StructMember(0) public native float getFloat();
    @StructMember(0) public native EOS_AntiCheatCommon_LogEventParamPair_ParamValue setFloat(float Float);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
