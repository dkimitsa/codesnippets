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
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library(Library.INTERNAL)/*</annotations>*/
public enum /*<name>*/APSAdFormat/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Banner(0L),
    MREC(1L),
    LeaderBoard(2L),
    Interstitial(3L),
    RewardedVideo(4L),
    InstreamVideo(5L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(APSAdFormat.class); }/*</bind>*/
    /*<constants>*/
    public static final int SIZE_MAX = 9999;
    public static final int BANNER_WIDTH = 320;
    public static final int BANNER_HEIGHT = 50;
    public static final int MREC_WIDTH = 300;
    public static final int MREC_HEIGHT = 250;
    public static final int LEADERBOARD_WIDTH = 728;
    public static final int LEADERBOARD_HEIGHT = 90;
    public static final int INSTREAM_VIDEO_DEFAULT_WIDTH = 320;
    public static final int INSTREAM_VIDEO_DEFAULT_HEIGHT = 480;
    /*</constants>*/
    /*<methods>*/
    @Bridge(symbol="APSAdFormatIsBanner", optional=true)
    public native boolean isBanner();
    @Bridge(symbol="APSAdFormatIsInterstitial", optional=true)
    public native boolean isInterstitial();
    /*</methods>*/

    private final long n;

    private /*<name>*/APSAdFormat/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/APSAdFormat/*</name>*/ valueOf(long n) {
        for (/*<name>*/APSAdFormat/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/APSAdFormat/*</name>*/.class.getName());
    }
}
