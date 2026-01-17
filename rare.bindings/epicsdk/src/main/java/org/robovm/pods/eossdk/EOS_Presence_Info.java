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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Presence_Info/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Presence_Info>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Presence_InfoPtr extends Ptr<EOS_Presence_Info, EOS_Presence_InfoPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_Presence_Info.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Presence_Info() {}
    public EOS_Presence_Info(int ApiVersion, EOS_Presence_EStatus Status, EOS_EpicAccountIdDetails UserId, BytePtr ProductId, BytePtr ProductVersion, BytePtr Platform, BytePtr RichText, int RecordsCount, EOS_Presence_DataRecord Records, BytePtr ProductName, BytePtr IntegratedPlatform) {
        this.setApiVersion(ApiVersion);
        this.setStatus(Status);
        this.setUserId(UserId);
        this.setProductId(ProductId);
        this.setProductVersion(ProductVersion);
        this.setPlatform(Platform);
        this.setRichText(RichText);
        this.setRecordsCount(RecordsCount);
        this.setRecords(Records);
        this.setProductName(ProductName);
        this.setIntegratedPlatform(IntegratedPlatform);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Presence_Info setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_Presence_EStatus getStatus();
    @StructMember(1) public native EOS_Presence_Info setStatus(EOS_Presence_EStatus Status);
    @StructMember(2) public native EOS_EpicAccountIdDetails getUserId();
    @StructMember(2) public native EOS_Presence_Info setUserId(EOS_EpicAccountIdDetails UserId);
    @StructMember(3) public native BytePtr getProductId();
    @StructMember(3) public native EOS_Presence_Info setProductId(BytePtr ProductId);
    @StructMember(4) public native BytePtr getProductVersion();
    @StructMember(4) public native EOS_Presence_Info setProductVersion(BytePtr ProductVersion);
    @StructMember(5) public native BytePtr getPlatform();
    @StructMember(5) public native EOS_Presence_Info setPlatform(BytePtr Platform);
    @StructMember(6) public native BytePtr getRichText();
    @StructMember(6) public native EOS_Presence_Info setRichText(BytePtr RichText);
    @StructMember(7) public native int getRecordsCount();
    @StructMember(7) public native EOS_Presence_Info setRecordsCount(int RecordsCount);
    @StructMember(8) public native EOS_Presence_DataRecord getRecords();
    @StructMember(8) public native EOS_Presence_Info setRecords(EOS_Presence_DataRecord Records);
    @StructMember(9) public native BytePtr getProductName();
    @StructMember(9) public native EOS_Presence_Info setProductName(BytePtr ProductName);
    @StructMember(10) public native BytePtr getIntegratedPlatform();
    @StructMember(10) public native EOS_Presence_Info setIntegratedPlatform(BytePtr IntegratedPlatform);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_Presence_Info_Release", optional=true)
    public native void release();
    /*</methods>*/
}
