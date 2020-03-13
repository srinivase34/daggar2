package com.mindorks.bootcamp.learndagger

import com.mindorks.bootcamp.learndagger.di.module.ApiStudent
import com.mindorks.bootcamp.learndagger.di.module.Student

/*
* Singleton class is threadsafe in kotlin
* */

class StudentMapper {

    fun map(apiStudent: ApiStudent): Student {
        return Student(
                "${apiStudent.firstName} ${apiStudent.lastname}",
                apiStudent.averageMarks
        )
    }
}