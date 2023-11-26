package stepdefinitions;

import Pages.CheckoutOrdenPage;
import Pages.IngresoPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class HacerCheckoutOrdenStepdefinition {

    private WebDriver driver;
    CheckoutOrdenPage checkoutOrdenPage;

    @Dado("que ingreso a la página de store para registrar pedido")
    public void queIngresoALaPáginaDeStoreParaRegistrarPedido() {
        checkoutOrdenPage = new CheckoutOrdenPage(driver);
        driver = checkoutOrdenPage.chromeDriverConnection();
        checkoutOrdenPage.visitWebsite("https://www.demoblaze.com/");
    }

    @Cuando("ingreso al carrito y hago pedido con los datos de compra {string} {string} {string} {string} {string} {string}")
    public void ingresoLosDatosDeLaCompra(String nombre, String pais, String ciudad, String tarjetaCredito, String mes, String anio){
        checkoutOrdenPage.hacerCompra(nombre, pais, ciudad, tarjetaCredito, mes, anio);
    }

    @Entonces("confirmo la compra")
    public void confirmoLaCompra() {
        assertEquals(true, checkoutOrdenPage.mensajeDeConfirmacion());

    }

}
