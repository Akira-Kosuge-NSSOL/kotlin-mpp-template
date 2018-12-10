package jp.co.nssol.sysrdc.kotlin.mpp.template.web.index

import jp.co.nssol.sysrdc.kotlin.mpp.template.web.app.app
import kotlinext.js.*
import react.dom.*
import kotlin.browser.*

fun main(args: Array<String>) {
    requireAll(require.context("./", true, js("/\\.css$/")))

    window.onload = {
        render(document.getElementById("root")) {
            app()
        }
    }

}
