import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Projectactivity2 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/crm");
        driver.manage().window().maximize();
    }
    @Test
    public void testMethod(){
        String ImageUrl = driver.findElement(By.xpath("//img[@alt='SuiteCRM']")).getAttribute("src");
        System.out.println("Url of the header image is: "+ImageUrl);
    }
    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
