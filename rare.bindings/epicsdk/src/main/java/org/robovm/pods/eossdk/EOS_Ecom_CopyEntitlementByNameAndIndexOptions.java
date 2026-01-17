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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Ecom_CopyEntitlementByNameAndIndexOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Ecom_CopyEntitlementByNameAndIndexOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Ecom_CopyEntitlementByNameAndIndexOptionsPtr extends Ptr<EOS_Ecom_CopyEntitlementByNameAndIndexOptions, EOS_Ecom_CopyEntitlementByNameAndIndexOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Ecom_CopyEntitlementByNameAndIndexOptions() {}
    public EOS_Ecom_CopyEntitlementByNameAndIndexOptions(int ApiVersion, EOS_EpicAccountIdDetails LocalUserId, BytePtr EntitlementName, int Index) {
        this.setApiVersion(ApiVersion);
        this.setLocalUserId(LocalUserId);
        this.setEntitlementName(EntitlementName);
        this.setIndex(Index);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Ecom_CopyEntitlementByNameAndIndexOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_EpicAccountIdDetails getLocalUserId();
    @StructMember(1) public native EOS_Ecom_CopyEntitlementByNameAndIndexOptions setLocalUserId(EOS_EpicAccountIdDetails LocalUserId);
    @StructMember(2) public native BytePtr getEntitlementName();
    @StructMember(2) public native EOS_Ecom_CopyEntitlementByNameAndIndexOptions setEntitlementName(BytePtr EntitlementName);
    @StructMember(3) public native int getIndex();
    @StructMember(3) public native EOS_Ecom_CopyEntitlementByNameAndIndexOptions setIndex(int Index);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
