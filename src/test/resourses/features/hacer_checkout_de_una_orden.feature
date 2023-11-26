#language: es

Característica: Hacer checkout de una orden

  Yo como usuario
  Quiero entrar al sitio web
  Para comprar producto


  Esquema del escenario: Hacer checkout de una orden
    Dado que ingreso a la página de store para registrar pedido
    Cuando ingreso al carrito y hago pedido con los datos de compra "<NOMBRE>" "<PAIS>" "<CIUDAD>" "<TARJETACREDITO>" "<MES>" "<ANIO>"
    Entonces confirmo la compra

    Ejemplos:
      | NOMBRE   | PAIS     | CIUDAD   | TARJETACREDITO  | MES   | ANIO  |
      | Juan     | Colombia | Medellin | 123456          | Abril | 2023  |