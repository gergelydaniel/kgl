import org.gradle.api.Project
import java.io.File
import java.util.concurrent.TimeUnit

fun String.runCommand(workingDir: File = File("./")): String {
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
