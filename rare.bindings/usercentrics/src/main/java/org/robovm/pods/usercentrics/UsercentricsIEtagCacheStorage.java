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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UsercentricsIEtagCacheStorage/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "bootIdentifier:")
    void bootIdentifier(String identifier);
    @Method(selector = "getEtagKey:")
    String getEtagKey(String key);
    @Method(selector = "getStoredFileKey:etagValue:")
    String getStoredFileKey(String key, String etagValue);
    @Method(selector = "removeOfflineStaging")
    void removeOfflineStaging();
    @Method(selector = "restoreOfflineStaging")
    void restoreOfflineStaging();
    @Method(selector = "saveOfflineStaging")
    void saveOfflineStaging();
    @Method(selector = "storeFileAndEtagKey:etagValue:body:")
    void storeFileAndEtagKey(String key, String etagValue, String body);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
