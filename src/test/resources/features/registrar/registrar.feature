#language: es

  Característica: Registro en la pagina



    Esquema del escenario: Registro
      Dado que CHAMI navega a la pagina de my store
      Cuando  realice el registro en la pagina
      |email|genero|primerNombre|ultimoNombre|password|nombre|apellido|empresa|domicilio|ciudad|estado|codigoPostal|movil|alias|
      |<email>|<genero>|<primerNombre>|<ultimoNombre>|<password>|<nombre>|<apellido>|<empresa>|<domicilio>|<ciudad>|<estado>|<codigoPostal>|<movil>|<alias>|
      Entonces  debera ver mensaje de registro exitoso.
      |CHAMI CHAMII|
      Ejemplos:
        |email                |genero|primerNombre|ultimoNombre|password|nombre   |apellido  |empresa  |domicilio      |ciudad    |estado   |codigoPostal|movil    |alias |
        |chamirojaaooo@hotmail.com|Mr    |CHAMI        |CHAMII       | AAAAA  | MAQUINA | MAQUINA2 | MACHINE | crr 45 # 54-23| medellin |colorado | 80201       |300564312|maqui  |
