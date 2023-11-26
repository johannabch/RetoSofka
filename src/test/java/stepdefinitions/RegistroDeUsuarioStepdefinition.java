package stepdefinitions;

import Pages.BaseSelenium;
import Pages.RegistroPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;


public class RegistroDeUsuarioStepdefinition {
    private WebDriver driver;
    RegistroPage registroPage;
    BaseSelenium baseSelenium;

    String alerta;

   /* @Dado("que ingreso a la página de store")
    public void queIngresoALaPáginaDeStore() {
        registroPage = new RegistroPage(driver);
        driver = registroPage.chromeDriverConnection();
        registroPage.visitWebsite("https://www.demoblaze.com/");
    }*/

    @Cuando("realizo un registro exitoso con {string} y {string}")
    public void realizoUnRegistroExitoso(String usuario, String clave) throws InterruptedException {
        registroPage.registrarUsuario(usuario,clave);
        alerta = registroPage.obtenerAlerta();
        registroPage.aceptarAlerta();
    }
    @Entonces("presenta mensaje de alerta indicando registro exitoso")
    public void presentaMensajeDeAlertaIndicandoRegistroExitoso()  {
        assertEquals("Sign up successful.", alerta);
    }


    @Cuando("realizo un registro con un usuario existente {string} y {string}")
    public void realizoUnRegistroConUnUsuarioExistente(String usuario, String clave) throws InterruptedException {
        registroPage.registrarUsuario(usuario,clave);
        alerta = registroPage.obtenerAlerta();
        registroPage.aceptarAlerta();
    }
    @Entonces("presenta mensaje de alerta indicando que el usuario ya existe")
    public void presentaMensajeDeAlertaIndicandoQueElUsuarioYaExiste() {
      assertEquals("This user already exist.", alerta);

    }


}
