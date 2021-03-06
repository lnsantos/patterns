package patterns.factory_methods.simple.factory

import patterns.factory_methods.simple.model.PersonModel

class SuperManPersonFactory : PersonFactory() {

    private fun getName(): String = "Henry Cavill"
    private fun getAlias(): String = "Superman"
    private fun getWeight(): Float = 85.0F

    override fun isThantPower(): Boolean = true
    override fun createPerson(): PersonModel {
        return PersonModel(
            getName(),
            getAlias(),
            getWeight()
        )
    }

}