package jp.co.nssol.sysrdc.kotlin.mpp.template.common

/**
 * Platform別コード
 * <pre>
 *     プラットフォーム別で定義する必要があるメソッドやクラスなど抽象的な項目定義を行う
 * </pre>
 */

// 各プラットフォームごとのメソッド定義を要求する
// Android(Jvm)側はそのままグローバルメソッドとして呼び出せるが、
// iOS側は以下のような中間メソッド経由でないとそのまま呼び出せない(自動生成されるFrameworkヘッダがそうなってしまう)
expect fun platformName(): String

// 上を呼び出す中間メソッド
fun createApplicationScreenMessage(): String {
    return "actual fun on ${platformName()}" //+ JSON.stringify(Data.serializer(), Data("asdf", 15))
}


// 具体例がなかったが、classのexpectも出来るっぽい
// JavaのInterfaceっぽくなる
// ・expect側はクラスに対してのみexpectキーワードをつけ、メソッド本文なし
// ・actual側はメソッドにもactualキーワードがいる
expect class Platform() {
    fun name(): String
}




