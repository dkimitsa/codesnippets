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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Platform_Options/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Platform_Options>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Platform_OptionsPtr extends Ptr<EOS_Platform_Options, EOS_Platform_OptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Platform_Options() {}
    public EOS_Platform_Options(int ApiVersion, VoidPtr Reserved, BytePtr ProductId, BytePtr SandboxId, EOS_Platform_ClientCredentials ClientCredentials, int bIsServer, BytePtr EncryptionKey, BytePtr OverrideCountryCode, BytePtr OverrideLocaleCode, BytePtr DeploymentId, long Flags, BytePtr CacheDirectory, int TickBudgetInMilliseconds, EOS_Platform_RTCOptions RTCOptions, EOS_IntegratedPlatformOptionsContainerHandle IntegratedPlatformOptionsContainerHandle, VoidPtr SystemSpecificOptions, DoublePtr TaskNetworkTimeoutSeconds) {
        this.setApiVersion(ApiVersion);
        this.setReserved(Reserved);
        this.setProductId(ProductId);
        this.setSandboxId(SandboxId);
        this.setClientCredentials(ClientCredentials);
        this.setBIsServer(bIsServer);
        this.setEncryptionKey(EncryptionKey);
        this.setOverrideCountryCode(OverrideCountryCode);
        this.setOverrideLocaleCode(OverrideLocaleCode);
        this.setDeploymentId(DeploymentId);
        this.setFlags(Flags);
        this.setCacheDirectory(CacheDirectory);
        this.setTickBudgetInMilliseconds(TickBudgetInMilliseconds);
        this.setRTCOptions(RTCOptions);
        this.setIntegratedPlatformOptionsContainerHandle(IntegratedPlatformOptionsContainerHandle);
        this.setSystemSpecificOptions(SystemSpecificOptions);
        this.setTaskNetworkTimeoutSeconds(TaskNetworkTimeoutSeconds);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Platform_Options setApiVersion(int ApiVersion);
    @StructMember(1) public native VoidPtr getReserved();
    @StructMember(1) public native EOS_Platform_Options setReserved(VoidPtr Reserved);
    @StructMember(2) public native BytePtr getProductId();
    @StructMember(2) public native EOS_Platform_Options setProductId(BytePtr ProductId);
    @StructMember(3) public native BytePtr getSandboxId();
    @StructMember(3) public native EOS_Platform_Options setSandboxId(BytePtr SandboxId);
    @StructMember(4) public native @ByVal EOS_Platform_ClientCredentials getClientCredentials();
    @StructMember(4) public native EOS_Platform_Options setClientCredentials(@ByVal EOS_Platform_ClientCredentials ClientCredentials);
    @StructMember(5) public native int getBIsServer();
    @StructMember(5) public native EOS_Platform_Options setBIsServer(int bIsServer);
    @StructMember(6) public native BytePtr getEncryptionKey();
    @StructMember(6) public native EOS_Platform_Options setEncryptionKey(BytePtr EncryptionKey);
    @StructMember(7) public native BytePtr getOverrideCountryCode();
    @StructMember(7) public native EOS_Platform_Options setOverrideCountryCode(BytePtr OverrideCountryCode);
    @StructMember(8) public native BytePtr getOverrideLocaleCode();
    @StructMember(8) public native EOS_Platform_Options setOverrideLocaleCode(BytePtr OverrideLocaleCode);
    @StructMember(9) public native BytePtr getDeploymentId();
    @StructMember(9) public native EOS_Platform_Options setDeploymentId(BytePtr DeploymentId);
    @StructMember(10) public native long getFlags();
    @StructMember(10) public native EOS_Platform_Options setFlags(long Flags);
    @StructMember(11) public native BytePtr getCacheDirectory();
    @StructMember(11) public native EOS_Platform_Options setCacheDirectory(BytePtr CacheDirectory);
    @StructMember(12) public native int getTickBudgetInMilliseconds();
    @StructMember(12) public native EOS_Platform_Options setTickBudgetInMilliseconds(int TickBudgetInMilliseconds);
    @StructMember(13) public native EOS_Platform_RTCOptions getRTCOptions();
    @StructMember(13) public native EOS_Platform_Options setRTCOptions(EOS_Platform_RTCOptions RTCOptions);
    @StructMember(14) public native EOS_IntegratedPlatformOptionsContainerHandle getIntegratedPlatformOptionsContainerHandle();
    @StructMember(14) public native EOS_Platform_Options setIntegratedPlatformOptionsContainerHandle(EOS_IntegratedPlatformOptionsContainerHandle IntegratedPlatformOptionsContainerHandle);
    @StructMember(15) public native VoidPtr getSystemSpecificOptions();
    @StructMember(15) public native EOS_Platform_Options setSystemSpecificOptions(VoidPtr SystemSpecificOptions);
    @StructMember(16) public native DoublePtr getTaskNetworkTimeoutSeconds();
    @StructMember(16) public native EOS_Platform_Options setTaskNetworkTimeoutSeconds(DoublePtr TaskNetworkTimeoutSeconds);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
