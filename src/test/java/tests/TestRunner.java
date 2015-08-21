
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty" , "html:target/cucumber" ,"json:target/cucumberSampleTests.json"},
		features = {"target/test-classes/features/login.feature"} )
public class TestRunner {

}
