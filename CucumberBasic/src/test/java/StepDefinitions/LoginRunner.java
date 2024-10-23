package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Login.feature",glue= {"StepDefinitions"},
monochrome=true,
plugin={"pretty","html:target/Reports/report.html"}
//plugin={"pretty","json:target/JSONReports/report.json"}
//plugin={"pretty",":junit/JSONReports/report.xml"}
//tags="@smoketest"
		
		)




public class LoginRunner {
	

}
