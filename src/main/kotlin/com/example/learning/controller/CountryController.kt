package com.example.learning.controller

import com.example.learning.dto.CountryDto
import com.example.learning.service.CountryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/countries")
class CountryController (
    private val countryService: CountryService
){
    @GetMapping
    fun getAll(): List<CountryDto> = countryService.getAll()
}