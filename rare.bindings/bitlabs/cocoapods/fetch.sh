#!/bin/sh
set -e

# clean up
rm -rf build
rm -rf fetch_pods.xcodeproj
rm -rf fetch_pods.xcworkspace
rm -rf Pods
rm -rf target-ios
rm -rf target-ios-sim
rm -rf BitLabs.xcframework
rm -rf Alamofire.xcframework
rm -rf Alamofire.bundle

# copy dummy project required to fetch lib using cocoapods
cp -R ../../scripts/fetch_pods.xcodeproj ./

PODNAME=BitLabs
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

PODNAME=Alamofire
xcodebuild -create-xcframework \
    -framework "target-ios-sim/${PODNAME}.framework" \
    -framework "target-ios/${PODNAME}.framework" \
    -output "${PODNAME}.xcframework"

cp -R target-ios/Alamofire.bundle .