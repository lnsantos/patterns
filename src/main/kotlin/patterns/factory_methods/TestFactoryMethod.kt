package patterns.factory_methods

import patterns.factory_methods.half_simple.enums.PersonTypeEnum
import patterns.factory_methods.simple.factory.ManPersonFactory
import patterns.factory_methods.simple.factory.SuperManPersonFactory
import patterns.factory_methods.simple.model.PersonModel

typealias HalfManFactory = patterns.factory_methods.half_simple.factory.ManPersonFactory
typealias HalfSuperManFactory = patterns.factory_methods.half_simple.factory.SuperManPersonFactory

class TestFactoryMethod {

    fun simpleExample(){
        val superManFactory = SuperManPersonFactory()
        val manPersonFactory = ManPersonFactory()

        println(":: Simple Factory Method")
        val superMan : PersonModel = superManFactory.getPerson()
        println("""
            Display name: ${superMan.name}
            data: 
            ${superManFactory.toString()}
        """.trimIndent())

        val person : PersonModel = manPersonFactory.getPerson()
        println("""
            Display name: ${person.name}
            data: 
            ${manPersonFactory.toString()}
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


}