package Pages;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;


import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ConsultoListaUsuariosApiPage {
    String api;

    public ConsultoListaUsuariosApiPage(String api) {
        this.api = api;
    }

    //Consultar usuario por ID
    @Test
    public int consultarLista() {
        Response response = RestAssured.get("https://reqres.in/api/users");
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("Response: " + response.asString());
        System.out.println("Body: " + response.getBody().asString());
        System.out.println("Time taken: " + response.time());
        System.out.println("Header: " + response.getHeader("content-type"));

        return response.getStatusCode();

    }
}