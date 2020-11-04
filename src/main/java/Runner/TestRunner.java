package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "C:\\Users\\Ashwini Raut\\eclipse-workspace\\FreecCrmBDDFramework\\src\\main\\java\\Features\\deals.feature"
		//where the feature file is located
		,glue= {"StepDefinition"}, // path of step definition files
		format= {"pretty","html:test-output"},
		monochrome=true,
		strict=true,// it will check the undefined step in the
		dryRun=false// one by one mapping it will check from feature file and step definition file.
		)

public class TestRunner {

}
