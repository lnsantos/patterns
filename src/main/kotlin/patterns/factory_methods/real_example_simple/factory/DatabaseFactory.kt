package patterns.factory_methods.real_example_simple.factory

import patterns.factory_methods.real_example_simple.data.DatabasePostgresSQL
import patterns.factory_methods.real_example_simple.data.DatabaseSQL
import patterns.factory_methods.real_example_simple.factory.database.DatabasePostgresSQLFactory
import patterns.factory_methods.real_example_simple.factory.database.DatabaseSQLFactory
import patterns.factory_methods.real_example_simple.factory.database.IDatabase

object DatabaseFactory {

    fun createDatabase(useMySql: Boolean): IDatabase = when (useMySql) {
        true -> DatabaseSQLFactory(DatabaseSQL())
        else -> DatabasePostgresSQLFactory(DatabasePostgresSQL())
    }

}
