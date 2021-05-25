package patterns.factory_methods.simple.factory

object MainPersonFactory {
    fun createPerson(isSuperMan: Boolean) : PersonFactory {
       if (isSuperMan) {
           return SuperManPersonFactory()
       }

        return ManPersonFactory()
    }
}
