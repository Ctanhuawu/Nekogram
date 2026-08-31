plugins {
    `kotlin-dsl`
    // kotlin("jvm") version "2.1.0"
}

gradlePlugin {
    plugins {
        register("testGenerator") {
            id = "test-generator"
            implementationClass = "com.example.TestGeneratorPlugin"
        }
        register("tlReaders") {
            id = "tl-readers"
            implementationClass = "tw.nekomimi.nekogram.tlv.TlReadersPlugin"
        }
    }
}

repositories {
    google()
    mavenCentral()
}
/*
val checkEmojiKeyboard by tasks.registering(GenerateSchemeTask::class) {

}
*/
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    incremental = false
}

dependencies {
    compileOnly(gradleApi())

    implementation("com.squareup.moshi:moshi:1.15.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.15.0")
    implementation("com.github.javaparser:javaparser-core:3.25.4")
    implementation("com.squareup:kotlinpoet:1.15.0")
}