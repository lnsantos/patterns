package patterns.factory_methods

import patterns.factory_methods.factory.ManPersonFactory
import patterns.factory_methods.factory.SuperManPersonFactory
import patterns.model.PersonModel

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

}