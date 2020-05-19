name = "vishal"
s1 = 'hello $name'
println 'Cuando se utilizan comillas simples la cadena string se toma literal lo que indica que no ejecuta la interpolacion de groovy.'
println s1
println ""

s1 = 'hello "David"'
println 'Con comillas simples si se pueden insertar comillas ddobles y las imprime'
println s1
println ""

s1 = "Hello $name"
println "Al utilizar comillas dobles si se ejecuta la interpolacion"
println s1
