# Nefta SDK

## Versions
| Release version | $pod_version     |
|-----------------|------------------|
| 3.3.0           | 3.3.0.0-SNAPSHOT |


## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `NeftaSDK.xcframework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path> <!-- path to NeftaSDK.xcframework -->
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
   implementation "io.github.dkimitsa.robovm:robopods-neftasdk-ios:$pod_version"
}
```

## Home page
https://github.com/Nefta-io/NeftaSDK-iOS
