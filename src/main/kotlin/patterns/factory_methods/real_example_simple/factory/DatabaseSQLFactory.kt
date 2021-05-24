package patterns.factory_methods.real_example_simple.factory

import patterns.factory_methods.real_example_simple.data.DatabaseSQL

class DatabaseSQLFactory(
    private val database : DatabaseSQL
) : IDatabase {

    override fun insert(query: String) {
        database.execute(query)
    }

    override fun update(query: String) {
        database.execute(query)
    }

    override fun delete(query: String) {
        database.execute(query)
    }

}