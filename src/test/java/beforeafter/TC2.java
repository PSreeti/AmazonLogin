package beforeafter;

import org.testng.annotations.Test;

public class TC2 extends TC1 {

    @Test(priority = 4)
    public void homePage()
    {
        System.out.println("HomePage launched");
    }
    @Test (priority = 5)
    public void Profile()
    {
        System.out.println("Profile button clicked");
    }


}
