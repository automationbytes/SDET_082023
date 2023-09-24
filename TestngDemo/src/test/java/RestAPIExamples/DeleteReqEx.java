package RestAPIExamples;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteReqEx {
    @Test
    public void deleteReq(){
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest/";
        Response response = RestAssured.given()
                .header("Authorization","Bearer fde797b4-d597-4a99-a57e-21a923d84106")
                .when()
                .delete("api/Coffees_V2/2")
                .then()
                .extract()
                .response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());

        Assert.assertEquals(response.statusCode(),204);
    }

}
