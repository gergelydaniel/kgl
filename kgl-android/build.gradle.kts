plugins {
    id("com.android.library")
    id("kotlin-android")
    id("maven-publish")
}

android {
    compileSdk = 33

    defaultConfig {
        minSdk = 21
        targetSdk = 33
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
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

afterEvaluate {
    publishing {
        addRepositoryIfPresent(project)

        publications {
            create<MavenPublication>("maven") {
                from(project.components["release"])

                groupId = "com.danielgergely.kgl"
                artifactId = "kgl-android"
                version = currentVersion
            }
        }
    }
}
