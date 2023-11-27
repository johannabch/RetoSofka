package Pages;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static io.restassured.path.json.JsonPath.given;

public class ConsultoUserPorIdApiPage {

    String api;
    public ConsultoUserPorIdApiPage(String api) {
        this.api = api;
    }

    //Consultar usuario por ID
    @Test
    public int consultarUsuario(int id){
            String getResponse = given().
                get(api +id).
                then().
                statusCode(200)
                .extract()
                .response()
                .asString();

    JsonPath jsPathGet = new JsonPath(getResponse);
        String email = jsPathGet.getString("data.email");
        String first_name = jsPathGet.getString("data.first_name");
        String last_name = jsPathGet.getString("data.last_name");
        System.out.println("Response complete: " + getResponse);
        System.out.println("E-mail: " + email);
        System.out.println("First name: " + first_name);
        System.out.println("Last name: " + last_name);

        return jsPathGet.getInt("data.id");

    }
}
