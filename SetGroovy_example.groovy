// Los Sets solo aceptan valores unicos, no lanza un error solo no se agrega
def emptySet = [] as Set
println emptySet.class.name
println emptySet.size()

def list = ["David", "David"]
def set = ["David", "David"] as Set //Hace unicos los valores repetidos

println "Tamaño de lista ${list.size()}, Tamaño de set ${set.size()}"
//formas de agregar elementos
set.add "Jazmin"
set << "Elena"
println set.size()
println set
println ""
set.each{
    println "${it}"
}
println ""
//Forma de remover elementos
set.remove 2
set-= "Jazmin"
set.each{
    println "${it}"
}
println ""

//Mas formas de agregar elementos
set+="Jazmin"
set+="Elena"
set.each{
    println "${it}"
}

//Formas de convirtir un Set a lista
list = set as List
println list.class.name
println set.asList().class.name
println set.toList().class.name