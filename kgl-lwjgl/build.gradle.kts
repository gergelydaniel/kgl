plugins {
    kotlin("jvm")
    id("maven-publish")
}

repositories {
    mavenCentral()
}

val lwjglVersion = "3.3.0"
val kotlinVersion = rootProject.ext["kotlin_version"] as String

version = currentVersion

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")

    implementation("org.lwjgl:lwjgl:$lwjglVersion")
    implementation("org.lwjgl:lwjgl-assimp:$lwjglVersion")
    implementation("org.lwjgl:lwjgl-glfw:$lwjglVersion")
    implementation("org.lwjgl:lwjgl-openal:$lwjglVersion")
    implementation("org.lwjgl:lwjgl-opengl:$lwjglVersion")
    implementation("org.lwjgl:lwjgl-stb:$lwjglVersion")

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
            artifactId = "kgl-lwjgl"
            version = currentVersion

            from(components["java"])
        }
    }
}
