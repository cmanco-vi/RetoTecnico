#Autor: Crihstian Manco
@HU1
Feature: Registro en Utest
  Como usuario web, quiero ingresar a la página de Utest.com y proceder con la creación de usuario

  @prueba
  Scenario Outline: Ingresar a la página y crear  usuario

    Given  un navegador web en la página de Utest.com
    When se ingresan los datos del formulario
      | nombre   | apellido   | email   | contrasena   |confirmcontrasena|
      | <nombre> | <apellido> | <email> | <contrasena> |<confirmcontrasena>|
    Then se crea un nuevo usuario
    Examples:
      | nombre    | apellido | email                      | contrasena  |confirmcontrasena|
      | crihstian | manco    | cmanco@choucairtesting.com | Retotecnico1 |Retotecnico1   |

