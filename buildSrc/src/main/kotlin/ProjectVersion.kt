import org.gradle.api.Project

val currentVersion: String by lazy {
    versionInfo().versionName
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
