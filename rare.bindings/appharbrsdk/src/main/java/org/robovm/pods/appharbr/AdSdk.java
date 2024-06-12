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
package org.robovm.pods.appharbr;

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
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/AdSdk/*</name>*/ implements ValuedEnum {
    /*<values>*/
    AdColony(5L),
    AdFalcon(6L),
    AdGeneration(38L),
    AdMob(1L),
    AdMost(7L),
    Aequus(8L),
    Algorix(72L),
    AppLovin(9L),
    Appodeal(39L),
    Amazon(40L),
    Automattic(70L),
    Beachfront(73L),
    Beeswax(74L),
    BidMachine(41L),
    BigoAds(71L),
    Chartboost(10L),
    ChocolatePlatform(42L),
    Colossus(75L),
    Conversant(76L),
    Criteo(43L),
    CrossPromotion(11L),
    Csj(90L),
    Datablocks(77L),
    Emodo(78L),
    Emx(45L),
    Equativ(46L),
    Facebook(4L),
    Fluct(47L),
    Flurry(12L),
    Fyber(13L),
    Gam(2L),
    Groundtruth(79L),
    Hyprmx(14L),
    IMobile(15L),
    ImproveDigital(48L),
    InMobi(16L),
    Index(49L),
    IronSource(17L),
    LeadBolt(18L),
    LgUAD(50L),
    Line(51L),
    Maio(19L),
    Max(20L),
    Mediagrid(80L),
    MediaNet(52L),
    Meson(36L),
    Mintegral(37L),
    MobFox(21L),
    MobileFuse(53L),
    Moloco(89L),
    MyTarget(22L),
    Nend(23L),
    Nimbus(69L),
    OneTag(54L),
    OpenX(55L),
    OpenWrapDFP(88L),
    Ogury(56L),
    Pangle(24L),
    PubMatic(57L),
    Pubnative(81L),
    Prebid(68L),
    Reklamup(91L),
    Rhythmone(82L),
    Rubicon(58L),
    ShareThrough(59L),
    Silvermob(83L),
    Smaato(25L),
    Sonobi(60L),
    ScaleMonk(26L),
    Snap(27L),
    Xandr(87L),
    XMediator(44L),
    TapDaq(28L),
    TapJoy(29L),
    Tappx(84L),
    Tencent(30L),
    TripleLift(61L),
    Undertone(85L),
    Unity(31L),
    UnrulyX(62L),
    Verizon(32L),
    Verve(63L),
    Vpon(33L),
    Vrtcal(86L),
    Vungle(34L),
    Yahoo(64L),
    Yandex(65L),
    YieldMo(66L),
    YieldOne(67L),
    Zucks(35L),
    Custom(998L),
    None(999L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/AdSdk/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/AdSdk/*</name>*/ valueOf(long n) {
        for (/*<name>*/AdSdk/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/AdSdk/*</name>*/.class.getName());
    }
}
