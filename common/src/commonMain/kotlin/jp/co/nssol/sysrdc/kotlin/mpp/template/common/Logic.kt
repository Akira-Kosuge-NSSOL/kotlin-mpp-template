package jp.co.nssol.sysrdc.kotlin.mpp.template.common

class Logic {

    suspend fun test(): String {
        var dao = Dao("http://www.google.co.jp")

        return dao.update()
    }
}


