package jp.co.nssol.sysrdc.kotlin.mpp.template.common

/**
 * JVMプラットフォームコード
 */

// expectメソッドの実体
actual fun platformName(): String {
    return "Android"
}

// expectクラスの実体
actual class Platform {
    actual fun name(): String = "Android"
}
