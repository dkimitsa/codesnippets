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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_Sanctions_PlayerSanction/*</name>*/ 
    extends /*<extends>*/Struct<EOS_Sanctions_PlayerSanction>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_Sanctions_PlayerSanctionPtr extends Ptr<EOS_Sanctions_PlayerSanction, EOS_Sanctions_PlayerSanctionPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_Sanctions_PlayerSanction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_Sanctions_PlayerSanction() {}
    public EOS_Sanctions_PlayerSanction(int ApiVersion, long TimePlaced, BytePtr Action, long TimeExpires, BytePtr ReferenceId) {
        this.setApiVersion(ApiVersion);
        this.setTimePlaced(TimePlaced);
        this.setAction(Action);
        this.setTimeExpires(TimeExpires);
        this.setReferenceId(ReferenceId);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_Sanctions_PlayerSanction setApiVersion(int ApiVersion);
    @StructMember(1) public native long getTimePlaced();
    @StructMember(1) public native EOS_Sanctions_PlayerSanction setTimePlaced(long TimePlaced);
    @StructMember(2) public native BytePtr getAction();
    @StructMember(2) public native EOS_Sanctions_PlayerSanction setAction(BytePtr Action);
    @StructMember(3) public native long getTimeExpires();
    @StructMember(3) public native EOS_Sanctions_PlayerSanction setTimeExpires(long TimeExpires);
    @StructMember(4) public native BytePtr getReferenceId();
    @StructMember(4) public native EOS_Sanctions_PlayerSanction setReferenceId(BytePtr ReferenceId);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_Sanctions_PlayerSanction_Release", optional=true)
    public native void release();
    /*</methods>*/
}
