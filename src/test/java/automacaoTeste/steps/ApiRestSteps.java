package automacaoTeste.steps;

import com.jayway.restassured.http.ContentType;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class ApiRestSteps {

    static String url;

    @Quando("chamar a api {string}")
    public void chamar_a_api(String api) {
        url = api;
    }


    @Entao("valido a resposta da chamada")
    public void validoARespostaDaChamada() {
        given()
                .relaxedHTTPSValidation()
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("userId", is(1))
                .body("title", equalTo("delectus aut autem"))
                .body("completed", is(false));

    }
}
