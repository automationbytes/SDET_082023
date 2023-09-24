package RestAPIExamples;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PostwitPojo {
    @Test
    public void PostReq(){

        ObjectMapper objectMapper = new ObjectMapper();

        PojoReqBdy pojoReqBdy = new PojoReqBdy();
        pojoReqBdy.setDescription("Devlabs POJO class");
        pojoReqBdy.setName("Devlabs POJO class");

        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .header("Authorization","Bearer fde797b4-d597-4a99-a57e-21a923d84106")
                .contentType(ContentType.JSON)
                .and()
                .body(pojoReqBdy)
                .when()
                .post("api/Coffees_V2")
                .then()
                .extract()
                .response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());
    }

}
