plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    // Comment/uncomment dependencies as needed
    // Sets the version of Kotlin imported by convention plugins
    // > check latest version at https://kotlinlang.org/docs/home.html
    implementation(kotlin("gradle-plugin", version="1.9.10"))
//    // Sets the version of shadow imported by convention plugins
//    // > check latest version at https://github.com/johnrengelman/shadow
//    implementation("com.github.johnrengelman:shadow:8.1.1")
}