package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/Customers.feature",
		glue = "StepDefinition",
		dryRun = false, // dryRun is checking feature file steps are implemented in StepDefinition or not, dryRun true used for running code in console by showing steps in feature file as implementing part opposite false for running the browser output
		monochrome = true,// It was used for showing test in console meaningful and understandable
		plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
		
		//		plugin = {"pretty","html:target/cucumber-reports/reports1.html","junit:target/cucumber-reports/report_xml.xml","json:target/cucumber-reports/report_json.json"} //Generating report for this plugin and creating a html & json & xml file with folder name
		)
public class Run {
	//This one class is empty
}
