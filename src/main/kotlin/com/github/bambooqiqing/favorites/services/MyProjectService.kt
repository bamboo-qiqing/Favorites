package com.github.bambooqiqing.favorites.services

import com.github.bambooqiqing.favorites.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
