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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Lobby_AttributeData_Value/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Lobby_AttributeData_Value>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Lobby_AttributeData_ValuePtr extends Ptr<EOS_Lobby_AttributeData_Value, EOS_Lobby_AttributeData_ValuePtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Lobby_AttributeData_Value() {}
    public EOS_Lobby_AttributeData_Value(long AsInt64, double AsDouble, int AsBool, BytePtr AsUtf8) {
        this.setAsInt64(AsInt64);
        this.setAsDouble(AsDouble);
        this.setAsBool(AsBool);
        this.setAsUtf8(AsUtf8);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native long getAsInt64();
    @StructMember(0) public native EOS_Lobby_AttributeData_Value setAsInt64(long AsInt64);
    @StructMember(0) public native double getAsDouble();
    @StructMember(0) public native EOS_Lobby_AttributeData_Value setAsDouble(double AsDouble);
    @StructMember(0) public native int getAsBool();
    @StructMember(0) public native EOS_Lobby_AttributeData_Value setAsBool(int AsBool);
    @StructMember(0) public native BytePtr getAsUtf8();
    @StructMember(0) public native EOS_Lobby_AttributeData_Value setAsUtf8(BytePtr AsUtf8);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
