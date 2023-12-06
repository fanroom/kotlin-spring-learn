package com.example.learning.entity

import jakarta.persistence.*
import org.hibernate.metamodel.internal.JpaMetaModelPopulationSetting

@Entity
@Table(name = "country")
class CountryEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    val name: String = "",
    val population: Int = 0,
) {

}