def key1 = {
    println "Closure como llave"
}

def Map map1 = [(key1): 100] //Uso de closure como llave dentro de un Mapa, obligatorio el uso de () cuando la llave es un closure ya que sirve con caracteres de escape

println map1.get(key1) //Para obter el valor de la llave (llave como closure)
println map1[key1]

map1 = [key1: { println "Closure como valor"}]

println ""

map1.key1() //obtiene el valor por medio de la llave, el regreso es la ejecución del closure


