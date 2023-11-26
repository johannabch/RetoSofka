package stepdefinitions;


import Pages.IngresoPage;
import Pages.RegistroPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;

import static Pages.IngresoPage.*;
import static org.junit.Assert.assertEquals;

public class IngresoDeUsuarioStepdefinition {
    private WebDriver driver;
    IngresoPage ingresoPage;
    String alerta;


 /*  @Dado("que ingreso a la página de store")
    public void queIngresoALaPáginaDeStore() {
        ingresoPage = new IngresoPage(driver);
        driver = ingresoPage.chromeDriverConnection();
        ingresoPage.visitWebsite("https://www.demoblaze.com/");
    }*/
    @Cuando("inicio sesion de forma exitosa con {string} y {string}")
    public void inicioSesionDeFormaExitosaCon(String usuario, String clave) {
       ingresoPage.ingresarUsuario(usuario,clave);

    }
    @Entonces("visualizo mensaje de bienvenida")
    public void visualizoMensajeDeBienvenida()  {
        assertEquals(true, ingresoPage.mensajeBienvenida());

    }

    @Cuando("inicio de sesion con usuario no registrado {string} y {string}")
    public void inicioDeSesionConUsuarioNoRegistrado(String usuario, String clave) throws InterruptedException {
        ingresoPage.ingresarUsuario(usuario,clave);
        alerta = ingresoPage.obtenerAlerta();
        ingresoPage.aceptarAlerta();
    }
    @Entonces("genera alerta indicando que el usuario no está registrado")
    public void generaAlertaIndicandoQueElUsuarioNoEstáRegistrado() {
        assertEquals("User does not exist.", alerta);

    }

    @Cuando("inicio de sesion con ingreso de clave incorrecta {string} y {string}")
    public void inicioDeSesionConIngresoDeClaveIncorrecta(String usuario, String clave) throws InterruptedException {
        ingresoPage.ingresarUsuario(usuario,clave);
        alerta = ingresoPage.obtenerAlerta();
        ingresoPage.aceptarAlerta();
    }
    @Entonces("genera alerta indicando clave incorrecta")
    public void generaAlertaIndicandoClaveIncorrecta() {
        assertEquals("Wrong password.", alerta);

    }

}
