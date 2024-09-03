group = "sfm.web"
version = "1.0-SNAPSHOT"

subprojects {
    apply(plugin = "java")
    apply(plugin = "idea")

    repositories {
        mavenCentral()
        mavenLocal()
    }

    tasks.withType<JavaCompile>().configureEach {
        // options.compilerArgs += [
        //     "-Xlint:all",
        //     "-Xlint:-options",
        //     "-Xlint:-path",
        //     "-Xlint:-try"
        // ]
//        options.compilerArgs += "--enable-preview"
        options.compilerArgs.addAll(
            listOf(
                "--enable-preview",
                "--add-exports",
                "java.base/jdk.internal.misc=ALL-UNNAMED"
            )
        )
        options.encoding = "UTF-8"
        // Avoid Gradle OOM.
        // https://docs.gradle.org/current/userguide/performance.html#run_the_compiler_as_a_separate_process
        options.isFork = true
        // if (rootProject.hasProperty("failOnWarnings") && rootProject.failOnWarnings.toBoolean()) {
        //     options.compilerArgs += ["-Werror"]
        // }
    }

    tasks.withType<JavaExec>().configureEach {
        jvmArgs = (jvmArgs ?: listOf()) + "--enable-preview"
    }

    tasks.withType<Test>().configureEach {
        jvmArgs = (jvmArgs ?: listOf()) + "--enable-preview"
    }

    tasks.withType<GenerateModuleMetadata>().configureEach {
        enabled = false
    }

    plugins.withId("java") {
        configure<JavaPluginExtension> {
            sourceCompatibility = JavaVersion.VERSION_21
            targetCompatibility = JavaVersion.VERSION_21
        }
    }
}

extensions.extraProperties.set("protoDir", file("idl/grpc"))