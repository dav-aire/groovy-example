// Los Currying Closure es la funcionalidad para fijar valores en un closure con varios parametros de entrada

def closure = {x, y, z ->
    x + y + z
}

println "Ejecutando closure ${closure(3, 4, 8)}"

def newClosure = closure.curry(1, 4) // Se crea nuevo closure, copia de un closure anterior y fijando dos de los 3 parametros con el metodos Curry

println "Ejecutando closure con curry ya ejecutado ${newClosure(5)}" // Al ser invocado ya solo necesita un parametro de entrada ya que los dos parametros anteriores ya estan fiojados con el metodo curry