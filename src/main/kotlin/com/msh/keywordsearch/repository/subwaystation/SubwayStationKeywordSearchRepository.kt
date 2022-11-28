package com.msh.keywordsearch.repository.subwaystation

import com.msh.keywordsearch.controller.dto.response.search.SubwayStationKeywordSearchResult
import com.msh.keywordsearch.domain.subwaystation.QSubwayStation.subwayStation
import com.msh.keywordsearch.repository.KeywordSearchRepository
import com.querydsl.core.types.Projections
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Repository

@Repository
class SubwayStationKeywordSearchRepository(
    val jpaQueryFactory: JPAQueryFactory
) : KeywordSearchRepository {
    override fun search(keyword: String): List<SubwayStationKeywordSearchResult> {
        return jpaQueryFactory
            .select(
                Projections.fields(
                    SubwayStationKeywordSearchResult::class.java,
                    subwayStation.name
                )
            )
            .from(subwayStation)
            .where(subwayStation.name.contains(keyword))
            .fetch()
    }
}