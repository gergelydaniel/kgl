plugins {
    kotlin("multiplatform")
    id("maven-publish")
}

group = "com.danielgergely.kgl"
version = rootProject.ext["currentVersion"] as String

repositories {
    mavenCentral()
}

kotlin {
    /* Targets configuration omitted. 
    *  To find out how to configure the targets, please follow the link:
    *  https://kotlinlang.org/docs/reference/building-mpp-with-gradle.html#setting-up-targets */

    iosArm64()
    iosX64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation(project(":kgl"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val iosArm64Main by getting { }
        val iosX64Main by getting { }

        val nativeMain by sourceSets.creating {
            dependsOn(commonMain)

            iosArm64Main.dependsOn(this)
            iosX64Main.dependsOn(this)
        }
    }
}
