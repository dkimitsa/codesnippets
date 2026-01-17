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
public enum /*<name>*/EOS_UI_EKeyCombination/*</name>*/ implements ValuedEnum {
    /*<values>*/
    EOS_UIK_ModifierShift(16L),
    EOS_UIK_KeyTypeMask(65535L),
    EOS_UIK_ModifierMask(-65536L),
    EOS_UIK_Shift(65536L),
    EOS_UIK_Control(131072L),
    EOS_UIK_Alt(262144L),
    EOS_UIK_Meta(524288L),
    EOS_UIK_ValidModifierMask(983040L),
    EOS_UIK_None(0L),
    EOS_UIK_Space(1L),
    EOS_UIK_Backspace(2L),
    EOS_UIK_Tab(3L),
    EOS_UIK_Escape(4L),
    EOS_UIK_PageUp(5L),
    EOS_UIK_PageDown(6L),
    EOS_UIK_End(7L),
    EOS_UIK_Home(8L),
    EOS_UIK_Insert(9L),
    EOS_UIK_Delete(10L),
    EOS_UIK_Left(11L),
    EOS_UIK_Up(12L),
    EOS_UIK_Right(13L),
    EOS_UIK_Down(14L),
    EOS_UIK_Key0(15L),
    EOS_UIK_Key1(16L),
    EOS_UIK_Key2(17L),
    EOS_UIK_Key3(18L),
    EOS_UIK_Key4(19L),
    EOS_UIK_Key5(20L),
    EOS_UIK_Key6(21L),
    EOS_UIK_Key7(22L),
    EOS_UIK_Key8(23L),
    EOS_UIK_Key9(24L),
    EOS_UIK_KeyA(25L),
    EOS_UIK_KeyB(26L),
    EOS_UIK_KeyC(27L),
    EOS_UIK_KeyD(28L),
    EOS_UIK_KeyE(29L),
    EOS_UIK_KeyF(30L),
    EOS_UIK_KeyG(31L),
    EOS_UIK_KeyH(32L),
    EOS_UIK_KeyI(33L),
    EOS_UIK_KeyJ(34L),
    EOS_UIK_KeyK(35L),
    EOS_UIK_KeyL(36L),
    EOS_UIK_KeyM(37L),
    EOS_UIK_KeyN(38L),
    EOS_UIK_KeyO(39L),
    EOS_UIK_KeyP(40L),
    EOS_UIK_KeyQ(41L),
    EOS_UIK_KeyR(42L),
    EOS_UIK_KeyS(43L),
    EOS_UIK_KeyT(44L),
    EOS_UIK_KeyU(45L),
    EOS_UIK_KeyV(46L),
    EOS_UIK_KeyW(47L),
    EOS_UIK_KeyX(48L),
    EOS_UIK_KeyY(49L),
    EOS_UIK_KeyZ(50L),
    EOS_UIK_Numpad0(51L),
    EOS_UIK_Numpad1(52L),
    EOS_UIK_Numpad2(53L),
    EOS_UIK_Numpad3(54L),
    EOS_UIK_Numpad4(55L),
    EOS_UIK_Numpad5(56L),
    EOS_UIK_Numpad6(57L),
    EOS_UIK_Numpad7(58L),
    EOS_UIK_Numpad8(59L),
    EOS_UIK_Numpad9(60L),
    EOS_UIK_NumpadAsterisk(61L),
    EOS_UIK_NumpadPlus(62L),
    EOS_UIK_NumpadMinus(63L),
    EOS_UIK_NumpadPeriod(64L),
    EOS_UIK_NumpadDivide(65L),
    EOS_UIK_F1(66L),
    EOS_UIK_F2(67L),
    EOS_UIK_F3(68L),
    EOS_UIK_F4(69L),
    EOS_UIK_F5(70L),
    EOS_UIK_F6(71L),
    EOS_UIK_F7(72L),
    EOS_UIK_F8(73L),
    EOS_UIK_F9(74L),
    EOS_UIK_F10(75L),
    EOS_UIK_F11(76L),
    EOS_UIK_F12(77L),
    EOS_UIK_F13(78L),
    EOS_UIK_F14(79L),
    EOS_UIK_F15(80L),
    EOS_UIK_F16(81L),
    EOS_UIK_F17(82L),
    EOS_UIK_F18(83L),
    EOS_UIK_F19(84L),
    EOS_UIK_F20(85L),
    EOS_UIK_F21(86L),
    EOS_UIK_F22(87L),
    EOS_UIK_F23(88L),
    EOS_UIK_F24(89L),
    EOS_UIK_OemPlus(90L),
    EOS_UIK_OemComma(91L),
    EOS_UIK_OemMinus(92L),
    EOS_UIK_OemPeriod(93L),
    EOS_UIK_Oem1(94L),
    EOS_UIK_Oem2(95L),
    EOS_UIK_Oem3(96L),
    EOS_UIK_Oem4(97L),
    EOS_UIK_Oem5(98L),
    EOS_UIK_Oem6(99L),
    EOS_UIK_Oem7(100L),
    EOS_UIK_Oem8(101L),
    EOS_UIK_MaxKeyType(102L),
    __EOS_UI_EKeyCombination_PAD_INT32__(2147483647L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/EOS_UI_EKeyCombination/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/EOS_UI_EKeyCombination/*</name>*/ valueOf(long n) {
        for (/*<name>*/EOS_UI_EKeyCombination/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/EOS_UI_EKeyCombination/*</name>*/.class.getName());
    }
}
