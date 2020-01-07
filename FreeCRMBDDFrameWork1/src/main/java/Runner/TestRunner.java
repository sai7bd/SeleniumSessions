package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(CucumberOptions.class)
@CucumberOptions(
		features = "C:\\Users\\Lego3\\workspace\\Selenium\\FreeCRMBDDFrameWork1\\src\\main\\java\\Features"
		.glue= {"stepDefinition"},
		//format= {"pretty", "html:test-outout"}
		)

public class TestRunner {

}
