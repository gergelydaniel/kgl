buildscript {
    repositories {
        maven("https://plugins.gradle.org/m2/")
        maven("https://repo1.maven.org/maven2/")
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.21")
        classpath("com.android.tools.build:gradle:7.3.1")
    }
}

val versionInfo = versionInfo()
println("Version:${versionInfo.versionName}, Type:${versionInfo.type}")

rootProject.ext["kotlin_version"] = "1.7.21"

allprojects {
    repositories {
        maven("https://plugins.gradle.org/m2/")
        maven("https://repo1.maven.org/maven2/")
        google()
        mavenCentral()
    }
}
