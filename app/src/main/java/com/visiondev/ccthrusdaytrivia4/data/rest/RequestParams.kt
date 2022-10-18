package com.visiondev.ccthrusdaytrivia4.data.rest

import kotlinx.serialization.Serializable

@Serializable
data class RequestParams(
    val boundingBox: BoundingBox? = null,
    val contentId: String? = null,
    val filters: List<FiltersItem?>? = null,
    val contentType: String? = null
)
@Serializable
data class FiltersItem(
	val id: String? = null,
	val value: List<String?>? = null
)
@Serializable
data class BoundingBox(
    val northEastCorner: NorthEastCorner? = null,
    val southWestCorner: SouthWestCorner? = null
)
@Serializable
data class SouthWestCorner(
	val latitude: Double? = null,
	val longitude: Double? = null
)
@Serializable
data class NorthEastCorner(
	val latitude: Double? = null,
	val longitude: Double? = null
)

