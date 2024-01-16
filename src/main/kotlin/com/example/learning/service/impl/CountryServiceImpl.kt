package com.example.learning.service.impl

import com.example.learning.dto.CountryDto
import com.example.learning.model.Country
import com.example.learning.repository.CountryRepository
import com.example.learning.service.CountryService
import org.springframework.stereotype.Service

@Service
class CountryServiceImpl(
    private val countryRepository: CountryRepository,
) : CountryService {

    override fun getAll(): List<CountryDto> = countryRepository.getALL().map { it.toDto()}

    private fun Country.toDto() = CountryDto(
        id = id,
        name = name,
        population = population,
    )

}