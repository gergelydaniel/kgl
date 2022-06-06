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

publishing {
    addRepositoryIfPresent(project)

    publications {
        create<MavenPublication>("maven") {
            groupId = "com.danielgergely.kgl"
            artifactId = "kgl-logl"
            version = currentVersion

            from(components["java"])
        }
    }
}
