package stepdefinitions;

import Pages.ActualizoDatosUsuarioApiPage;
import Pages.ConsultoUserPorIdApiPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.Assert;

public class ActualizarUsuarioApiStepdefinition {
    int id = 1;

    ActualizoDatosUsuarioApiPage actualizoDatosUsuarioApiPage;

    @Dado("que requiero hacer una actualizacion de usuario en la api")
    public void queRequieroHacerUnaActualizacionDeUsuarioEnLaApi() {
        actualizoDatosUsuarioApiPage = new ActualizoDatosUsuarioApiPage("https://reqres.in/api/users/");
    }

    @Cuando("actualizo datos de un usuario")
    public void actualizoDatosDeUnUsuario() {
        actualizoDatosUsuarioApiPage.actualizarDatos(id);
    }

    @Entonces("retorna el estado esperado del servicio para la peticion de actualizacion")
    public void retornaElEstadoEsperadoDelServicioParaLaPeticionDeActualizacion() {
        Assert.assertEquals(actualizoDatosUsuarioApiPage.actualizarDatos(id), "2023");
    }

}
