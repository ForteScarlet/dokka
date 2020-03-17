publishing {
    publications {
        register<MavenPublication>("javadocPlugin") {
            artifactId = "javadoc-plugin"
            from(components["java"])
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.6.10")
}