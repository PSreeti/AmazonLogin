package RestAssuredPackage;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComplexJson {

    public static void main(String[] args) {

        JsonPath jp = new JsonPath(RequestURL.GetPrice());
        int count = jp.getInt("courses.size()");  //1
        System.out.println(count);
        int amount = jp.getInt("dashboard.purchaseAmount"); //2
        System.out.println(amount);
        String title = jp.getString("courses[0].title");  //3
        System.out.println(title);
        String title3 = jp.getString("courses[3].title");       //3
        System.out.println(title3);

        for (int i = 0; i < count; i++)            //4
        {
            System.out.println(jp.getString("courses[" + i + "].title"));

            System.out.println(jp.getInt("courses[" + i + "].price"));


        }

//        int copies = jp.getInt("courses[2].copies");
//        System.out.println(copies);

        for (int i = 0; i < count; i++)          //5
        {
            String coursesTitle = jp.getString("courses[" + i + "].title");
            if (coursesTitle.equalsIgnoreCase("RPA")) {
                System.out.println(jp.getInt("courses[" + i + "].copies"));
                break;
            }
        }

        int sum = 0;
        int purchaseAmount = jp.getInt("dashboard.purchaseAmount");
        {
            for (int i = 0; i < count; i++) {


                int copies = jp.getInt("courses[" + i + "].copies");
                //System.out.println(copies);
                int price = jp.getInt("courses[" + i + "].price");
                //System.out.println(price);

                int amount1 = price * copies;
                System.out.println(amount1);

                sum = sum + amount1;


            }
            Assert.assertEquals(purchaseAmount, sum);
            System.out.println("this is equal");

        }

    }

}









//1.Print No of courses returned by API

  //2.Print Purchase Amount

    //3. Print Title of the first course

      //4. Print All course titles and their respective Prices

        //5. Print no of copies sold by RPA Course

        //6. Verify if Sum of all Course prices matches with Purchase Amount