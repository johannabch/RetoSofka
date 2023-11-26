#language: es

Característica: Inicio de sesion

  "Yo como usuario
  Quiero entrar al sitio web
  Para comprar producto


  Antecedentes:
    Dado que ingreso a la página de store

  Esquema del escenario: login exitoso
    Cuando inicio sesion de forma exitosa con "<USUARIO>" y "<CLAVE>"
    Entonces visualizo mensaje de bienvenida
    Ejemplos:
      | USUARIO   | CLAVE  |
      | pruebaS11 | 123456 |

  Esquema del escenario: login con usuario inexistente
    Cuando inicio de sesion con usuario no registrado "<USUARIO>" y "<CLAVE>"
    Entonces genera alerta indicando que el usuario no está registrado
    Ejemplos:
      | USUARIO   | CLAVE  |
      | Juana21   | 123456 |

  Esquema del escenario: login con ingreso de clave incorrecta
    Cuando inicio de sesion con ingreso de clave incorrecta "<USUARIO>" y "<CLAVE>"
    Entonces genera alerta indicando clave incorrecta
    Ejemplos:
      | USUARIO   | CLAVE   |
      | pruebaS11 | 1234567 |

