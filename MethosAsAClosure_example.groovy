// El operatos .& solo se ha utilizado con metodos que reciban un solo parametro

def list = ["David", "Jazmin", "Elena"]
list.each{
    println "${this.class.name} ${it}"
}

println ""

String printName(String name){
    println "${this.class.name}"
    println "$name"
}

printName("David") // Ejecuta el metodo

list.each(this.&printName) // Se utiliza el operador .& para accesar al metodo printName como si fuera un closure

println ""

def diHola = {
    println it
}

list.each(diHola)