package com.msh.keywordsearch.repository.sigungu

import com.msh.keywordsearch.domain.sigungu.Sigungu
import org.springframework.data.jpa.repository.JpaRepository

interface SigunguRepository : JpaRepository<Sigungu, Long> {
}