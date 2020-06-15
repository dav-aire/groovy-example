// El operador SpreadOperator es aplicar un metodo o acción sobre todos los objetos de una lista, es equivalente como si lo hicieras objeto por objeto
// Se puede aplicar sobre listas objetos etc, se agregan ejemplos
def map = [1:"David", 2:"Jazmin", 3:"Elena"]
def key = [10,20,30]
def values = ["David", "Jazmin", "Elena"]

println "Invocando llaves del mapa ${map*.key}"
println "Invocando valores del mapa ${map*.value}"

println "Invocando valores de una lista ${key*.value}"

def list = [[1], [45,65,98], [4,6]]
println "Invocando tamaño de las listas dentro de una lista ${list*.size()}"

class Person{
    String nombre
    int edad

    Person(String nombre, int edad){
        this.nombre = nombre
        this.edad = edad
    }
}

def personas = [new Person("David", 27), new Person("Jazmin", 25)]

println personas*.nombre
println personas*.edad
println "El tamaño del nombre de las personas es ${personas*.nombre*.length()}"
