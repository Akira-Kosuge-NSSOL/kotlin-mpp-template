package jp.co.nssol.sysrdc.kotlin.mpp.template.common

expect fun platformName(): String

fun createApplicationScreenMessage(): String {
    return "Kotlin Rocks on ${platformName()}" //+ JSON.stringify(Data.serializer(), Data("asdf", 15))
}



