package com.visiondev.ccthrusdaytrivia4.data.models

data class Response(
	val boundingBox: BoundingBox? = null,
	val contentId: String? = null,
	val filters: List<FiltersItem?>? = null,
	val contentType: String? = null
)

data class FiltersItem(
	val id: String? = null,
	val value: List<String?>? = null
)

data class BoundingBox(
	val northEastCorner: NorthEastCorner? = null,
	val southWestCorner: SouthWestCorner? = null
)

data class SouthWestCorner(
	val latitude: Double? = null,
	val longitude: Double? = null
)

data class NorthEastCorner(
	val latitude: Double? = null,
	val longitude: Double? = null
)

