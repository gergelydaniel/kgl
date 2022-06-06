plugins {
    kotlin("jvm")
    id("maven-publish")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")

    implementation("org.jogamp.gluegen:gluegen-rt:2.3.2")
    implementation("org.jogamp.jogl:jogl-all:2.3.2")

    implementation(project(":kgl"))
}

java {
    withSourcesJar()
}

val publishEnabled = rootProject.ext["publishEnabled"] as Boolean? == true

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
            groupId = "com.danielgergely.kgl"
            artifactId = "kgl-logl"
            version = rootProject.ext["currentVersion"] as String

            from(components["java"])
        }
    }
}
