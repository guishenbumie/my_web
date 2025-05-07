plugins {
    id("java")
}

group = "sfm.web"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("io.netty:netty-all:4.1.115.Final")
    implementation("org.slf4j:slf4j-api:2.0.16")
    implementation("com.google.guava:guava:33.4.0-jre")
    implementation("org.bouncycastle:bcprov-jdk16:1.46")

    implementation("com.google.protobuf:protobuf-java:3.21.9")

    implementation("org.apache.commons:commons-lang3:3.16.0")
}

tasks.test {
    useJUnitPlatform()
}