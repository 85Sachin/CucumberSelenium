package testRunner;


//import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;

//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//Uncomment @RunWith if not using Junit
//@RunWith(Cucumber.class)

@CucumberOptions(
		features={"Features"},
		glue={"stepDefination"},
				plugin={"html:target/cucumber-html-report",
						"json:target/cucumber.jason",
						"pretty:target/cucumber-pretty,txt",
						"usage:target/cucumber-usage.json", 
						"junit:target/cucumber-result.xml" }
		)
	
	@Test
	 public class Runner extends AbstractTestNGCucumberTests{

}
