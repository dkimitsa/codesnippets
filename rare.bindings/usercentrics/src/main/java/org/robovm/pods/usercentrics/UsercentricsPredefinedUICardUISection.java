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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUICardUISection/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUICardUISectionPtr extends Ptr<UsercentricsPredefinedUICardUISection, UsercentricsPredefinedUICardUISectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUICardUISection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUICardUISection() {}
    protected UsercentricsPredefinedUICardUISection(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUICardUISection(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:cards:controllerID:")
    public UsercentricsPredefinedUICardUISection(String title, NSArray<UsercentricsPredefinedUICardUI> cards, UsercentricsPredefinedUIControllerIDSettings controllerID) { super((SkipInit) null); initObject(init(title, cards, controllerID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "cards")
    public native NSArray<UsercentricsPredefinedUICardUI> getCards();
    @Property(selector = "controllerID")
    public native UsercentricsPredefinedUIControllerIDSettings getControllerID();
    @Property(selector = "title")
    public native String getTitle();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:cards:controllerID:")
    protected native @Pointer long init(String title, NSArray<UsercentricsPredefinedUICardUI> cards, UsercentricsPredefinedUIControllerIDSettings controllerID);
    @Method(selector = "doCopyTitle:cards:controllerID:")
    public native UsercentricsPredefinedUICardUISection doCopy(String title, NSArray<UsercentricsPredefinedUICardUI> cards, UsercentricsPredefinedUIControllerIDSettings controllerID);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
