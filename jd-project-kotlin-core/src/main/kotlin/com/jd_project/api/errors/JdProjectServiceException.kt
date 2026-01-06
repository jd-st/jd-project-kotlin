// File generated from our OpenAPI spec by Stainless.

package com.jd_project.api.errors

import com.jd_project.api.core.JsonValue
import com.jd_project.api.core.http.Headers

abstract class JdProjectServiceException
protected constructor(message: String, cause: Throwable? = null) :
    JdProjectException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
