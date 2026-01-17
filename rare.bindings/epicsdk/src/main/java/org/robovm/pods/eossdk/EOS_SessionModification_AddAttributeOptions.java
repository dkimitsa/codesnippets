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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_SessionModification_AddAttributeOptions/*</name>*/ 
    extends /*<extends>*/Struct<EOS_SessionModification_AddAttributeOptions>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_SessionModification_AddAttributeOptionsPtr extends Ptr<EOS_SessionModification_AddAttributeOptions, EOS_SessionModification_AddAttributeOptionsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_SessionModification_AddAttributeOptions() {}
    public EOS_SessionModification_AddAttributeOptions(int ApiVersion, EOS_Sessions_AttributeData SessionAttribute, EOS_ESessionAttributeAdvertisementType AdvertisementType) {
        this.setApiVersion(ApiVersion);
        this.setSessionAttribute(SessionAttribute);
        this.setAdvertisementType(AdvertisementType);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_SessionModification_AddAttributeOptions setApiVersion(int ApiVersion);
    @StructMember(1) public native EOS_Sessions_AttributeData getSessionAttribute();
    @StructMember(1) public native EOS_SessionModification_AddAttributeOptions setSessionAttribute(EOS_Sessions_AttributeData SessionAttribute);
    @StructMember(2) public native EOS_ESessionAttributeAdvertisementType getAdvertisementType();
    @StructMember(2) public native EOS_SessionModification_AddAttributeOptions setAdvertisementType(EOS_ESessionAttributeAdvertisementType AdvertisementType);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
