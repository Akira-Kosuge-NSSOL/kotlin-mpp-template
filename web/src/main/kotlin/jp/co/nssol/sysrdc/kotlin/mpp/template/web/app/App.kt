package jp.co.nssol.sysrdc.kotlin.mpp.template.web.app

import jp.co.nssol.sysrdc.kotlin.mpp.template.web.logo.logo
import jp.co.nssol.sysrdc.kotlin.mpp.template.web.ticker.ticker
import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("App-header") {
            logo()
            h2 {
                +"Welcome to React with Kotlin"
            }
        }
        p("App-intro") {
            +"To get started, edit "
            code { +"app/App.kt" }
            +" and save to reload."
        }
        p("App-ticker") {
            ticker()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
