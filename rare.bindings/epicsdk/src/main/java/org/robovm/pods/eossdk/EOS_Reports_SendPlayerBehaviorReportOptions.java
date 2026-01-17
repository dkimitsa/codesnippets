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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Reports_SendPlayerBehaviorReportOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Reports_SendPlayerBehaviorReportOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Reports_SendPlayerBehaviorReportOptionsPtr extends Ptr<EOS_Reports_SendPlayerBehaviorReportOptions, EOS_Reports_SendPlayerBehaviorReportOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Reports_SendPlayerBehaviorReportOptions() {}
    public EOS_Reports_SendPlayerBehaviorReportOptions(int ApiVersion, EOS_ProductUserIdDetails ReporterUserId, EOS_ProductUserIdDetails ReportedUserId, EOS_EPlayerReportsCategory Category, BytePtr Message, BytePtr Context) {
        this.setApiVersion(ApiVersion);
        this.setReporterUserId(ReporterUserId);
        this.setReportedUserId(ReportedUserId);
        this.setCategory(Category);
        this.setMessage(Message);
        this.setContext(Context);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Reports_SendPlayerBehaviorReportOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_ProductUserIdDetails getReporterUserId();
    @StructMember(1) public native EOS_Reports_SendPlayerBehaviorReportOptions setReporterUserId(EOS_ProductUserIdDetails ReporterUserId);
    @StructMember(2) public native EOS_ProductUserIdDetails getReportedUserId();
    @StructMember(2) public native EOS_Reports_SendPlayerBehaviorReportOptions setReportedUserId(EOS_ProductUserIdDetails ReportedUserId);
    @StructMember(3) public native EOS_EPlayerReportsCategory getCategory();
    @StructMember(3) public native EOS_Reports_SendPlayerBehaviorReportOptions setCategory(EOS_EPlayerReportsCategory Category);
    @StructMember(4) public native BytePtr getMessage();
    @StructMember(4) public native EOS_Reports_SendPlayerBehaviorReportOptions setMessage(BytePtr Message);
    @StructMember(5) public native BytePtr getContext();
    @StructMember(5) public native EOS_Reports_SendPlayerBehaviorReportOptions setContext(BytePtr Context);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
