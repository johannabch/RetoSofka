package Pages;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ActualizoDatosUsuarioApiPage {

    String api;
    public ActualizoDatosUsuarioApiPage(String api) {
        this.api = api;
    }

    @Test
    public String actualizarDatos(int id){
        RestAssured.baseURI="https://reqres.in/api/users";
        String getResponse = given()
                .log()
                .all()
                .header("accept", "application/json")
                .body(BodyLoad.updateUser())
                .when()
                .patch("/1")
                .then()
                .assertThat()
                .log()
                .all()
                .statusCode(200)
                .extract()
                .response()
                .asString();

        JsonPath jsPathGet = new JsonPath(getResponse);
        System.out.println("Response complete: " + getResponse);
        String updatedAt = jsPathGet.getString("updatedAt");
        System.out.println("UpdatedAt field: " + updatedAt);

        int n = 4;
        return updatedAt.length() < n ? updatedAt : updatedAt.substring(0, n);

    }
}
