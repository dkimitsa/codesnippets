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
rm -rf UsercentricsRvm.xcframework
rm -rf Usercentrics.xcframework
rm -rf UsercentricsUI.xcframework
rm -rf UsercentricsUIResources.bundle

# copy dummy project required to fetch lib using cocoapods
cp -R ../../scripts/fetch_pods.xcodeproj ./

PODNAME=UsercentricsRvm
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


cp -R Pods/Usercentrics/Usercentrics.xcframework .
cp -R Pods/UsercentricsUI/UsercentricsUI.xcframework .
cp -R Pods/UsercentricsUI/UsercentricsUIResources.bundle .

rm -rf build
rm -rf fetch_pods.xcodeproj
rm -rf fetch_pods.xcworkspace
rm -rf Pods
rm -rf target-ios
rm -rf target-ios-sim
