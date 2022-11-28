package com.msh.keywordsearch.controller.dto.response.search

import com.msh.keywordsearch.controller.dto.response.KeywordSearchResponseDto

interface KeywordSearchResult {

    fun toResponseDto(): KeywordSearchResponseDto
}