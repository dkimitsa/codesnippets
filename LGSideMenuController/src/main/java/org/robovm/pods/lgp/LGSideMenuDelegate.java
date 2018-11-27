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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/LGSideMenuDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "willShowLeftView:sideMenuController:")
    void willShowLeftView(UIView leftView, LGSideMenuController sideMenuController);
    @Method(selector = "didShowLeftView:sideMenuController:")
    void didShowLeftView(UIView leftView, LGSideMenuController sideMenuController);
    @Method(selector = "willHideLeftView:sideMenuController:")
    void willHideLeftView(UIView leftView, LGSideMenuController sideMenuController);
    @Method(selector = "didHideLeftView:sideMenuController:")
    void didHideLeftView(UIView leftView, LGSideMenuController sideMenuController);
    @Method(selector = "willShowRightView:sideMenuController:")
    void willShowRightView(UIView rightView, LGSideMenuController sideMenuController);
    @Method(selector = "didShowRightView:sideMenuController:")
    void didShowRightView(UIView rightView, LGSideMenuController sideMenuController);
    @Method(selector = "willHideRightView:sideMenuController:")
    void willHideRightView(UIView rightView, LGSideMenuController sideMenuController);
    @Method(selector = "didHideRightView:sideMenuController:")
    void didHideRightView(UIView rightView, LGSideMenuController sideMenuController);
    @Method(selector = "showAnimationsForLeftView:sideMenuController:duration:")
    void showAnimationsForLeftView(UIView leftView, LGSideMenuController sideMenuController, double duration);
    @Method(selector = "hideAnimationsForLeftView:sideMenuController:duration:")
    void hideAnimationsForLeftView(UIView leftView, LGSideMenuController sideMenuController, double duration);
    @Method(selector = "showAnimationsForRightView:sideMenuController:duration:")
    void showAnimationsForRightView(UIView rightView, LGSideMenuController sideMenuController, double duration);
    @Method(selector = "hideAnimationsForRightView:sideMenuController:duration:")
    void hideAnimationsForRightView(UIView rightView, LGSideMenuController sideMenuController, double duration);
    @Method(selector = "showAnimationsBlockForLeftView:sideMenuController:duration:")
    void showAnimationsBlockForLeftView(UIView leftView, LGSideMenuController sideMenuController, double duration);
    @Method(selector = "hideAnimationsBlockForLeftView:sideMenuController:duration:")
    void hideAnimationsBlockForLeftView(UIView leftView, LGSideMenuController sideMenuController, double duration);
    @Method(selector = "showAnimationsBlockForRightView:sideMenuController:duration:")
    void showAnimationsBlockForRightView(UIView rightView, LGSideMenuController sideMenuController, double duration);
    @Method(selector = "hideAnimationsBlockForRightView:sideMenuController:duration:")
    void hideAnimationsBlockForRightView(UIView rightView, LGSideMenuController sideMenuController, double duration);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
