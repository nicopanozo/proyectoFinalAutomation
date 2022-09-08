import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Home.feature",
        glue = {"stepDefinitions"},
        tags = "@LogoutSuccess"

)
public class TestRunner {

}

