import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Activity1 {
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://v1.training-support.net");
            System.out.println("Home page title: " + driver.getTitle());

            driver.findElement(By.id("about-link")).click();
            System.out.println("About page title: " + driver.getTitle());

            // Close the browser
            driver.close();
        }
    }
