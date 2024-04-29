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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OMIDAmazonAdSessionContext/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OMIDAmazonAdSessionContextPtr extends Ptr<OMIDAmazonAdSessionContext, OMIDAmazonAdSessionContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OMIDAmazonAdSessionContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected OMIDAmazonAdSessionContext() {}
    protected OMIDAmazonAdSessionContext(Handle h, long handle) { super(h, handle); }
    protected OMIDAmazonAdSessionContext(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPartner:webView:contentUrl:customReferenceIdentifier:error:")
    public static  OMIDAmazonAdSessionContext createWithWebView(OMIDAmazonPartner partner, WKWebView webView, String contentUrl, String customReferenceIdentifier, NSError.NSErrorPtr error) {
       OMIDAmazonAdSessionContext res = new OMIDAmazonAdSessionContext((SkipInit) null);
       res.initObject(res.initWithPartnerWebView(partner, webView, contentUrl, customReferenceIdentifier, error));
       return res;
    }
    @Method(selector = "initWithPartner:script:resources:contentUrl:customReferenceIdentifier:error:")
    public OMIDAmazonAdSessionContext(OMIDAmazonPartner partner, String script, NSArray<OMIDAmazonVerificationScriptResource> resources, String contentUrl, String customReferenceIdentifier, NSError.NSErrorPtr error) { super((SkipInit) null); initObject(init(partner, script, resources, contentUrl, customReferenceIdentifier, error)); }
    @Method(selector = "initWithPartner:javaScriptWebView:contentUrl:customReferenceIdentifier:error:")
    public static  OMIDAmazonAdSessionContext createWithJavaScriptWebView(OMIDAmazonPartner partner, WKWebView webView, String contentUrl, String customReferenceIdentifier, NSError.NSErrorPtr error) {
       OMIDAmazonAdSessionContext res = new OMIDAmazonAdSessionContext((SkipInit) null);
       res.initObject(res.initWithPartnerJavaScriptWebView(partner, webView, contentUrl, customReferenceIdentifier, error));
       return res;
    }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPartner:webView:contentUrl:customReferenceIdentifier:error:")
    protected native @Pointer long initWithPartnerWebView(OMIDAmazonPartner partner, WKWebView webView, String contentUrl, String customReferenceIdentifier, NSError.NSErrorPtr error);
    @Method(selector = "initWithPartner:script:resources:contentUrl:customReferenceIdentifier:error:")
    protected native @Pointer long init(OMIDAmazonPartner partner, String script, NSArray<OMIDAmazonVerificationScriptResource> resources, String contentUrl, String customReferenceIdentifier, NSError.NSErrorPtr error);
    @Method(selector = "initWithPartner:javaScriptWebView:contentUrl:customReferenceIdentifier:error:")
    protected native @Pointer long initWithPartnerJavaScriptWebView(OMIDAmazonPartner partner, WKWebView webView, String contentUrl, String customReferenceIdentifier, NSError.NSErrorPtr error);
    /*</methods>*/
}
