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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_AntiCheatClient_ProtectMessageOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_AntiCheatClient_ProtectMessageOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_AntiCheatClient_ProtectMessageOptionsPtr extends Ptr<EOS_AntiCheatClient_ProtectMessageOptions, EOS_AntiCheatClient_ProtectMessageOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_AntiCheatClient_ProtectMessageOptions() {}
    public EOS_AntiCheatClient_ProtectMessageOptions(int ApiVersion, int DataLengthBytes, VoidPtr Data, int OutBufferSizeBytes) {
        this.setApiVersion(ApiVersion);
        this.setDataLengthBytes(DataLengthBytes);
        this.setData(Data);
        this.setOutBufferSizeBytes(OutBufferSizeBytes);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_AntiCheatClient_ProtectMessageOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native int getDataLengthBytes();
    @StructMember(1) public native EOS_AntiCheatClient_ProtectMessageOptions setDataLengthBytes(int DataLengthBytes);
    @StructMember(2) public native VoidPtr getData();
    @StructMember(2) public native EOS_AntiCheatClient_ProtectMessageOptions setData(VoidPtr Data);
    @StructMember(3) public native int getOutBufferSizeBytes();
    @StructMember(3) public native EOS_AntiCheatClient_ProtectMessageOptions setOutBufferSizeBytes(int OutBufferSizeBytes);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
