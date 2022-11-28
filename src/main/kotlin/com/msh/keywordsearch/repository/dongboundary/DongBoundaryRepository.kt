package com.msh.keywordsearch.repository.dongboundary

import com.msh.keywordsearch.domain.dongboundary.DongBoundary
import org.springframework.data.jpa.repository.JpaRepository

interface DongBoundaryRepository : JpaRepository<DongBoundary, Long> {
}