//package RestAssuredPackage;
//
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//import org.json.simple.JSONObject;
//import org.testng.annotations.Test;
//
//import java.util.HashMap;
//
//public class APITesting {
//@Test
//    public void PostResult()
//    {
//        HashMap<String,Object> map = new HashMap<String,Object>();
//        map.put("name","Ram");
//        map.put("job","Police");
//
//        System.out.println(map);
//    JSONObject request = new JSONObject(map);
//
//        System.out.println(request.toJSONString());
//
//
//    }
//-----------
//
//        package com.qa.opencart.utils;
//
//
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import org.json.simple.JSONObject;
//
//import java.util.HashMap;
//
//import static io.restassured.RestAssured.given;
//import static io.restassured.RestAssured.replaceFiltersWith;
//
//    public class APIUtil {
//
//        public int expectedStatus;
//        public int actualStatus;
//        public int expectedPostStatus;
//        public int actualPostStatus;
//
//        public void getResult(String baseURI )
//        {
//            Response response= RestAssured.get(baseURI);
//            System.out.println(response.statusCode());
//            System.out.println(response.getBody().asString());
//            int expectedStatus = 200;
//            int actualStatus = response.getStatusCode();
//
//
//        }
//
//        public void PostResult(String BaseURI)
//        {
//            JSONObject request = new JSONObject();
//            request.put("name","Ram");
//            request.put("job","Police");
//
//            System.out.println(request.toJSONString());
//            Response response = RestAssured.post(BaseURI);
//            System.out.println(response.getBody());
//            System.out.println(response.getHeader("Content-Type"));
////      given().
////               body(request.toJSONString()).
////        when().
////               post(BaseURI).
////       then().
////              statusCode(201);
//
//            int expectedPostStatus = 201;
//            int actualPostStatus =response.getStatusCode();
//
//        }
//
//        public void PUTResult(String BaseURI)
//        {
//            JSONObject jp = new JSONObject();
//            jp.put("Name","Ramesh");
//            jp.put("Job","Doctor");
//            System.out.println(jp);
//            Response response = RestAssured.put(BaseURI);
//            System.out.println(response.statusCode());
//
//        }
//
//    }
//
//}
