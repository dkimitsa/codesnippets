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
public enum /*<name>*/EOS_UI_EInputStateButtonFlags/*</name>*/ implements ValuedEnum {
    /*<values>*/
    EOS_UISBF_None(0L),
    EOS_UISBF_DPad_Left(1L),
    EOS_UISBF_DPad_Right(2L),
    EOS_UISBF_DPad_Down(4L),
    EOS_UISBF_DPad_Up(8L),
    EOS_UISBF_FaceButton_Left(16L),
    EOS_UISBF_FaceButton_Right(32L),
    EOS_UISBF_FaceButton_Bottom(64L),
    EOS_UISBF_FaceButton_Top(128L),
    EOS_UISBF_LeftShoulder(256L),
    EOS_UISBF_RightShoulder(512L),
    EOS_UISBF_LeftTrigger(1024L),
    EOS_UISBF_RightTrigger(2048L),
    EOS_UISBF_Special_Left(4096L),
    EOS_UISBF_Special_Right(8192L),
    EOS_UISBF_LeftThumbstick(16384L),
    EOS_UISBF_RightThumbstick(32768L),
    __EOS_UI_EInputStateButtonFlags_PAD_INT32__(2147483647L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/EOS_UI_EInputStateButtonFlags/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/EOS_UI_EInputStateButtonFlags/*</name>*/ valueOf(long n) {
        for (/*<name>*/EOS_UI_EInputStateButtonFlags/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/EOS_UI_EInputStateButtonFlags/*</name>*/.class.getName());
    }
}
