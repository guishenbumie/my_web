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

    // https://mvnrepository.com/artifact/com.google.guava/guava
    implementation("com.google.guava:guava:33.3.1-jre")
}

tasks.test {
    useJUnitPlatform()
}