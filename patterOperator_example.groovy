//patter Operator crea una expresión regular reutilizable para otras cadenas 
def saying = """Now is the time for all good men (and women) to come to the aid
of their country"""

println saying
//La expresión regular indica que inicia (\w) con una letra y el signo "+en"  indica que las palabras terminen con las letras en
def pattern = ~/(\w+en)/  // aqui se crea el patter operator
def matcher = pattern.matcher(saying) //Ejecuta el metodo matcher para aplicar la expresión regular

println matcher
println matcher[0][0]
println matcher[1][0]

def count = matcher.getCount()
println "El numero de coincidencias es $count"
for(i in 0..<count){
    println matcher[i]
}