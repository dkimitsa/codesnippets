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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedTVSecondLayerDetailsEntryLink/*</name>*/ 
    extends /*<extends>*/UsercentricsPredefinedTVSecondLayerDetailsEntry/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedTVSecondLayerDetailsEntryLinkPtr extends Ptr<UsercentricsPredefinedTVSecondLayerDetailsEntryLink, UsercentricsPredefinedTVSecondLayerDetailsEntryLinkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedTVSecondLayerDetailsEntryLink.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedTVSecondLayerDetailsEntryLink() {}
    protected UsercentricsPredefinedTVSecondLayerDetailsEntryLink(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedTVSecondLayerDetailsEntryLink(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:linkLabel:url:")
    public UsercentricsPredefinedTVSecondLayerDetailsEntryLink(String title, String linkLabel, String url) { super((SkipInit) null); initObject(init(title, linkLabel, url)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "linkLabel")
    public native String getLinkLabel();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "url")
    public native String getUrl();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:linkLabel:url:")
    protected native @Pointer long init(String title, String linkLabel, String url);
    @Method(selector = "doCopyTitle:linkLabel:url:")
    public native UsercentricsPredefinedTVSecondLayerDetailsEntryLink doCopy(String title, String linkLabel, String url);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
