package com.github.francmarin98.vitessedarktheme.services

import com.intellij.openapi.project.Project
import com.github.francmarin98.vitessedarktheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
