package com.example.learning.repository

import com.example.learning.model.Country

interface CountryRepository{
    fun getALL(): List<Country>
}