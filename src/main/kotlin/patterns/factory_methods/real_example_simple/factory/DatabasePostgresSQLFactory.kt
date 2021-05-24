package patterns.factory_methods.real_example_simple.factory

import patterns.factory_methods.real_example_simple.data.DatabasePostgresSQL

class DatabasePostgresSQLFactory(
    private val database : DatabasePostgresSQL
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