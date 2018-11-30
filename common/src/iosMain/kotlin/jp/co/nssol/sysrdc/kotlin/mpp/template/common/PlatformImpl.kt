package jp.co.nssol.sysrdc.kotlin.mpp.template.common

import platform.UIKit.UIDevice

/**
 * iOSプラットフォームコード
 */

// expectメソッドの実体
actual fun platformName(): String {
    return UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

// expectクラスの実体
actual class Platform {
    actual fun name(): String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

//https://stackoverflow.com/a/24505884