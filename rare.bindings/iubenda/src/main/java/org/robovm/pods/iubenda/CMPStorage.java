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
package org.robovm.pods.iubenda;

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
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/CMPStorage/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "consentString")
    String getConsentString();
    @Property(selector = "setConsentString:")
    void setConsentString(String v);
    @Property(selector = "consentTimestamp")
    NSDate getConsentTimestamp();
    @Property(selector = "setConsentTimestamp:")
    void setConsentTimestamp(NSDate v);
    @Property(selector = "googlePersonalized")
    boolean isGooglePersonalized();
    @Property(selector = "setGooglePersonalized:")
    void setGooglePersonalized(boolean v);
    @Property(selector = "vendorConsents")
    String getVendorConsents();
    @Property(selector = "setVendorConsents:")
    void setVendorConsents(String v);
    @Property(selector = "purposeConsents")
    String getPurposeConsents();
    @Property(selector = "setPurposeConsents:")
    void setPurposeConsents(String v);
    @Property(selector = "gvlVersion")
    @MachineSizedSInt long getGvlVersion();
    @Property(selector = "setGvlVersion:")
    void setGvlVersion(@MachineSizedSInt long v);
    @Property(selector = "version")
    String getVersion();
    @Property(selector = "setVersion:")
    void setVersion(String v);
    @Property(selector = "id")
    @MachineSizedSInt long getId();
    @Property(selector = "setId:")
    void setId(@MachineSizedSInt long v);
    @Property(selector = "publisherPurposeRestrictions")
    NSDictionary<NSString, NSString> getPublisherPurposeRestrictions();
    @Property(selector = "setPublisherPurposeRestrictions:")
    void setPublisherPurposeRestrictions(NSDictionary<NSString, NSString> v);
    @Property(selector = "vendorConsentsCustomUi")
    NSDictionary<NSString, NSNumber> getVendorConsentsCustomUi();
    @Property(selector = "setVendorConsentsCustomUi:")
    void setVendorConsentsCustomUi(NSDictionary<NSString, NSNumber> v);
    @Property(selector = "purposeConsentsCustomUi")
    NSDictionary<NSString, NSNumber> getPurposeConsentsCustomUi();
    @Property(selector = "setPurposeConsentsCustomUi:")
    void setPurposeConsentsCustomUi(NSDictionary<NSString, NSNumber> v);
    @Property(selector = "specialFeatureOptinsCustomUi")
    NSDictionary<NSString, NSNumber> getSpecialFeatureOptinsCustomUi();
    @Property(selector = "setSpecialFeatureOptinsCustomUi:")
    void setSpecialFeatureOptinsCustomUi(NSDictionary<NSString, NSNumber> v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "clear")
    void clear();
    @Method(selector = "isVendorConsentGivenForId:")
    boolean isVendorConsentGivenForId(@MachineSizedSInt long id);
    @Method(selector = "isPurposeConsentGivenForId:")
    boolean isPurposeConsentGivenForId(@MachineSizedSInt long id);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
