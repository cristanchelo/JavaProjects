Feature: Automatizacion de Api Rest
  Yo como automatizador
  Necesito automatizar la ejecucion de un api
  Para aprender a interactuar con los servicios

  Scenario Outline: Actualizar un usuario con el metodo Patch
    Given "Sofia" establece la base url "https://gorest.co.in/" del servicio
    When actualiza la informacion del usuario en el endpoint "public/v2/users/" con el id 2898
      | name   | <name>   |
      | status | <status> |
    Then valida que la respuesta contenga el nombre "<name>" y el codigo de estado sea 200

    Examples:
      | name                     | status   |
      | Armando Casas de Bareque | Inactive |