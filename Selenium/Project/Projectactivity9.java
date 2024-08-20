import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Projectactivity9 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.get("http://alchemy.hguy.co/crm");
        driver.manage().window().maximize();
    }
    @Test
    public void testMethod() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//*[@title='Log In']")).click();
        driver.findElement(By.xpath("//*[@id='grouptab_0']")).click();
        driver.findElement(By.xpath("//*[@id='moduleTab_9_Leads'][1]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        List<WebElement> count = driver.findElements(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr"));
        for (int i=1;i<=10;i++){
            Thread.sleep(1000);
            String names=driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr["+i+"]/td[3]/b/a")).getAttribute("text");
            String users=driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr["+i+"]/td[8]/a")).getAttribute("text");
            System.out.println("name is "+names +" and user is "+users);
        }
    }
    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}


