class User{
    String primerNombre
    String apellido
    def imprimeNombre = {
        println "${primerNombre} ${apellido}"
    }
}

User user

//println user.primerNombre // Causa error por que nuestra propiedad no existe 
println user?.primerNombre // El uso del operador Navigation/Dereference que nos ayuda a validar y evitar el NullPointerException, asi ya podemos ocupar propiedades que aun no se definen

