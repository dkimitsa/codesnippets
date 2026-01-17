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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_EcomHandle/*</name>*/ 
    extends /*<extends>*/NativeObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_EcomHandlePtr extends Ptr<EOS_EcomHandle, EOS_EcomHandlePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_EcomHandle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected EOS_EcomHandle() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_Ecom_QueryOwnership", optional=true)
    public native void queryOwnership(EOS_Ecom_QueryOwnershipOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Ecom_QueryOwnershipBySandboxIds", optional=true)
    public native void queryOwnershipBySandboxIds(EOS_Ecom_QueryOwnershipBySandboxIdsOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Ecom_QueryOwnershipToken", optional=true)
    public native void queryOwnershipToken(EOS_Ecom_QueryOwnershipTokenOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Ecom_QueryEntitlements", optional=true)
    public native void queryEntitlements(EOS_Ecom_QueryEntitlementsOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Ecom_QueryEntitlementToken", optional=true)
    public native void queryEntitlementToken(EOS_Ecom_QueryEntitlementTokenOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Ecom_QueryOffers", optional=true)
    public native void queryOffers(EOS_Ecom_QueryOffersOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Ecom_Checkout", optional=true)
    public native void checkout(EOS_Ecom_CheckoutOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Ecom_RedeemEntitlements", optional=true)
    public native void redeemEntitlements(EOS_Ecom_RedeemEntitlementsOptions Options, VoidPtr ClientData, FunctionPtr CompletionDelegate);
    @Bridge(symbol="EOS_Ecom_GetLastRedeemedEntitlementsCount", optional=true)
    public native int getLastRedeemedEntitlementsCount(EOS_Ecom_GetLastRedeemedEntitlementsCountOptions Options);
    @Bridge(symbol="EOS_Ecom_CopyLastRedeemedEntitlementByIndex", optional=true)
    public native EOS_EResult copyLastRedeemedEntitlementByIndex(EOS_Ecom_CopyLastRedeemedEntitlementByIndexOptions Options, BytePtr OutRedeemedEntitlementId, IntPtr InOutRedeemedEntitlementIdLength);
    @Bridge(symbol="EOS_Ecom_GetEntitlementsCount", optional=true)
    public native int getEntitlementsCount(EOS_Ecom_GetEntitlementsCountOptions Options);
    @Bridge(symbol="EOS_Ecom_GetEntitlementsByNameCount", optional=true)
    public native int getEntitlementsByNameCount(EOS_Ecom_GetEntitlementsByNameCountOptions Options);
    @Bridge(symbol="EOS_Ecom_CopyEntitlementByIndex", optional=true)
    public native EOS_EResult copyEntitlementByIndex(EOS_Ecom_CopyEntitlementByIndexOptions Options, EOS_Ecom_Entitlement.EOS_Ecom_EntitlementPtr OutEntitlement);
    @Bridge(symbol="EOS_Ecom_CopyEntitlementByNameAndIndex", optional=true)
    public native EOS_EResult copyEntitlementByNameAndIndex(EOS_Ecom_CopyEntitlementByNameAndIndexOptions Options, EOS_Ecom_Entitlement.EOS_Ecom_EntitlementPtr OutEntitlement);
    @Bridge(symbol="EOS_Ecom_CopyEntitlementById", optional=true)
    public native EOS_EResult copyEntitlementById(EOS_Ecom_CopyEntitlementByIdOptions Options, EOS_Ecom_Entitlement.EOS_Ecom_EntitlementPtr OutEntitlement);
    @Bridge(symbol="EOS_Ecom_GetOfferCount", optional=true)
    public native int getOfferCount(EOS_Ecom_GetOfferCountOptions Options);
    @Bridge(symbol="EOS_Ecom_CopyOfferByIndex", optional=true)
    public native EOS_EResult copyOfferByIndex(EOS_Ecom_CopyOfferByIndexOptions Options, EOS_Ecom_CatalogOffer.EOS_Ecom_CatalogOfferPtr OutOffer);
    @Bridge(symbol="EOS_Ecom_CopyOfferById", optional=true)
    public native EOS_EResult copyOfferById(EOS_Ecom_CopyOfferByIdOptions Options, EOS_Ecom_CatalogOffer.EOS_Ecom_CatalogOfferPtr OutOffer);
    @Bridge(symbol="EOS_Ecom_GetOfferItemCount", optional=true)
    public native int getOfferItemCount(EOS_Ecom_GetOfferItemCountOptions Options);
    @Bridge(symbol="EOS_Ecom_CopyOfferItemByIndex", optional=true)
    public native EOS_EResult copyOfferItemByIndex(EOS_Ecom_CopyOfferItemByIndexOptions Options, EOS_Ecom_CatalogItem.EOS_Ecom_CatalogItemPtr OutItem);
    @Bridge(symbol="EOS_Ecom_CopyItemById", optional=true)
    public native EOS_EResult copyItemById(EOS_Ecom_CopyItemByIdOptions Options, EOS_Ecom_CatalogItem.EOS_Ecom_CatalogItemPtr OutItem);
    @Bridge(symbol="EOS_Ecom_GetOfferImageInfoCount", optional=true)
    public native int getOfferImageInfoCount(EOS_Ecom_GetOfferImageInfoCountOptions Options);
    @Bridge(symbol="EOS_Ecom_CopyOfferImageInfoByIndex", optional=true)
    public native EOS_EResult copyOfferImageInfoByIndex(EOS_Ecom_CopyOfferImageInfoByIndexOptions Options, EOS_Ecom_KeyImageInfo.EOS_Ecom_KeyImageInfoPtr OutImageInfo);
    @Bridge(symbol="EOS_Ecom_GetItemImageInfoCount", optional=true)
    public native int getItemImageInfoCount(EOS_Ecom_GetItemImageInfoCountOptions Options);
    @Bridge(symbol="EOS_Ecom_CopyItemImageInfoByIndex", optional=true)
    public native EOS_EResult copyItemImageInfoByIndex(EOS_Ecom_CopyItemImageInfoByIndexOptions Options, EOS_Ecom_KeyImageInfo.EOS_Ecom_KeyImageInfoPtr OutImageInfo);
    @Bridge(symbol="EOS_Ecom_GetItemReleaseCount", optional=true)
    public native int getItemReleaseCount(EOS_Ecom_GetItemReleaseCountOptions Options);
    @Bridge(symbol="EOS_Ecom_CopyItemReleaseByIndex", optional=true)
    public native EOS_EResult copyItemReleaseByIndex(EOS_Ecom_CopyItemReleaseByIndexOptions Options, EOS_Ecom_CatalogRelease.EOS_Ecom_CatalogReleasePtr OutRelease);
    @Bridge(symbol="EOS_Ecom_GetTransactionCount", optional=true)
    public native int getTransactionCount(EOS_Ecom_GetTransactionCountOptions Options);
    @Bridge(symbol="EOS_Ecom_CopyTransactionByIndex", optional=true)
    public native EOS_EResult copyTransactionByIndex(EOS_Ecom_CopyTransactionByIndexOptions Options, EOS_Ecom_TransactionHandle.EOS_Ecom_TransactionHandlePtr OutTransaction);
    @Bridge(symbol="EOS_Ecom_CopyTransactionById", optional=true)
    public native EOS_EResult copyTransactionById(EOS_Ecom_CopyTransactionByIdOptions Options, EOS_Ecom_TransactionHandle.EOS_Ecom_TransactionHandlePtr OutTransaction);
    @Bridge(symbol="EOS_Ecom_Transaction_GetTransactionId", optional=true)
    public static native EOS_EResult transaction_GetTransactionId(EOS_Ecom_TransactionHandle Handle, BytePtr OutBuffer, IntPtr InOutBufferLength);
    @Bridge(symbol="EOS_Ecom_Transaction_GetEntitlementsCount", optional=true)
    public static native int transaction_GetEntitlementsCount(EOS_Ecom_TransactionHandle Handle, EOS_Ecom_Transaction_GetEntitlementsCountOptions Options);
    @Bridge(symbol="EOS_Ecom_Transaction_CopyEntitlementByIndex", optional=true)
    public static native EOS_EResult transaction_CopyEntitlementByIndex(EOS_Ecom_TransactionHandle Handle, EOS_Ecom_Transaction_CopyEntitlementByIndexOptions Options, EOS_Ecom_Entitlement.EOS_Ecom_EntitlementPtr OutEntitlement);
    /*</methods>*/
}
