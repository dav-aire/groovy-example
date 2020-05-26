def x = 13.1
def result = ""

switch (x){
    case "foo": 
        result = "String"
        break

    case [4,5,6]: //Cae aqui si el valor de x esta contenido en algun valor de la lista
        result = "List"
        break

    case 12..30: //Cae aqui si el valor de x esta contenido en algun valor del rango
        result = "Range"
        break
    
    case Integer://Cae aqui si el tipo de datos de x es integer
        result = "Integer"
        break

    case Number:
        result = "Number"
        break

    default:
        result = "Default"
        break
}

println "El valor regresado es ${result}"