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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUIApplication/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUIApplicationPtr extends Ptr<UsercentricsPredefinedUIApplication, UsercentricsPredefinedUIApplicationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUIApplication.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUIApplication() {}
    protected UsercentricsPredefinedUIApplication(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUIApplication(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCookieInformationService:logger:loggerLevel:")
    public UsercentricsPredefinedUIApplication(UsercentricsCookieInformationService cookieInformationService, UsercentricsLogger logger, UsercentricsLoggerLevel loggerLevel) { super((SkipInit) null); initObject(init(cookieInformationService, logger, loggerLevel)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "cookieInformationService")
    public native UsercentricsCookieInformationService getCookieInformationService();
    @Property(selector = "logger")
    public native UsercentricsLogger getLogger();
    @Property(selector = "loggerLevel")
    public native UsercentricsLoggerLevel getLoggerLevel();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCookieInformationService:logger:loggerLevel:")
    protected native @Pointer long init(UsercentricsCookieInformationService cookieInformationService, UsercentricsLogger logger, UsercentricsLoggerLevel loggerLevel);
    /*</methods>*/
}
