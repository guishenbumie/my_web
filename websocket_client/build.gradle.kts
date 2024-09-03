import com.google.protobuf.gradle.id

plugins {
    id("java")
    id("com.google.protobuf") version "0.9.2"
}

group = "sfm.web"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("com.google.protobuf:protobuf-java:3.21.9")
    implementation("io.grpc:grpc-protobuf:1.53.0")
    implementation("io.grpc:grpc-stub:1.53.0")

    implementation("org.java-websocket:Java-WebSocket:1.5.3")
}

sourceSets {
    main {
        java {
            srcDirs("gen")
        }
        proto {
            srcDir({ rootProject.extra["protoDir"] })
            setIncludes(setOf("im.proto"))
        }
    }
}

protobuf {
    // 配置 protoc
    protoc {
        artifact = "com.google.protobuf:protoc:3.21.9"
    }
    // 配置 grpc
    plugins {
        // 这里需要加 id，旧版本可能是这样: grpc {}
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.53.0"
        }
    }
    // 配置 gradle task
    generateProtoTasks {
        ofSourceSet("main").forEach {
            it.plugins {
                id("grpc") { }
            }
        }
    }
}

tasks.test {
    useJUnitPlatform()
}