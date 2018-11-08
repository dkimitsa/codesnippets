#/bin/sh
set -e
# just put in build folder here
BUILD_DIR=build
BUILD_ROOT=build
CONFIGURATION=Release
TARGET=EnhanceW
OUTPUTFOLDER=lib

# Step 1. Build Device and Simulator versions
xcodebuild -verbose -target ${TARGET} -configuration ${CONFIGURATION} -sdk iphoneos -arch arm64 -arch armv7 -arch armv7s BUILD_DIR="${BUILD_DIR}" BUILD_ROOT="${BUILD_ROOT}"
xcodebuild -verbose -target ${TARGET} -configuration ${CONFIGURATION} -sdk iphonesimulator -arch i386 -arch x86_64 BUILD_DIR="${BUILD_DIR}" BUILD_ROOT="${BUILD_ROOT}"

# make sure the output directory exists
mkdir -p "${OUTPUTFOLDER}"

# Step 2. Create universal binary file using lipo
lipo -create -output "${OUTPUTFOLDER}/libenhancew.a" "${BUILD_DIR}/${CONFIGURATION}-iphoneos/libEnhanceW.a" "${BUILD_DIR}/${CONFIGURATION}-iphonesimulator/libEnhanceW.a"

# Last touch headers
cp ${BUILD_DIR}/${CONFIGURATION}-iphoneos/include/EnhanceW/*.h "${OUTPUTFOLDER}/"
cp Enhance/*.h "${OUTPUTFOLDER}/"

# build success just issue file to print platforms included
echo === Included archs
file "${OUTPUTFOLDER}/libenhancew.a"

