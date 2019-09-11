package cucumberOptions;



import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/search.feature",
		glue = "stepDefinations", monochrome = true,
		tags = "@SeleniumTest",
		plugin= {"pretty", "html:target/cucumber", "json:target/cucumber.json","junit:target/cukes.xml"})
public class TestRuner3 {

}
