import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestNGActivity7 {
        WebDriver driver;
        WebDriverWait wait;

        @BeforeClass
        public void beforeClass() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get("https://v1.training-support.net/selenium/login-form");
        }

        @DataProvider(name = "Authentication")
        public static Object[][] credentials() {
            return new Object[][] { { "admin", "password" }};
        }

        @Test (dataProvider = "Authentication")
        public void loginTestCase(String username, String password) {
            WebElement usernameField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));

            usernameField.sendKeys(username);
            passwordField.sendKeys(password);

            driver.findElement(By.cssSelector("button[type='submit']")).click();

            String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
            Assert.assertEquals(loginMessage, "Welcome Back, admin");
        }

        @AfterClass
        public void afterClass() {
            driver.close();
        }

    }

