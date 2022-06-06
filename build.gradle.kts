buildscript {
    repositories {
        maven("https://plugins.gradle.org/m2/")
        maven("https://repo1.maven.org/maven2/")
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
        classpath("com.android.tools.build:gradle:7.0.4")
    }
}

val versionInfo = versionInfo()

println("Version:${versionInfo.versionName}, Type:${versionInfo.type}")

rootProject.ext["currentVersion"] = versionInfo.versionName

rootProject.ext["publishEnabled"] = getLocalProperty("MAVEN_PUBLISH_URL") != null &&
        getLocalProperty("MAVEN_PUBLISH_USER") != null &&
        getLocalProperty("MAVEN_PUBLISH_PASS") != null

rootProject.ext["publishUrl"] = getLocalProperty("MAVEN_PUBLISH_URL")
rootProject.ext["publishUsername"] = getLocalProperty("MAVEN_PUBLISH_USER")
rootProject.ext["publishPassword"] = getLocalProperty("MAVEN_PUBLISH_PASS")
rootProject.ext["kotlin_version"] = "1.6.21"

allprojects {
    repositories {
        maven("https://plugins.gradle.org/m2/")
        maven("https://repo1.maven.org/maven2/")
        google()
        mavenCentral()
    }
}

enum class VersionType { RELEASE, SNAPSHOT }

data class VersionInfo(
    val versionName: String,
    val type: VersionType
)

fun versionInfo(): VersionInfo {
    val exactTag = "git describe --tags --exact-match".runCommand()
    return if (exactTag.isNotEmpty()) {
        VersionInfo(exactTag, VersionType.RELEASE)
    } else {
        val version = "git describe --tags --abbrev=0".runCommand()
        val hash = "git describe --always".runCommand()

        VersionInfo("$version-SNAPSHOT-$hash", VersionType.SNAPSHOT)
    }
}

fun String.runCommand(workingDir: File = file("./")): String {
    val parts = this.split("\\s".toRegex())
    val proc = ProcessBuilder(*parts.toTypedArray())
        .directory(workingDir)
        .redirectOutput(ProcessBuilder.Redirect.PIPE)
        .redirectError(ProcessBuilder.Redirect.PIPE)
        .start()

    proc.waitFor(1, TimeUnit.MINUTES)
    return proc.inputStream.bufferedReader().readText().trim()
}

fun Project.getLocalProperty(key: String): String? =
    rootDir.resolve("local.properties")
        .let { file ->
            if (file.exists()) {
                java.io.FileInputStream(file)
            } else {
                null
            }
        }?.use { fileInputStream ->
            val prop = java.util.Properties()
            prop.load(fileInputStream)
            prop.getProperty(key)
        } ?: System.getenv(key)
