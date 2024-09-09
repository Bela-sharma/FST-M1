import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class Activty3runner {


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "Features",
            glue = {"stepDefinitions"},
            tags = "@activity3"
    )

    public class Activty3runner {}
}
