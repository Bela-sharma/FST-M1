import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Projectactivity3 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/crm");
        driver.manage().window().maximize();
    }
    @Test
    public void testMethod() {
        String CopyrightText = driver.findElement(By.xpath("//*[@id='admin_options']")).getText();
        System.out.println("Url of the header image is: " + CopyrightText);
    }
    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
