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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_SessionDetails_Attribute/*</name>*/ 
    extends /*<extends>*/Struct<EOS_SessionDetails_Attribute>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_SessionDetails_AttributePtr extends Ptr<EOS_SessionDetails_Attribute, EOS_SessionDetails_AttributePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_SessionDetails_Attribute.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_SessionDetails_Attribute() {}
    public EOS_SessionDetails_Attribute(int ApiVersion, EOS_Sessions_AttributeData Data, EOS_ESessionAttributeAdvertisementType AdvertisementType) {
        this.setApiVersion(ApiVersion);
        this.setData(Data);
        this.setAdvertisementType(AdvertisementType);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_SessionDetails_Attribute setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_Sessions_AttributeData getData();
    @StructMember(1) public native EOS_SessionDetails_Attribute setData(EOS_Sessions_AttributeData Data);
    @StructMember(2) public native EOS_ESessionAttributeAdvertisementType getAdvertisementType();
    @StructMember(2) public native EOS_SessionDetails_Attribute setAdvertisementType(EOS_ESessionAttributeAdvertisementType AdvertisementType);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_SessionDetails_Attribute_Release", optional=true)
    public native void release();
    /*</methods>*/
}
