def emptyMap = [:]

println "El tipo de objetpo es ${emptyMap.getClass().name}"
println "El tamaño del Mapa es ${emptyMap.size()}"

def todos = ["a":"Primera sección del mapa", "b": "Segunda sección del mapa"]
println todos.size()
println todos["a"]
println todos.a
println todos."a"
println todos.getAt("b")
println todos.get("b")

println todos.get("c") //Se agrega mensaje si no existe el valor, si no se agrega mensaje envia null
println todos.get("c", "No reconocido, No existe") //Si el valor no existe, con esta forma es agregado al mapa

todos.d = "Tercera sección de rango"
println todos.d
todos.put("e", "Escribe la sección de strings")
println todos.e
todos.putAt "f", "escribe la sección closure" // Nota que no se utilizan parentesis
println todos.f
todos[null] = "No se envia nada" //un valor null tambien puede ser una llave
println todos[null]

todos.each{
    println "Key ${it.key} , Value ${it.value}"
}

todos.eachWithIndex{
    it, i -> println "${i} Key: ${it.key}, Value ${it.value}"
}

todos.values().each{ //No exise el metodo para obtener solo las llaves, aunque podriamos usar el each de arriba
    println "${it}"
}