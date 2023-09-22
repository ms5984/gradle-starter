import org.gradle.kotlin.dsl.dependencies

plugins {
    id("java")
}

repositories {
    mavenCentral()
}

// Make java version accessible to importing projects
val javaVersion by extra(17)

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(javaVersion))
}

dependencies {
    compileOnly("org.jetbrains:annotations:24.0.1")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}