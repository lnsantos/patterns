package patterns.factory_methods.real_example_simple

import patterns.factory_methods.real_example_simple.factory.DatabaseFactory
import patterns.factory_methods.real_example_simple.model.ClientModel

class ClientDAO(
    private val useMySql: Boolean
) {

    fun createClient(
        client: ClientModel
    ){
       val createClientQuery = "INSERT INTO client (name, alias) VALUES ('${client.name}', '${client.alias}');"
       return DatabaseFactory.createDatabase(useMySql).insert(createClientQuery)
    }

}