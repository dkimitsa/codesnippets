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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Mods_EnumerateModsCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Mods_EnumerateModsCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Mods_EnumerateModsCallbackInfoPtr extends Ptr<EOS_Mods_EnumerateModsCallbackInfo, EOS_Mods_EnumerateModsCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Mods_EnumerateModsCallbackInfo() {}
    public EOS_Mods_EnumerateModsCallbackInfo(EOS_EResult ResultCode, EOS_EpicAccountIdDetails LocalUserId, VoidPtr ClientData, EOS_EModEnumerationType Type) {
        this.setResultCode(ResultCode);
        this.setLocalUserId(LocalUserId);
        this.setClientData(ClientData);
        this.setType(Type);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native EOS_EResult getResultCode();
    @StructMember(0) public native EOS_Mods_EnumerateModsCallbackInfo setResultCode(EOS_EResult ResultCode);
    @StructMember(1) public native EOS_EpicAccountIdDetails getLocalUserId();
    @StructMember(1) public native EOS_Mods_EnumerateModsCallbackInfo setLocalUserId(EOS_EpicAccountIdDetails LocalUserId);
    @StructMember(2) public native VoidPtr getClientData();
    @StructMember(2) public native EOS_Mods_EnumerateModsCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(3) public native EOS_EModEnumerationType getType();
    @StructMember(3) public native EOS_Mods_EnumerateModsCallbackInfo setType(EOS_EModEnumerationType Type);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
