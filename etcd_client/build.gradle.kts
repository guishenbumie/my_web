plugins {
    id("java")
    id("com.google.protobuf") version "0.9.4"
}

group = "sfm.web"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // gRPC 核心依赖
    implementation("io.grpc:grpc-netty:1.70.0")
    implementation("io.grpc:grpc-protobuf:1.70.0")
    implementation("io.grpc:grpc-stub:1.70.0")
    // JDK 注解（可选，用于生成代码的注解）
    compileOnly("javax.annotation:javax.annotation-api:1.3.2")

    // 添加日志依赖
    implementation("org.slf4j:slf4j-api:1.7.36")
    implementation("ch.qos.logback:logback-classic:1.2.11")

    implementation("org.apache.commons:commons-lang3:3.19.0")
    implementation("com.google.auto.service:auto-service-annotations:1.1.1")
}

tasks.test {
    useJUnitPlatform()
}

// Protobuf 配置
protobuf {
    protoc {
        // 指定 protoc 编译器版本
        artifact = "com.google.protobuf:protoc:3.23.4"
    }
    plugins {
        // 配置 gRPC Java 插件
        create("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.56.0"
        }
    }
    generateProtoTasks {
        all().forEach { task ->
            // 对所有 proto 文件应用 gRPC 插件
            task.plugins {
                create("grpc")
            }
        }
    }
}

// 配置生成的代码目录（让 IDE 识别）
sourceSets {
    main {
        java {
            srcDirs("build/generated/source/proto/main/grpc")
            srcDirs("build/generated/source/proto/main/java")
        }
    }
}