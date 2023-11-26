package stepdefinitions;

import Pages.CheckoutOrdenPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import static org.junit.Assert.assertEquals;

public class HacerCheckoutOrdenStepdefinition {

    CheckoutOrdenPage checkoutOrdenPage;

    @Cuando("ingreso al carrito y hago pedido con los datos de compra {string} {string} {string} {string} {string} {string}")
    public void ingresoLosDatosDeLaCompra(String nombre, String pais, String ciudad, String tarjetaCredito, String mes, String anio){
        checkoutOrdenPage.hacerCompra(nombre, pais, ciudad, tarjetaCredito, mes, anio);
    }

    @Entonces("confirmo la compra")
    public void confirmoLaCompra() {
        assertEquals(true, checkoutOrdenPage.mensajeDeConfirmacion());

    }

}
