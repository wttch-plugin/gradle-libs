package com.wttch.plugin.gradle.libs

import org.gradle.api.artifacts.dsl.RepositoryHandler

fun RepositoryHandler.sonatypeRelease() {
    maven {
        it.setUrl("https://oss.sonatype.org/service/local/staging/deploy/maven2/")
    }
}

fun RepositoryHandler.sonatypeSnapshot() {
    maven {
        it.setUrl("https://oss.sonatype.org/content/repositories/snapshots/")
    }
}