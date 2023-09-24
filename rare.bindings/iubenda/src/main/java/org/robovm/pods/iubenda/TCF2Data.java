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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC7iubenda8TCF2Data")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TCF2Data/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TCF2DataPtr extends Ptr<TCF2Data, TCF2DataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TCF2Data.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TCF2Data() {}
    protected TCF2Data(Handle h, long handle) { super(h, handle); }
    protected TCF2Data(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tcString")
    public native String getTcString();
    @Property(selector = "setTcString:")
    public native void setTcString(String v);
    @Property(selector = "tcfPolicyVersion")
    public native @MachineSizedSInt long getTcfPolicyVersion();
    @Property(selector = "setTcfPolicyVersion:")
    public native void setTcfPolicyVersion(@MachineSizedSInt long v);
    @Property(selector = "cmpId")
    public native @MachineSizedSInt long getCmpId();
    @Property(selector = "setCmpId:")
    public native void setCmpId(@MachineSizedSInt long v);
    @Property(selector = "cmpVersion")
    public native @MachineSizedSInt long getCmpVersion();
    @Property(selector = "setCmpVersion:")
    public native void setCmpVersion(@MachineSizedSInt long v);
    @Property(selector = "gdprApplies")
    public native GDPRApplies getGdprApplies();
    @Property(selector = "setGdprApplies:")
    public native void setGdprApplies(GDPRApplies v);
    @Property(selector = "useNonStandardStacks")
    public native boolean isUseNonStandardStacks();
    @Property(selector = "setUseNonStandardStacks:")
    public native void setUseNonStandardStacks(boolean v);
    @Property(selector = "purposeOneTreatment")
    public native boolean isPurposeOneTreatment();
    @Property(selector = "setPurposeOneTreatment:")
    public native void setPurposeOneTreatment(boolean v);
    @Property(selector = "publisherCC")
    public native String getPublisherCC();
    @Property(selector = "setPublisherCC:")
    public native void setPublisherCC(String v);
    @Property(selector = "vendor")
    public native TCF2DataConsents getVendor();
    @Property(selector = "setVendor:")
    public native void setVendor(TCF2DataConsents v);
    @Property(selector = "purpose")
    public native TCF2DataConsents getPurpose();
    @Property(selector = "setPurpose:")
    public native void setPurpose(TCF2DataConsents v);
    @Property(selector = "specialFeatureOptins")
    public native String getSpecialFeatureOptins();
    @Property(selector = "setSpecialFeatureOptins:")
    public native void setSpecialFeatureOptins(String v);
    @Property(selector = "publisher")
    public native TCF2DataConsents getPublisher();
    @Property(selector = "setPublisher:")
    public native void setPublisher(TCF2DataConsents v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
