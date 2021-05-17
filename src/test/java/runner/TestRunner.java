package runner;

import java.sql.Driver;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions"},
monochrome= true,
plugin = {"pretty", "json:target/JSONReports"})
public class TestRunner {

	public void clickOnBanner() {
		System.out.println("hello");
	}
}
