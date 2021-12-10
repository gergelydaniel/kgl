plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("maven-publish")
}

repositories {
    mavenCentral()
}

group = "com.danielgergely.kgl"
version = rootProject.ext["currentVersion"] as String

//def compilerArgs = [
//        //'-Xno-param-assertions',
//        //'-Xno-call-assertions',
//        //'-Xno-receiver-assertions'
//]

kotlin {
    jvm {
        //compilations.main.kotlinOptions.freeCompilerArgs = compilerArgs
    }

    js {
        //compilations.main.kotlinOptions.freeCompilerArgs = compilerArgs
    }

    linuxX64()
    mingwX64()

    explicitApi()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
            }
        }
        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
                //compileKotlinJs {
                //    kotlinOptions.metaInfo = true
                //    kotlinOptions.sourceMap = true
                //    kotlinOptions.suppressWarnings = true
                //    kotlinOptions.verbose = true
                //    kotlinOptions.main = "call"
                //    kotlinOptions.moduleKind = "umd"
                //}
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }

        val linuxX64Main by getting { }
        val mingwX64Main by getting { }

        val nativeMain by sourceSets.creating {
            dependsOn(commonMain)

            linuxX64Main.dependsOn(this)
            mingwX64Main.dependsOn(this)
        }
    }
}
