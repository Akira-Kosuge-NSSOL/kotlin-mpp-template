package jp.co.nssol.sysrdc.kotlin.native.common

import platform.UIKit.UIDevice

actual fun platformName(): String {

  return UIDevice.currentDevice.systemName() +
          " " +
          UIDevice.currentDevice.systemVersion
}

//https://stackoverflow.com/a/24505884