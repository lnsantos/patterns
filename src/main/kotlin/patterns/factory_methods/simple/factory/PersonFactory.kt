package patterns.factory_methods.simple.factory

import patterns.factory_methods.simple.model.PersonModel

abstract class PersonFactory {

    init {
        println("Class person has started")
    }

    abstract fun isThantPower(): Boolean
    abstract fun createPerson() : PersonModel

    fun getPerson() : PersonModel = createPerson()

    override fun toString() : String {
        return """
                - Alias: ${getPerson().alias}
                - Weight: ${getPerson().weight}
                - isPower: ${isThantPower().takeIf { it }?.let { "he is super human, and save to society..." } ?: "simple human :("}
        """
    }

}