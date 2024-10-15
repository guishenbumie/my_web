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

    // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
    implementation("org.slf4j:slf4j-api:2.0.16")
    // https://mvnrepository.com/artifact/commons-io/commons-io
    implementation("commons-io:commons-io:2.16.1")
    // https://mvnrepository.com/artifact/org.apache.commons/commons-lang3
    implementation("org.apache.commons:commons-lang3:3.12.0")
    // https://mvnrepository.com/artifact/org.apache.commons/commons-collections4
    implementation("org.apache.commons:commons-collections4:4.4")
    // https://mvnrepository.com/artifact/org.ow2.asm/asm-tree
    implementation("org.ow2.asm:asm-tree:9.7")
    // https://mvnrepository.com/artifact/com.google.guava/guava
    implementation("com.google.guava:guava:33.3.1-jre")

    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot
    implementation("org.springframework.boot:spring-boot:3.3.3")
    implementation("org.springframework.boot:spring-boot-autoconfigure:3.3.3")
    implementation("org.springframework.boot:spring-boot-starter:3.3.3")
    implementation("org.springframework.boot:spring-boot-starter-web:3.3.3")
    implementation("org.springframework.boot:spring-boot-starter-logging:3.3.3")

}

tasks.test {
    useJUnitPlatform()
}