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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Sessions_RegisterPlayersCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Sessions_RegisterPlayersCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Sessions_RegisterPlayersCallbackInfoPtr extends Ptr<EOS_Sessions_RegisterPlayersCallbackInfo, EOS_Sessions_RegisterPlayersCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Sessions_RegisterPlayersCallbackInfo() {}
    public EOS_Sessions_RegisterPlayersCallbackInfo(EOS_EResult ResultCode, VoidPtr ClientData, EOS_ProductUserIdDetails.EOS_ProductUserIdDetailsPtr RegisteredPlayers, int RegisteredPlayersCount, EOS_ProductUserIdDetails.EOS_ProductUserIdDetailsPtr SanctionedPlayers, int SanctionedPlayersCount) {
        this.setResultCode(ResultCode);
        this.setClientData(ClientData);
        this.setRegisteredPlayers(RegisteredPlayers);
        this.setRegisteredPlayersCount(RegisteredPlayersCount);
        this.setSanctionedPlayers(SanctionedPlayers);
        this.setSanctionedPlayersCount(SanctionedPlayersCount);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native EOS_EResult getResultCode();
    @StructMember(0) public native EOS_Sessions_RegisterPlayersCallbackInfo setResultCode(EOS_EResult ResultCode);
    @StructMember(1) public native VoidPtr getClientData();
    @StructMember(1) public native EOS_Sessions_RegisterPlayersCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(2) public native EOS_ProductUserIdDetails.EOS_ProductUserIdDetailsPtr getRegisteredPlayers();
    @StructMember(2) public native EOS_Sessions_RegisterPlayersCallbackInfo setRegisteredPlayers(EOS_ProductUserIdDetails.EOS_ProductUserIdDetailsPtr RegisteredPlayers);
    @StructMember(3) public native int getRegisteredPlayersCount();
    @StructMember(3) public native EOS_Sessions_RegisterPlayersCallbackInfo setRegisteredPlayersCount(int RegisteredPlayersCount);
    @StructMember(4) public native EOS_ProductUserIdDetails.EOS_ProductUserIdDetailsPtr getSanctionedPlayers();
    @StructMember(4) public native EOS_Sessions_RegisterPlayersCallbackInfo setSanctionedPlayers(EOS_ProductUserIdDetails.EOS_ProductUserIdDetailsPtr SanctionedPlayers);
    @StructMember(5) public native int getSanctionedPlayersCount();
    @StructMember(5) public native EOS_Sessions_RegisterPlayersCallbackInfo setSanctionedPlayersCount(int SanctionedPlayersCount);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
