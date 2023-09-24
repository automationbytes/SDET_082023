package RestAPIExamples;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

public class PostReqwitJsonObj {


    @Test
    public void PostReq(){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Description","Devlabs new Traditional Delight Coffee using JSON Obj");
        jsonObject.put("Name","Devlabs Filter Coffee");


        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .header("Authorization","Bearer fde797b4-d597-4a99-a57e-21a923d84106")
                .contentType(ContentType.JSON)
                .and()
                .body(jsonObject.toString())
                .when()
                .post("api/Coffees_V2")
                .then()
                .extract()
                .response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());
    }
}
