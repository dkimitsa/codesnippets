#!/bin/sh
set -e

# clean up
rm -rf build
rm -rf fetch_pods.xcodeproj
rm -rf fetch_pods.xcworkspace
rm -rf Pods
rm -rf AppHabrSkd.xcframework

# copy dummy project required to fetch lib using cocoapods
cp -R ../../scripts/fetch_pods.xcodeproj ./

pod install 
pod update 
cp -R `find Pods/AppHarbrSDK -name "AppHarbrSDK.xcframework"` ./