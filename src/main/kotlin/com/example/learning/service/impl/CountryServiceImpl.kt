package com.example.learning.service.impl

import com.example.learning.dto.CountryDto
import com.example.learning.entity.CountryEntity
import com.example.learning.repository.CountryRepository
import com.example.learning.service.CountryService
import org.springframework.stereotype.Service

@Service
class CountryServiceImpl(
    private val countryRepository: CountryRepository,
) : CountryService {

    override fun getAll(): List<CountryDto> {
        return countryRepository.findAll().map {it.toDto()}
    }
    private fun CountryEntity.toDto(): CountryDto =
        CountryDto(
            id = this.id,
            name = this.name,
            population = this.population,
        )
}