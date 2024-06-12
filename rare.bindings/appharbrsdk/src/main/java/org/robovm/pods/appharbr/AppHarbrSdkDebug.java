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
package org.robovm.pods.appharbr;

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
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("AppHarbrSDK.AppHarbrSdkDebug")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AppHarbrSdkDebug/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AppHarbrSdkDebugPtr extends Ptr<AppHarbrSdkDebug, AppHarbrSdkDebugPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AppHarbrSdkDebug.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AppHarbrSdkDebug() {}
    protected AppHarbrSdkDebug(Handle h, long handle) { super(h, handle); }
    protected AppHarbrSdkDebug(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDebug:blockAll:reportAll:")
    public AppHarbrSdkDebug(boolean debug, boolean blockAll, boolean reportAll) { super((SkipInit) null); initObject(init(debug, blockAll, reportAll)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDebug:blockAll:reportAll:")
    protected native @Pointer long init(boolean debug, boolean blockAll, boolean reportAll);
    @Method(selector = "withBlockAllWithBlockAll:")
    public native AppHarbrSdkDebug withBlockAll(boolean blockAll);
    @Method(selector = "withReportAllWithReportAll:")
    public native AppHarbrSdkDebug withReportAll(boolean reportAll);
    @Method(selector = "withBlockDomainsWithBlockDomains:")
    public native AppHarbrSdkDebug withBlockDomains(NSArray<NSString> blockDomains);
    /*</methods>*/
}
