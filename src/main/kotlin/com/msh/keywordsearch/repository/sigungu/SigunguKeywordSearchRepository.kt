package com.msh.keywordsearch.repository.sigungu

import com.msh.keywordsearch.controller.dto.response.search.SigunguKeywordSearchResult
import com.msh.keywordsearch.domain.sigungu.QSigungu.sigungu
import com.msh.keywordsearch.repository.KeywordSearchRepository
import com.querydsl.core.types.Projections
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Repository

@Repository
class SigunguKeywordSearchRepository(
    val jpaQueryFactory: JPAQueryFactory
) : KeywordSearchRepository {
    override fun search(keyword: String): List<SigunguKeywordSearchResult> {
        return jpaQueryFactory
            .select(
                Projections.fields(
                    SigunguKeywordSearchResult::class.java,
                    sigungu.name
                )
            )
            .from(sigungu)
            .where(sigungu.name.contains(keyword))
            .fetch()
    }
}