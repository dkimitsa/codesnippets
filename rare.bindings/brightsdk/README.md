# YabbiAds iOS Framework
Bright SDK pays a fixed daily rate, on top of your existing revenue

## Versions 
| Release version | $pod_version        |
|-----------------|---------------------|
| 1.486.56        | 1.486.56.0-SNAPSHOT |

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `brdsdk.xcframework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path to brdsdk.xcframework -->
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
   implementation "io.github.dkimitsa.robovm:robopods-brightsdk-ios:$pod_version"
}
```

## Home page

https://bright-sdk.com
