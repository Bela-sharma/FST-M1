import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Projectactivity5 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/crm");
        driver.manage().window().maximize();
    }
    @Test
    public void testMethod() {
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//*[@title='Log In']")).click();
        String color=driver.findElement(By.xpath("//*[@class='desktop-toolbar']")).getCssValue("color");
        System.out.println("Color of the Navigation bar is: "+color);
    }
    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
