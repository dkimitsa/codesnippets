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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC7iubenda16TCF2DataConsents")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TCF2DataConsents/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TCF2DataConsentsPtr extends Ptr<TCF2DataConsents, TCF2DataConsentsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TCF2DataConsents.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TCF2DataConsents() {}
    protected TCF2DataConsents(Handle h, long handle) { super(h, handle); }
    protected TCF2DataConsents(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "consents")
    public native String getConsents();
    @Property(selector = "setConsents:")
    public native void setConsents(String v);
    @Property(selector = "legitimateInterests")
    public native String getLegitimateInterests();
    @Property(selector = "setLegitimateInterests:")
    public native void setLegitimateInterests(String v);
    @Property(selector = "customPurpose")
    public native TCF2DataConsents getCustomPurpose();
    @Property(selector = "setCustomPurpose:")
    public native void setCustomPurpose(TCF2DataConsents v);
    @Property(selector = "restrictions")
    public native NSDictionary<NSString, NSString> getRestrictions();
    @Property(selector = "setRestrictions:")
    public native void setRestrictions(NSDictionary<NSString, NSString> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
