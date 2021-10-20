package com.wttch.plugin.gradle.libs;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class WttchLibsPlugin implements Plugin<Project> {

  @Override
  public void apply(Project target) {
    target.getExtensions().add("", "");
  }
}
