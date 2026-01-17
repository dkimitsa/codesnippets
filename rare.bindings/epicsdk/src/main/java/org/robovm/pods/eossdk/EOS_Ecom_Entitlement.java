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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Ecom_Entitlement/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Ecom_Entitlement>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Ecom_EntitlementPtr extends Ptr<EOS_Ecom_Entitlement, EOS_Ecom_EntitlementPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_Ecom_Entitlement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Ecom_Entitlement() {}
    public EOS_Ecom_Entitlement(int ApiVersion, BytePtr EntitlementName, BytePtr EntitlementId, BytePtr CatalogItemId, int ServerIndex, int bRedeemed, long EndTimestamp) {
        this.setApiVersion(ApiVersion);
        this.setEntitlementName(EntitlementName);
        this.setEntitlementId(EntitlementId);
        this.setCatalogItemId(CatalogItemId);
        this.setServerIndex(ServerIndex);
        this.setBRedeemed(bRedeemed);
        this.setEndTimestamp(EndTimestamp);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Ecom_Entitlement setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getEntitlementName();
    @StructMember(1) public native EOS_Ecom_Entitlement setEntitlementName(BytePtr EntitlementName);
    @StructMember(2) public native BytePtr getEntitlementId();
    @StructMember(2) public native EOS_Ecom_Entitlement setEntitlementId(BytePtr EntitlementId);
    @StructMember(3) public native BytePtr getCatalogItemId();
    @StructMember(3) public native EOS_Ecom_Entitlement setCatalogItemId(BytePtr CatalogItemId);
    @StructMember(4) public native int getServerIndex();
    @StructMember(4) public native EOS_Ecom_Entitlement setServerIndex(int ServerIndex);
    @StructMember(5) public native int getBRedeemed();
    @StructMember(5) public native EOS_Ecom_Entitlement setBRedeemed(int bRedeemed);
    @StructMember(6) public native long getEndTimestamp();
    @StructMember(6) public native EOS_Ecom_Entitlement setEndTimestamp(long EndTimestamp);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_Ecom_Entitlement_Release", optional=true)
    public native void release();
    /*</methods>*/
}
