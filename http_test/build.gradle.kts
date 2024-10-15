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

    // https://mvnrepository.com/artifact/org.apache.httpcomponents.client5/httpclient5
    implementation("org.apache.httpcomponents.client5:httpclient5:5.3.1")
    // https://mvnrepository.com/artifact/org.apache.commons/commons-lang3
    implementation("org.apache.commons:commons-lang3:3.17.0")
    implementation("com.alibaba:fastjson:2.0.52")
}

tasks.test {
    useJUnitPlatform()
}