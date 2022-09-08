package RestAssuredPackage;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Type;

public class Test1 {
    @Test
    public void Test1() {

        Response Data = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(Data.getStatusCode());
        System.out.println(Data.getTime());
        System.out.println(Data.getBody().asString());
        System.out.println(Data.getHeader("content-type"));

        Assert.assertEquals(Data.getStatusCode(), 200, "RESPOSNSE CODE MISMATCH");

        int total_pages = Data.jsonPath().get("total_pages");

        Assert.assertEquals(total_pages, 2, "Mismatch");

    }
                @Test
                public void postTest2()
        {

            String url ="https://reqres.in/api/users";
            String   contentType="application/json";
            String bodyData= "{\n" +
                    "    \"name\": \"morpheus\",\n" +
                    "    \"job\": \"leader\"\n" +
                    "}";


            Response Data = RestAssured.given().contentType(bodyData).when().post(url).then().extract().response();
            String job = Data.jsonPath().get("job");

            Assert.assertEquals("job","leader","misamtch");


    }




}
