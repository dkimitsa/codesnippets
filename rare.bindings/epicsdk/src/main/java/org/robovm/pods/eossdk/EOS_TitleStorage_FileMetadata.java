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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_TitleStorage_FileMetadata/*</name>*/ 
    extends /*<extends>*/Struct<EOS_TitleStorage_FileMetadata>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_TitleStorage_FileMetadataPtr extends Ptr<EOS_TitleStorage_FileMetadata, EOS_TitleStorage_FileMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_TitleStorage_FileMetadata.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EOS_TitleStorage_FileMetadata() {}
    public EOS_TitleStorage_FileMetadata(int ApiVersion, int FileSizeBytes, BytePtr MD5Hash, BytePtr Filename, int UnencryptedDataSizeBytes) {
        this.setApiVersion(ApiVersion);
        this.setFileSizeBytes(FileSizeBytes);
        this.setMD5Hash(MD5Hash);
        this.setFilename(Filename);
        this.setUnencryptedDataSizeBytes(UnencryptedDataSizeBytes);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getApiVersion();
    @StructMember(0) public native EOS_TitleStorage_FileMetadata setApiVersion(int ApiVersion);
    @StructMember(1) public native int getFileSizeBytes();
    @StructMember(1) public native EOS_TitleStorage_FileMetadata setFileSizeBytes(int FileSizeBytes);
    @StructMember(2) public native BytePtr getMD5Hash();
    @StructMember(2) public native EOS_TitleStorage_FileMetadata setMD5Hash(BytePtr MD5Hash);
    @StructMember(3) public native BytePtr getFilename();
    @StructMember(3) public native EOS_TitleStorage_FileMetadata setFilename(BytePtr Filename);
    @StructMember(4) public native int getUnencryptedDataSizeBytes();
    @StructMember(4) public native EOS_TitleStorage_FileMetadata setUnencryptedDataSizeBytes(int UnencryptedDataSizeBytes);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_TitleStorage_FileMetadata_Release", optional=true)
    public native void release();
    /*</methods>*/
}
