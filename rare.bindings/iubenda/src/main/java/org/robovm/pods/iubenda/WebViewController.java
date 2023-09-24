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
package org.robovm.pods.iubenda;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC7iubenda17WebViewController")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WebViewController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements WKNavigationDelegate, WKScriptMessageHandler, WKUIDelegate/*</implements>*/ {

    /*<ptr>*/public static class WebViewControllerPtr extends Ptr<WebViewController, WebViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WebViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected WebViewController() {}
    protected WebViewController(Handle h, long handle) { super(h, handle); }
    protected WebViewController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native WebViewControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(WebViewControllerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "userContentController:didReceiveScriptMessage:")
    public native void didReceiveScriptMessage(WKUserContentController userContentController, WKScriptMessage message);
    @Method(selector = "webView:decidePolicyForNavigationAction:decisionHandler:")
    public native void decidePolicyForNavigationAction(WKWebView webView, WKNavigationAction navigationAction, @Block VoidBlock1<WKNavigationActionPolicy> decisionHandler);
    @Method(selector = "webView:createWebViewWithConfiguration:forNavigationAction:windowFeatures:")
    public native WKWebView createWebView(WKWebView webView, WKWebViewConfiguration configuration, WKNavigationAction navigationAction, WKWindowFeatures windowFeatures);
    @Method(selector = "webView:decidePolicyForNavigationResponse:decisionHandler:")
    public native void decidePolicyForNavigationResponse(WKWebView webView, WKNavigationResponse navigationResponse, @Block VoidBlock1<WKNavigationResponsePolicy> decisionHandler);
    @Method(selector = "webView:didStartProvisionalNavigation:")
    public native void didStartProvisionalNavigation(WKWebView webView, WKNavigation navigation);
    @Method(selector = "webView:didFinishNavigation:")
    public native void didFinishNavigation(WKWebView webView, WKNavigation navigation);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "webView:decidePolicyForNavigationAction:preferences:decisionHandler:")
    public native void decidePolicyForNavigationAction(WKWebView webView, WKNavigationAction navigationAction, WKWebpagePreferences preferences, @Block VoidBlock2<WKNavigationActionPolicy, WKWebpagePreferences> decisionHandler);
    @Method(selector = "webView:didReceiveServerRedirectForProvisionalNavigation:")
    public native void didReceiveServerRedirectForProvisionalNavigation(WKWebView webView, WKNavigation navigation);
    @Method(selector = "webView:didFailProvisionalNavigation:withError:")
    public native void didFailProvisionalNavigation(WKWebView webView, WKNavigation navigation, NSError error);
    @Method(selector = "webView:didCommitNavigation:")
    public native void didCommitNavigation(WKWebView webView, WKNavigation navigation);
    @Method(selector = "webView:didFailNavigation:withError:")
    public native void didFailNavigation(WKWebView webView, WKNavigation navigation, NSError error);
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
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "webViewDidClose:")
    public native void didClose(WKWebView webView);
    @Method(selector = "webView:runJavaScriptAlertPanelWithMessage:initiatedByFrame:completionHandler:")
    public native void runJavaScriptAlertPanel(WKWebView webView, String message, WKFrameInfo frame, @Block Runnable completionHandler);
    @Method(selector = "webView:runJavaScriptConfirmPanelWithMessage:initiatedByFrame:completionHandler:")
    public native void runJavaScriptConfirmPanel(WKWebView webView, String message, WKFrameInfo frame, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "webView:runJavaScriptTextInputPanelWithPrompt:defaultText:initiatedByFrame:completionHandler:")
    public native void runJavaScriptTextInputPanel(WKWebView webView, String prompt, String defaultText, WKFrameInfo frame, @Block VoidBlock1<NSString> completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "webView:requestMediaCapturePermissionForOrigin:initiatedByFrame:type:decisionHandler:")
    public native void requestMediaCapturePermission(WKWebView webView, WKSecurityOrigin origin, WKFrameInfo frame, WKMediaCaptureType type, @Block VoidBlock1<WKPermissionDecision> decisionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "webView:requestDeviceOrientationAndMotionPermissionForOrigin:initiatedByFrame:decisionHandler:")
    public native void requestDeviceOrientationAndMotionPermission(WKWebView webView, WKSecurityOrigin origin, WKFrameInfo frame, @Block VoidBlock1<WKPermissionDecision> decisionHandler);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use webView:contextMenuConfigurationForElement:completionHandler:
     */
    @Deprecated
    @Method(selector = "webView:shouldPreviewElement:")
    public native boolean shouldPreviewElement(WKWebView webView, WKPreviewElementInfo elementInfo);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use webView:contextMenuConfigurationForElement:completionHandler:
     */
    @Deprecated
    @Method(selector = "webView:previewingViewControllerForElement:defaultActions:")
    public native UIViewController getPreviewingViewControllerForElement(WKWebView webView, WKPreviewElementInfo elementInfo, NSArray<?> previewActions);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use webView:contextMenuForElement:willCommitWithAnimator:
     */
    @Deprecated
    @Method(selector = "webView:commitPreviewingViewController:")
    public native void commitPreviewingViewController(WKWebView webView, UIViewController previewingViewController);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "webView:contextMenuConfigurationForElement:completionHandler:")
    public native void getContextMenuConfiguration(WKWebView webView, WKContextMenuElementInfo elementInfo, @Block VoidBlock1<UIContextMenuConfiguration> completionHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "webView:contextMenuWillPresentForElement:")
    public native void contextMenuWillPresent(WKWebView webView, WKContextMenuElementInfo elementInfo);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "webView:contextMenuForElement:willCommitWithAnimator:")
    public native void getContextMenu(WKWebView webView, WKContextMenuElementInfo elementInfo, UIContextMenuInteractionCommitAnimating animator);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "webView:contextMenuDidEndForElement:")
    public native void contextMenuDidEnd(WKWebView webView, WKContextMenuElementInfo elementInfo);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "webView:showLockdownModeFirstUseMessage:completionHandler:")
    public native void showLockdownModeFirstUseMessage(WKWebView webView, String message, @Block VoidBlock1<WKDialogResult> completionHandler);
    /*</methods>*/
}
