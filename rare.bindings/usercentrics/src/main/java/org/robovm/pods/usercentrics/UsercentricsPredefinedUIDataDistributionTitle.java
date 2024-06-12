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
package org.robovm.pods.usercentrics;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUIDataDistributionTitle/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUIDataDistributionTitlePtr extends Ptr<UsercentricsPredefinedUIDataDistributionTitle, UsercentricsPredefinedUIDataDistributionTitlePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUIDataDistributionTitle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUIDataDistributionTitle() {}
    protected UsercentricsPredefinedUIDataDistributionTitle(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUIDataDistributionTitle(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithProcessingLocationTitle:thirdPartyCountriesTitle:thirdPartyCountriesDescription:")
    public UsercentricsPredefinedUIDataDistributionTitle(String processingLocationTitle, String thirdPartyCountriesTitle, String thirdPartyCountriesDescription) { super((SkipInit) null); initObject(init(processingLocationTitle, thirdPartyCountriesTitle, thirdPartyCountriesDescription)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "processingLocationTitle")
    public native String getProcessingLocationTitle();
    @Property(selector = "thirdPartyCountriesDescription")
    public native String getThirdPartyCountriesDescription();
    @Property(selector = "thirdPartyCountriesTitle")
    public native String getThirdPartyCountriesTitle();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithProcessingLocationTitle:thirdPartyCountriesTitle:thirdPartyCountriesDescription:")
    protected native @Pointer long init(String processingLocationTitle, String thirdPartyCountriesTitle, String thirdPartyCountriesDescription);
    /*</methods>*/
}
