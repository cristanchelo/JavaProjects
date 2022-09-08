Feature: Automatizacion de Api Rest
  Yo como automatizador
  Necesito automatizar la ejecucion de un api
  Para aprender a interactuar con los servicios

  Scenario: Eliminar la informacion de un usuario
    Given "Julian" establece la base url "https://gorest.co.in/" del servicio
    When elimina el usuario en el endpoint "public/v2/users/" con el id 2876
    Then valida que el codigo de estado HTTP sea 204 y la respuesta sea nula o no traiga informacion