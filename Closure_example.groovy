def closureVar ={
    println "Hola mundo"
}

println "Un closure no se ejecuta hasta que es llamado"
println ""
closureVar.call() // Metodo predefinido para los closure que llama a ejecución al closure
println ""
println "Ejemplo closure con parametros"

def closurWithParameter = {param ->
    println "Hola ${param}"
}

closurWithParameter.call("David Torres") //Llamada explicita con el metodo call
closurWithParameter("Jazmin Basilio")//Llamada implicita solo enviado argumentos
println ""
println "Ejemplo closure con parametros y uno de ellos tiene un valor por default"
def closureDefaultParameter = {param1, param2 = "Valor default" ->
    println "${param1}  ${param2}"  
}
//Para un closure con parametros por default, cuando se envian todos los datos el closure no ocupa los valores default, pero cuando no se envia valor el closure toma el valor por default
closureDefaultParameter("Hola", "Mundo") 
closureDefaultParameter("Hola")

println ""
println "Ejemplo valor retorno en closure"
//La palabra reservada return es opcional, cuando no se agrega el closure devuelve la ultima linea ejecutada en el cuerpo del closure
def suma = {list -> 
    return list.sum()
}
def resta = {num1, num2 -> 
    num1 -num2
}
println "El valor devuelto por el closure suma es ${suma([2,2])}"
println "El valor devuelto por el closure resta es ${resta(6,3)}"

//Un closure es formado por variables libres (free variable) que son variables no locales y que no son parametros del closure pero que estan al mismo alcance que la declaracicón del closure
println ""
println "Ejemplo variables libres y closure"
def variableLibre = "Soy una variable libre"
def variableLibreNumero = 20
def clusureVarFree = {strg , num ->
    def sumaV = num + variableLibreNumero
    println "${strg} y el valor de la suma de la variable libre con el parametro obtenido es ${sumaV}"
}

clusureVarFree.call(variableLibre, 5) //closure quocupa variables libres