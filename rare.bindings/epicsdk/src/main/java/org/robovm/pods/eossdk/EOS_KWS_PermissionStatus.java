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
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_KWS_PermissionStatus/*</name>*/ 
    extends /*<extends>*/Struct<EOS_KWS_PermissionStatus>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_KWS_PermissionStatusPtr extends Ptr<EOS_KWS_PermissionStatus, EOS_KWS_PermissionStatusPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_KWS_PermissionStatus.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_KWS_PermissionStatus() {}
    public EOS_KWS_PermissionStatus(int ApiVersion, BytePtr Name, EOS_EKWSPermissionStatus Status) {
        this.setApiVersion(ApiVersion);
        this.setName(Name);
        this.setStatus(Status);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_KWS_PermissionStatus setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getName();
    @StructMember(1) public native EOS_KWS_PermissionStatus setName(BytePtr Name);
    @StructMember(2) public native EOS_EKWSPermissionStatus getStatus();
    @StructMember(2) public native EOS_KWS_PermissionStatus setStatus(EOS_EKWSPermissionStatus Status);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_KWS_PermissionStatus_Release", optional=true)
    public native void release();
    /*</methods>*/
}
