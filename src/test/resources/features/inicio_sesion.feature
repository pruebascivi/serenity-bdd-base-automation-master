# author: DiegoPinzon20
# date: 20/02/2023
# language: es

Característica: Iniciar sesion en Start Sharp
  Como usuario quiero iniciar sesión en la página web de Start Sharp

  @Test1
  Escenario: Inicio de sesón exitoso
    Dado "David" navega a la página de inicio de sesión
    Cuando incia sesión con las credenciales de acceso correctas
    Entonces debería ver el tablero en la página principal

    @Test2
  Escenario: Recordar cosas
    Dado "David" quiere recordar algo
    Cuando el trata de recordar "Foo"
    Entonces el deberia traer Foo

  @Test3
  Escenario: Inicio de sesón exitoso
    Dado "David" tiene un token
