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

    implementation("org.java-websocket:Java-WebSocket:1.5.3")
}

tasks.test {
    useJUnitPlatform()
}