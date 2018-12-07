package jp.co.nssol.sysrdc.kotlin.mpp.template.common.server

/**
 * JVMプラットフォームコード
 */

// expectメソッドの実体
actual fun platformName(): String {
    return "Jvm - server"
}

// expectクラスの実体
actual class Platform {
    actual fun name(): String = "Jvm - server"
}
