package patterns.factory_methods.half_simple.model

import patterns.factory_methods.half_simple.enums.PersonTypeEnum

data class PersonModel(
    val name: String,
    val alias: String,
    val weight: Float,
    val category: PersonTypeEnum
)