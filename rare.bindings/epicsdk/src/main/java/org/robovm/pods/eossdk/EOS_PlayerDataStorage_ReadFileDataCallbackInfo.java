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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_PlayerDataStorage_ReadFileDataCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_PlayerDataStorage_ReadFileDataCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_PlayerDataStorage_ReadFileDataCallbackInfoPtr extends Ptr<EOS_PlayerDataStorage_ReadFileDataCallbackInfo, EOS_PlayerDataStorage_ReadFileDataCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_PlayerDataStorage_ReadFileDataCallbackInfo() {}
    public EOS_PlayerDataStorage_ReadFileDataCallbackInfo(VoidPtr ClientData, EOS_ProductUserIdDetails LocalUserId, BytePtr Filename, int TotalFileSizeBytes, int bIsLastChunk, int DataChunkLengthBytes, VoidPtr DataChunk) {
        this.setClientData(ClientData);
        this.setLocalUserId(LocalUserId);
        this.setFilename(Filename);
        this.setTotalFileSizeBytes(TotalFileSizeBytes);
        this.setBIsLastChunk(bIsLastChunk);
        this.setDataChunkLengthBytes(DataChunkLengthBytes);
        this.setDataChunk(DataChunk);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native VoidPtr getClientData();
    @StructMember(0) public native EOS_PlayerDataStorage_ReadFileDataCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(1) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(1) public native EOS_PlayerDataStorage_ReadFileDataCallbackInfo setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    @StructMember(2) public native BytePtr getFilename();
    @StructMember(2) public native EOS_PlayerDataStorage_ReadFileDataCallbackInfo setFilename(BytePtr Filename);
    @StructMember(3) public native int getTotalFileSizeBytes();
    @StructMember(3) public native EOS_PlayerDataStorage_ReadFileDataCallbackInfo setTotalFileSizeBytes(int TotalFileSizeBytes);
    @StructMember(4) public native int getBIsLastChunk();
    @StructMember(4) public native EOS_PlayerDataStorage_ReadFileDataCallbackInfo setBIsLastChunk(int bIsLastChunk);
    @StructMember(5) public native int getDataChunkLengthBytes();
    @StructMember(5) public native EOS_PlayerDataStorage_ReadFileDataCallbackInfo setDataChunkLengthBytes(int DataChunkLengthBytes);
    @StructMember(6) public native VoidPtr getDataChunk();
    @StructMember(6) public native EOS_PlayerDataStorage_ReadFileDataCallbackInfo setDataChunk(VoidPtr DataChunk);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
