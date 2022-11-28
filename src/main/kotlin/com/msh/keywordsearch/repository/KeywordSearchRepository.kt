package com.msh.keywordsearch.repository

import com.msh.keywordsearch.controller.dto.response.search.KeywordSearchResult

interface KeywordSearchRepository {

    fun search(keyword: String): List<KeywordSearchResult>
}