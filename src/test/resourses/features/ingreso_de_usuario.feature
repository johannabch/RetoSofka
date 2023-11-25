#language: es

Característica: Inicio de sesion

  "Yo como usuario
  Quiero entrar al sitio web
  Para comprar producto

  Antecedentes:
    Dado que ingreso a la página de store

  Escenario: login exitoso
    Cuando inicio sesion de forma exitosa
    Entonces visualizo los productos de la pagina

  Escenario: login fallido
    Cuando inicio de sesion con usuario no registrado
    Entonces genera alerta indicando que el usuario no está registrado