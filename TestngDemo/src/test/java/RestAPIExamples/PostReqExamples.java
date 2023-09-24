package RestAPIExamples;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PostReqExamples {

    @Test
    public void PostReq(){


        //not recommended
        String reqbody = "{\n" +
                "  \"Description\": \"DevLabs Instant Coffee\",\n" +
                "  \"Name\": \"DevCafe\"\n" +
                "}\n" +
                "\n";


        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .header("Authorization","Bearer fde797b4-d597-4a99-a57e-21a923d84106")
                .contentType(ContentType.JSON)
                .and()
                .body(reqbody)
                .when()
                .post("api/Coffees_V2")
                .then()
                .extract()
                .response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());
    }
}
