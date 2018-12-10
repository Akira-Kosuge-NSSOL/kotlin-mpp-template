package jp.co.nssol.sysrdc.kotlin.mpp.template.common

/**
 * jsプラットフォームコード
 */

// expectメソッドの実体
actual fun platformName(): String {
    return "Web"
}

// expectクラスの実体
actual class Platform {
    actual fun name(): String = "Web"
}
