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
public enum /*<name>*/EOS_EConnectionClosedReason/*</name>*/ implements ValuedEnum {
    /*<values>*/
    EOS_CCR_Unknown(0L),
    EOS_CCR_ClosedByLocalUser(1L),
    EOS_CCR_ClosedByPeer(2L),
    EOS_CCR_TimedOut(3L),
    EOS_CCR_TooManyConnections(4L),
    EOS_CCR_InvalidMessage(5L),
    EOS_CCR_InvalidData(6L),
    EOS_CCR_ConnectionFailed(7L),
    EOS_CCR_ConnectionClosed(8L),
    EOS_CCR_NegotiationFailed(9L),
    EOS_CCR_UnexpectedError(10L),
    EOS_CCR_ConnectionIgnored(11L),
    __EOS_EConnectionClosedReason_PAD_INT32__(2147483647L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/EOS_EConnectionClosedReason/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/EOS_EConnectionClosedReason/*</name>*/ valueOf(long n) {
        for (/*<name>*/EOS_EConnectionClosedReason/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/EOS_EConnectionClosedReason/*</name>*/.class.getName());
    }
}
