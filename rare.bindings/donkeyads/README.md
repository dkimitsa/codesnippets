# DonkeyAdsSDKKit iOS Framework

## Versions 
| Release version | $pod_version        |
|-----------------|---------------------|
| 1.0.0           | 1.0.0.0-SNAPSHOT    |

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native libraries: 
-`DonkeyAdsSDKKit.xcframework`
-`DonkeyAdsSDKKitRvm.xcframework`

### To build `DonkeyAdsSDKKitRvm.xcframework`
- put `DonkeyAdsSDKKit.xcframework` to `cocoapods/src/DonkeyAdsSDKKitRvm/DonkeyAdsSDKKitRvm.xcframework`
- `cd cocoapods`
- `./fetch.sh`

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path to DonkeyAdsSDKKit.xcframework and DonkeyAdsSDKKitRvm.xcframework -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
repositories {
    maven { url 'https://central.sonatype.com/repository/maven-snapshots/' }
}
dependencies {
   ... other dependencies ...
   implementation "io.github.dkimitsa.robovm:robopods-donkeyads-ios:$pod_version"
}
```

