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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LGSideMenuDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements LGSideMenuDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("willShowLeftView:sideMenuController:")
    public void willShowLeftView(UIView leftView, LGSideMenuController sideMenuController) {}
    @NotImplemented("didShowLeftView:sideMenuController:")
    public void didShowLeftView(UIView leftView, LGSideMenuController sideMenuController) {}
    @NotImplemented("willHideLeftView:sideMenuController:")
    public void willHideLeftView(UIView leftView, LGSideMenuController sideMenuController) {}
    @NotImplemented("didHideLeftView:sideMenuController:")
    public void didHideLeftView(UIView leftView, LGSideMenuController sideMenuController) {}
    @NotImplemented("willShowRightView:sideMenuController:")
    public void willShowRightView(UIView rightView, LGSideMenuController sideMenuController) {}
    @NotImplemented("didShowRightView:sideMenuController:")
    public void didShowRightView(UIView rightView, LGSideMenuController sideMenuController) {}
    @NotImplemented("willHideRightView:sideMenuController:")
    public void willHideRightView(UIView rightView, LGSideMenuController sideMenuController) {}
    @NotImplemented("didHideRightView:sideMenuController:")
    public void didHideRightView(UIView rightView, LGSideMenuController sideMenuController) {}
    @NotImplemented("showAnimationsForLeftView:sideMenuController:duration:")
    public void showAnimationsForLeftView(UIView leftView, LGSideMenuController sideMenuController, double duration) {}
    @NotImplemented("hideAnimationsForLeftView:sideMenuController:duration:")
    public void hideAnimationsForLeftView(UIView leftView, LGSideMenuController sideMenuController, double duration) {}
    @NotImplemented("showAnimationsForRightView:sideMenuController:duration:")
    public void showAnimationsForRightView(UIView rightView, LGSideMenuController sideMenuController, double duration) {}
    @NotImplemented("hideAnimationsForRightView:sideMenuController:duration:")
    public void hideAnimationsForRightView(UIView rightView, LGSideMenuController sideMenuController, double duration) {}
    @NotImplemented("showAnimationsBlockForLeftView:sideMenuController:duration:")
    public void showAnimationsBlockForLeftView(UIView leftView, LGSideMenuController sideMenuController, double duration) {}
    @NotImplemented("hideAnimationsBlockForLeftView:sideMenuController:duration:")
    public void hideAnimationsBlockForLeftView(UIView leftView, LGSideMenuController sideMenuController, double duration) {}
    @NotImplemented("showAnimationsBlockForRightView:sideMenuController:duration:")
    public void showAnimationsBlockForRightView(UIView rightView, LGSideMenuController sideMenuController, double duration) {}
    @NotImplemented("hideAnimationsBlockForRightView:sideMenuController:duration:")
    public void hideAnimationsBlockForRightView(UIView rightView, LGSideMenuController sideMenuController, double duration) {}
    /*</methods>*/
}
