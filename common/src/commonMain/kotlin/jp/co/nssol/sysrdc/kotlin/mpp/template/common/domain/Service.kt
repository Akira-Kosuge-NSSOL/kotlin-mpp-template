package jp.co.nssol.sysrdc.kotlin.mpp.template.common.domain

import jp.co.nssol.sysrdc.kotlin.mpp.template.common.model.Data

class Service {

    suspend fun test(): Data {
        var api = Api("http://www.google.co.jp")

        return api.read()
    }
}


