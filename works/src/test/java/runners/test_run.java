package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =  "resources/features/makemytrip.feature",
		glue = "steps",
		dryRun = false,
		monochrome = true,
		plugin = {
				"html:target/reports/reports.html"
				
		}
		)
public class test_run {

}
