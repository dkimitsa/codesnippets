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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUIViewData/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUIViewDataPtr extends Ptr<UsercentricsPredefinedUIViewData, UsercentricsPredefinedUIViewDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUIViewData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUIViewData() {}
    protected UsercentricsPredefinedUIViewData(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUIViewData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithControllerId:uiVariant:settings:")
    public UsercentricsPredefinedUIViewData(String controllerId, UsercentricsVariant uiVariant, UsercentricsPredefinedUIViewSettings settings) { super((SkipInit) null); initObject(init(controllerId, uiVariant, settings)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "controllerId")
    public native String getControllerId();
    @Property(selector = "settings")
    public native UsercentricsPredefinedUIViewSettings getSettings();
    @Property(selector = "uiVariant")
    public native UsercentricsVariant getUiVariant();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithControllerId:uiVariant:settings:")
    protected native @Pointer long init(String controllerId, UsercentricsVariant uiVariant, UsercentricsPredefinedUIViewSettings settings);
    /*</methods>*/
}
