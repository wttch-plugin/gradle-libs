package com.wttch.plugin.gradle.libs

import org.gradle.api.Project


fun Project.isReleaseVersion(): Boolean {
    return !version.toString().endsWith("SNAPSHOT")
}