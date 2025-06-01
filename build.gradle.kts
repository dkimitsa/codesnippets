plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.13.1"
}

group = "com.robovmx"
version = "1.0.1"

repositories {
    mavenCentral()
}

intellij {
    version.set("2022.3.1")
    type.set("IC") 

    plugins.set(listOf("maven", "DevKit"))
    updateSinceUntilBuild.set(false)
}

tasks {
    withType<JavaCompile> {
        sourceCompatibility = "11"
        targetCompatibility = "11"
    }
}
