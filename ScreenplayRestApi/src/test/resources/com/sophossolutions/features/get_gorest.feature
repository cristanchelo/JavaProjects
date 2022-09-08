Feature: Automatizacion de Api Rest
  Yo como automatizador
  Necesito automatizar la ejecucion de un api
  Para aprender a interactuar con los servicios

  Scenario: Consultar informacion de usuario
    Given "Cristian" establece la base url "https://gorest.co.in/" del servicio
    When consulta en el endpoint "public/v2/users/" el id "18"
    Then valida que el codigo de estado HTTP sea 200 y la respuesta contenga el nombre "Marion Padberg"