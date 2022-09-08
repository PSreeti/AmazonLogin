package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pjoshi\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

//        //1.ID - always unique
//        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
//       driver.findElement(By.id("ap_email")).sendKeys("joshipreeti90@gmail.com");
//       driver.findElement(By.id("continue")).click();
//       driver.findElement(By.id("ap_password")).sendKeys("Pjoshishail@19");
//       Thread.sleep(20);
//       driver.findElement(By.id("signInSubmit")).click();
//       driver.wait(20);
//        driver.close();
//
//        //2.name - unique
//        driver.findElement(By.name("email")).sendKeys("joshipreeti90@gmail.com");

        //3. xpath
//        driver.findElement(By.xpath("//input[@id=\'ap_email\']")).sendKeys("joshipreeti90@gmail.com");
//        driver.findElement(By.xpath("//input[@id=\'continue\']")).click();

        //4.CSSSelector -- copy selector

        //5.linkText : only for links
//        driver.findElement(By.linkText("Conditions of Use")).click();
//        driver.findElement(By.linkText("Privacy Notice")).click();

        //6. PartialLinktext : not recommended
//        driver.findElement(By.partialLinkText("Conditions")).click();
//
//        //7.class name// not always unique
//        driver.findElement(By.className("a-input-text a-span12 auth-autofocus auth-required-field")).sendKeys("joshipreeti90@gmail.com");

    //8.tag name

        List<WebElement> elements= driver.findElements(By.tagName("a"));
        for (WebElement names:elements)
        {
            System.out.println(names.getText());
        }



    }


}
