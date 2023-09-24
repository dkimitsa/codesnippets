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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC7iubenda12CMPStorageV1")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMPStorageV1/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements CMPStorage/*</implements>*/ {

    /*<ptr>*/public static class CMPStorageV1Ptr extends Ptr<CMPStorageV1, CMPStorageV1Ptr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CMPStorageV1.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CMPStorageV1() {}
    protected CMPStorageV1(Handle h, long handle) { super(h, handle); }
    protected CMPStorageV1(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "consentString")
    public native String getConsentString();
    @Property(selector = "setConsentString:")
    public native void setConsentString(String v);
    @Property(selector = "consentTimestamp")
    public native NSDate getConsentTimestamp();
    @Property(selector = "setConsentTimestamp:")
    public native void setConsentTimestamp(NSDate v);
    @Property(selector = "googlePersonalized")
    public native boolean isGooglePersonalized();
    @Property(selector = "setGooglePersonalized:")
    public native void setGooglePersonalized(boolean v);
    @Property(selector = "vendorConsents")
    public native String getVendorConsents();
    @Property(selector = "setVendorConsents:")
    public native void setVendorConsents(String v);
    @Property(selector = "purposeConsents")
    public native String getPurposeConsents();
    @Property(selector = "setPurposeConsents:")
    public native void setPurposeConsents(String v);
    @Property(selector = "subjectToGDPR")
    public native SubjectToGDPR getSubjectToGDPR();
    @Property(selector = "setSubjectToGDPR:")
    public native void setSubjectToGDPR(SubjectToGDPR v);
    @Property(selector = "gvlVersion")
    public native @MachineSizedSInt long getGvlVersion();
    @Property(selector = "setGvlVersion:")
    public native void setGvlVersion(@MachineSizedSInt long v);
    @Property(selector = "version")
    public native String getVersion();
    @Property(selector = "setVersion:")
    public native void setVersion(String v);
    @Property(selector = "id")
    public native @MachineSizedSInt long getId();
    @Property(selector = "setId:")
    public native void setId(@MachineSizedSInt long v);
    @Property(selector = "publisherPurposeRestrictions")
    public native NSDictionary<NSString, NSString> getPublisherPurposeRestrictions();
    @Property(selector = "setPublisherPurposeRestrictions:")
    public native void setPublisherPurposeRestrictions(NSDictionary<NSString, NSString> v);
    @Property(selector = "vendorConsentsCustomUi")
    public native NSDictionary<NSString, NSNumber> getVendorConsentsCustomUi();
    @Property(selector = "setVendorConsentsCustomUi:")
    public native void setVendorConsentsCustomUi(NSDictionary<NSString, NSNumber> v);
    @Property(selector = "purposeConsentsCustomUi")
    public native NSDictionary<NSString, NSNumber> getPurposeConsentsCustomUi();
    @Property(selector = "setPurposeConsentsCustomUi:")
    public native void setPurposeConsentsCustomUi(NSDictionary<NSString, NSNumber> v);
    @Property(selector = "specialFeatureOptinsCustomUi")
    public native NSDictionary<NSString, NSNumber> getSpecialFeatureOptinsCustomUi();
    @Property(selector = "setSpecialFeatureOptinsCustomUi:")
    public native void setSpecialFeatureOptinsCustomUi(NSDictionary<NSString, NSNumber> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "clear")
    public native void clear();
    @Method(selector = "isVendorConsentGivenForId:")
    public native boolean isVendorConsentGivenForId(@MachineSizedSInt long id);
    @Method(selector = "isPurposeConsentGivenForId:")
    public native boolean isPurposeConsentGivenForId(@MachineSizedSInt long id);
    /*</methods>*/
}
