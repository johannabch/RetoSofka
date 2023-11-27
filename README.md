# Introduction 
TODO: El presente proyecto está orientado a la automatización de la página Web para compra de productos https://www.demoblaze.com/
Procesos automatizados WEB: 
Registrarse en el sistema
Logearse en el sistema
Añadir un elemento al carrito de compras 
Hacer checkout de una orden

Runners WEB:
RegistroDeUsuarioRunner
IngresoDeUsuarioRunner
AgregoElementoAlCarritoRunner
HacerCheckoutOrdenRunner

Adicionalmente, se automatiza API https://reqres.in/api-docs/. con los siguientes escenarios:
Consultar un usuario creado por ID
Actualizar los datos de un usuario y verificar la correcta actualización de los datos por medio de consulta
Consultar la lista completa de usuarios

Runners API: 
ConsultoUsuarioPorIdApiRunner
ConsultoListaUsuariosApiRunner
ActualizoDatosUsuarioApiRunner

# Getting Started
Herramientas de automatización: IntelliJ IDEA Community Edition 2023.2.4
1. Versiones de dependencies: JDK 11, apache-maven-3.9.5, rest-assured 3.0.0 
2. Patron de diseño usado: POM haciendo uso de Selenium
3. Navegador para ejecución del proyecto web: Chome Version 119.0.6045.160 (Official Build) (64-bit)


# Build and Test
- Se abre proyecto en IntelliJ y Se da espera a la actualizacion de dependencias con Maven
- Se ingresa a la ruta src/test/java/runners para ejecutar cada uno de los Runners 


