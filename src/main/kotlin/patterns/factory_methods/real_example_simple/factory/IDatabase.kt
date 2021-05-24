package patterns.factory_methods.real_example_simple.factory

interface IDatabase {

    fun insert(query: String)
    fun update(query: String)
    fun delete(query: String)

}