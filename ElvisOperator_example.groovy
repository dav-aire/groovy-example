//El operador Elvis es un operador reducido del operador ternario de Java, cuando sabemos que se regresara un valor falso o nulo podemos ocuparlo.

def primerNombre = 1 != 1 ? null : "David" // Sin uso de operador Elvis
println primerNombre

def segundoNombre = 1 != 1 ?: "Torres" // Con uso de operador Elvis, ya no necesitamos indicar que se regresara un valor nulo
println segundoNombre

