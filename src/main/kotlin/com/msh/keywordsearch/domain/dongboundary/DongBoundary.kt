package com.msh.keywordsearch.domain.dongboundary

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class DongBoundary(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long = 0L,

    private val name: String,

    private val dongCode: String
) {
}