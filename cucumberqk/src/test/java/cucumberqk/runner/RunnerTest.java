package cucumberqk.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber"},
		features = { "src/test/java/cucumberqk/featurefiles/atacalc.feature"},
		glue = {"cucumberqk.steps"}
		//monochrome = true,
		//tags = {"@fast and @smoke"}
		/*tags = {"@fast"},*/ /*we can define our tag like @smoke */
		/* only those scenario will be executes that have @smoke (in this only 1) tag*/
		)

public class RunnerTest {

}
