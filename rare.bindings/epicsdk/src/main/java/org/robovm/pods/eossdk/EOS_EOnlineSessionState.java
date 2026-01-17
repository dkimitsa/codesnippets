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
public enum /*<name>*/EOS_EOnlineSessionState/*</name>*/ implements ValuedEnum {
    /*<values>*/
    EOS_OSS_NoSession(0L),
    EOS_OSS_Creating(1L),
    EOS_OSS_Pending(2L),
    EOS_OSS_Starting(3L),
    EOS_OSS_InProgress(4L),
    EOS_OSS_Ending(5L),
    EOS_OSS_Ended(6L),
    EOS_OSS_Destroying(7L),
    __EOS_EOnlineSessionState_PAD_INT32__(2147483647L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/EOS_EOnlineSessionState/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/EOS_EOnlineSessionState/*</name>*/ valueOf(long n) {
        for (/*<name>*/EOS_EOnlineSessionState/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/EOS_EOnlineSessionState/*</name>*/.class.getName());
    }
}
