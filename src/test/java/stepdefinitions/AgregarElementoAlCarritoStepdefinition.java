package stepdefinitions;

import Pages.AgregoElementoPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class AgregarElementoAlCarritoStepdefinition {

    private WebDriver driver;
    AgregoElementoPage agregoElementoPage;
    String alerta;

   @Dado("que ingreso a la página de store para agregar producto al carrito")
    public void queIngresoALaPáginaDeStoreParaAgregarProductoAlCarrito() {
        agregoElementoPage = new AgregoElementoPage(driver);
        driver = agregoElementoPage.chromeDriverConnection();
        agregoElementoPage.visitWebsite("https://www.demoblaze.com/");
    }

    @Cuando("selecciono un producto")
    public void seleccionoUnProducto()  {
        agregoElementoPage.seleccionarElemento();
    }

    @Y("lo agrego al carrito de compras")
    public void loAgregoAlCarritoDeCompras() throws InterruptedException{
       agregoElementoPage.agregarAlCarrito();
       alerta = agregoElementoPage.obtenerAlerta();
       agregoElementoPage.aceptarAlerta();

    }

    @Entonces("presenta mensaje de alerta indicando que el producto fue agregado")
    public void presentaMensajeDeAlertaIndicandoQueElProductoFueAgregado() {
        assertEquals("Product added", alerta);

    }

}