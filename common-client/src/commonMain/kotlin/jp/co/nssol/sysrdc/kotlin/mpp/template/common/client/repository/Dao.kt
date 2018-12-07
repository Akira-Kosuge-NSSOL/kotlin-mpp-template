package jp.co.nssol.sysrdc.kotlin.mpp.template.common.repository

import jp.co.nssol.sysrdc.kotlin.mpp.template.common.domain.Api
import jp.co.nssol.sysrdc.kotlin.mpp.template.common.model.Data

class Dao(val url: String) {

    private val api = Api(url)

    suspend fun get(): Data? = try {
        api.read()
    } catch (cause: Throwable) {
        null
    }
}
