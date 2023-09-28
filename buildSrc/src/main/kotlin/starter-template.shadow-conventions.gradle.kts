plugins {
    id("starter-template.java-conventions")
}

val missing = buildscript.configurations["classpath"].allDependencies.stream()
    .noneMatch { it.group == "com.github.johnrengelman" && it.name == "shadow" }
if (missing) {
    """
        The shadow plugin isn't on the convention plugin classpath.
        Make sure it's uncommented in the dependencies block of buildSrc/build.gradle.kts
    """.trimIndent().let(::error)
}
apply(plugin = "com.github.johnrengelman.shadow")