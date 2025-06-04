plugins {
    id("java")
    id("org.jetbrains.intellij.platform") version "2.6.0"
    kotlin("jvm") version "2.1.21"
}

group = "com.robovmx"
version = "1.0.1"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        intellijIdeaCommunity("2024.2.1")
        bundledPlugin("com.intellij.java")
        bundledPlugin("org.jetbrains.kotlin")
    }
}