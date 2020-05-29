/*
    Cuando un closure solo tiene un parametro de entrar se puede omitir la lista de argumentos y el simbolo -> y se ocupa la
    variable implicita 'it'
*/

def closIt = {
    println "Hola ${it}"
}

closIt.call("David");

println ""

/*
    La variable implicita 'this' hace referencia a la instancia de la clase donde el closure es definido (Todo lo que abarca la clase y dentro del closure invocado
    La variable implicita 'owner' hace referencia al objeto que esta solo dentro del closure
    La variable implicita 'delegate' es igual a 'owner' salvo que delegate puede ser cambiado, por ejemplo al valor de 'this'
*/

class Class1{
    def closure = {
        println "-- En closure--"
        println this.class.name
        println owner.class.name
        println delegate.class.name
        def closureAnidado = {
            println "--En closure anidado--"
            println this.class.name
            println owner.class.name
            println delegate.class.name
        }
        closureAnidado()
    }
}

def clos = new Class1().closure
clos()
println ""
println "--- Cambiando the delegate ---"
clos.delegate = this
clos()
println ""

def closure2 = {
    println "--- Closure fuera de Clase1 (En el script)"
    println this.class.name
    println delegate.class.name
    println owner.class.name
}

closure2()