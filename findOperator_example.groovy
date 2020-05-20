//Operador find encuentra caracteres en una cadena de texto y los almacena en un array bidireccional
// Nota: La expresión regular \w indica que inicia con un caracter de a-z y el signo mas es que continua con mas caracteres de a-z

//Ejemplo con solo una linea de texto, aqui solo regresa una posición en el array

def winpath = /C:\windows\system32\somedir/
def matcher = winpath =~ /(\w{1}):\\(\w+)\\(\w+)\\(\w+)/
println matcher
println matcher[0]
println matcher[0][4]
def newPath = matcher.replaceFirst('/etc/bin')
println newPath

//Ejemplo con varias lineas de texto, aqui regresa n posiciónes en el array segun las lineas de texto que haya en el string
def winpathMultiLine = /
C:\windows\system32\somedir
C:\windows\system32\CarpetaMas2
/

println winpathMultiLine

def matcherMultiLine = winpathMultiLine =~ /(\w{1}):\\(\w+)\\(\w+)\\(\w+)/
println matcherMultiLine
println matcherMultiLine[0]
println matcherMultiLine[1]