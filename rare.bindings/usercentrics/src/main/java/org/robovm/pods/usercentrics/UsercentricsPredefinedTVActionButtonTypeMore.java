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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedTVActionButtonTypeMore/*</name>*/ 
    extends /*<extends>*/UsercentricsPredefinedTVActionButtonType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedTVActionButtonTypeMorePtr extends Ptr<UsercentricsPredefinedTVActionButtonTypeMore, UsercentricsPredefinedTVActionButtonTypeMorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedTVActionButtonTypeMore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedTVActionButtonTypeMore() {}
    protected UsercentricsPredefinedTVActionButtonTypeMore(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedTVActionButtonTypeMore(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithInitialSection:")
    public UsercentricsPredefinedTVActionButtonTypeMore(String initialSection) { super((SkipInit) null); initObject(init(initialSection)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "initialSection")
    public native String getInitialSection();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithInitialSection:")
    protected native @Pointer long init(String initialSection);
    @Method(selector = "doCopyInitialSection:")
    public native UsercentricsPredefinedTVActionButtonTypeMore doCopyInitialSection(String initialSection);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
