package com.msh.keywordsearch.service

import com.msh.keywordsearch.controller.dto.response.KeywordSearchResponseDto
import com.msh.keywordsearch.repository.KeywordSearchRepository
import org.springframework.stereotype.Service

@Service
class KeywordSearchService(
    private val keywordSearchRepositories: List<KeywordSearchRepository>
) {
    fun search(keyword: String?): List<KeywordSearchResponseDto> {
        if (keyword.isNullOrBlank()) {
            throw RuntimeException("검색 키워드를 입력해야 합니다.") // 키워드 없을 때 추천 검색어만 리턴하게 작성할 경우 throw 지우고 이곳에
        }
        val resultList = keywordSearchRepositories.flatMap { it.search(keyword) }
        return resultList.map { it.toResponseDto() }
    }

}
