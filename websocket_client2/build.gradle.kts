plugins {
    id("java")
}

group = "sfm.web"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("org.slf4j:slf4j-simple:2.0.9")
    implementation("org.slf4j:slf4j-api:2.0.13")

    implementation("jakarta.platform:jakarta.jakartaee-api:9.1.0")
    implementation("org.glassfish.tyrus.bundles:tyrus-standalone-client:2.0.0")

    implementation("com.fasterxml.jackson.core:jackson-databind:2.17.2")
    implementation("org.apache.thrift:libthrift:0.16.0")
}

tasks.test {
    useJUnitPlatform()
}