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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsSecondLayer/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsSecondLayerPtr extends Ptr<UsercentricsSecondLayer, UsercentricsSecondLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsSecondLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsSecondLayer() {}
    protected UsercentricsSecondLayer(Handle h, long handle) { super(h, handle); }
    protected UsercentricsSecondLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTabsCategoriesLabel:tabsServicesLabel:hideTogglesForServices:hideDataProcessingServices:hideButtonDeny:hideLanguageSwitch:acceptButtonText:denyButtonText:")
    public UsercentricsSecondLayer(String tabsCategoriesLabel, String tabsServicesLabel, boolean hideTogglesForServices, boolean hideDataProcessingServices, UsercentricsBoolean hideButtonDeny, UsercentricsBoolean hideLanguageSwitch, String acceptButtonText, String denyButtonText) { super((SkipInit) null); initObject(init(tabsCategoriesLabel, tabsServicesLabel, hideTogglesForServices, hideDataProcessingServices, hideButtonDeny, hideLanguageSwitch, acceptButtonText, denyButtonText)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "acceptButtonText")
    public native String getAcceptButtonText();
    @Property(selector = "denyButtonText")
    public native String getDenyButtonText();
    @Property(selector = "hideButtonDeny")
    public native UsercentricsBoolean getHideButtonDeny();
    @Property(selector = "hideDataProcessingServices")
    public native boolean isHideDataProcessingServices();
    @Property(selector = "hideLanguageSwitch")
    public native UsercentricsBoolean getHideLanguageSwitch();
    @Property(selector = "hideTogglesForServices")
    public native boolean isHideTogglesForServices();
    @Property(selector = "tabsCategoriesLabel")
    public native String getTabsCategoriesLabel();
    @Property(selector = "tabsServicesLabel")
    public native String getTabsServicesLabel();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTabsCategoriesLabel:tabsServicesLabel:hideTogglesForServices:hideDataProcessingServices:hideButtonDeny:hideLanguageSwitch:acceptButtonText:denyButtonText:")
    protected native @Pointer long init(String tabsCategoriesLabel, String tabsServicesLabel, boolean hideTogglesForServices, boolean hideDataProcessingServices, UsercentricsBoolean hideButtonDeny, UsercentricsBoolean hideLanguageSwitch, String acceptButtonText, String denyButtonText);
    @Method(selector = "doCopyTabsCategoriesLabel:tabsServicesLabel:hideTogglesForServices:hideDataProcessingServices:hideButtonDeny:hideLanguageSwitch:acceptButtonText:denyButtonText:")
    public native UsercentricsSecondLayer doCopy(String tabsCategoriesLabel, String tabsServicesLabel, boolean hideTogglesForServices, boolean hideDataProcessingServices, UsercentricsBoolean hideButtonDeny, UsercentricsBoolean hideLanguageSwitch, String acceptButtonText, String denyButtonText);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
