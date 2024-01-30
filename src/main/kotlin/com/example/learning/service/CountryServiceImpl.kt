package com.example.learning.service

import com.example.learning.dto.CountryDto
import com.example.learning.model.Country
import com.example.learning.repository.CountryRepository
import org.springframework.stereotype.Service

@Service
class CountryServiceImpl(
    private val countryRepository: CountryRepository,
) : CountryService {

    override fun getAll(): List<CountryDto> = countryRepository.getALL().map { it.toDto()}

    override fun create(dto: CountryDto): Int =
        countryRepository.create(dto.name, dto.population)

    override fun update(id: Int, dto: CountryDto) {
        countryRepository.update(id, dto.name, dto.population)
    }

    private fun Country.toDto() = CountryDto(
        id = id,
        name = name,
        population = population,
    )

}