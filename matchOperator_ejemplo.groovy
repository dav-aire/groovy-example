assert "abc" ==~ 'abc' : "No es igual"
assert "abc" ==~ /abc/ : "No es igual con slashy"
//assert "abcabc" ==~ /abc/ : "Provocando fallo"

// Este signo ^ indica que la cadena inicia con a y el signo . indica el caracter de termina
assert "abc" ==~ /^a.c/ : "No inicia con a ni termina con c" 

//En la condición se indica que inicia con a y que hay dos caracteres mas aparte de a
assert "abc" ==~ /^a../ : "No inicia con a ni tiene dos caracteres mas"  

//En la condición se indica que la cadena de texto puede tener n caracteres pero debe de terminar en con el caracter c
assert "abc esto es otra c" ==~ /.*c$/

//Misma logica que arriba salvo que aqui se agrega el caracter de escape \ para no tomar en cuenta el signo dolar, por eso es mejor ocupar los slashy strings
assert "abc" ==~ ".*c\$"