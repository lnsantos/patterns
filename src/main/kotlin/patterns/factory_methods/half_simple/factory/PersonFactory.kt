package patterns.factory_methods.half_simple.factory

import patterns.factory_methods.half_simple.enums.PersonTypeEnum
import patterns.factory_methods.half_simple.model.PersonModel

abstract class PersonFactory {

    private lateinit var person : PersonModel

    init {
        println("Class person has started")
    }
    abstract fun createPerson(category: PersonTypeEnum) : PersonModel

    fun setCreatePerson(person: PersonModel) {
        this.person = person
    }

    override fun toString() : String {

        if (this::person.isInitialized){
            return """
                - name: ${person.name}
                - Alias: ${person.alias}
                - Weight: ${person.weight}
                - isPower: ${person.takeIf { it.category.isSuper }?.let { "he is super human, and save to society..." } ?: "simple human :("}
        """
        }

        return "Person data not found :("
    }

}