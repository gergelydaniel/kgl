buildscript {
    repositories {
        maven("https://plugins.gradle.org/m2/")
        maven("https://repo1.maven.org/maven2/")
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
        classpath("com.android.tools.build:gradle:7.0.4")
    }
}

rootProject.ext["currentVersion"] = "0.5-ios15"
rootProject.ext["kotlin_version"] = "1.6.21"

allprojects {
    repositories {
        maven("https://plugins.gradle.org/m2/")
        maven("https://repo1.maven.org/maven2/")
        google()
        mavenCentral()
    }
}
