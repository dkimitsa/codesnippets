buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        maven("https://central.sonatype.com/repository/maven-snapshots")
    }
    dependencies {
        classpath(libs.robovm.gradle.plugin)
    }
}
plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.composeCompiler)
}
apply(plugin = "robovm")

dependencies {
    implementation(project(":shared"))

    implementation(libs.robovm.rt)
    implementation(libs.robovm.cocoatouch)
    implementation(libs.robovm.compose.interop)
}
