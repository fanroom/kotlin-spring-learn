package com.example.learning.controller

import com.example.learning.dto.CountryDto
import com.example.learning.service.CountryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/countries")
class CountryController (
    private val countryService: CountryService
){
    @GetMapping
    fun getAll(): List<CountryDto> = countryService.getAll()

    @PostMapping
    fun create(@RequestBody dto: CountryDto): Int =
        countryService.create(dto)

    @PutMapping("/{id}")
    fun update(@PathVariable id: Int, @RequestBody dto: CountryDto) {
        countryService.update(id, dto)
    }
}