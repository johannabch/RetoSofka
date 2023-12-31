#language: es

Característica: registro de usuario

  Yo como usuario
  Quiero entrar al sitio web
  Para comprar producto


  Esquema del escenario: Registrar Usuario exitoso
    Dado que ingreso a la página de store para hacer un registro de usuario
    Cuando realizo un registro exitoso con "<USUARIO>" y "<CLAVE>"
    Entonces presenta mensaje de alerta indicando registro exitoso
    Ejemplos:
      | USUARIO   | CLAVE  |
      | pruebaS27 | 123456 |

  Esquema del escenario: Registrar Usuario fallido
    Dado que ingreso a la página de store para hacer un registro de usuario
    Cuando realizo un registro con un usuario existente "<USUARIO>" y "<CLAVE>"
    Entonces presenta mensaje de alerta indicando que el usuario ya existe
    Ejemplos:
      | USUARIO   | CLAVE  |
      | pruebaS27 | 123456 |