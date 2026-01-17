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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_AntiCheatServer_ReceiveMessageFromClientOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_AntiCheatServer_ReceiveMessageFromClientOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_AntiCheatServer_ReceiveMessageFromClientOptionsPtr extends Ptr<EOS_AntiCheatServer_ReceiveMessageFromClientOptions, EOS_AntiCheatServer_ReceiveMessageFromClientOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_AntiCheatServer_ReceiveMessageFromClientOptions() {}
    public EOS_AntiCheatServer_ReceiveMessageFromClientOptions(int ApiVersion, VoidPtr ClientHandle, int DataLengthBytes, VoidPtr Data) {
        this.setApiVersion(ApiVersion);
        this.setClientHandle(ClientHandle);
        this.setDataLengthBytes(DataLengthBytes);
        this.setData(Data);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_AntiCheatServer_ReceiveMessageFromClientOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native VoidPtr getClientHandle();
    @StructMember(1) public native EOS_AntiCheatServer_ReceiveMessageFromClientOptions setClientHandle(VoidPtr ClientHandle);
    @StructMember(2) public native int getDataLengthBytes();
    @StructMember(2) public native EOS_AntiCheatServer_ReceiveMessageFromClientOptions setDataLengthBytes(int DataLengthBytes);
    @StructMember(3) public native VoidPtr getData();
    @StructMember(3) public native EOS_AntiCheatServer_ReceiveMessageFromClientOptions setData(VoidPtr Data);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
