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
public enum /*<name>*/EOS_EExternalCredentialType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    EOS_ECT_EPIC(0L),
    EOS_ECT_STEAM_APP_TICKET(1L),
    EOS_ECT_PSN_ID_TOKEN(2L),
    EOS_ECT_XBL_XSTS_TOKEN(3L),
    EOS_ECT_DISCORD_ACCESS_TOKEN(4L),
    EOS_ECT_GOG_SESSION_TICKET(5L),
    EOS_ECT_NINTENDO_ID_TOKEN(6L),
    EOS_ECT_NINTENDO_NSA_ID_TOKEN(7L),
    EOS_ECT_UPLAY_ACCESS_TOKEN(8L),
    EOS_ECT_OPENID_ACCESS_TOKEN(9L),
    EOS_ECT_DEVICEID_ACCESS_TOKEN(10L),
    EOS_ECT_APPLE_ID_TOKEN(11L),
    EOS_ECT_GOOGLE_ID_TOKEN(12L),
    EOS_ECT_OCULUS_USERID_NONCE(13L),
    EOS_ECT_ITCHIO_JWT(14L),
    EOS_ECT_ITCHIO_KEY(15L),
    EOS_ECT_EPIC_ID_TOKEN(16L),
    EOS_ECT_AMAZON_ACCESS_TOKEN(17L),
    EOS_ECT_STEAM_SESSION_TICKET(18L),
    EOS_ECT_VIVEPORT_USER_TOKEN(19L),
    __EOS_EExternalCredentialType_PAD_INT32__(2147483647L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/EOS_EExternalCredentialType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/EOS_EExternalCredentialType/*</name>*/ valueOf(long n) {
        for (/*<name>*/EOS_EExternalCredentialType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/EOS_EExternalCredentialType/*</name>*/.class.getName());
    }
}
