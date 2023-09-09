plugins {
    kotlin("jvm")
    id("maven-publish")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")

    implementation(libs.org.jogamp.gluegen.rt)
    implementation(libs.org.jogamp.jogl.all)

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
