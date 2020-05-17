import groovy.json.JsonSlurper

def slurper = new JsonSlurper()
def result = slurper.parseText('{"person":{"name": "David Torres", "age":27, "cars":["bmw", "ford"]}}')

println result.person.name
println result.person.age
println result.person.cars.size()
println result.person.cars[0]
println result.person.cars[1]