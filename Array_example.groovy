def stringArray = new String[3]
println stringArray.size()
stringArray[0] = "David"
println stringArray

stringArray[1] = "Jazmin"
stringArray[2] = "Elena"

println stringArray

println stringArray[1]
stringArray.each{ //ejemplo de uso each como un closure siempre regresa un elemento si no se definen explicitamente , la variable siempre se llama it
    println it
}
println stringArray[-1..-3] //Ejemplo de rango inverso