#language: es

Característica: Agregar elemento al carrito de compras

  Yo como usuario
  Quiero entrar al sitio web
  Para comprar producto


  Antecedentes:
    Dado que ingreso a la página de store

    Escenario: Agregar elemento al carrito de compras
      Cuando selecciono un producto
      Y lo agrego al carrito de compras
      Entonces presenta mensaje de alerta indicando que el producto fue agregado
