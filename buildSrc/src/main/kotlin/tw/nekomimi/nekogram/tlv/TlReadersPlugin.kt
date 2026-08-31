package tw.nekomimi.nekogram.tlv

import org.gradle.api.Plugin
import org.gradle.api.Project
import java.io.File

class TlReadersPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val task = project.tasks.register(
            "generateTlReaders",
            GenerateTlReadersTask::class.java
        ) {
            schemaDir = File(project.rootDir, "TMessagesProj_AppTests/tlscheme")
            tlrpcFile = File(project.projectDir, "src/main/java/org/telegram/tgnet/TLRPC.java")
            outputFile = "tw/nekomimi/nekogram/tlv/TlReaders.java"
            outputFolder.set(File(project.projectDir, "src/main/java"))
        }

        project.tasks.matching { it.name.contains("compile") && it.name.contains("Java") }.configureEach {
            dependsOn(task)
        }
    }
}
