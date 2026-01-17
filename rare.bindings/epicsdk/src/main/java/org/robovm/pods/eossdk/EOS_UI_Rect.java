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
package org.robovm.pods.eossdk;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_UI_Rect/*</name>*/ 
    extends /*<extends>*/Struct<EOS_UI_Rect>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_UI_RectPtr extends Ptr<EOS_UI_Rect, EOS_UI_RectPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_UI_Rect() {}
    public EOS_UI_Rect(int ApiVersion, int X, int Y, int Width, int Height) {
        this.setApiVersion(ApiVersion);
        this.setX(X);
        this.setY(Y);
        this.setWidth(Width);
        this.setHeight(Height);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_UI_Rect setApiVersion(int ApiVersion);
    @StructMember(1) public native int getX();
    @StructMember(1) public native EOS_UI_Rect setX(int X);
    @StructMember(2) public native int getY();
    @StructMember(2) public native EOS_UI_Rect setY(int Y);
    @StructMember(3) public native int getWidth();
    @StructMember(3) public native EOS_UI_Rect setWidth(int Width);
    @StructMember(4) public native int getHeight();
    @StructMember(4) public native EOS_UI_Rect setHeight(int Height);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
