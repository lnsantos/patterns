package patterns.factory_methods.factory

import patterns.model.PersonModel

class ManPersonFactory : PersonFactory() {

    private fun getName(): String = "Lucas"
    private fun getAlias(): String = "Nepo"
    private fun getWeight(): Float = 70.0F

    override fun isThantPower(): Boolean = false
    override fun createPerson(): PersonModel {
        return PersonModel(
            getName(),
            getAlias(),
            getWeight()
        )
    }

}