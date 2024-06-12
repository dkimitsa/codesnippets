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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsKotlinException/*</name>*/ 
    extends /*<extends>*/UsercentricsKotlinThrowable/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsKotlinExceptionPtr extends Ptr<UsercentricsKotlinException, UsercentricsKotlinExceptionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsKotlinException.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UsercentricsKotlinException() {}
    protected UsercentricsKotlinException(Handle h, long handle) { super(h, handle); }
    protected UsercentricsKotlinException(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMessage:")
    public UsercentricsKotlinException(String message) { super((SkipInit) null); initObject(init(message)); }
    @Method(selector = "initWithCause:")
    public UsercentricsKotlinException(UsercentricsKotlinThrowable cause) { super((SkipInit) null); initObject(init(cause)); }
    @Method(selector = "initWithMessage:cause:")
    public UsercentricsKotlinException(String message, UsercentricsKotlinThrowable cause) { super((SkipInit) null); initObject(init(message, cause)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMessage:")
    protected native @Pointer long init(String message);
    @Method(selector = "initWithCause:")
    protected native @Pointer long init(UsercentricsKotlinThrowable cause);
    @Method(selector = "initWithMessage:cause:")
    protected native @Pointer long init(String message, UsercentricsKotlinThrowable cause);
    /*</methods>*/
}
