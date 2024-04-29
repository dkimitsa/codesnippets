# Amazon Publisher Services iOS SDK

## Versions
| Release version | $pod_version     |
|-----------------|------------------|
| 4.9.2           | 4.9.2.0-SNAPSHOT |


## Install Instructions
Get `DTBiOSSDK.xcframeworks` from `cocoapods` using [fetch.sh](cocoapods/fetch.sh) script. 

### 3rd party native framework
This RoboPod requires you to add the native `DTBiOSSDK.xcframework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path> <!-- path to DTBiOSSDK.xcframework -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
repositories {
    maven { url 'https://oss.sonatype.org/content/repositories/snapshots' }
}
dependencies {
   ... other dependencies ...
   implementation "io.github.dkimitsa.robovm:robopods-amazon-pub-services-ios:$pod_version"
}
```

## Home page
https://aps.amazon.com/aps/solutions-for-mobile-app-developers/
