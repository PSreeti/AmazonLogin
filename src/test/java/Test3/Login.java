package Test3;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class Login implements LoginLogout {
      HashMap<String,String> hm = new HashMap();

    @Override
    public void LaunchBrowser() {
        System.out.println("driver=WebdriverManager.chromedriver().create()");

    }

    @Override
    public void url() {
        System.out.println("driver.get(URL)");

    }

    @Override
    public void addusernameandPass() {
        hm.put("ram","joshi@123");
        hm.put("shyam","shyam@123");

    }

    @Override
    public void sendkeyusernameandpass() {

        for(Map.Entry a : hm.entrySet() )
        {
            System.out.println("driver.findelement(By.xpath).sendkeys(a.getKey()) +e.getvalue()");
        }

    }


    @Override
    public void clicksubmit() {

        System.out.println("driver.findelement(By.xpath).click()");

    }

    @Override
    public void assertions() {
        System.out.println("Assert.assertEquals(Expected,driver.getTitle)");

    }

    @Override
    public void logout() {
        System.out.println("driver.findelement(By.xpath).click()");
    }

    @Override
    public void closebrowser() {

        System.out.println("driver.close");

    }

    public static void main(String[] args) {
        Login l= new Login();
        l.LaunchBrowser();
        l.url();
        l.addusernameandPass();
        l.sendkeyusernameandpass();
        l.clicksubmit();
        l.assertions();
        l.logout();
        l.closebrowser();
    }
}



//Write a Script for login and logout functionality by using interface ,hashmap, class ,static non-static ,assertion ,abstraction