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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/APS/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class APSPtr extends Ptr<APS, APSPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(APS.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public APS() {}
    protected APS(Handle h, long handle) { super(h, handle); }
    protected APS(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initializeWithAppKey:adNetwork:completion:")
    public static native void init(String appKey, APSAdNetwork adNetwork, @Block VoidBlock1<NSError> completion);
    @Method(selector = "initializeWithAppKey:adNetwork:config:completion:")
    public static native void init(String appKey, APSAdNetwork adNetwork, APSInitConfig config, @Block VoidBlock1<NSError> completion);
    @Method(selector = "setCustomAttribute:forKey:")
    public static native void setCustomAttribute(String value, String key);
    @Method(selector = "adNetwork")
    public static native APSAdNetwork adNetwork();
    @Method(selector = "setPrivacyString:type:")
    public static native void setPrivacyString(String string, APSPrivacyType privacyType);
    @Method(selector = "setContentUrl:")
    public static native void setContentUrl(String contentUrl);
    @Method(selector = "setImpressionDepth:")
    public static native void setImpressionDepth(@MachineSizedSInt long depthLevel);
    @Method(selector = "setSessionDurationInSeconds:")
    public static native void setSessionDurationInSeconds(@MachineSizedSInt long sessionDurationInSeconds);
    @Method(selector = "version")
    public static native String version();
    /*</methods>*/
}
