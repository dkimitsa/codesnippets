# AppHarbr by GeoEdge: Secure, High-Quality Ads for Optimal User Experience

## Versions
| Release version | $pod_version      |
|-----------------|-------------------|
| 1.14.3          | 1.14.3.0-SNAPSHOT |


## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `AppHarbrSDK.xcframework`.

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
    maven { url 'https://central.sonatype.com/repository/maven-snapshots/' }
}
dependencies {
    ... other dependencies ...
    implementation "io.github.dkimitsa.robovm:robopods-appharbrsdk-ios:$pod_version"
}
```

## Home page
https://appharbr.com
