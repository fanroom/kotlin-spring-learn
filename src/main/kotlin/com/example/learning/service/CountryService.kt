package com.example.learning.service

import com.example.learning.dto.CountryDto

interface CountryService {
    fun getAll(): List<CountryDto>
    fun create(dto: CountryDto): Int
    fun update(id: Int, dto: CountryDto)
}