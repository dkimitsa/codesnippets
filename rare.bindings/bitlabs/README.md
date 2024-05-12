# BitLabs iOS SDK

## Versions
| Release version | $pod_version     |
|-----------------|------------------|
| 3.2.1           | 3.2.1.0-SNAPSHOT |


## Install Instructions
Get 
  - `BitLabs.xcframeworks`
  - `Alamofire.xcframeworks`
  - `Alamofire.bundle`
from `cocoapods` using [fetch.sh](cocoapods/fetch.sh) script. 

### 3rd party native framework
This RoboPod requires you to add the native `BitLabs.xcframework`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path> <!-- path to BitLabs.xcframework -->
    </frameworkPaths>
    <resources>
        <resource>
            <path>res/Alamofire.bundle</path> <!-- path to Alamofire.bundle -->
        </resource>
    </resources>
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
   implementation "io.github.dkimitsa.robovm:robopods-bitlabs-ios:$pod_version"
}
```

## Home page
https://github.com/BitBurst-GmbH/bitlabs-ios-sdk
