package beforeafter;


import org.testng.annotations.Test;

public class TC1 extends BaseTest {

    @Test(priority = 1)
    public void launchUrl()
    {
        System.out.println("Url launched");
    }
    @Test (priority = 3)
    public void enterPass()
    {
        System.out.println("pass entered");
    }

    @Test (priority = 2)
    public void enterUser()
    {
        System.out.println("user entered");
    }






}
