//El metodo find busca regresa el primer valor que cumpla con la condicion dictada dentro del closure
//Regresa null si ningun valor cumple

def foundElement = [1, 2, 3, 4].find(){element ->
    //element > 5 //Condición que no cumple
    element > 2 //Condición que cumple
}

println "${foundElement}"

assert foundElement == 3