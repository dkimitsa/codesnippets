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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Ecom_QueryEntitlementTokenOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Ecom_QueryEntitlementTokenOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Ecom_QueryEntitlementTokenOptionsPtr extends Ptr<EOS_Ecom_QueryEntitlementTokenOptions, EOS_Ecom_QueryEntitlementTokenOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Ecom_QueryEntitlementTokenOptions() {}
    public EOS_Ecom_QueryEntitlementTokenOptions(int ApiVersion, EOS_EpicAccountIdDetails LocalUserId, BytePtr.BytePtrPtr EntitlementNames, int EntitlementNameCount) {
        this.setApiVersion(ApiVersion);
        this.setLocalUserId(LocalUserId);
        this.setEntitlementNames(EntitlementNames);
        this.setEntitlementNameCount(EntitlementNameCount);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Ecom_QueryEntitlementTokenOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_EpicAccountIdDetails getLocalUserId();
    @StructMember(1) public native EOS_Ecom_QueryEntitlementTokenOptions setLocalUserId(EOS_EpicAccountIdDetails LocalUserId);
    @StructMember(2) public native BytePtr.BytePtrPtr getEntitlementNames();
    @StructMember(2) public native EOS_Ecom_QueryEntitlementTokenOptions setEntitlementNames(BytePtr.BytePtrPtr EntitlementNames);
    @StructMember(3) public native int getEntitlementNameCount();
    @StructMember(3) public native EOS_Ecom_QueryEntitlementTokenOptions setEntitlementNameCount(int EntitlementNameCount);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
