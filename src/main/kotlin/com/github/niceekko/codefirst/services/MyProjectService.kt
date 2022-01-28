package com.github.niceekko.codefirst.services

import com.intellij.openapi.project.Project
import com.github.niceekko.codefirst.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
