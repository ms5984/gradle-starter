plugins {
    id("starter-template.java-conventions")
    kotlin("jvm")
}

// capture the version of the Kotlin compiler used to compile this build script (see buildSrc/build.gradle.kts)
val kotlinVersion by extra(kotlin.coreLibrariesVersion)