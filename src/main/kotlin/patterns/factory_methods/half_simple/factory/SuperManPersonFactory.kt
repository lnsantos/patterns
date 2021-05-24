package patterns.factory_methods.half_simple.factory

import patterns.factory_methods.half_simple.enums.PersonTypeEnum
import patterns.factory_methods.half_simple.model.PersonModel

class SuperManPersonFactory : PersonFactory() {

    private fun getName(): String = "Henry Cavill"
    private fun getAlias(): String = "Superman"
    private fun getWeight(): Float = 85.0F

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