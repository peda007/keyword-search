package com.msh.keywordsearch.repository.subwaystation

import com.msh.keywordsearch.domain.subwaystation.SubwayStation
import org.springframework.data.jpa.repository.JpaRepository

interface SubwayStationRepository : JpaRepository<SubwayStation, Long> {
}