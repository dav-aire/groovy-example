def method(bool){
    try{
        if(bool) throw new Exception("foo")
        println 1
    } catch(e){
        println 2
    }finally{
        println 3
    }
}

//assert method(false) == 1
//assert method(true) == 2

method(false)  //No cacha el error, los bloques que termina son el try y finally
println "Segunda invocación"
method(true)  //cacha el error, los bloques que termina son catch y finally

//Nota: En groovy puedes capturar varias excepciones y tratarlas en un solo bloque de caprtura multiple como se muestra a continuación
try{
    /*.... codigo a supervisar */
}catch(IOException | NullPointerException e){
    /* Un solo bloque que trata la exception cachada */
}