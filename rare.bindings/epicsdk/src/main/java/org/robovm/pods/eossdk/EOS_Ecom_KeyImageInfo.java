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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Ecom_KeyImageInfo/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Ecom_KeyImageInfo>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Ecom_KeyImageInfoPtr extends Ptr<EOS_Ecom_KeyImageInfo, EOS_Ecom_KeyImageInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_Ecom_KeyImageInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Ecom_KeyImageInfo() {}
    public EOS_Ecom_KeyImageInfo(int ApiVersion, BytePtr Type, BytePtr Url, int Width, int Height) {
        this.setApiVersion(ApiVersion);
        this.setType(Type);
        this.setUrl(Url);
        this.setWidth(Width);
        this.setHeight(Height);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Ecom_KeyImageInfo setApiVersion(int ApiVersion);
    @StructMember(1) public native BytePtr getType();
    @StructMember(1) public native EOS_Ecom_KeyImageInfo setType(BytePtr Type);
    @StructMember(2) public native BytePtr getUrl();
    @StructMember(2) public native EOS_Ecom_KeyImageInfo setUrl(BytePtr Url);
    @StructMember(3) public native int getWidth();
    @StructMember(3) public native EOS_Ecom_KeyImageInfo setWidth(int Width);
    @StructMember(4) public native int getHeight();
    @StructMember(4) public native EOS_Ecom_KeyImageInfo setHeight(int Height);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_Ecom_KeyImageInfo_Release", optional=true)
    public native void release();
    /*</methods>*/
}
