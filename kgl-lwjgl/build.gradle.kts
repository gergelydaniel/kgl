plugins {
    kotlin("jvm")
    id("maven-publish")
}

repositories {
    mavenCentral()
}

val lwjglVersion = "3.3.0"
val kotlinVersion = rootProject.ext["kotlin_version"] as String

version = rootProject.ext["currentVersion"] as String

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

//val sourcesJar by creating(Jar::class) {
//    //dependsOn(JavaPlugin.CLASSES_TASK_NAME)
//    classifier = "sources"
//    from(sourceSets["main"].allSource)
//}

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
            artifactId = "kgl-lwjgl"
            version = rootProject.ext["currentVersion"] as String

            from(components["java"])
            //artifact(sourcesJar.get())
        }
    }
}
