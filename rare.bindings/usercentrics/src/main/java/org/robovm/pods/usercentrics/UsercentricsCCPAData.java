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
package org.robovm.pods.usercentrics;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsCCPAData/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsCCPADataPtr extends Ptr<UsercentricsCCPAData, UsercentricsCCPADataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsCCPAData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsCCPAData() {}
    protected UsercentricsCCPAData(Handle h, long handle) { super(h, handle); }
    protected UsercentricsCCPAData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithVersion:noticeGiven:optedOut:lspact:")
    public UsercentricsCCPAData(int version, UsercentricsBoolean noticeGiven, UsercentricsBoolean optedOut, UsercentricsBoolean lspact) { super((SkipInit) null); initObject(init(version, noticeGiven, optedOut, lspact)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lspact")
    public native UsercentricsBoolean getLspact();
    @Property(selector = "noticeGiven")
    public native UsercentricsBoolean getNoticeGiven();
    @Property(selector = "optedOut")
    public native UsercentricsBoolean getOptedOut();
    @Property(selector = "setOptedOut:")
    public native void setOptedOut(UsercentricsBoolean v);
    @Property(selector = "uspString")
    public native String getUspString();
    @Property(selector = "version")
    public native int getVersion();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithVersion:noticeGiven:optedOut:lspact:")
    protected native @Pointer long init(int version, UsercentricsBoolean noticeGiven, UsercentricsBoolean optedOut, UsercentricsBoolean lspact);
    @Method(selector = "doCopyVersion:noticeGiven:optedOut:lspact:")
    public native UsercentricsCCPAData doCopy(int version, UsercentricsBoolean noticeGiven, UsercentricsBoolean optedOut, UsercentricsBoolean lspact);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /**
     * @deprecated Please, use the field uspString directly
     */
    @Deprecated
    @Method(selector = "toUSPString")
    public native String toUSPString();
    /*</methods>*/
}
