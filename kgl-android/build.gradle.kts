plugins {
    id("com.android.library")
    id("kotlin-android")
    id("maven-publish")
}

android {
    compileSdkVersion(31)

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(31)
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            //proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
        }
    }
}

val kotlinVersion = rootProject.ext["kotlin_version"] as String

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")

    implementation(project(":kgl"))
}

val publishEnabled = rootProject.ext["publishEnabled"] as Boolean? == true

afterEvaluate {
    publishing {
        if (publishEnabled) {
            repositories {
                maven {
                    url = uri(rootProject.ext["publishUrl"] as String)
                    credentials {
                        username = rootProject.ext["publishUsername"] as String
                        password = rootProject.ext["publishPassword"] as String
                    }
                }
            }
        }

        publications {
            create<MavenPublication>("maven") {
                from(project.components["release"])

                groupId = "com.danielgergely.kgl"
                artifactId = "kgl-android"
                version = rootProject.ext["currentVersion"] as String

            }
        }
    }
}
