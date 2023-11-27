package stepdefinitions;

import Pages.ConsultoListaUsuariosApiPage;
import Pages.ConsultoUserPorIdApiPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.Assert;
import io.restassured.response.Response;

public class ConsultarListaUsuariosApiStepdefinition {

    ConsultoListaUsuariosApiPage consultoListaUsuariosApiPage;

    @Dado("que requiero hacer consulta para lista de usuarios en la api")
    public void queRequieroHacerConsultaParaListaDeUsuariosEnLaApi() {
        consultoListaUsuariosApiPage = new ConsultoListaUsuariosApiPage("https://reqres.in/api/users/");
    }

    @Cuando("hago consulta de lista completa de usuarios")
    public void hagoConsultaDeListaCompletaDeUsuarios() {
        consultoListaUsuariosApiPage.consultarLista();
    }

    @Entonces("retorna el estado esperado del servicio para la peticion de lista de usuarios")
    public void retornaElEstadoEsperadoDelServicioParaLaPeticionDelistaDeUsuarios() {
        Assert.assertEquals(consultoListaUsuariosApiPage.consultarLista(), 200);

    }
}
