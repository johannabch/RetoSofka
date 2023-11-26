package Pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgregoElementoPage extends BaseSelenium {

  //  By elemento = By.id("login2");
    By elemento = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img");
    By agregarACarrito = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");

    public AgregoElementoPage(WebDriver driver) {
        super(driver);
    }

    @Test
    public void seleccionarElemento() {

        click(elemento);
        if (isDisplayed(elemento)) {
            click(agregarACarrito);

        } else {
            System.out.print("No fue posible seleccionar elemento");
        }
    }

    @Test
    public void agregarAlCarrito() {
        if (isDisplayed(elemento)) {
            click(agregarACarrito);

        } else {
            System.out.print("No fue posible agregar al carrito");
        }
    }


}
