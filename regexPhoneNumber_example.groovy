class Phone{
    String areaCode
    String exchange
    String local
}

def phoneStr = '(800)555-1212'
def phoneRegex = ~/^[01]?\s*[\(\.-]?(\d{3})[\)\.-]?\s*(\d{3})[\.-](\d{4})$/

def matcher = phoneRegex.matcher(phoneStr)


println matcher[0][0]
println matcher[0][1]
println matcher[0][2]
println matcher[0][3]


def phone = new Phone(
    areaCode: matcher[0][1],
    exchange: matcher[0][2],
    local: matcher[0][3]
)

println "El numero original es ${phoneStr}"
println """
Analizando numero de telefono\
\n\tCodigo de area = ${phone.areaCode}\
\n\tExchange = ${phone.exchange}\
\n\tLocal = ${phone.local}
"""