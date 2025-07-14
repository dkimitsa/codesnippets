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
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("CacheManagerRvm")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CacheManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CacheManagerPtr extends Ptr<CacheManager, CacheManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CacheManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CacheManager() {}
    protected CacheManager(Handle h, long handle) { super(h, handle); }
    protected CacheManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "saveAssetMetadata:")
    public native void saveAssetMetadata(AdAsset asset);
    @Method(selector = "clearAllCachedAssetsAndMetadata")
    public native void clearAllCachedAssetsAndMetadata();
    @Method(selector = "clearCache")
    public native void clearCache();
    @Method(selector = "updateAssetListWith:")
    public native NSArray<AdAsset> updateAssetList(NSArray<AdAsset> newAssets);
    @Method(selector = "updateAssetListAndCleanupOutdatedWith:")
    public native NSArray<AdAsset> updateAssetListAndCleanupOutdated(NSArray<AdAsset> newAssets);
    @Method(selector = "finalizeDownloadWithAsset:sourceURL:isSourceHoldingURL:")
    public native boolean finalizeDownload(AdAsset asset, NSURL sourceURL, boolean isSourceHoldingURL);
    @Method(selector = "markDownloadFailedWithAssetId:")
    public native void markDownloadFailed(String assetId);
    @Method(selector = "getReadyAssets")
    public native NSArray<AdAsset> getReadyAssets();
    @Method(selector = "getLoadedAssetsWithNamedOnly:")
    public native NSArray<AdAsset> getLoadedAssets(boolean namedOnly);
    @Method(selector = "namedAdWithName:")
    public native AdAsset getNamedAd(String name);
    @Method(selector = "getNextAd")
    public native AdAsset getNextAd();
    @Method(selector = "hasValidCachedAssets")
    public native boolean hasValidCachedAssets();
    @Method(selector = "getFileURLFor:")
    public native NSURL getFileURLFor(String assetId);
    @Method(selector = "performAutomaticCleanup")
    public native void performAutomaticCleanup();
    @Method(selector = "getCacheStats")
    public native CacheStats getCacheStats();
    @Method(selector = "performDeepCleanup")
    public native void performDeepCleanup();
    @Method(selector = "shouldPerformCleanup")
    public native boolean shouldPerformCleanup();
    @Method(selector = "getPendingWifiOnlyAssets")
    public native NSArray<AdAsset> getPendingWifiOnlyAssets();
    @Method(selector = "getFailedDownloadAssets")
    public native NSArray<AdAsset> getFailedDownloadAssets();
    @Method(selector = "validateAndUpdateMetadata")
    public native void validateAndUpdateMetadata();
    @Method(selector = "markDownloadSkippedDueToNetworkWithAssetId:")
    public native void markDownloadSkippedDueToNetwork(String assetId);
    @Method(selector = "nextAvailableAd")
    public native AdAsset nextAvailableAd();
    @Method(selector = "localURLFor:")
    public native NSURL localURLFor(AdAsset asset);
    @Method(selector = "getAssetBy:")
    public native AdAsset getAssetBy(String assetId);
    @Method(selector = "getLatestAssetWithId:")
    public native AdAsset getLatestAsset(String id);
    @Method(selector = "shared")
    public static native CacheManager shared();
    /*</methods>*/

    // dkimitsa: manually moved here from CacheManagerRvm_CacheStats
    @Library(Library.INTERNAL) @NativeClass("CacheManagerRvm_CacheStats")
    public static class CacheStats extends NSObject {
        public static class CacheStatsPtr extends Ptr<CacheStats, CacheStatsPtr> {}
        static { ObjCRuntime.bind(CacheStats.class); }

        protected CacheStats() {}
        protected CacheStats(Handle h, long handle) { super(h, handle); }
        protected CacheStats(SkipInit skipInit) { super(skipInit); }

        @Property(selector = "assetCount")
        public native @MachineSizedSInt long getAssetCount();
        @Property(selector = "totalSizeBytes")
        public native long getTotalSizeBytes();
        @Property(selector = "namedCount")
        public native @MachineSizedSInt long getNamedCount();
        @Property(selector = "unnamedCount")
        public native @MachineSizedSInt long getUnnamedCount();
    }
}
