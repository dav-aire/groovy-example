// El matodo collect itera sobre una colleción axistente convirtiendo cada elemento a un nuevo valor especificado dentro del closure y regresa una nueva lista con los elementos arrojados
def list = [1, 2, 3, 4].collect {element ->
    return element * 2
}

list.each{
    println it
}

assert list == [2, 4, 6, 8]
