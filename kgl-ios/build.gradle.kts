plugins {
    kotlin("multiplatform")
    id("maven-publish")
}

group = "com.danielgergely.kgl"
version = currentVersion

repositories {
    mavenCentral()
}

kotlin {
    iosArm64()
    iosX64()
    iosSimulatorArm64()

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
        val iosSimulatorArm64Main by getting { }

        val nativeMain by sourceSets.creating {
            dependsOn(commonMain)

            iosArm64Main.dependsOn(this)
            iosX64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }

        all {
            languageSettings.optIn("kotlinx.cinterop.ExperimentalForeignApi")
        }
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.RequiresOptIn"
}

publishing {
    addRepositoryIfPresent(project)
}
