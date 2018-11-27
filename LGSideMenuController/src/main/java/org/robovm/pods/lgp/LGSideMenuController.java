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
package org.robovm.pods.lgp;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LGSideMenuController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LGSideMenuControllerPtr extends Ptr<LGSideMenuController, LGSideMenuControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LGSideMenuController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected LGSideMenuController() {}
    protected LGSideMenuController(Handle h, long handle) { super(h, handle); }
    protected LGSideMenuController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRootViewController:")
    public LGSideMenuController(UIViewController rootViewController) { super((SkipInit) null); initObject(init(rootViewController)); }
    @Method(selector = "initWithRootViewController:leftViewController:rightViewController:")
    public LGSideMenuController(UIViewController rootViewController, UIViewController leftViewController, UIViewController rightViewController) { super((SkipInit) null); initObject(init(rootViewController, leftViewController, rightViewController)); }
    @Method(selector = "initWithRootView:")
    public LGSideMenuController(UIView rootView) { super((SkipInit) null); initObject(init(rootView)); }
    @Method(selector = "initWithRootView:leftView:rightView:")
    public LGSideMenuController(UIView rootView, UIView leftView, UIView rightView) { super((SkipInit) null); initObject(init(rootView, leftView, rightView)); }
    @Method(selector = "initWithNibName:bundle:")
    public LGSideMenuController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public LGSideMenuController(NSCoder aDecoder) { super(aDecoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rootViewController")
    public native UIViewController getRootViewController();
    @Property(selector = "setRootViewController:")
    public native void setRootViewController(UIViewController v);
    @Property(selector = "leftViewController")
    public native UIViewController getLeftViewController();
    @Property(selector = "setLeftViewController:")
    public native void setLeftViewController(UIViewController v);
    @Property(selector = "rightViewController")
    public native UIViewController getRightViewController();
    @Property(selector = "setRightViewController:")
    public native void setRightViewController(UIViewController v);
    @Property(selector = "rootView")
    public native UIView getRootView();
    @Property(selector = "setRootView:")
    public native void setRootView(UIView v);
    @Property(selector = "leftView")
    public native UIView getLeftView();
    @Property(selector = "setLeftView:")
    public native void setLeftView(UIView v);
    @Property(selector = "rightView")
    public native UIView getRightView();
    @Property(selector = "setRightView:")
    public native void setRightView(UIView v);
    @Property(selector = "rootViewContainer")
    public native UIView getRootViewContainer();
    @Property(selector = "leftViewContainer")
    public native UIView getLeftViewContainer();
    @Property(selector = "rightViewContainer")
    public native UIView getRightViewContainer();
    @Property(selector = "leftViewBackgroundView")
    public native UIImageView getLeftViewBackgroundView();
    @Property(selector = "rightViewBackgroundView")
    public native UIImageView getRightViewBackgroundView();
    @Property(selector = "tapGesture")
    public native UITapGestureRecognizer getTapGesture();
    @Property(selector = "panGesture")
    public native UIPanGestureRecognizer getPanGesture();
    @Property(selector = "leftViewWidth")
    public native @MachineSizedFloat double getLeftViewWidth();
    @Property(selector = "setLeftViewWidth:")
    public native void setLeftViewWidth(@MachineSizedFloat double v);
    @Property(selector = "rightViewWidth")
    public native @MachineSizedFloat double getRightViewWidth();
    @Property(selector = "setRightViewWidth:")
    public native void setRightViewWidth(@MachineSizedFloat double v);
    @Property(selector = "leftViewPresentationStyle")
    public native LGSideMenuPresentationStyle getLeftViewPresentationStyle();
    @Property(selector = "setLeftViewPresentationStyle:")
    public native void setLeftViewPresentationStyle(LGSideMenuPresentationStyle v);
    @Property(selector = "rightViewPresentationStyle")
    public native LGSideMenuPresentationStyle getRightViewPresentationStyle();
    @Property(selector = "setRightViewPresentationStyle:")
    public native void setRightViewPresentationStyle(LGSideMenuPresentationStyle v);
    @Property(selector = "leftViewAlwaysVisibleOptions")
    public native LGSideMenuAlwaysVisibleOptions getLeftViewAlwaysVisibleOptions();
    @Property(selector = "setLeftViewAlwaysVisibleOptions:")
    public native void setLeftViewAlwaysVisibleOptions(LGSideMenuAlwaysVisibleOptions v);
    @Property(selector = "rightViewAlwaysVisibleOptions")
    public native LGSideMenuAlwaysVisibleOptions getRightViewAlwaysVisibleOptions();
    @Property(selector = "setRightViewAlwaysVisibleOptions:")
    public native void setRightViewAlwaysVisibleOptions(LGSideMenuAlwaysVisibleOptions v);
    @Property(selector = "isLeftViewHidesOnTouch")
    public native boolean isLeftViewHidesOnTouch();
    @Property(selector = "setLeftViewHidesOnTouch:")
    public native void setLeftViewHidesOnTouch(boolean v);
    @Property(selector = "isRightViewHidesOnTouch")
    public native boolean isRightViewHidesOnTouch();
    @Property(selector = "setRightViewHidesOnTouch:")
    public native void setRightViewHidesOnTouch(boolean v);
    @Property(selector = "isLeftViewSwipeGestureEnabled")
    public native boolean isLeftViewSwipeGestureEnabled();
    @Property(selector = "setLeftViewSwipeGestureEnabled:")
    public native void setLeftViewSwipeGestureEnabled(boolean v);
    @Property(selector = "isRightViewSwipeGestureEnabled")
    public native boolean isRightViewSwipeGestureEnabled();
    @Property(selector = "setRightViewSwipeGestureEnabled:")
    public native void setRightViewSwipeGestureEnabled(boolean v);
    @Property(selector = "isLeftViewSwipeGestureDisabled")
    public native boolean isLeftViewSwipeGestureDisabled();
    @Property(selector = "setLeftViewSwipeGestureDisabled:")
    public native void setLeftViewSwipeGestureDisabled(boolean v);
    @Property(selector = "isRightViewSwipeGestureDisabled")
    public native boolean isRightViewSwipeGestureDisabled();
    @Property(selector = "setRightViewSwipeGestureDisabled:")
    public native void setRightViewSwipeGestureDisabled(boolean v);
    @Property(selector = "swipeGestureArea")
    public native LGSideMenuSwipeGestureArea getSwipeGestureArea();
    @Property(selector = "setSwipeGestureArea:")
    public native void setSwipeGestureArea(LGSideMenuSwipeGestureArea v);
    @Property(selector = "leftViewSwipeGestureRange")
    public native @ByVal LGSideMenuSwipeGestureRange getLeftViewSwipeGestureRange();
    @Property(selector = "setLeftViewSwipeGestureRange:")
    public native void setLeftViewSwipeGestureRange(@ByVal LGSideMenuSwipeGestureRange v);
    @Property(selector = "rightViewSwipeGestureRange")
    public native @ByVal LGSideMenuSwipeGestureRange getRightViewSwipeGestureRange();
    @Property(selector = "setRightViewSwipeGestureRange:")
    public native void setRightViewSwipeGestureRange(@ByVal LGSideMenuSwipeGestureRange v);
    @Property(selector = "leftViewAnimationDuration")
    public native double getLeftViewAnimationDuration();
    @Property(selector = "setLeftViewAnimationDuration:")
    public native void setLeftViewAnimationDuration(double v);
    @Property(selector = "rightViewAnimationDuration")
    public native double getRightViewAnimationDuration();
    @Property(selector = "setRightViewAnimationDuration:")
    public native void setRightViewAnimationDuration(double v);
    @Property(selector = "shouldHideLeftViewAnimated")
    public native boolean shouldHideLeftViewAnimated();
    @Property(selector = "setShouldHideLeftViewAnimated:")
    public native void setShouldHideLeftViewAnimated(boolean v);
    @Property(selector = "shouldHideRightViewAnimated")
    public native boolean shouldHideRightViewAnimated();
    @Property(selector = "setShouldHideRightViewAnimated:")
    public native void setShouldHideRightViewAnimated(boolean v);
    @Property(selector = "isLeftViewEnabled")
    public native boolean isLeftViewEnabled();
    @Property(selector = "setLeftViewEnabled:")
    public native void setLeftViewEnabled(boolean v);
    @Property(selector = "isRightViewEnabled")
    public native boolean isRightViewEnabled();
    @Property(selector = "setRightViewEnabled:")
    public native void setRightViewEnabled(boolean v);
    @Property(selector = "isLeftViewDisabled")
    public native boolean isLeftViewDisabled();
    @Property(selector = "setLeftViewDisabled:")
    public native void setLeftViewDisabled(boolean v);
    @Property(selector = "isRightViewDisabled")
    public native boolean isRightViewDisabled();
    @Property(selector = "setRightViewDisabled:")
    public native void setRightViewDisabled(boolean v);
    @Property(selector = "leftViewBackgroundColor")
    public native UIColor getLeftViewBackgroundColor();
    @Property(selector = "setLeftViewBackgroundColor:")
    public native void setLeftViewBackgroundColor(UIColor v);
    @Property(selector = "rightViewBackgroundColor")
    public native UIColor getRightViewBackgroundColor();
    @Property(selector = "setRightViewBackgroundColor:")
    public native void setRightViewBackgroundColor(UIColor v);
    @Property(selector = "leftViewBackgroundImage")
    public native UIImage getLeftViewBackgroundImage();
    @Property(selector = "setLeftViewBackgroundImage:")
    public native void setLeftViewBackgroundImage(UIImage v);
    @Property(selector = "rightViewBackgroundImage")
    public native UIImage getRightViewBackgroundImage();
    @Property(selector = "setRightViewBackgroundImage:")
    public native void setRightViewBackgroundImage(UIImage v);
    @Property(selector = "leftViewBackgroundBlurEffect")
    public native UIBlurEffect getLeftViewBackgroundBlurEffect();
    @Property(selector = "setLeftViewBackgroundBlurEffect:")
    public native void setLeftViewBackgroundBlurEffect(UIBlurEffect v);
    @Property(selector = "rightViewBackgroundBlurEffect")
    public native UIBlurEffect getRightViewBackgroundBlurEffect();
    @Property(selector = "setRightViewBackgroundBlurEffect:")
    public native void setRightViewBackgroundBlurEffect(UIBlurEffect v);
    @Property(selector = "leftViewBackgroundAlpha")
    public native @MachineSizedFloat double getLeftViewBackgroundAlpha();
    @Property(selector = "setLeftViewBackgroundAlpha:")
    public native void setLeftViewBackgroundAlpha(@MachineSizedFloat double v);
    @Property(selector = "rightViewBackgroundAlpha")
    public native @MachineSizedFloat double getRightViewBackgroundAlpha();
    @Property(selector = "setRightViewBackgroundAlpha:")
    public native void setRightViewBackgroundAlpha(@MachineSizedFloat double v);
    @Property(selector = "rootViewLayerBorderColor")
    public native UIColor getRootViewLayerBorderColor();
    @Property(selector = "setRootViewLayerBorderColor:")
    public native void setRootViewLayerBorderColor(UIColor v);
    @Property(selector = "leftViewLayerBorderColor")
    public native UIColor getLeftViewLayerBorderColor();
    @Property(selector = "setLeftViewLayerBorderColor:")
    public native void setLeftViewLayerBorderColor(UIColor v);
    @Property(selector = "rightViewLayerBorderColor")
    public native UIColor getRightViewLayerBorderColor();
    @Property(selector = "setRightViewLayerBorderColor:")
    public native void setRightViewLayerBorderColor(UIColor v);
    @Property(selector = "rootViewLayerBorderWidth")
    public native @MachineSizedFloat double getRootViewLayerBorderWidth();
    @Property(selector = "setRootViewLayerBorderWidth:")
    public native void setRootViewLayerBorderWidth(@MachineSizedFloat double v);
    @Property(selector = "leftViewLayerBorderWidth")
    public native @MachineSizedFloat double getLeftViewLayerBorderWidth();
    @Property(selector = "setLeftViewLayerBorderWidth:")
    public native void setLeftViewLayerBorderWidth(@MachineSizedFloat double v);
    @Property(selector = "rightViewLayerBorderWidth")
    public native @MachineSizedFloat double getRightViewLayerBorderWidth();
    @Property(selector = "setRightViewLayerBorderWidth:")
    public native void setRightViewLayerBorderWidth(@MachineSizedFloat double v);
    @Property(selector = "rootViewLayerShadowColor")
    public native UIColor getRootViewLayerShadowColor();
    @Property(selector = "setRootViewLayerShadowColor:")
    public native void setRootViewLayerShadowColor(UIColor v);
    @Property(selector = "leftViewLayerShadowColor")
    public native UIColor getLeftViewLayerShadowColor();
    @Property(selector = "setLeftViewLayerShadowColor:")
    public native void setLeftViewLayerShadowColor(UIColor v);
    @Property(selector = "rightViewLayerShadowColor")
    public native UIColor getRightViewLayerShadowColor();
    @Property(selector = "setRightViewLayerShadowColor:")
    public native void setRightViewLayerShadowColor(UIColor v);
    @Property(selector = "rootViewLayerShadowRadius")
    public native @MachineSizedFloat double getRootViewLayerShadowRadius();
    @Property(selector = "setRootViewLayerShadowRadius:")
    public native void setRootViewLayerShadowRadius(@MachineSizedFloat double v);
    @Property(selector = "leftViewLayerShadowRadius")
    public native @MachineSizedFloat double getLeftViewLayerShadowRadius();
    @Property(selector = "setLeftViewLayerShadowRadius:")
    public native void setLeftViewLayerShadowRadius(@MachineSizedFloat double v);
    @Property(selector = "rightViewLayerShadowRadius")
    public native @MachineSizedFloat double getRightViewLayerShadowRadius();
    @Property(selector = "setRightViewLayerShadowRadius:")
    public native void setRightViewLayerShadowRadius(@MachineSizedFloat double v);
    @Property(selector = "rootViewCoverBlurEffectForLeftView")
    public native UIBlurEffect getRootViewCoverBlurEffectForLeftView();
    @Property(selector = "setRootViewCoverBlurEffectForLeftView:")
    public native void setRootViewCoverBlurEffectForLeftView(UIBlurEffect v);
    @Property(selector = "rootViewCoverBlurEffectForRightView")
    public native UIBlurEffect getRootViewCoverBlurEffectForRightView();
    @Property(selector = "setRootViewCoverBlurEffectForRightView:")
    public native void setRootViewCoverBlurEffectForRightView(UIBlurEffect v);
    @Property(selector = "leftViewCoverBlurEffect")
    public native UIBlurEffect getLeftViewCoverBlurEffect();
    @Property(selector = "setLeftViewCoverBlurEffect:")
    public native void setLeftViewCoverBlurEffect(UIBlurEffect v);
    @Property(selector = "rightViewCoverBlurEffect")
    public native UIBlurEffect getRightViewCoverBlurEffect();
    @Property(selector = "setRightViewCoverBlurEffect:")
    public native void setRightViewCoverBlurEffect(UIBlurEffect v);
    @Property(selector = "rootViewCoverAlphaForLeftView")
    public native @MachineSizedFloat double getRootViewCoverAlphaForLeftView();
    @Property(selector = "setRootViewCoverAlphaForLeftView:")
    public native void setRootViewCoverAlphaForLeftView(@MachineSizedFloat double v);
    @Property(selector = "rootViewCoverAlphaForRightView")
    public native @MachineSizedFloat double getRootViewCoverAlphaForRightView();
    @Property(selector = "setRootViewCoverAlphaForRightView:")
    public native void setRootViewCoverAlphaForRightView(@MachineSizedFloat double v);
    @Property(selector = "leftViewCoverAlpha")
    public native @MachineSizedFloat double getLeftViewCoverAlpha();
    @Property(selector = "setLeftViewCoverAlpha:")
    public native void setLeftViewCoverAlpha(@MachineSizedFloat double v);
    @Property(selector = "rightViewCoverAlpha")
    public native @MachineSizedFloat double getRightViewCoverAlpha();
    @Property(selector = "setRightViewCoverAlpha:")
    public native void setRightViewCoverAlpha(@MachineSizedFloat double v);
    @Property(selector = "rootViewShouldAutorotate")
    public native boolean isRootViewShouldAutorotate();
    @Property(selector = "setRootViewShouldAutorotate:")
    public native void setRootViewShouldAutorotate(boolean v);
    @Property(selector = "isRootViewStatusBarHidden")
    public native boolean isRootViewStatusBarHidden();
    @Property(selector = "setRootViewStatusBarHidden:")
    public native void setRootViewStatusBarHidden(boolean v);
    @Property(selector = "isLeftViewStatusBarHidden")
    public native boolean isLeftViewStatusBarHidden();
    @Property(selector = "setLeftViewStatusBarHidden:")
    public native void setLeftViewStatusBarHidden(boolean v);
    @Property(selector = "isRightViewStatusBarHidden")
    public native boolean isRightViewStatusBarHidden();
    @Property(selector = "setRightViewStatusBarHidden:")
    public native void setRightViewStatusBarHidden(boolean v);
    @Property(selector = "rootViewStatusBarStyle")
    public native UIStatusBarStyle getRootViewStatusBarStyle();
    @Property(selector = "setRootViewStatusBarStyle:")
    public native void setRootViewStatusBarStyle(UIStatusBarStyle v);
    @Property(selector = "leftViewStatusBarStyle")
    public native UIStatusBarStyle getLeftViewStatusBarStyle();
    @Property(selector = "setLeftViewStatusBarStyle:")
    public native void setLeftViewStatusBarStyle(UIStatusBarStyle v);
    @Property(selector = "rightViewStatusBarStyle")
    public native UIStatusBarStyle getRightViewStatusBarStyle();
    @Property(selector = "setRightViewStatusBarStyle:")
    public native void setRightViewStatusBarStyle(UIStatusBarStyle v);
    @Property(selector = "rootViewStatusBarUpdateAnimation")
    public native UIStatusBarAnimation getRootViewStatusBarUpdateAnimation();
    @Property(selector = "setRootViewStatusBarUpdateAnimation:")
    public native void setRootViewStatusBarUpdateAnimation(UIStatusBarAnimation v);
    @Property(selector = "leftViewStatusBarUpdateAnimation")
    public native UIStatusBarAnimation getLeftViewStatusBarUpdateAnimation();
    @Property(selector = "setLeftViewStatusBarUpdateAnimation:")
    public native void setLeftViewStatusBarUpdateAnimation(UIStatusBarAnimation v);
    @Property(selector = "rightViewStatusBarUpdateAnimation")
    public native UIStatusBarAnimation getRightViewStatusBarUpdateAnimation();
    @Property(selector = "setRightViewStatusBarUpdateAnimation:")
    public native void setRightViewStatusBarUpdateAnimation(UIStatusBarAnimation v);
    @Property(selector = "rootViewCoverColorForLeftView")
    public native UIColor getRootViewCoverColorForLeftView();
    @Property(selector = "setRootViewCoverColorForLeftView:")
    public native void setRootViewCoverColorForLeftView(UIColor v);
    @Property(selector = "rootViewCoverColorForRightView")
    public native UIColor getRootViewCoverColorForRightView();
    @Property(selector = "setRootViewCoverColorForRightView:")
    public native void setRootViewCoverColorForRightView(UIColor v);
    @Property(selector = "leftViewCoverColor")
    public native UIColor getLeftViewCoverColor();
    @Property(selector = "setLeftViewCoverColor:")
    public native void setLeftViewCoverColor(UIColor v);
    @Property(selector = "rightViewCoverColor")
    public native UIColor getRightViewCoverColor();
    @Property(selector = "setRightViewCoverColor:")
    public native void setRightViewCoverColor(UIColor v);
    @Property(selector = "rootViewScaleForLeftView")
    public native @MachineSizedFloat double getRootViewScaleForLeftView();
    @Property(selector = "setRootViewScaleForLeftView:")
    public native void setRootViewScaleForLeftView(@MachineSizedFloat double v);
    @Property(selector = "rootViewScaleForRightView")
    public native @MachineSizedFloat double getRootViewScaleForRightView();
    @Property(selector = "setRootViewScaleForRightView:")
    public native void setRootViewScaleForRightView(@MachineSizedFloat double v);
    @Property(selector = "leftViewInitialScale")
    public native @MachineSizedFloat double getLeftViewInitialScale();
    @Property(selector = "setLeftViewInitialScale:")
    public native void setLeftViewInitialScale(@MachineSizedFloat double v);
    @Property(selector = "rightViewInitialScale")
    public native @MachineSizedFloat double getRightViewInitialScale();
    @Property(selector = "setRightViewInitialScale:")
    public native void setRightViewInitialScale(@MachineSizedFloat double v);
    @Property(selector = "leftViewInitialOffsetX")
    public native @MachineSizedFloat double getLeftViewInitialOffsetX();
    @Property(selector = "setLeftViewInitialOffsetX:")
    public native void setLeftViewInitialOffsetX(@MachineSizedFloat double v);
    @Property(selector = "rightViewInitialOffsetX")
    public native @MachineSizedFloat double getRightViewInitialOffsetX();
    @Property(selector = "setRightViewInitialOffsetX:")
    public native void setRightViewInitialOffsetX(@MachineSizedFloat double v);
    @Property(selector = "leftViewBackgroundImageInitialScale")
    public native @MachineSizedFloat double getLeftViewBackgroundImageInitialScale();
    @Property(selector = "setLeftViewBackgroundImageInitialScale:")
    public native void setLeftViewBackgroundImageInitialScale(@MachineSizedFloat double v);
    @Property(selector = "rightViewBackgroundImageInitialScale")
    public native @MachineSizedFloat double getRightViewBackgroundImageInitialScale();
    @Property(selector = "setRightViewBackgroundImageInitialScale:")
    public native void setRightViewBackgroundImageInitialScale(@MachineSizedFloat double v);
    @Property(selector = "leftViewBackgroundImageFinalScale")
    public native @MachineSizedFloat double getLeftViewBackgroundImageFinalScale();
    @Property(selector = "setLeftViewBackgroundImageFinalScale:")
    public native void setLeftViewBackgroundImageFinalScale(@MachineSizedFloat double v);
    @Property(selector = "rightViewBackgroundImageFinalScale")
    public native @MachineSizedFloat double getRightViewBackgroundImageFinalScale();
    @Property(selector = "setRightViewBackgroundImageFinalScale:")
    public native void setRightViewBackgroundImageFinalScale(@MachineSizedFloat double v);
    @Property(selector = "isLeftViewShowing")
    public native boolean isLeftViewShowing();
    @Property(selector = "isRightViewShowing")
    public native boolean isRightViewShowing();
    @Property(selector = "isLeftViewHidden")
    public native boolean isLeftViewHidden();
    @Property(selector = "isRightViewHidden")
    public native boolean isRightViewHidden();
    @Property(selector = "isLeftViewVisible")
    public native boolean isLeftViewVisible();
    @Property(selector = "isRightViewVisible")
    public native boolean isRightViewVisible();
    @Property(selector = "isLeftViewAlwaysVisibleForCurrentOrientation")
    public native boolean isLeftViewAlwaysVisibleForCurrentOrientation();
    @Property(selector = "isRightViewAlwaysVisibleForCurrentOrientation")
    public native boolean isRightViewAlwaysVisibleForCurrentOrientation();
    @Property(selector = "willShowLeftView")
    public native @Block VoidBlock2<LGSideMenuController, UIView> getWillShowLeftView();
    @Property(selector = "setWillShowLeftView:")
    public native void setWillShowLeftView(@Block VoidBlock2<LGSideMenuController, UIView> v);
    @Property(selector = "didShowLeftView")
    public native @Block VoidBlock2<LGSideMenuController, UIView> getDidShowLeftView();
    @Property(selector = "setDidShowLeftView:")
    public native void setDidShowLeftView(@Block VoidBlock2<LGSideMenuController, UIView> v);
    @Property(selector = "willHideLeftView")
    public native @Block VoidBlock2<LGSideMenuController, UIView> getWillHideLeftView();
    @Property(selector = "setWillHideLeftView:")
    public native void setWillHideLeftView(@Block VoidBlock2<LGSideMenuController, UIView> v);
    @Property(selector = "didHideLeftView")
    public native @Block VoidBlock2<LGSideMenuController, UIView> getDidHideLeftView();
    @Property(selector = "setDidHideLeftView:")
    public native void setDidHideLeftView(@Block VoidBlock2<LGSideMenuController, UIView> v);
    @Property(selector = "willShowRightView")
    public native @Block VoidBlock2<LGSideMenuController, UIView> getWillShowRightView();
    @Property(selector = "setWillShowRightView:")
    public native void setWillShowRightView(@Block VoidBlock2<LGSideMenuController, UIView> v);
    @Property(selector = "didShowRightView")
    public native @Block VoidBlock2<LGSideMenuController, UIView> getDidShowRightView();
    @Property(selector = "setDidShowRightView:")
    public native void setDidShowRightView(@Block VoidBlock2<LGSideMenuController, UIView> v);
    @Property(selector = "willHideRightView")
    public native @Block VoidBlock2<LGSideMenuController, UIView> getWillHideRightView();
    @Property(selector = "setWillHideRightView:")
    public native void setWillHideRightView(@Block VoidBlock2<LGSideMenuController, UIView> v);
    @Property(selector = "didHideRightView")
    public native @Block VoidBlock2<LGSideMenuController, UIView> getDidHideRightView();
    @Property(selector = "setDidHideRightView:")
    public native void setDidHideRightView(@Block VoidBlock2<LGSideMenuController, UIView> v);
    @Property(selector = "showLeftViewAnimations")
    public native @Block VoidBlock3<LGSideMenuController, UIView, Double> getShowLeftViewAnimations();
    @Property(selector = "setShowLeftViewAnimations:")
    public native void setShowLeftViewAnimations(@Block VoidBlock3<LGSideMenuController, UIView, Double> v);
    @Property(selector = "hideLeftViewAnimations")
    public native @Block VoidBlock3<LGSideMenuController, UIView, Double> getHideLeftViewAnimations();
    @Property(selector = "setHideLeftViewAnimations:")
    public native void setHideLeftViewAnimations(@Block VoidBlock3<LGSideMenuController, UIView, Double> v);
    @Property(selector = "showRightViewAnimations")
    public native @Block VoidBlock3<LGSideMenuController, UIView, Double> getShowRightViewAnimations();
    @Property(selector = "setShowRightViewAnimations:")
    public native void setShowRightViewAnimations(@Block VoidBlock3<LGSideMenuController, UIView, Double> v);
    @Property(selector = "hideRightViewAnimations")
    public native @Block VoidBlock3<LGSideMenuController, UIView, Double> getHideRightViewAnimations();
    @Property(selector = "setHideRightViewAnimations:")
    public native void setHideRightViewAnimations(@Block VoidBlock3<LGSideMenuController, UIView, Double> v);
    @Property(selector = "delegate")
    public native LGSideMenuDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(LGSideMenuDelegate v);
    @Property(selector = "isShouldShowLeftView")
    public native boolean shouldShowLeftView();
    @Property(selector = "setShouldShowLeftView:")
    public native void setShouldShowLeftView(boolean v);
    @Property(selector = "isShouldShowRightView")
    public native boolean shouldShowRightView();
    @Property(selector = "setShouldShowRightView:")
    public native void setShouldShowRightView(boolean v);
    @Property(selector = "isLeftViewAlwaysVisible")
    public native boolean isLeftViewAlwaysVisible();
    @Property(selector = "isRightViewAlwaysVisible")
    public native boolean isRightViewAlwaysVisible();
    @Property(selector = "leftViewAnimationSpeed")
    public native double getLeftViewAnimationSpeed();
    @Property(selector = "setLeftViewAnimationSpeed:")
    public native void setLeftViewAnimationSpeed(double v);
    @Property(selector = "rightViewAnimationSpeed")
    public native double getRightViewAnimationSpeed();
    @Property(selector = "setRightViewAnimationSpeed:")
    public native void setRightViewAnimationSpeed(double v);
    @Property(selector = "showLeftViewAnimationsBlock")
    public native @Block VoidBlock3<LGSideMenuController, UIView, Double> getShowLeftViewAnimationsBlock();
    @Property(selector = "setShowLeftViewAnimationsBlock:")
    public native void setShowLeftViewAnimationsBlock(@Block VoidBlock3<LGSideMenuController, UIView, Double> v);
    @Property(selector = "hideLeftViewAnimationsBlock")
    public native @Block VoidBlock3<LGSideMenuController, UIView, Double> getHideLeftViewAnimationsBlock();
    @Property(selector = "setHideLeftViewAnimationsBlock:")
    public native void setHideLeftViewAnimationsBlock(@Block VoidBlock3<LGSideMenuController, UIView, Double> v);
    @Property(selector = "showRightViewAnimationsBlock")
    public native @Block VoidBlock3<LGSideMenuController, UIView, Double> getShowRightViewAnimationsBlock();
    @Property(selector = "setShowRightViewAnimationsBlock:")
    public native void setShowRightViewAnimationsBlock(@Block VoidBlock3<LGSideMenuController, UIView, Double> v);
    @Property(selector = "hideRightViewAnimationsBlock")
    public native @Block VoidBlock3<LGSideMenuController, UIView, Double> getHideRightViewAnimationsBlock();
    @Property(selector = "setHideRightViewAnimationsBlock:")
    public native void setHideRightViewAnimationsBlock(@Block VoidBlock3<LGSideMenuController, UIView, Double> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="LGSideMenuControllerVersionString", optional=true)
    public static native BytePtr getVersionString();
    @GlobalValue(symbol="LGSideMenuControllerVersionNumber", optional=true)
    public static native double getVersionNumber();
    @Library(Library.INTERNAL)
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        @GlobalValue(symbol="LGSideMenuControllerDidDismissLeftViewNotification", optional=true)
        public static native String DidDismissLeftView();
        @GlobalValue(symbol="LGSideMenuControllerWillDismissRightViewNotification", optional=true)
        public static native String WillDismissRightView();
        @GlobalValue(symbol="LGSideMenuControllerDidDismissRightViewNotification", optional=true)
        public static native String DidDismissRightView();
        @GlobalValue(symbol="LGSideMenuControllerWillShowLeftViewNotification", optional=true)
        public static native String WillShowLeftView();
        @GlobalValue(symbol="LGSideMenuControllerDidShowLeftViewNotification", optional=true)
        public static native String DidShowLeftView();
        @GlobalValue(symbol="LGSideMenuControllerWillHideLeftViewNotification", optional=true)
        public static native String WillHideLeftView();
        @GlobalValue(symbol="LGSideMenuControllerDidHideLeftViewNotification", optional=true)
        public static native String DidHideLeftView();
        @GlobalValue(symbol="LGSideMenuControllerWillShowRightViewNotification", optional=true)
        public static native String WillShowRightView();
        @GlobalValue(symbol="LGSideMenuControllerDidShowRightViewNotification", optional=true)
        public static native String DidShowRightView();
        @GlobalValue(symbol="LGSideMenuControllerWillHideRightViewNotification", optional=true)
        public static native String WillHideRightView();
        @GlobalValue(symbol="LGSideMenuControllerDidHideRightViewNotification", optional=true)
        public static native String DidHideRightView();
        @GlobalValue(symbol="LGSideMenuControllerWillDismissLeftViewNotification", optional=true)
        public static native String WillDismissLeftView();
    }
    
    @Method(selector = "initWithRootViewController:")
    protected native @Pointer long init(UIViewController rootViewController);
    @Method(selector = "initWithRootViewController:leftViewController:rightViewController:")
    protected native @Pointer long init(UIViewController rootViewController, UIViewController leftViewController, UIViewController rightViewController);
    @Method(selector = "initWithRootView:")
    protected native @Pointer long init(UIView rootView);
    @Method(selector = "initWithRootView:leftView:rightView:")
    protected native @Pointer long init(UIView rootView, UIView leftView, UIView rightView);
    @Method(selector = "rootViewWillLayoutSubviewsWithSize:")
    public native void rootViewWillLayoutSubviews(@ByVal CGSize size);
    @Method(selector = "leftViewWillLayoutSubviewsWithSize:")
    public native void leftViewWillLayoutSubviews(@ByVal CGSize size);
    @Method(selector = "rightViewWillLayoutSubviewsWithSize:")
    public native void rightViewWillLayoutSubviews(@ByVal CGSize size);
    @Method(selector = "isLeftViewAlwaysVisibleForOrientation:")
    public native boolean isLeftViewAlwaysVisibleForOrientation(UIInterfaceOrientation orientation);
    @Method(selector = "isRightViewAlwaysVisibleForOrientation:")
    public native boolean isRightViewAlwaysVisibleForOrientation(UIInterfaceOrientation orientation);
    @Method(selector = "showLeftView")
    public native void showLeftView();
    @Method(selector = "hideLeftView")
    public native void hideLeftView();
    @Method(selector = "toggleLeftView")
    public native void toggleLeftView();
    @Method(selector = "showLeftView:")
    public native void showLeftView(NSObject sender);
    @Method(selector = "hideLeftView:")
    public native void hideLeftView(NSObject sender);
    @Method(selector = "toggleLeftView:")
    public native void toggleLeftView(NSObject sender);
    @Method(selector = "showLeftViewAnimated")
    public native void showLeftViewAnimated();
    @Method(selector = "hideLeftViewAnimated")
    public native void hideLeftViewAnimated();
    @Method(selector = "toggleLeftViewAnimated")
    public native void toggleLeftViewAnimated();
    @Method(selector = "showLeftViewAnimated:")
    public native void showLeftViewAnimated(NSObject sender);
    @Method(selector = "hideLeftViewAnimated:")
    public native void hideLeftViewAnimated(NSObject sender);
    @Method(selector = "toggleLeftViewAnimated:")
    public native void toggleLeftViewAnimated(NSObject sender);
    @Method(selector = "showLeftViewAnimated:completionHandler:")
    public native void showLeftView(boolean animated, @Block Runnable completionHandler);
    @Method(selector = "hideLeftViewAnimated:completionHandler:")
    public native void hideLeftView(boolean animated, @Block Runnable completionHandler);
    @Method(selector = "toggleLeftViewAnimated:completionHandler:")
    public native void toggleLeftView(boolean animated, @Block Runnable completionHandler);
    @Method(selector = "showLeftViewAnimated:delay:completionHandler:")
    public native void showLeftView(boolean animated, double delay, @Block Runnable completionHandler);
    @Method(selector = "hideLeftViewAnimated:delay:completionHandler:")
    public native void hideLeftView(boolean animated, double delay, @Block Runnable completionHandler);
    @Method(selector = "toggleLeftViewAnimated:delay:completionHandler:")
    public native void toggleLeftView(boolean animated, double delay, @Block Runnable completionHandler);
    @Method(selector = "showRightView")
    public native void showRightView();
    @Method(selector = "hideRightView")
    public native void hideRightView();
    @Method(selector = "toggleRightView")
    public native void toggleRightView();
    @Method(selector = "showRightView:")
    public native void showRightView(NSObject sender);
    @Method(selector = "hideRightView:")
    public native void hideRightView(NSObject sender);
    @Method(selector = "toggleRightView:")
    public native void toggleRightView(NSObject sender);
    @Method(selector = "showRightViewAnimated")
    public native void showRightViewAnimated();
    @Method(selector = "hideRightViewAnimated")
    public native void hideRightViewAnimated();
    @Method(selector = "toggleRightViewAnimated")
    public native void toggleRightViewAnimated();
    @Method(selector = "showRightViewAnimated:")
    public native void showRightViewAnimated(NSObject sender);
    @Method(selector = "hideRightViewAnimated:")
    public native void hideRightViewAnimated(NSObject sender);
    @Method(selector = "toggleRightViewAnimated:")
    public native void toggleRightViewAnimated(NSObject sender);
    @Method(selector = "showRightViewAnimated:completionHandler:")
    public native void showRightView(boolean animated, @Block Runnable completionHandler);
    @Method(selector = "hideRightViewAnimated:completionHandler:")
    public native void hideRightView(boolean animated, @Block Runnable completionHandler);
    @Method(selector = "toggleRightViewAnimated:completionHandler:")
    public native void toggleRightView(boolean animated, @Block Runnable completionHandler);
    @Method(selector = "showRightViewAnimated:delay:completionHandler:")
    public native void showRightView(boolean animated, double delay, @Block Runnable completionHandler);
    @Method(selector = "hideRightViewAnimated:delay:completionHandler:")
    public native void hideRightView(boolean animated, double delay, @Block Runnable completionHandler);
    @Method(selector = "toggleRightViewAnimated:delay:completionHandler:")
    public native void toggleRightView(boolean animated, double delay, @Block Runnable completionHandler);
    @Method(selector = "updateLayoutsAndStyles")
    public native void updateLayoutsAndStyles();
    @Method(selector = "showHideLeftViewAnimated:completionHandler:")
    public native void showHideLeftView(boolean animated, @Block Runnable completionHandler);
    @Method(selector = "showHideRightViewAnimated:completionHandler:")
    public native void showHideRightView(boolean animated, @Block Runnable completionHandler);
    @Method(selector = "isLeftViewAlwaysVisibleForInterfaceOrientation:")
    public native boolean isLeftViewAlwaysVisibleForInterfaceOrientation(UIInterfaceOrientation interfaceOrientation);
    @Method(selector = "isRightViewAlwaysVisibleForInterfaceOrientation:")
    public native boolean isRightViewAlwaysVisibleForInterfaceOrientation(UIInterfaceOrientation interfaceOrientation);
    @Method(selector = "setLeftViewEnabledWithWidth:presentationStyle:alwaysVisibleOptions:")
    public native void setLeftViewEnabled(@MachineSizedFloat double width, LGSideMenuPresentationStyle presentationStyle, LGSideMenuAlwaysVisibleOptions alwaysVisibleOptions);
    @Method(selector = "setRightViewEnabledWithWidth:presentationStyle:alwaysVisibleOptions:")
    public native void setRightViewEnabled(@MachineSizedFloat double width, LGSideMenuPresentationStyle presentationStyle, LGSideMenuAlwaysVisibleOptions alwaysVisibleOptions);
    /*</methods>*/
}
