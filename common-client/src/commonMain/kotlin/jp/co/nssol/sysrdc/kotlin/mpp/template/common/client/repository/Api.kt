package jp.co.nssol.sysrdc.kotlin.mpp.template.common.client.repository

import io.ktor.client.HttpClient
import io.ktor.client.features.ExpectSuccess
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.*
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.contentType
import io.ktor.http.takeFrom
import jp.co.nssol.sysrdc.kotlin.mpp.template.common.model.Data

/**
 * バックエンド側のWebApiとの接続部
 * ktor版
 * <pre>
 * </pre>
 */
class Api(private val endPoint: String) {
    private val client = HttpClient {
        install(JsonFeature) {
            serializer = KotlinxSerializer().apply {
//                setMapper(AllData::class, AllData.serializer())
//                setMapper(Favorite::class, Favorite.serializer())
//                setMapper(Vote::class, Vote.serializer())
            }
        }
        install(ExpectSuccess)
    }

    suspend fun create(data: Data): String = client.put {
    }

    suspend fun read(): Data = client.get {
    }

    suspend fun update(data: Data): String = client.post {
    }

    suspend fun delete(id: String): Unit = client.delete() {
    }

    private fun HttpRequestBuilder.apiUrl(path: String, userId: String? = null) {
        if (userId != null) {
            header(HttpHeaders.Authorization, "Bearer $userId")
        }
        header(HttpHeaders.CacheControl, "no-cache")
        url {
            takeFrom(endPoint)
            encodedPath = path
        }
    }
}