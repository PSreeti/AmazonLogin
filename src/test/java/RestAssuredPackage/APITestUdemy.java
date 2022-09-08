package RestAssuredPackage;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.openqa.selenium.json.Json;
import org.testng.Assert;
import org.testng.annotations.Test;
import zmq.io.net.Address;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class APITestUdemy {
    @Test
    public void GetAPI() {
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String Response = given().log().all().
                queryParam("key", "qaclick123").header("Content-Type", "application/json").
                body(RequestURL.payload()).
                when().post("maps/api/place/add/json").
                then().assertThat().statusCode(200).body("scope", equalTo("APP"))
                .extract().response().asString();                                                          //extract().response().asString();

        System.out.println(Response);
        JsonPath js = new JsonPath(Response);                   // takes string as input & convert to json & help to parse the json
        String Place = js.getString("place_id");
        System.out.println(Place);

//Put Place
        String newAdd = "70 New Delhi, INDIA";
        given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").
                body("{\n" +
                        "\"place_id\":\"" + Place + "\",\n" +
                        "\"address\":\"70 New Delhi, INDIA\",\n" +
                        "\"key\":\"qaclick123\"\n" +
                        "}\n").
                when().put("maps/api/place/update/json").
                then().assertThat().statusCode(200).log().all().body("msg", equalTo("Address successfully updated"));

        //GET Place

        String NewAddress = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", Place)
                .when().get("maps/api/place/get/json").
                then().log().all().assertThat().statusCode(200).extract().response().asString();

        JsonPath jp1 = new JsonPath(NewAddress);
        String actualAddress = jp1.getString("address");
        Assert.assertEquals(actualAddress, newAdd);





    }


}

