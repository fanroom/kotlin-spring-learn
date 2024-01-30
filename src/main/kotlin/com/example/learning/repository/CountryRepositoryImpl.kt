package com.example.learning.repository

import com.example.learning.model.Country
import org.springframework.jdbc.core.RowMapper
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.jdbc.support.GeneratedKeyHolder
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

    override fun create(name: String, population: Int): Int {
        val keyHolder = GeneratedKeyHolder()
        jdbcTemplate.update(
            "insert into country (name, population) values (:name, :population)",
            MapSqlParameterSource(
                mapOf(
                "name" to name,
                "population" to population,
                )
            ),
            keyHolder,
            listOf("id").toTypedArray()
        )
        return keyHolder.keys?.getValue("id") as Int
    }

    override fun update(id: Int, name: String, population: Int) {
        jdbcTemplate.update(
            "update country set name = :name, population = :population where id = :id",
            mapOf(
                "id" to id,
                "name" to name,
                "population" to population,
           )
        )
    }
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