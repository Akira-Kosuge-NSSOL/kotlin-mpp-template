package jp.co.nssol.sysrdc.kotlin.mpp.template.common

class Dao(val url: String) {

    private val api = Api(url)

    suspend fun update(): String = try {
        api.home()
    } catch (cause: Throwable) {
        "Error"
    }
}
