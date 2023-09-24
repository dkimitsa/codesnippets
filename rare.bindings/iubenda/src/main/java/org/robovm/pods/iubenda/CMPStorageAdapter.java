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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMPStorageAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements CMPStorage/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("consentString")
    public String getConsentString() { return null; }
    @NotImplemented("setConsentString:")
    public void setConsentString(String v) {}
    @NotImplemented("consentTimestamp")
    public NSDate getConsentTimestamp() { return null; }
    @NotImplemented("setConsentTimestamp:")
    public void setConsentTimestamp(NSDate v) {}
    @NotImplemented("googlePersonalized")
    public boolean isGooglePersonalized() { return false; }
    @NotImplemented("setGooglePersonalized:")
    public void setGooglePersonalized(boolean v) {}
    @NotImplemented("vendorConsents")
    public String getVendorConsents() { return null; }
    @NotImplemented("setVendorConsents:")
    public void setVendorConsents(String v) {}
    @NotImplemented("purposeConsents")
    public String getPurposeConsents() { return null; }
    @NotImplemented("setPurposeConsents:")
    public void setPurposeConsents(String v) {}
    @NotImplemented("gvlVersion")
    public @MachineSizedSInt long getGvlVersion() { return 0; }
    @NotImplemented("setGvlVersion:")
    public void setGvlVersion(@MachineSizedSInt long v) {}
    @NotImplemented("version")
    public String getVersion() { return null; }
    @NotImplemented("setVersion:")
    public void setVersion(String v) {}
    @NotImplemented("id")
    public @MachineSizedSInt long getId() { return 0; }
    @NotImplemented("setId:")
    public void setId(@MachineSizedSInt long v) {}
    @NotImplemented("publisherPurposeRestrictions")
    public NSDictionary<NSString, NSString> getPublisherPurposeRestrictions() { return null; }
    @NotImplemented("setPublisherPurposeRestrictions:")
    public void setPublisherPurposeRestrictions(NSDictionary<NSString, NSString> v) {}
    @NotImplemented("vendorConsentsCustomUi")
    public NSDictionary<NSString, NSNumber> getVendorConsentsCustomUi() { return null; }
    @NotImplemented("setVendorConsentsCustomUi:")
    public void setVendorConsentsCustomUi(NSDictionary<NSString, NSNumber> v) {}
    @NotImplemented("purposeConsentsCustomUi")
    public NSDictionary<NSString, NSNumber> getPurposeConsentsCustomUi() { return null; }
    @NotImplemented("setPurposeConsentsCustomUi:")
    public void setPurposeConsentsCustomUi(NSDictionary<NSString, NSNumber> v) {}
    @NotImplemented("specialFeatureOptinsCustomUi")
    public NSDictionary<NSString, NSNumber> getSpecialFeatureOptinsCustomUi() { return null; }
    @NotImplemented("setSpecialFeatureOptinsCustomUi:")
    public void setSpecialFeatureOptinsCustomUi(NSDictionary<NSString, NSNumber> v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("clear")
    public void clear() {}
    @NotImplemented("isVendorConsentGivenForId:")
    public boolean isVendorConsentGivenForId(@MachineSizedSInt long id) { return false; }
    @NotImplemented("isPurposeConsentGivenForId:")
    public boolean isPurposeConsentGivenForId(@MachineSizedSInt long id) { return false; }
    /*</methods>*/
}
