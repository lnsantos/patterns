package patterns.factory_methods.real_example_simple

import patterns.factory_methods.real_example_simple.data.DatabasePostgresSQL
import patterns.factory_methods.real_example_simple.data.DatabaseSQL
import patterns.factory_methods.real_example_simple.factory.DatabasePostgresSQLFactory
import patterns.factory_methods.real_example_simple.factory.DatabaseSQLFactory
import patterns.factory_methods.real_example_simple.model.ClientModel

class ClientDAO(
    private val useMySql: Boolean
) {

    private val postgresSQL by lazy { DatabasePostgresSQLFactory(DatabasePostgresSQL()) }
    private val mySQL by lazy { DatabaseSQLFactory(DatabaseSQL()) }

    fun createClient(
        client: ClientModel
    ){
        val createClientQuery = "INSERT INTO client (name, alias) VALUES ('${client.name}', '${client.alias}');"
        if (useMySql){
            mySQL.insert(createClientQuery)
            return
        }

        postgresSQL.insert(createClientQuery)
    }

}