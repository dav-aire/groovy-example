def list = ["David", "Jazmin", "Elena"]
println "Imprime lista desde list.each"
list.each{
    println it
}

String printName(String name){
    println "Ejecutado desde el metodo printName ${name}"
}

list.each(this.&printName) //Se envia como parametro de entrada el metodo printName que es parecido al primer each ejecutado en este codigo
