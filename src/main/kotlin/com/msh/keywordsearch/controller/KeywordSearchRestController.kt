package com.msh.keywordsearch.controller

import com.msh.keywordsearch.controller.dto.response.KeywordSearchResponseDto
import com.msh.keywordsearch.service.KeywordSearchService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/search")
class KeywordSearchRestController(
    private val keywordSearchService: KeywordSearchService
) {

    @GetMapping
    fun search(@RequestParam keyword: String?): ResponseEntity<List<KeywordSearchResponseDto>> {
        return ResponseEntity.ok(keywordSearchService.search(keyword))
    }
}