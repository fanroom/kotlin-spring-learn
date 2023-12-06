package com.example.learning.repository

import com.example.learning.entity.CountryEntity
import org.springframework.data.repository.CrudRepository

interface CountryRepository: CrudRepository<CountryEntity,  Int>{
}