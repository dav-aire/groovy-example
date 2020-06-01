//El metodo any valida que dentro de la coleccion un elemento cumpla con la codición dada, devuelve true o false segun sea el caso.
def anyElement = [1,2,3,4].any{element -> 
    //element > 5//false
    element > 2//true
}

println "${anyElement}"
assert anyElement == true