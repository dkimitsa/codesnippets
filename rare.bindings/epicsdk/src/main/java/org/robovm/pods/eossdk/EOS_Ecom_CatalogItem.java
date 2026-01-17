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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Ecom_CatalogItem/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Ecom_CatalogItem>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Ecom_CatalogItemPtr extends Ptr<EOS_Ecom_CatalogItem, EOS_Ecom_CatalogItemPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_Ecom_CatalogItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Ecom_CatalogItem() {}
    public EOS_Ecom_CatalogItem(int ApiVersion, BytePtr CatalogNamespace, BytePtr Id, BytePtr EntitlementName, BytePtr TitleText, BytePtr DescriptionText, BytePtr LongDescriptionText, BytePtr TechnicalDetailsText, BytePtr DeveloperText, EOS_EEcomItemType ItemType, long EntitlementEndTimestamp) {
        this.setApiVersion(ApiVersion);
        this.setCatalogNamespace(CatalogNamespace);
        this.setId(Id);
        this.setEntitlementName(EntitlementName);
        this.setTitleText(TitleText);
        this.setDescriptionText(DescriptionText);
        this.setLongDescriptionText(LongDescriptionText);
        this.setTechnicalDetailsText(TechnicalDetailsText);
        this.setDeveloperText(DeveloperText);
        this.setItemType(ItemType);
        this.setEntitlementEndTimestamp(EntitlementEndTimestamp);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Ecom_CatalogItem setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getCatalogNamespace();
    @StructMember(1) public native EOS_Ecom_CatalogItem setCatalogNamespace(BytePtr CatalogNamespace);
    @StructMember(2) public native BytePtr getId();
    @StructMember(2) public native EOS_Ecom_CatalogItem setId(BytePtr Id);
    @StructMember(3) public native BytePtr getEntitlementName();
    @StructMember(3) public native EOS_Ecom_CatalogItem setEntitlementName(BytePtr EntitlementName);
    @StructMember(4) public native BytePtr getTitleText();
    @StructMember(4) public native EOS_Ecom_CatalogItem setTitleText(BytePtr TitleText);
    @StructMember(5) public native BytePtr getDescriptionText();
    @StructMember(5) public native EOS_Ecom_CatalogItem setDescriptionText(BytePtr DescriptionText);
    @StructMember(6) public native BytePtr getLongDescriptionText();
    @StructMember(6) public native EOS_Ecom_CatalogItem setLongDescriptionText(BytePtr LongDescriptionText);
    @StructMember(7) public native BytePtr getTechnicalDetailsText();
    @StructMember(7) public native EOS_Ecom_CatalogItem setTechnicalDetailsText(BytePtr TechnicalDetailsText);
    @StructMember(8) public native BytePtr getDeveloperText();
    @StructMember(8) public native EOS_Ecom_CatalogItem setDeveloperText(BytePtr DeveloperText);
    @StructMember(9) public native EOS_EEcomItemType getItemType();
    @StructMember(9) public native EOS_Ecom_CatalogItem setItemType(EOS_EEcomItemType ItemType);
    @StructMember(10) public native long getEntitlementEndTimestamp();
    @StructMember(10) public native EOS_Ecom_CatalogItem setEntitlementEndTimestamp(long EntitlementEndTimestamp);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_Ecom_CatalogItem_Release", optional=true)
    public native void release();
    /*</methods>*/
}
