package Pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOrdenPage extends BaseSelenium {
    boolean mensajeConfirmacion;

    By botonCarrito = By.id("cartur");
    By registrarPedido = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
    By nombre = By.id("name");
    By pais = By.id("country");
    By ciudad = By.id("city");
    By tarjetaCredito = By.id("card");
    By mes = By.id("month");
    By anio = By.id("year");
    By hacerPedido = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");

    By mensajeDeConfirmacion = By.xpath("/html/body/div[10]");
    By confirmar = By.xpath("/html/body/div[10]/div[7]/div");




    public CheckoutOrdenPage(WebDriver driver) {
        super(driver);
    }

    @Test
    public void hacerCompra(String nombre1, String pais1, String ciudad1, String tarjetaCredito1, String mes1, String anio1) {

        click(botonCarrito);
        if (isDisplayed(botonCarrito)) {
            if (isDisplayed(registrarPedido)) {
                type(nombre1, nombre);
                type(pais1, pais);
                type(ciudad1, ciudad);
                type(tarjetaCredito1, tarjetaCredito);
                type(mes1, mes);
                type(anio1, anio);
                click(hacerPedido);

            }

            } else {
                System.out.print("No fue posible ingresar al carrito");
            }
        }

    @Test
    public Boolean mensajeDeConfirmacion() {
        mensajeConfirmacion = isVisible(mensajeDeConfirmacion);
        click(confirmar);
        return mensajeConfirmacion;
    }

}


