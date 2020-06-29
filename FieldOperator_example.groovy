class Todo{
    String nombre
    def getNombre(){ //Metodo declarado manualmente, recordar que groovy crea automaticamente sus getter y setter cuando no son declarados ppor el usuario
        println "Obteniendo Nombre"
        nombre
    }
}

def todo = new Todo(nombre:"David")

println todo.nombre  // Aqui se invoca el metodo getNombre naturalmente 

println todo.@nombre // Pasa por alto el metodo getNombre y accesa directamente al valor del atributo nombre