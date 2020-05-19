println "Para el uso de directorios es mejor utilizar los slashy string ya que no se necesitan ocupar tantos 'comodines' o 'carateres de escape' "

def winpathQuoted = 'C:\\windows\\system32'
def winpathSlashy = /C:\windows\system32/
println winpathQuoted
println winpathSlashy

assert winpathSlashy ==~ '\\w{1}:\\\\.+\\\\.+' : "No coinciden los valores"
assert winpathSlashy ==~ /\w{1}:\\.+\\.+/ : "No coinciden los valores"

