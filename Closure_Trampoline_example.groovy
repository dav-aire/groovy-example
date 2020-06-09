def factorial

/*
factorial = {n, BigInteger acc = 1 ->
    n == 1 ? acc : factorial(n-1, n*acc)
}

println "${factorial(1000)}"
*/
//El codigo anterior, al ser ejecutado causa un error de tipo java.lang.StackOverflowError por que se crea un desbordamiento de pila como menciona su nombre cuando la cantidad es muy grande
//Esto se puede solucionar con el metodo .trampoline ya que este ejecuta por turno un bucle de funciones evitando el desbordamiento de funciones (No se invocan de un solo golpe, si no espera a que termine una para invocar al siguiente).

factorial = {n, BigInteger acc=1 ->
    n == 1 ? acc : factorial.trampoline(n-1, n*acc)
}.trampoline()


println "${factorial(1000)}" // Ya no causa el error de desbordamiento y ejecuta de forma correcta la funcion