def emptyList = []
println "Tipo de clase igual a ${emptyList.class.name}"
println "Tamaño de lista igual a ${emptyList.size}"

def list = ["David"] // Se crea lista con un solo elemento
//Formas de agregar valores a una lista
list.add "Jazmin" //Notar que los parentesis son opcionales
list << "Elena" 
println list.size

list.each{
    println it
}

//Formas de accesar a los valores guardados
println list[1] // Por numero de posicion
list[0] = "Juan"
println list.get(0) //con el metodo Get


list.set(0, "Teresa") //Seteo de posición y valor en una lista
println list.get(0)

//remover valores de una lista
list.remove 2
list-="Jazmin"
list.each{
    println it
}

//Mas formas de agregar valores a una lista
list.add "Jazmin"
list+="Elena"
list.each{
    println it
}
println list[-1] //Accesa al ultimo valor guardado en la lista