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
package org.robovm.pods.amznpubservices;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/APSLogger/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class APSLoggerPtr extends Ptr<APSLogger, APSLoggerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(APSLogger.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected APSLogger() {}
    protected APSLogger(Handle h, long handle) { super(h, handle); }
    protected APSLogger(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setDelegate:")
    public static native void setDelegate(APSLoggerDelegate delegate);
    @Method(selector = "setLevel:")
    public static native void setLevel(APSLoggerLevel level);
    @Method(selector = "level")
    public static native APSLoggerLevel level();
    @Method(selector = "setPrefix:")
    public static native void setPrefix(String prefix);
    @Method(selector = "trace:")
    public static native void trace(String message);
    @Method(selector = "trace:exception:")
    public static native void trace(String message, NSException exception);
    @Method(selector = "trace:tag:")
    public static native void trace(String message, NSObject tag);
    @Method(selector = "trace:exception:tag:")
    public static native void trace(String message, NSException exception, NSObject tag);
    @Method(selector = "debug:")
    public static native void debug(String message);
    @Method(selector = "debug:exception:")
    public static native void debug(String message, NSException exception);
    @Method(selector = "debug:tag:")
    public static native void debug(String message, NSObject tag);
    @Method(selector = "debug:exception:tag:")
    public static native void debug(String message, NSException exception, NSObject tag);
    @Method(selector = "info:")
    public static native void info(String message);
    @Method(selector = "info:exception:")
    public static native void info(String message, NSException exception);
    @Method(selector = "info:tag:")
    public static native void info(String message, NSObject tag);
    @Method(selector = "info:exception:tag:")
    public static native void info(String message, NSException exception, NSObject tag);
    @Method(selector = "warn:")
    public static native void warn(String message);
    @Method(selector = "warn:exception:")
    public static native void warn(String message, NSException exception);
    @Method(selector = "warn:tag:")
    public static native void warn(String message, NSObject tag);
    @Method(selector = "warn:exception:tag:")
    public static native void warn(String message, NSException exception, NSObject tag);
    @Method(selector = "error:")
    public static native void error(String message);
    @Method(selector = "error:exception:")
    public static native void error(String message, NSException exception);
    @Method(selector = "error:tag:")
    public static native void error(String message, NSObject tag);
    @Method(selector = "error:exception:tag:")
    public static native void error(String message, NSException exception, NSObject tag);
    @Method(selector = "fatalWithRemoteLogging:")
    public static native void fatal(String message);
    @Method(selector = "fatalWithRemoteLogging:exception:")
    public static native void fatal(String message, NSException exception);
    @Method(selector = "fatalWithRemoteLogging:tag:")
    public static native void fatal(String message, NSObject tag);
    @Method(selector = "fatalWithRemoteLogging:exception:tag:")
    public static native void fatal(String message, NSException exception, NSObject tag);
    /*</methods>*/
}
