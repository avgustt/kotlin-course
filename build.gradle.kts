plugins {
    kotlin("jvm") version "1.8.10"
    application
}

group = "com.sergei"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.google.code.gson:gson:2.10.1")
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.2")


}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}