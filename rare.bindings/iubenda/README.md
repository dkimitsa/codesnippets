# Iubenda SDK

## Versions
| Release version | $pod_version     |
|-----------------|------------------|
| 2.6.8           | 2.6.8.0-SNAPSHOT |


## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `iubenda.xcframework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path> <!-- path to iubenda.xcframework -->
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
   implementation "io.github.dkimitsa.robovm:robopods-iubenda-ios:$pod_version"
}
```

## Home page
https://www.iubenda.com/en/help/19678-cs-for-mobile-developers-guide
