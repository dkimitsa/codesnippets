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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DTBAdDispatcher/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements WKNavigationDelegate/*</implements>*/ {

    /*<ptr>*/public static class DTBAdDispatcherPtr extends Ptr<DTBAdDispatcher, DTBAdDispatcherPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DTBAdDispatcher.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public DTBAdDispatcher() {}
    protected DTBAdDispatcher(Handle h, long handle) { super(h, handle); }
    protected DTBAdDispatcher(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adView")
    public native DTBAdView getAdView();
    @Property(selector = "setAdView:", strongRef = true)
    public native void setAdView(DTBAdView v);
    @Property(selector = "currentState")
    public native DTBAdState getCurrentState();
    @Property(selector = "setCurrentState:")
    public native void setCurrentState(DTBAdState v);
    @Property(selector = "placementType")
    public native DTBAdPlacementType getPlacementType();
    @Property(selector = "setPlacementType:")
    public native void setPlacementType(DTBAdPlacementType v);
    @Property(selector = "defaultPosition")
    public native @ByVal CGRect getDefaultPosition();
    @Property(selector = "setDefaultPosition:")
    public native void setDefaultPosition(@ByVal CGRect v);
    @Property(selector = "currentPosition")
    public native @ByVal CGRect getCurrentPosition();
    @Property(selector = "setCurrentPosition:")
    public native void setCurrentPosition(@ByVal CGRect v);
    @Property(selector = "maxSize")
    public native @ByVal CGSize getMaxSize();
    @Property(selector = "setMaxSize:")
    public native void setMaxSize(@ByVal CGSize v);
    @Property(selector = "screenSize")
    public native @ByVal CGSize getScreenSize();
    @Property(selector = "setScreenSize:")
    public native void setScreenSize(@ByVal CGSize v);
    @Property(selector = "currentSize")
    public native @ByVal CGSize getCurrentSize();
    @Property(selector = "setCurrentSize:")
    public native void setCurrentSize(@ByVal CGSize v);
    @Property(selector = "pageLoaded")
    public native boolean isPageLoaded();
    @Property(selector = "setPageLoaded:")
    public native void setPageLoaded(boolean v);
    @Property(selector = "closeButton")
    public native UIButton getCloseButton();
    @Property(selector = "setCloseButton:")
    public native void setCloseButton(UIButton v);
    @Property(selector = "currentOrientation")
    public native String getCurrentOrientation();
    @Property(selector = "setCurrentOrientation:")
    public native void setCurrentOrientation(String v);
    @Property(selector = "useCustomClose")
    public native boolean isUseCustomClose();
    @Property(selector = "setUseCustomClose:")
    public native void setUseCustomClose(boolean v);
    @Property(selector = "ignoreLogEventsForExposureChange")
    public native boolean isIgnoreLogEventsForExposureChange();
    @Property(selector = "setIgnoreLogEventsForExposureChange:")
    public native void setIgnoreLogEventsForExposureChange(boolean v);
    @Property(selector = "omSdkHelper")
    public native APSOmSdkHelper getOmSdkHelper();
    @Property(selector = "setOmSdkHelper:")
    public native void setOmSdkHelper(APSOmSdkHelper v);
    @Property(selector = "customCloseDelegate")
    public native DTBUseCustomCloseDelegate getCustomCloseDelegate();
    @Property(selector = "setCustomCloseDelegate:", strongRef = true)
    public native void setCustomCloseDelegate(DTBUseCustomCloseDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "evaluateJavaScriptFromString:")
    public native void evaluateJavaScriptFromString(String script);
    @Method(selector = "prepareMRAID")
    public native void prepareMRAID();
    @Method(selector = "fireSetSupportPropertiesEvent")
    public native void fireSetSupportPropertiesEvent();
    @Method(selector = "firePlacementTypeChangeEvent:")
    public native void firePlacementTypeChangeEvent(DTBAdPlacementType pType);
    @Method(selector = "fireCurrentPositionEvent")
    public native void fireCurrentPositionEvent();
    @Method(selector = "fireDefaultPositionEvent")
    public native void fireDefaultPositionEvent();
    @Method(selector = "fireSetStateEvent:")
    public native void fireSetStateEvent(DTBAdState cState);
    @Method(selector = "fireSetMaxSizeEvent")
    public native void fireSetMaxSizeEvent();
    @Method(selector = "fireScreenSizeEvent")
    public native void fireScreenSizeEvent();
    @Method(selector = "fireSetCurrentOrientationEvent")
    public native void fireSetCurrentOrientationEvent();
    @Method(selector = "onOpenUrl:")
    public native void onOpenUrl(NSURL url);
    @Method(selector = "fireErrorEvent:forAction:")
    public native void fireErrorEvent(String errorMessage, String action);
    @Method(selector = "fireReadyEvent")
    public native void fireReadyEvent();
    @Method(selector = "fireSizeChangeEvent")
    public native void fireSizeChangeEvent();
    @Method(selector = "fireStateChangeEvent")
    public native void fireStateChangeEvent();
    @Method(selector = "fireExposureChangeEvent:withVisibleRect:")
    public native void fireExposureChangeEvent(int exposureChange, @ByVal CGRect visibleRect);
    @Method(selector = "fireNativeCommandCompleted:")
    public native void fireNativeCommandCompleted(String command);
    @Method(selector = "executeOpen:")
    public native void executeOpen(String url);
    @Method(selector = "executeClose")
    public native void executeClose();
    @Method(selector = "executeResize:")
    public native void executeResize(NSDictionary<?, ?> params);
    @Method(selector = "executeUnload")
    public native void executeUnload();
    @Method(selector = "executeExpand:")
    public native void executeExpand(NSDictionary<?, ?> params);
    @Method(selector = "useCustomClose:")
    public native void useCustomClose(NSDictionary<?, ?> params);
    @Method(selector = "executeJSReadyCommand")
    public native void executeJSReadyCommand();
    @Method(selector = "cleanup")
    public native void cleanup();
    @Method(selector = "isValidTapEventForRedirection")
    public native boolean isValidTapEventForRedirection();
    @Method(selector = "adViewDidDisappear:")
    public native void adViewDidDisappear(DTBAdView adview);
    @Method(selector = "addCloseIndicator:toView:")
    public native void addCloseIndicator(@ByVal CGPoint closeCoordinates, UIView supView);
    @Method(selector = "updateCurrentOrientationProperties")
    public native void updateCurrentOrientationProperties();
    @Method(selector = "orientationDidChange:")
    public native void orientationDidChange(String updatedOrientation);
    @Method(selector = "onViewabilityChanged:")
    public native void onViewabilityChanged(boolean changedVal);
    @Method(selector = "impressionFired")
    public native void impressionFired();
    @Method(selector = "adClicked")
    public native void adClicked();
    @Method(selector = "videoPlaybackCompleted")
    public native void videoPlaybackCompleted();
    @Method(selector = "adDidLoad")
    public native void adDidLoad();
    @Method(selector = "adFailedToLoad")
    public native void adFailedToLoad();
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
    @Method(selector = "webView:didFailProvisionalNavigation:withError:")
    public native void didFailProvisionalNavigation(WKWebView webView, WKNavigation navigation, NSError error);
    @Method(selector = "webView:didCommitNavigation:")
    public native void didCommitNavigation(WKWebView webView, WKNavigation navigation);
    @Method(selector = "webView:didFinishNavigation:")
    public native void didFinishNavigation(WKWebView webView, WKNavigation navigation);
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
    /*</methods>*/
}
