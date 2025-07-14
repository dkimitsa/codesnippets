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
package org.robovm.pods.donkeyads;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("AdAssetRvm")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AdAsset/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AdAssetPtr extends Ptr<AdAsset, AdAssetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AdAsset.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AdAsset() {}
    protected AdAsset(Handle h, long handle) { super(h, handle); }
    protected AdAsset(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "id")
    public native String getId();
    @Property(selector = "type")
    public native AssetType getType();
    @Property(selector = "url")
    public native NSURL getUrl();
    @Property(selector = "link")
    public native NSURL getLink();
    @Property(selector = "width")
    public native @MachineSizedSInt long getWidth();
    @Property(selector = "height")
    public native @MachineSizedSInt long getHeight();
    @Property(selector = "closeTimeout")
    public native @MachineSizedSInt long getCloseTimeout();
    @Property(selector = "filesizeBytes")
    public native long getFilesizeBytes();
    @Property(selector = "wifiOnly")
    public native boolean isWifiOnly();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "viewThroughLink")
    public native String getViewThroughLink();
    @Property(selector = "lastDownloadTimestamp")
    public native NSDate getLastDownloadTimestamp();
    @Property(selector = "setLastDownloadTimestamp:")
    public native void setLastDownloadTimestamp(NSDate v);
    @Property(selector = "cachedAtStartup")
    public native boolean isCachedAtStartup();
    @Property(selector = "setCachedAtStartup:")
    public native void setCachedAtStartup(boolean v);
    @Property(selector = "showCounter")
    public native @MachineSizedSInt long getShowCounter();
    @Property(selector = "setShowCounter:")
    public native void setShowCounter(@MachineSizedSInt long v);
    @Property(selector = "clickCounter")
    public native @MachineSizedSInt long getClickCounter();
    @Property(selector = "setClickCounter:")
    public native void setClickCounter(@MachineSizedSInt long v);
    @Property(selector = "overrideUrl")
    public native String getOverrideUrl();
    @Property(selector = "setOverrideUrl:")
    public native void setOverrideUrl(String v);
    @Property(selector = "externalTracker")
    public native String getExternalTracker();
    @Property(selector = "setExternalTracker:")
    public native void setExternalTracker(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "incrementShowCounter")
    public native void incrementShowCounter();
    @Method(selector = "incrementClickCounter")
    public native void incrementClickCounter();
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
