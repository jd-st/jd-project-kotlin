package com.jd_project.api.errors

open class JdProjectException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
