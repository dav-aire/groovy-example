for (i in "Hola"){
    println i
}

for(i in 0..10){
    print i
}

for (i in [1,2,3,4]){
    print i
}
println ""
autores = [1:"Vishal", 2:"Jim", 3:"Chris", 4:"Joseph"]

for (entry in autores){
    println "${entry.key} ${entry.value}"
}