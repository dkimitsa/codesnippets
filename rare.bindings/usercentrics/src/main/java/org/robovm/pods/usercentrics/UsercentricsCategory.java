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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UsercentricsUsercentricsCategory")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsCategory/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsCategoryPtr extends Ptr<UsercentricsCategory, UsercentricsCategoryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsCategory.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsCategory() {}
    protected UsercentricsCategory(Handle h, long handle) { super(h, handle); }
    protected UsercentricsCategory(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCategorySlug:label:description:isEssential:isHidden:")
    public UsercentricsCategory(String categorySlug, String label, String description, boolean isEssential, boolean isHidden) { super((SkipInit) null); initObject(init(categorySlug, label, description, isEssential, isHidden)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "categorySlug")
    public native String getCategorySlug();
    @Property(selector = "description_")
    public native String getDescription_();
    @Property(selector = "isEssential")
    public native boolean isEssential();
    @Property(selector = "isHidden")
    public native boolean isHidden();
    @Property(selector = "label")
    public native String getLabel();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCategorySlug:label:description:isEssential:isHidden:")
    protected native @Pointer long init(String categorySlug, String label, String description, boolean isEssential, boolean isHidden);
    @Method(selector = "doCopyCategorySlug:label:description:isEssential:isHidden:")
    public native UsercentricsCategory doCopy(String categorySlug, String label, String description, boolean isEssential, boolean isHidden);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}
