package com.example.learning.repository

import com.example.learning.model.Country
import org.springframework.jdbc.core.RowMapper
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class CountryRepositoryImpl(
    private val jdbcTemplate: NamedParameterJdbcTemplate,
): CountryRepository {
    override fun getALL(): List<Country> =
        jdbcTemplate.query(
            "select * from country order by name",
            ROW_MAPPER
        )
    private companion object{
        val ROW_MAPPER = RowMapper<Country>{ rs, _ ->
            Country(
                id = rs.getInt("id"),
                name = rs.getString("name"),
                population = rs.getInt("population"),
            )
        }
    }
}