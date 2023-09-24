package RestAPIExamples;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class GetReqExamples {

    @Test
    public void getReq(){
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .header("Authorization","Bearer fde797b4-d597-4a99-a57e-21a923d84106")
                .when()
                .get("api/Coffees_V2")
                .then()
                .extract()
                .response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());

        Assert.assertEquals(response.statusCode(),200);
    }


    @Test
    public void validateResponseusingHamcrest(){
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        RestAssured.given()
                .header("Authorization","Bearer fde797b4-d597-4a99-a57e-21a923d84106")
                .when()
                .get("api/Coffees_V2")
                .then()
                .assertThat()
                .statusCode(200)
              //  .body("Name",hasItem("Vignesh"))
                .body("Id",hasItems(2,5,900));
    }

}
