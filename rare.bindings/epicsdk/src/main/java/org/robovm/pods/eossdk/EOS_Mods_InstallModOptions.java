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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Mods_InstallModOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Mods_InstallModOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Mods_InstallModOptionsPtr extends Ptr<EOS_Mods_InstallModOptions, EOS_Mods_InstallModOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Mods_InstallModOptions() {}
    public EOS_Mods_InstallModOptions(int ApiVersion, EOS_EpicAccountIdDetails LocalUserId, EOS_Mod_Identifier Mod, int bRemoveAfterExit) {
        this.setApiVersion(ApiVersion);
        this.setLocalUserId(LocalUserId);
        this.setMod(Mod);
        this.setBRemoveAfterExit(bRemoveAfterExit);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Mods_InstallModOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_EpicAccountIdDetails getLocalUserId();
    @StructMember(1) public native EOS_Mods_InstallModOptions setLocalUserId(EOS_EpicAccountIdDetails LocalUserId);
    @StructMember(2) public native EOS_Mod_Identifier getMod();
    @StructMember(2) public native EOS_Mods_InstallModOptions setMod(EOS_Mod_Identifier Mod);
    @StructMember(3) public native int getBRemoveAfterExit();
    @StructMember(3) public native EOS_Mods_InstallModOptions setBRemoveAfterExit(int bRemoveAfterExit);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
