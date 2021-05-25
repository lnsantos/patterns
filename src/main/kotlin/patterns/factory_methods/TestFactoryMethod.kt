package patterns.factory_methods

import patterns.factory_methods.half_simple.enums.PersonTypeEnum
import patterns.factory_methods.real_example_simple.ClientDAO
import patterns.factory_methods.real_example_simple.model.ClientModel
import patterns.factory_methods.simple.factory.MainPersonFactory
import patterns.factory_methods.simple.factory.ManPersonFactory
import patterns.factory_methods.simple.factory.SuperManPersonFactory
import patterns.factory_methods.simple.model.PersonModel

typealias HalfManFactory = patterns.factory_methods.half_simple.factory.ManPersonFactory
typealias HalfSuperManFactory = patterns.factory_methods.half_simple.factory.SuperManPersonFactory

class TestFactoryMethod {

    fun simpleExample(){
        println(":: Simple Factory Method")
        val supermanFactory = MainPersonFactory.createPerson(true)
        val superMan : PersonModel = supermanFactory.createPerson()
        println("""
            Display name: ${superMan.name}
            data: 
            ${supermanFactory.toString()}
        """.trimIndent())

        val personFactory = MainPersonFactory.createPerson(false)
        val person : PersonModel = personFactory.createPerson()
        println("""
            Display name: ${person.name}
            data: 
            ${personFactory.toString()}
        """.trimIndent())
    }

    fun halfSimpleExample(){
        println(":: Half Simple Factory Method")

        val superManFactory = HalfManFactory()
        superManFactory.createPerson(PersonTypeEnum.SUPER)
        println(superManFactory.toString())

        val manPersonFactory = HalfSuperManFactory()
        manPersonFactory.createPerson(PersonTypeEnum.COMMON)
        println(manPersonFactory.toString())
    }

    fun realExampleSimple(){
        println(":: Real example Simple Factory Method")

        val createClient = ClientModel("Lucas","Dev")
        ClientDAO(useMySql = true).createClient(createClient)
        ClientDAO(useMySql = false).createClient(createClient)
    }

}