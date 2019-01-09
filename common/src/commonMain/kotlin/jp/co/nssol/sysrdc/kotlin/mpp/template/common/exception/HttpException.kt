package jp.co.nssol.sysrdc.kotlin.mpp.template.common.exception

import kotlin.jvm.JvmOverloads

class HttpException : Exception {

    var statusCode: Int? = null
        internal set

    var responseBody: String? = null
        internal set

    @JvmOverloads
    constructor(message: String? = null,
                cause: Throwable? = null,
                statusCode: Int? = null,
                responseBody: String? = null) : super(message, cause) {
        this.statusCode = statusCode
        this.responseBody = responseBody
    }
}