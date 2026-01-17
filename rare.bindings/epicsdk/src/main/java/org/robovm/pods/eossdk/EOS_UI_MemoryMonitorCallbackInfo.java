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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_UI_MemoryMonitorCallbackInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_UI_MemoryMonitorCallbackInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_UI_MemoryMonitorCallbackInfoPtr extends Ptr<EOS_UI_MemoryMonitorCallbackInfo, EOS_UI_MemoryMonitorCallbackInfoPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_UI_MemoryMonitorCallbackInfo() {}
    public EOS_UI_MemoryMonitorCallbackInfo(VoidPtr ClientData, VoidPtr SystemMemoryMonitorReport) {
        this.setClientData(ClientData);
        this.setSystemMemoryMonitorReport(SystemMemoryMonitorReport);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native VoidPtr getClientData();
    @StructMember(0) public native EOS_UI_MemoryMonitorCallbackInfo setClientData(VoidPtr ClientData);
    @StructMember(1) public native VoidPtr getSystemMemoryMonitorReport();
    @StructMember(1) public native EOS_UI_MemoryMonitorCallbackInfo setSystemMemoryMonitorReport(VoidPtr SystemMemoryMonitorReport);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
