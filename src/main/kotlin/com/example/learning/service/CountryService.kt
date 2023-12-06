package com.example.learning.service

import com.example.learning.dto.CountryDto

interface CountryService {
    fun getAll(): List<CountryDto>
}