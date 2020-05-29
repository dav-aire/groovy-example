def list = ["David", "Jazmin", "Elena"]
list.each{
    println "${this.class.name} ${it}"
}

println ""

String printName(String name){
    println "${this.class.name}"
    println name
}

printName("David") // Ejecuta el metodo