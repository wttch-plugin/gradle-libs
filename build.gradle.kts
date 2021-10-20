plugins {
    java
    kotlin("jvm") version "1.4.32"
    id("java-gradle-plugin")
    id("com.gradle.plugin-publish") version "0.14.0"
}

group = "com.wttch.plugin"
version = "1.0"

pluginBundle {
    website = "https://blog.wttch.com"
    vcsUrl = "https://github.com/wttch-plugin/gradle-libs"
    tags = listOf("wttch", "libs")
}

gradlePlugin {
    plugins {
        create("greetingsPlugin") {
            id = "com.wttch.libs"
            displayName = "Wttch Library Gradle Plugin"
            description = "Wttch Library Gradle Plugin"
            implementationClass = "com.wttch.plugin.gradle.libs.WttchLibsPlugin"
        }
    }
}

repositories {
    mavenCentral()

}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}