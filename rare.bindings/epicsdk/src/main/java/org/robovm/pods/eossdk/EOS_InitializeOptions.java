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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_InitializeOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_InitializeOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_InitializeOptionsPtr extends Ptr<EOS_InitializeOptions, EOS_InitializeOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_InitializeOptions() {}
    public EOS_InitializeOptions(int ApiVersion, FunctionPtr AllocateMemoryFunction, FunctionPtr ReallocateMemoryFunction, FunctionPtr ReleaseMemoryFunction, BytePtr ProductName, BytePtr ProductVersion, VoidPtr Reserved, VoidPtr SystemInitializeOptions, EOS_Initialize_ThreadAffinity OverrideThreadAffinity) {
        this.setApiVersion(ApiVersion);
        this.setAllocateMemoryFunction(AllocateMemoryFunction);
        this.setReallocateMemoryFunction(ReallocateMemoryFunction);
        this.setReleaseMemoryFunction(ReleaseMemoryFunction);
        this.setProductName(ProductName);
        this.setProductVersion(ProductVersion);
        this.setReserved(Reserved);
        this.setSystemInitializeOptions(SystemInitializeOptions);
        this.setOverrideThreadAffinity(OverrideThreadAffinity);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_InitializeOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native FunctionPtr getAllocateMemoryFunction();
    @StructMember(1) public native EOS_InitializeOptions setAllocateMemoryFunction(FunctionPtr AllocateMemoryFunction);
    @StructMember(2) public native FunctionPtr getReallocateMemoryFunction();
    @StructMember(2) public native EOS_InitializeOptions setReallocateMemoryFunction(FunctionPtr ReallocateMemoryFunction);
    @StructMember(3) public native FunctionPtr getReleaseMemoryFunction();
    @StructMember(3) public native EOS_InitializeOptions setReleaseMemoryFunction(FunctionPtr ReleaseMemoryFunction);
    @StructMember(4) public native BytePtr getProductName();
    @StructMember(4) public native EOS_InitializeOptions setProductName(BytePtr ProductName);
    @StructMember(5) public native BytePtr getProductVersion();
    @StructMember(5) public native EOS_InitializeOptions setProductVersion(BytePtr ProductVersion);
    @StructMember(6) public native VoidPtr getReserved();
    @StructMember(6) public native EOS_InitializeOptions setReserved(VoidPtr Reserved);
    @StructMember(7) public native VoidPtr getSystemInitializeOptions();
    @StructMember(7) public native EOS_InitializeOptions setSystemInitializeOptions(VoidPtr SystemInitializeOptions);
    @StructMember(8) public native EOS_Initialize_ThreadAffinity getOverrideThreadAffinity();
    @StructMember(8) public native EOS_InitializeOptions setOverrideThreadAffinity(EOS_Initialize_ThreadAffinity OverrideThreadAffinity);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
