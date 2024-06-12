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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUISimpleCardContent/*</name>*/ 
    extends /*<extends>*/UsercentricsPredefinedUICardContent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUISimpleCardContentPtr extends Ptr<UsercentricsPredefinedUISimpleCardContent, UsercentricsPredefinedUISimpleCardContentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUISimpleCardContent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUISimpleCardContent() {}
    protected UsercentricsPredefinedUISimpleCardContent(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUISimpleCardContent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:description:value:")
    public UsercentricsPredefinedUISimpleCardContent(String title, String description, String value) { super((SkipInit) null); initObject(init(title, description, value)); }
    @Method(selector = "initWithTitle:description:values:")
    public UsercentricsPredefinedUISimpleCardContent(String title, String description, NSArray<NSString> values) { super((SkipInit) null); initObject(init(title, description, values)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "description_")
    public native String getDescription_();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "value")
    public native String getValue();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:description:value:")
    protected native @Pointer long init(String title, String description, String value);
    @Method(selector = "initWithTitle:description:values:")
    protected native @Pointer long init(String title, String description, NSArray<NSString> values);
    /*</methods>*/
}
