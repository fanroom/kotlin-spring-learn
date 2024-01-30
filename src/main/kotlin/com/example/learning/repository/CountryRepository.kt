package com.example.learning.repository

import com.example.learning.model.Country

interface CountryRepository{
    fun getALL(): List<Country>

    fun create(name: String, population: Int): Int

    fun update(id: Int, name: String, population: Int)
}