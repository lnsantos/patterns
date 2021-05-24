package patterns.factory_methods.real_example_simple.data

class DatabasePostgresSQL {

    fun execute(query: String){
        println("Query PostgresSQL: $query")
    }

}