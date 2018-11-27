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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LGSideMenuSwipeGestureRange/*</name>*/ 
    extends /*<extends>*/Struct<LGSideMenuSwipeGestureRange>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LGSideMenuSwipeGestureRangePtr extends Ptr<LGSideMenuSwipeGestureRange, LGSideMenuSwipeGestureRangePtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LGSideMenuSwipeGestureRange() {}
    public LGSideMenuSwipeGestureRange(@MachineSizedFloat double left, @MachineSizedFloat double right) {
        this.setLeft(left);
        this.setRight(right);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @MachineSizedFloat double getLeft();
    @StructMember(0) public native LGSideMenuSwipeGestureRange setLeft(@MachineSizedFloat double left);
    @StructMember(1) public native @MachineSizedFloat double getRight();
    @StructMember(1) public native LGSideMenuSwipeGestureRange setRight(@MachineSizedFloat double right);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
