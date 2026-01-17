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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Ecom_QueryEntitlementsOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Ecom_QueryEntitlementsOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Ecom_QueryEntitlementsOptionsPtr extends Ptr<EOS_Ecom_QueryEntitlementsOptions, EOS_Ecom_QueryEntitlementsOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Ecom_QueryEntitlementsOptions() {}
    public EOS_Ecom_QueryEntitlementsOptions(int ApiVersion, EOS_EpicAccountIdDetails LocalUserId, BytePtr.BytePtrPtr EntitlementNames, int EntitlementNameCount, int bIncludeRedeemed, BytePtr OverrideCatalogNamespace) {
        this.setApiVersion(ApiVersion);
        this.setLocalUserId(LocalUserId);
        this.setEntitlementNames(EntitlementNames);
        this.setEntitlementNameCount(EntitlementNameCount);
        this.setBIncludeRedeemed(bIncludeRedeemed);
        this.setOverrideCatalogNamespace(OverrideCatalogNamespace);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Ecom_QueryEntitlementsOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_EpicAccountIdDetails getLocalUserId();
    @StructMember(1) public native EOS_Ecom_QueryEntitlementsOptions setLocalUserId(EOS_EpicAccountIdDetails LocalUserId);
    @StructMember(2) public native BytePtr.BytePtrPtr getEntitlementNames();
    @StructMember(2) public native EOS_Ecom_QueryEntitlementsOptions setEntitlementNames(BytePtr.BytePtrPtr EntitlementNames);
    @StructMember(3) public native int getEntitlementNameCount();
    @StructMember(3) public native EOS_Ecom_QueryEntitlementsOptions setEntitlementNameCount(int EntitlementNameCount);
    @StructMember(4) public native int getBIncludeRedeemed();
    @StructMember(4) public native EOS_Ecom_QueryEntitlementsOptions setBIncludeRedeemed(int bIncludeRedeemed);
    @StructMember(5) public native BytePtr getOverrideCatalogNamespace();
    @StructMember(5) public native EOS_Ecom_QueryEntitlementsOptions setOverrideCatalogNamespace(BytePtr OverrideCatalogNamespace);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
