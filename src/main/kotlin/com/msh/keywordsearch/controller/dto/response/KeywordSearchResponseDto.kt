package com.msh.keywordsearch.controller.dto.response

data class KeywordSearchResponseDto(
    val name: String,
    val center: Coordinate,
    val count: Long? = 0L,
    val boundary: Boundary? = null
)

data class Coordinate(
    val x: Double,
    val y: Double
)

data class Boundary(
    val coordinates: List<Coordinate>
)