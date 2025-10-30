# Adjust SDK

## Versions
| Release version | $pod_version     |
|-----------------|------------------|
| 5.4.6           | 5.4.6.0-SNAPSHOT |


## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `AdjustSdk.xcframework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path> <!-- path to AdjustSdk.xcframework -->
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
    implementation "io.github.dkimitsa.robovm:robopods-adjust-ios:$pod_version"
}
```

## Home page
https://github.com/adjust/ios_sdk
https://dev.adjust.com/en/sdk/ios/
