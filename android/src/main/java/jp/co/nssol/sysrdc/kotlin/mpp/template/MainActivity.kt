package jp.co.nssol.sysrdc.kotlin.mpp.template

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import jp.co.nssol.sysrdc.kotlin.mpp.template.common.Platform
import jp.co.nssol.sysrdc.kotlin.mpp.template.common.platformName

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.textView).text = platformName()
        findViewById<TextView>(R.id.textView2).text = Platform().name()
    }
}
