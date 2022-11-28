package com.msh.keywordsearch.repository.dongboundary

import com.msh.keywordsearch.controller.dto.response.search.DongBoundaryKeywordSearchResult
import com.msh.keywordsearch.domain.dongboundary.QDongBoundary.dongBoundary
import com.msh.keywordsearch.repository.KeywordSearchRepository
import com.querydsl.core.types.Projections
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Repository

@Repository
class DongBoundaryKeywordSearchRepository(
    val jpaQueryFactory: JPAQueryFactory
) : KeywordSearchRepository {
    override fun search(keyword: String): List<DongBoundaryKeywordSearchResult> {
        return jpaQueryFactory
            .select(
                Projections.fields(
                    DongBoundaryKeywordSearchResult::class.java,
                    dongBoundary.name,
                    dongBoundary.dongCode
                )
            )
            .from(dongBoundary)
            .where(dongBoundary.name.contains(keyword))
            .fetch()
    }
}