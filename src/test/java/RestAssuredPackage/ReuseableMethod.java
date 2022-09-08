package RestAssuredPackage;

import io.restassured.path.json.JsonPath;

public class ReuseableMethod {

    public static JsonPath RawToJson(String response)
    {
        JsonPath jp = new JsonPath(response);
        return jp;
    }
}
