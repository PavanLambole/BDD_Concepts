package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions
		(
		features = "src/test/resources/FeatureWithTags", 
		glue = {"StepDefinitions"}, 
	//	tags = ("@smoke")             output - scenarios haveing @smoke tag --> sample 1 and sample 3 
	//  here we can usesingle or multiple tags using "and" , "or"
	//   tags = ("@smoke or @regression")     // output - sample 1, sample 2 and sample 3
	//	tags = ("@smoke and @regression")     //output - scenarios will have only smoke and regression tags --> sample 3
		tags = ("@smoke and not @regression") //sample 1
		)

	public class LoginRunner_RunWithSimpleTag {

	}
