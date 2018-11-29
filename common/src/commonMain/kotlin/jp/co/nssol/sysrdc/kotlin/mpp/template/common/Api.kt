package jp.co.nssol.sysrdc.kotlin.mpp.template.common

import io.ktor.client.HttpClient
import io.ktor.client.features.ExpectSuccess
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.client.request.post
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.http.takeFrom

class Api(private val url: String) {
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

    suspend fun home(): String = client.get {
        url {
            takeFrom(url)
            encodedPath = "/home"
        }
        contentType(ContentType.Application.Json)
    }

    suspend fun login(userId: String, passwd: String): Unit = client.post {
        url {
            takeFrom(url)
            encodedPath = "/login"
        }
        contentType(ContentType.Application.Json)
        parameter("userId", userId)
        parameter("passwd", passwd)
    }
}