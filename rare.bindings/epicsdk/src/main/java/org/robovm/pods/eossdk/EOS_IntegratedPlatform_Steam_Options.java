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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_IntegratedPlatform_Steam_Options/*</name>*/ 
    extends /*<extends>*/Struct<EOS_IntegratedPlatform_Steam_Options>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_IntegratedPlatform_Steam_OptionsPtr extends Ptr<EOS_IntegratedPlatform_Steam_Options, EOS_IntegratedPlatform_Steam_OptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_IntegratedPlatform_Steam_Options() {}
    public EOS_IntegratedPlatform_Steam_Options(int ApiVersion, BytePtr OverrideLibraryPath, int SteamMajorVersion, int SteamMinorVersion, BytePtr SteamApiInterfaceVersionsArray, int SteamApiInterfaceVersionsArrayBytes) {
        this.setApiVersion(ApiVersion);
        this.setOverrideLibraryPath(OverrideLibraryPath);
        this.setSteamMajorVersion(SteamMajorVersion);
        this.setSteamMinorVersion(SteamMinorVersion);
        this.setSteamApiInterfaceVersionsArray(SteamApiInterfaceVersionsArray);
        this.setSteamApiInterfaceVersionsArrayBytes(SteamApiInterfaceVersionsArrayBytes);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_IntegratedPlatform_Steam_Options setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getOverrideLibraryPath();
    @StructMember(1) public native EOS_IntegratedPlatform_Steam_Options setOverrideLibraryPath(BytePtr OverrideLibraryPath);
    @StructMember(2) public native int getSteamMajorVersion();
    @StructMember(2) public native EOS_IntegratedPlatform_Steam_Options setSteamMajorVersion(int SteamMajorVersion);
    @StructMember(3) public native int getSteamMinorVersion();
    @StructMember(3) public native EOS_IntegratedPlatform_Steam_Options setSteamMinorVersion(int SteamMinorVersion);
    @StructMember(4) public native BytePtr getSteamApiInterfaceVersionsArray();
    @StructMember(4) public native EOS_IntegratedPlatform_Steam_Options setSteamApiInterfaceVersionsArray(BytePtr SteamApiInterfaceVersionsArray);
    @StructMember(5) public native int getSteamApiInterfaceVersionsArrayBytes();
    @StructMember(5) public native EOS_IntegratedPlatform_Steam_Options setSteamApiInterfaceVersionsArrayBytes(int SteamApiInterfaceVersionsArrayBytes);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
