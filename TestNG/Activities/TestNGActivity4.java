import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class TestNGActivity4 {

    public class DemoOne {
        @Test
        public void firstTestCase() {
            System.out.println("I'm in first test case from demoOne Class");
        }

        @Test
        public void secondTestCase() {
            System.out.println("I'm in second test case from demoOne Class");
        }
    }
}
