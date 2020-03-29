#language: es

  Característica: Realizar login
    Yo como usuario de Bancolombia
    Quiero iniciar sesion en el SVP
    Para realizar transacciones en la SVP


    Esquema del escenario: login exitoso
       Dado que CHAMI navega a la pagina de my store
       Cuando  realice el login
         | email  |password  |
         | <email>| <password> |
      Entonces  debera ver mensaje de registro exitoso.
         |CHAMI CHAMII|
      Ejemplos:
      |email                      |password     |
      | chamirojaaoo@hotmail.com  |  AAAAA      |