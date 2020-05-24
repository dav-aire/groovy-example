def numRage = 0..9
println numRage.size()
numRage.each{
    print "${it} "
}

println ""
println numRage.contains(6) //Este metodo te envia true o false si el valor que se agrega existe o no en el rango
println numRage.contains(-1)

def alpheRange = "a".."z"
println alpheRange.size()
println alpheRange[2] //accesando al valor del rango por su posición

def exclusiveRange = 1..<10 //Puedes excluir valores en un rango
println exclusiveRange.size()
exclusiveRange.each{
    print "${it} "
}
println ""
println exclusiveRange.contains(10) //No existe le valor 10

def reverseRange = 9..0 //Rango inverso
reverseRange.each{
    print "${it} "
}

println ""
println ""

println "Estilo Groovy para bucles"
for (i in 0..9){
    print "${i} "
}
println ""
println "Bucle de rangos en Groovy"
(0..9).each{
    print "${it} "
}