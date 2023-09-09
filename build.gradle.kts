buildscript {
    repositories {
        maven("https://plugins.gradle.org/m2/")
        maven("https://repo1.maven.org/maven2/")
        google()
        mavenCentral()
    }
    dependencies {
        classpath(libs.org.jetbrains.kotlin.gradle.plugin)
        classpath(libs.com.android.tools.build.gradle)
    }
}

val versionInfo = versionInfo()
println("Version:${versionInfo.versionName}, Type:${versionInfo.type}")

allprojects {
    repositories {
        maven("https://plugins.gradle.org/m2/")
        maven("https://repo1.maven.org/maven2/")
        google()
        mavenCentral()
    }
}
