plugins {

    id("java")
    kotlin("jvm")
}

group = "dev.flxwdns.inventrium"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    maven {
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    // paper-api
    compileOnly("io.papermc.paper:paper-api:1.21-R0.1-SNAPSHOT")

    // junit
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(kotlin("stdlib-jdk8"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}