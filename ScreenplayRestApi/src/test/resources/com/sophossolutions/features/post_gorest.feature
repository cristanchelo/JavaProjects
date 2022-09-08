Feature: Automatizacion de Api Rest
  Yo como automatizador
  Necesito automatizar la ejecucion de un api
  Para aprender a interactuar con los servicios

  Scenario Outline: Crear un usuario con el metodo Post
    Given "Manuela" establece la base url "https://gorest.co.in/" del servicio
    When proporciona la informacion del usuario en el endpoint "public/v2/users"
      | name   | <name>   |
      | email  | <email>  |
      | gender | <gender> |
      | status | <status> |
    Then valida la respuesta contenga el nombre "<name>" y el codigo de estado sea 201

    Examples:
      | name          | email                      | gender | status |
      | Armando Casas | armando.casas6@gorest.in.co | Male   | Active |