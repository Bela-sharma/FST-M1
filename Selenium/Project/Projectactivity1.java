import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Projectactivity1 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/crm");
        driver.manage().window().maximize();
    }

    @Test
    public void testMethod() {
        String title = driver.getTitle();
        System.out.println("Title of the page is: " + title);
        Assert.assertEquals(title, "SuiteCRM");
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}

