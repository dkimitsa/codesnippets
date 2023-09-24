# YabbiAds iOS Framework
YabbiAds SDK for mobile advertising

## Versions 
| Release version       | $pod_version     |
|-----------------------|------------------|
| 1.6.0                 | 1.6.0.0-SNAPSHOT |

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `YabbiAds.xcframework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path to YabbiAds.xcframework -->
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
   implementation "io.github.dkimitsa.robovm:robopods-yabbiads-ios:$pod_version"
}
```

## Home page

https://yabbi.me/en
https://mobileadx.ru/maven/pods/YabbiAds/