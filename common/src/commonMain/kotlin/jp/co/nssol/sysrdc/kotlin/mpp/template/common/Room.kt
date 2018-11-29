package jp.co.nssol.sysrdc.kotlin.mpp.template.common

import kotlinx.serialization.Serializable

// This format is enforced by Sessionize and it should not be changed unless we extract Sessionize DTO
@Serializable
data class Room(
    val name: String,
    val id: Int,
    val sort: Int
)
