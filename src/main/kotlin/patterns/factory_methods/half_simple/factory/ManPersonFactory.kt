package patterns.factory_methods.half_simple.factory

import patterns.factory_methods.half_simple.enums.PersonTypeEnum
import patterns.factory_methods.half_simple.model.PersonModel

class ManPersonFactory : PersonFactory() {

    private fun getName(): String = "Lucas"
    private fun getAlias(): String = "Nepo"
    private fun getWeight(): Float = 70.0F

    override fun createPerson(category: PersonTypeEnum): PersonModel {
        return PersonModel(
            getName(),
            getAlias(),
            getWeight(),
            category
        ).apply {
            setCreatePerson(this)
        }
    }

}