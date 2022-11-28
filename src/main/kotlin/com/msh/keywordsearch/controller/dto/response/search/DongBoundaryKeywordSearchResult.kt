package com.msh.keywordsearch.controller.dto.response.search

import com.msh.keywordsearch.controller.dto.response.Coordinate
import com.msh.keywordsearch.controller.dto.response.KeywordSearchResponseDto

data class DongBoundaryKeywordSearchResult(
    val name: String? = null,
    val dongCode: String? = null
) : KeywordSearchResult {
    override fun toResponseDto(): KeywordSearchResponseDto {
        if (name.isNullOrBlank()) {
            throw RuntimeException("검색 이름은 반드시 필요합니다.")
        }
        return KeywordSearchResponseDto(name, Coordinate(127.1, 313.5))
    }
}