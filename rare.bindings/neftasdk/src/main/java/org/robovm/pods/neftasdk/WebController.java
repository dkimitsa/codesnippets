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
package org.robovm.pods.neftasdk;

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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("NeftaSDK.WebController")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WebController/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements WKNavigationDelegate/*</implements>*/ {

    /*<ptr>*/public static class WebControllerPtr extends Ptr<WebController, WebControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WebController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public WebController() {}
    protected WebController(Handle h, long handle) { super(h, handle); }
    protected WebController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "layoutSubviews")
    public native void layoutSubviews();
    @Method(selector = "didMoveToSuperview")
    public native void didMoveToSuperview();
    @Method(selector = "webView:didFailNavigation:withError:")
    public native void didFailNavigation(WKWebView webView, WKNavigation navigation, NSError error);
    @Method(selector = "webView:didFailProvisionalNavigation:withError:")
    public native void didFailProvisionalNavigation(WKWebView webView, WKNavigation navigation, NSError error);
    @Method(selector = "webView:didFinishNavigation:")
    public native void didFinishNavigation(WKWebView webView, WKNavigation navigation);
    @Method(selector = "observeValueForKeyPath:ofObject:change:context:")
    public native void observeValue(String keyPath, NSObject object, NSDictionary<NSString, ?> change, VoidPtr context);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    @Method(selector = "webView:decidePolicyForNavigationAction:decisionHandler:")
    public native void decidePolicyForNavigationAction(WKWebView webView, WKNavigationAction navigationAction, @Block VoidBlock1<WKNavigationActionPolicy> decisionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "webView:decidePolicyForNavigationAction:preferences:decisionHandler:")
    public native void decidePolicyForNavigationAction(WKWebView webView, WKNavigationAction navigationAction, WKWebpagePreferences preferences, @Block VoidBlock2<WKNavigationActionPolicy, WKWebpagePreferences> decisionHandler);
    @Method(selector = "webView:decidePolicyForNavigationResponse:decisionHandler:")
    public native void decidePolicyForNavigationResponse(WKWebView webView, WKNavigationResponse navigationResponse, @Block VoidBlock1<WKNavigationResponsePolicy> decisionHandler);
    @Method(selector = "webView:didStartProvisionalNavigation:")
    public native void didStartProvisionalNavigation(WKWebView webView, WKNavigation navigation);
    @Method(selector = "webView:didReceiveServerRedirectForProvisionalNavigation:")
    public native void didReceiveServerRedirectForProvisionalNavigation(WKWebView webView, WKNavigation navigation);
    @Method(selector = "webView:didCommitNavigation:")
    public native void didCommitNavigation(WKWebView webView, WKNavigation navigation);
    @Method(selector = "webView:didReceiveAuthenticationChallenge:completionHandler:")
    public native void didReceiveAuthenticationChallenge(WKWebView webView, NSURLAuthenticationChallenge challenge, @Block VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential> completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "webViewWebContentProcessDidTerminate:")
    public native void webContentProcessDidTerminate(WKWebView webView);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "webView:authenticationChallenge:shouldAllowDeprecatedTLS:")
    public native void shouldAllowDeprecatedTLS(WKWebView webView, NSURLAuthenticationChallenge challenge, @Block VoidBooleanBlock decisionHandler);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "webView:navigationAction:didBecomeDownload:")
    public native void didBecomeDownload(WKWebView webView, WKNavigationAction navigationAction, WKDownload download);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "webView:navigationResponse:didBecomeDownload:")
    public native void didBecomeDownload(WKWebView webView, WKNavigationResponse navigationResponse, WKDownload download);
    /*</methods>*/
}
