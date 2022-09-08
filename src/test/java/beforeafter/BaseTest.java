package beforeafter;

import org.apache.hc.core5.http.io.SessionOutputBuffer;
import org.testng.annotations.*;

public class BaseTest  {

    @BeforeTest
    public void loginToApplication()
    {
        System.out.println("Login App");
    }
    @AfterTest
    public void logoutApplication()
    {
        System.out.println("Logout App success");
    }

    @BeforeMethod
    public void connectDB()
    {
        System.out.println("DB connected");
    }

    @AfterMethod
     public void disconnectedDB()
    {
        System.out.println("DB Disconnected");
    }
    @BeforeSuite
    public void testData()
    {
        System.out.println("Test Data Created");
    }
   @AfterSuite
   public void tearDownTestData()
    {
        System.out.println("Test Data deleted");
    }

}

