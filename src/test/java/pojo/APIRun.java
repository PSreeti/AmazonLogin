package pojo;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonParser.Feature;

import static io.restassured.RestAssured.given;

public class APIRun {

    @Test
    public void GetAPI()
    {

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        AddPlace ap = given().queryParam("key", "qaclick123").queryParam("place_id","2fdf740f90a0ae39d947f4a556cf5a25").expect().defaultParser(Parser.JSON)
                .when().get("maps/api/place/get/json").as(AddPlace.class);

        System.out.println(ap.getPhone_number());
        System.out.println(ap.getTypes());
        System.out.println(ap.getLocation().getlatitude());
        System.out.println(ap.getLanguage());


    }
}


