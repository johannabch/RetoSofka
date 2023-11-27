package stepdefinitions;

import Pages.ConsultoUserPorIdApiPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.Assert;

public class ConsultarUsuarioPorIdApiStepdefinition {

    int codigo = 200;
    int id = 1;
    ConsultoUserPorIdApiPage consultoUserPorIdApiPage;

    @Dado("que requiero hacer consulta por id en la api")
    public void queRequieroHacerConsultaPorIdEnLaApi() {
        consultoUserPorIdApiPage = new ConsultoUserPorIdApiPage("https://reqres.in/api/users/");
    }

    @Cuando("hago consulta de usuario por id")
    public void hagoConsultaDeUsuarioPorId() {
        consultoUserPorIdApiPage.consultarUsuario(id);
    }

    @Entonces("retorna el estado esperado del servicio para la peticion")
    public void retornaElEstadoEsperadoDelServicioParaLaPeticion() {
        Assert.assertEquals(consultoUserPorIdApiPage.consultarUsuario(id), 1);
    }

}
