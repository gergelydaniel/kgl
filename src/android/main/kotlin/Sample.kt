package sample

actual class Sample {
    actual fun checkMe() = 4242
}

actual object Platform {
    actual val name: String = "Android"
}