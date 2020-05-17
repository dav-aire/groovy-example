def name = "David"
def printClosure = { println "Hola ${name}" }
printClosure()
name = "Elena"
printClosure()