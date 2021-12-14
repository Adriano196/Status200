package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/resources/test.feature",
		glue = "steps",
		tags = "@executa1",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:target/report.html","json:target/report.json"}
		
		)





public class Executar {

}