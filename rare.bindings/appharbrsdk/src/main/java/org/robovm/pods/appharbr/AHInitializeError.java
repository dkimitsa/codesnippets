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
public enum /*<name>*/AHInitializeError/*</name>*/ implements NSErrorCode {
    /*<values>*/
    InvalidApiKey(0L),
    InvalidActivation(1L),
    UnsupportedDirectMediation(2L),
    EnableDebugMode(3L),
    InternalError(4L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*/
    public static final String ErrorDomain = "AppHarbrSDK.AHInitializeError";
    /*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*//*</methods>*/

    // dkimitsa: manually added code
    private static String getClassDomain() {
        return ErrorDomain;
    }

    private final long n;

    private /*<name>*/AHInitializeError/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/AHInitializeError/*</name>*/ valueOf(long n) {
        for (/*<name>*/AHInitializeError/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/AHInitializeError/*</name>*/.class.getName());
    }

    // bind wrap to include it in compilation as long as nserror enum is used 
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/AHInitializeError/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be inserted in value section */
            return /*<name>*/AHInitializeError/*</name>*/.getClassDomain();
        }
    }
}
