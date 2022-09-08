package RestAssuredPackage;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class UdemyAddBook {

    @Test
    public void PostBook(){

        RestAssured.baseURI = "http://216.10.245.166";

        String Response = given().log().all().header("Content-Type","application/json").body(RequestURL.AddBook())
                .when().post("/Library/Addbook.php")
                .then().log().all().assertThat().statusCode(200).extract().response().asString();

        System.out.println(Response);
        JsonPath js = ReuseableMethod.RawToJson(Response);
        String id = js.get("ID");
        System.out.println(id);
    }
}
