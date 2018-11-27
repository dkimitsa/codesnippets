#/bin/sh

# This script fetches and build the LGSideMenuController framework binary
set -e
mkdir -p libs
rm -f Cartfile
rm -rf Carthage
rm -rf libs/LGSideMenuController.framework
echo 'github "Friend-LGA/LGSideMenuController"' > Cartfile
carthage update
cp -r Carthage/Build/iOS/LGSideMenuController.framework libs/
rm -r Carthage
rm -f Cartfile
rm -f Cartfile.resolved
