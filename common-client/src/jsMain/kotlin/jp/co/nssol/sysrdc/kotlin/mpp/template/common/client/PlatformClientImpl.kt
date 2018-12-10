package jp.co.nssol.sysrdc.kotlin.mpp.template.common.client

import jp.co.nssol.sysrdc.kotlin.mpp.template.common.model.Data

actual fun getData(): Data {
    return Data("Web-Client", 111)
}
