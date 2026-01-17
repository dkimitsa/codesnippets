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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Ecom_CatalogOffer/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Ecom_CatalogOffer>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Ecom_CatalogOfferPtr extends Ptr<EOS_Ecom_CatalogOffer, EOS_Ecom_CatalogOfferPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_Ecom_CatalogOffer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Ecom_CatalogOffer() {}
    public EOS_Ecom_CatalogOffer(int ApiVersion, int ServerIndex, BytePtr CatalogNamespace, BytePtr Id, BytePtr TitleText, BytePtr DescriptionText, BytePtr LongDescriptionText, BytePtr TechnicalDetailsText_DEPRECATED, BytePtr CurrencyCode, EOS_EResult PriceResult, int OriginalPrice_DEPRECATED, int CurrentPrice_DEPRECATED, byte DiscountPercentage, long ExpirationTimestamp, int PurchasedCount_DEPRECATED, int PurchaseLimit, int bAvailableForPurchase, long OriginalPrice64, long CurrentPrice64, int DecimalPoint, long ReleaseDateTimestamp, long EffectiveDateTimestamp) {
        this.setApiVersion(ApiVersion);
        this.setServerIndex(ServerIndex);
        this.setCatalogNamespace(CatalogNamespace);
        this.setId(Id);
        this.setTitleText(TitleText);
        this.setDescriptionText(DescriptionText);
        this.setLongDescriptionText(LongDescriptionText);
        this.setTechnicalDetailsText_DEPRECATED(TechnicalDetailsText_DEPRECATED);
        this.setCurrencyCode(CurrencyCode);
        this.setPriceResult(PriceResult);
        this.setOriginalPrice_DEPRECATED(OriginalPrice_DEPRECATED);
        this.setCurrentPrice_DEPRECATED(CurrentPrice_DEPRECATED);
        this.setDiscountPercentage(DiscountPercentage);
        this.setExpirationTimestamp(ExpirationTimestamp);
        this.setPurchasedCount_DEPRECATED(PurchasedCount_DEPRECATED);
        this.setPurchaseLimit(PurchaseLimit);
        this.setBAvailableForPurchase(bAvailableForPurchase);
        this.setOriginalPrice64(OriginalPrice64);
        this.setCurrentPrice64(CurrentPrice64);
        this.setDecimalPoint(DecimalPoint);
        this.setReleaseDateTimestamp(ReleaseDateTimestamp);
        this.setEffectiveDateTimestamp(EffectiveDateTimestamp);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Ecom_CatalogOffer setApiVersion(int ApiVersion);
    @StructMember(1) public native int getServerIndex();
    @StructMember(1) public native EOS_Ecom_CatalogOffer setServerIndex(int ServerIndex);
    @StructMember(2) public native BytePtr getCatalogNamespace();
    @StructMember(2) public native EOS_Ecom_CatalogOffer setCatalogNamespace(BytePtr CatalogNamespace);
    @StructMember(3) public native BytePtr getId();
    @StructMember(3) public native EOS_Ecom_CatalogOffer setId(BytePtr Id);
    @StructMember(4) public native BytePtr getTitleText();
    @StructMember(4) public native EOS_Ecom_CatalogOffer setTitleText(BytePtr TitleText);
    @StructMember(5) public native BytePtr getDescriptionText();
    @StructMember(5) public native EOS_Ecom_CatalogOffer setDescriptionText(BytePtr DescriptionText);
    @StructMember(6) public native BytePtr getLongDescriptionText();
    @StructMember(6) public native EOS_Ecom_CatalogOffer setLongDescriptionText(BytePtr LongDescriptionText);
    @StructMember(7) public native BytePtr getTechnicalDetailsText_DEPRECATED();
    @StructMember(7) public native EOS_Ecom_CatalogOffer setTechnicalDetailsText_DEPRECATED(BytePtr TechnicalDetailsText_DEPRECATED);
    @StructMember(8) public native BytePtr getCurrencyCode();
    @StructMember(8) public native EOS_Ecom_CatalogOffer setCurrencyCode(BytePtr CurrencyCode);
    @StructMember(9) public native EOS_EResult getPriceResult();
    @StructMember(9) public native EOS_Ecom_CatalogOffer setPriceResult(EOS_EResult PriceResult);
    @StructMember(10) public native int getOriginalPrice_DEPRECATED();
    @StructMember(10) public native EOS_Ecom_CatalogOffer setOriginalPrice_DEPRECATED(int OriginalPrice_DEPRECATED);
    @StructMember(11) public native int getCurrentPrice_DEPRECATED();
    @StructMember(11) public native EOS_Ecom_CatalogOffer setCurrentPrice_DEPRECATED(int CurrentPrice_DEPRECATED);
    @StructMember(12) public native byte getDiscountPercentage();
    @StructMember(12) public native EOS_Ecom_CatalogOffer setDiscountPercentage(byte DiscountPercentage);
    @StructMember(13) public native long getExpirationTimestamp();
    @StructMember(13) public native EOS_Ecom_CatalogOffer setExpirationTimestamp(long ExpirationTimestamp);
    @StructMember(14) public native int getPurchasedCount_DEPRECATED();
    @StructMember(14) public native EOS_Ecom_CatalogOffer setPurchasedCount_DEPRECATED(int PurchasedCount_DEPRECATED);
    @StructMember(15) public native int getPurchaseLimit();
    @StructMember(15) public native EOS_Ecom_CatalogOffer setPurchaseLimit(int PurchaseLimit);
    @StructMember(16) public native int getBAvailableForPurchase();
    @StructMember(16) public native EOS_Ecom_CatalogOffer setBAvailableForPurchase(int bAvailableForPurchase);
    @StructMember(17) public native long getOriginalPrice64();
    @StructMember(17) public native EOS_Ecom_CatalogOffer setOriginalPrice64(long OriginalPrice64);
    @StructMember(18) public native long getCurrentPrice64();
    @StructMember(18) public native EOS_Ecom_CatalogOffer setCurrentPrice64(long CurrentPrice64);
    @StructMember(19) public native int getDecimalPoint();
    @StructMember(19) public native EOS_Ecom_CatalogOffer setDecimalPoint(int DecimalPoint);
    @StructMember(20) public native long getReleaseDateTimestamp();
    @StructMember(20) public native EOS_Ecom_CatalogOffer setReleaseDateTimestamp(long ReleaseDateTimestamp);
    @StructMember(21) public native long getEffectiveDateTimestamp();
    @StructMember(21) public native EOS_Ecom_CatalogOffer setEffectiveDateTimestamp(long EffectiveDateTimestamp);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_Ecom_CatalogOffer_Release", optional=true)
    public native void release();
    /*</methods>*/
}
