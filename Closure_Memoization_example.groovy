def closure = {x, y ->
    sleep(100);
    x + y
}

memoizedClosure = closure.memoize() // metodo que guarda en cache el resultado ejecutado de un metodo, cuando vuelve hacer ejecutado este al tener la información en cache procesa la información de forma mas rapida

def testTime(x, y){
    inicio = System.currentTimeMillis()
    memoizedClosure(x, y)
    termino = System.currentTimeMillis()

    println "x = ${x}, y = ${y} tiempo: ${termino - inicio} ms"
}

testTime(1, 2)
testTime(4, 6)
testTime(4, 8)
testTime(1, 2)
testTime(8, 29)
testTime(4, 8)