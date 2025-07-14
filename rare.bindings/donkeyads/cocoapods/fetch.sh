#!/bin/sh
set -e

# clean up
rm -rf Podfile.lock
rm -rf build
rm -rf fetch_pods.xcodeproj
rm -rf fetch_pods.xcworkspace
rm -rf Pods
rm -rf target-ios
rm -rf target-ios-sim
rm -rf DonkeyAdsSDKKitRvm.xcframework

# copy dummy project required to fetch lib using cocoapods
cp -R ../../scripts/fetch_pods.xcodeproj ./

PODNAME=DonkeyAdsSDKKitRvm
pod install 
pod update 
pushd Pods

xcodebuild -configuration Release -sdk iphoneos -scheme $PODNAME build \
         CODE_SIGNING_REQUIRED=NO CODE_SIGNING_ALLOWED=NO \
         CONFIGURATION_BUILD_DIR=../target-ios
xcodebuild -configuration Release -sdk iphonesimulator -scheme $PODNAME build \
         CODE_SIGNING_REQUIRED=NO CODE_SIGNING_ALLOWED=NO \
         CONFIGURATION_BUILD_DIR=../target-ios-sim
popd

xcodebuild -create-xcframework \
    -framework "target-ios-sim/${PODNAME}.framework" \
    -framework "target-ios/${PODNAME}.framework" \
    -output "${PODNAME}.xcframework"


rm -rf ../src/main/bro-gen/DonkeyAdsSDKKitRvm.framework/Headers
mkdir -p ../src/main/bro-gen/DonkeyAdsSDKKitRvm.framework/Headers
cp -R DonkeyAdsSDKKitRvm.xcframework/ios-arm64/DonkeyAdsSDKKitRvm.framework/Headers/ ../src/main/bro-gen/DonkeyAdsSDKKitRvm.framework/Headers

#rm -rf build
#rm -rf fetch_pods.xcodeproj
#rm -rf fetch_pods.xcworkspace
#rm -rf Pods
#rm -rf target-ios
#rm -rf target-ios-sim
