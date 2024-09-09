import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CucumberActivity4 {
        WebDriver driver;
        WebDriverWait wait;

        @Given("^User is on Login page$")
        public void loginPage() {
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 10);

            driver.get("https://v1.training-support.net/selenium/login-form");
        }

        @When("^User enters username and password$")
        public void enterCredentials() {
            driver.findElement(By.id("username")).sendKeys("admin");
            driver.findElement(By.id("password")).sendKeys("password");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
        }

        @When("^User enters {string} and {string}$")
        public void user_enters_and(String username, String password) throws Throwable {

            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);

            driver.findElement(By.xpath("//button[@type='submit']")).click();
        }

        @Then("^Read the page title and confirmation message$")
        public void readTitleAndHeading() {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));

            String pageTitle = driver.getTitle();
            String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();

            System.out.println("Page title is: " + pageTitle);
            System.out.println("Login message is: " + confirmMessage);

            Assert.assertEquals(confirmMessage, "Welcome Back, admin");
        }

        @And("^Close the Browser$")
        public void closeBrowser() {
            driver.close();
        }

    }
}
