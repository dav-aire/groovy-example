/*
    Los closures son un tipo de dato dentro de groovy derivados de la libreria groovy.lang importada automaticamente
    Las ventajs de delcara de forma explicita un closure es que no aceptara otro tipo de valor a menos que sea un closure
*/

Closure clos = {
    println it
}

clos.call("Hola mundo desde un closure declarado explicitamente")