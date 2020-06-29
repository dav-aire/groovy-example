List<List<String>> list1 = new ArrayList<List<String>>() // sin uso de Diamond Operator

List<List<String>> list2 = new ArrayList() // Con uso del operador Diamond Operator , es lo mismo que arriba solo reduce codigo

def list = ["Hola", "Mundo"]

list1 << list

list1.each{
    println it
}
