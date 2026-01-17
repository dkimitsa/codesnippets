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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_PlayerDataStorage_FileTransferProgressCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_PlayerDataStorage_FileTransferProgressCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_PlayerDataStorage_FileTransferProgressCallbackInfoPtr extends Ptr<EOS_PlayerDataStorage_FileTransferProgressCallbackInfo, EOS_PlayerDataStorage_FileTransferProgressCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_PlayerDataStorage_FileTransferProgressCallbackInfo() {}
    public EOS_PlayerDataStorage_FileTransferProgressCallbackInfo(VoidPtr ClientData, EOS_ProductUserIdDetails LocalUserId, BytePtr Filename, int BytesTransferred, int TotalFileSizeBytes) {
        this.setClientData(ClientData);
        this.setLocalUserId(LocalUserId);
        this.setFilename(Filename);
        this.setBytesTransferred(BytesTransferred);
        this.setTotalFileSizeBytes(TotalFileSizeBytes);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native VoidPtr getClientData();
    @StructMember(0) public native EOS_PlayerDataStorage_FileTransferProgressCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(1) public native EOS_ProductUserIdDetails getLocalUserId();
    @StructMember(1) public native EOS_PlayerDataStorage_FileTransferProgressCallbackInfo setLocalUserId(EOS_ProductUserIdDetails LocalUserId);
    @StructMember(2) public native BytePtr getFilename();
    @StructMember(2) public native EOS_PlayerDataStorage_FileTransferProgressCallbackInfo setFilename(BytePtr Filename);
    @StructMember(3) public native int getBytesTransferred();
    @StructMember(3) public native EOS_PlayerDataStorage_FileTransferProgressCallbackInfo setBytesTransferred(int BytesTransferred);
    @StructMember(4) public native int getTotalFileSizeBytes();
    @StructMember(4) public native EOS_PlayerDataStorage_FileTransferProgressCallbackInfo setTotalFileSizeBytes(int TotalFileSizeBytes);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
