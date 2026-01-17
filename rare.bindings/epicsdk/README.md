# Epic SDK  (EOSSDK) iOS Framework

## Versions 
| Release version | $pod_version        |
|-----------------|---------------------|
| 1.18.1.2        | 1.18.1.2.0-SNAPSHOT |

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native libraries: 
-`EOSSDK.xcframework`

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path to EOSSDK.xcframework -->
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
   implementation "io.github.dkimitsa.robovm:robopods-epicsdk-ios:$pod_version"
}
```

