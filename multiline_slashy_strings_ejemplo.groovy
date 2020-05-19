def name = "david"
def path = "c:/groovy"
def multilineSlashy = /
Hola $name 
path = $path
dolar = $
path = c:\/groovy    aqui si se utiliza un caracter de escape que es '\'
/

println multilineSlashy