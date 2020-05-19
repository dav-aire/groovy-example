def name = "David"
def multiLineQuote = """
Hola, $name
Esto es un multiline string con comillas dobles
"""

println multiLineQuote
println multiLineQuote.class.name
def multiLineSingleQuote = '''
Hola $name 
Este es un multiline string con comillas simples
'''

println multiLineSingleQuote
println multiLineSingleQuote.class.name

println """
Aplican las mismas reglas del uso de comillas dobles y simples:
comillas dobles: Ejecutan interpolación, ocupan clase Gstring
comillas simples: toman el texto literal, ocupan clase String
"""