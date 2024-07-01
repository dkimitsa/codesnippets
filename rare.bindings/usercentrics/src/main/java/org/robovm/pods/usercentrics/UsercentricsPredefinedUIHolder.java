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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUIHolder/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUIHolderPtr extends Ptr<UsercentricsPredefinedUIHolder, UsercentricsPredefinedUIHolderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUIHolder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUIHolder() {}
    protected UsercentricsPredefinedUIHolder(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUIHolder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithData:consentManager:viewHandlers:")
    public UsercentricsPredefinedUIHolder(UsercentricsPredefinedUIViewData data, UsercentricsPredefinedUIConsentManager consentManager, UsercentricsPredefinedUIViewHandlers viewHandlers) { super((SkipInit) null); initObject(init(data, consentManager, viewHandlers)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "consentManager")
    public native UsercentricsPredefinedUIConsentManager getConsentManager();
    @Property(selector = "data")
    public native UsercentricsPredefinedUIViewData getData();
    @Property(selector = "viewHandlers")
    public native UsercentricsPredefinedUIViewHandlers getViewHandlers();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithData:consentManager:viewHandlers:")
    protected native @Pointer long init(UsercentricsPredefinedUIViewData data, UsercentricsPredefinedUIConsentManager consentManager, UsercentricsPredefinedUIViewHandlers viewHandlers);
    @Method(selector = "doCopyData:consentManager:viewHandlers:")
    public native UsercentricsPredefinedUIHolder doCopy(UsercentricsPredefinedUIViewData data, UsercentricsPredefinedUIConsentManager consentManager, UsercentricsPredefinedUIViewHandlers viewHandlers);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
