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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Connect_TransferDeviceIdAccountOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Connect_TransferDeviceIdAccountOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Connect_TransferDeviceIdAccountOptionsPtr extends Ptr<EOS_Connect_TransferDeviceIdAccountOptions, EOS_Connect_TransferDeviceIdAccountOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Connect_TransferDeviceIdAccountOptions() {}
    public EOS_Connect_TransferDeviceIdAccountOptions(int ApiVersion, EOS_ProductUserIdDetails PrimaryLocalUserId, EOS_ProductUserIdDetails LocalDeviceUserId, EOS_ProductUserIdDetails ProductUserIdToPreserve) {
        this.setApiVersion(ApiVersion);
        this.setPrimaryLocalUserId(PrimaryLocalUserId);
        this.setLocalDeviceUserId(LocalDeviceUserId);
        this.setProductUserIdToPreserve(ProductUserIdToPreserve);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Connect_TransferDeviceIdAccountOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_ProductUserIdDetails getPrimaryLocalUserId();
    @StructMember(1) public native EOS_Connect_TransferDeviceIdAccountOptions setPrimaryLocalUserId(EOS_ProductUserIdDetails PrimaryLocalUserId);
    @StructMember(2) public native EOS_ProductUserIdDetails getLocalDeviceUserId();
    @StructMember(2) public native EOS_Connect_TransferDeviceIdAccountOptions setLocalDeviceUserId(EOS_ProductUserIdDetails LocalDeviceUserId);
    @StructMember(3) public native EOS_ProductUserIdDetails getProductUserIdToPreserve();
    @StructMember(3) public native EOS_Connect_TransferDeviceIdAccountOptions setProductUserIdToPreserve(EOS_ProductUserIdDetails ProductUserIdToPreserve);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
