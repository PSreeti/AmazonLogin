package RestAssuredPackage;

import io.opentelemetry.api.trace.StatusCode;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class FirstRestAssuredProg {
    @Test
    public void getResponseBody()
    {

        given().when().get("https://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").
                then().log().body();

    }
    @Test
    public void getResponseStatus()
    {
        String url ="https://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";
       int statusCode= given().when().get("https://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").
               getStatusCode();
        System.out.println("status code is "+ " "+ statusCode);

        given().when().get(url).then().assertThat().statusCode(200);
    }
}