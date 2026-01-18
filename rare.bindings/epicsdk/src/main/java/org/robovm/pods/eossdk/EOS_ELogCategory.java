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
public enum /*<name>*/EOS_ELogCategory/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Core(0L),
    Auth(1L),
    Friends(2L),
    Presence(3L),
    UserInfo(4L),
    HttpSerialization(5L),
    Ecom(6L),
    P2P(7L),
    Sessions(8L),
    RateLimiter(9L),
    PlayerDataStorage(10L),
    Analytics(11L),
    Messaging(12L),
    Connect(13L),
    Overlay(14L),
    Achievements(15L),
    Stats(16L),
    UI(17L),
    Lobby(18L),
    Leaderboards(19L),
    Keychain(20L),
    IntegratedPlatform(21L),
    TitleStorage(22L),
    Mods(23L),
    AntiCheat(24L),
    Reports(25L),
    Sanctions(26L),
    ProgressionSnapshots(27L),
    KWS(28L),
    RTC(29L),
    RTCAdmin(30L),
    CustomInvites(31L),
    HTTP(41L),
    ALL_CATEGORIES(2147483647L),
    PAD_INT32(2147483647L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/EOS_ELogCategory/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/EOS_ELogCategory/*</name>*/ valueOf(long n) {
        for (/*<name>*/EOS_ELogCategory/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/EOS_ELogCategory/*</name>*/.class.getName());
    }
}
