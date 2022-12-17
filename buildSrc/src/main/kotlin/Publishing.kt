import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import java.net.URI

data class PublishingSetup(
    val url: String,
    val username: String,
    val password: String,
)

fun Project.getPublishingSetup(): PublishingSetup? {
    val url = getLocalProperty("MAVEN_PUBLISH_URL")
    val user = getLocalProperty("MAVEN_PUBLISH_USER")
    val password = getLocalProperty("MAVEN_PUBLISH_PASS")

    return if (url != null && user != null && password != null) {
        PublishingSetup(url, user, password)
    } else {
        null
    }
}

fun PublishingExtension.addRepositoryIfPresent(project: Project) {
    val publishingSetup = project.getPublishingSetup()

    if (publishingSetup != null) {
        repositories {
            maven {
                url = URI(publishingSetup.url)
                credentials {
                    username = publishingSetup.username
                    password = publishingSetup.password
                }
            }
        }
    }
}
