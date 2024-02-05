package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/java/feature", glue = { "stepDefinitions",
		"hooks" }, snippets = SnippetType.CAMELCASE, dryRun = false, monochrome = true, stepNotifications = true, publish = true, plugin = {
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty" })
public class TestRunner {
	public static WebDriver driver;

}

/*
 * @BeforeClass public static void launch() { String browser = "chrome"; driver
 * = BaseFunction.launchBrowser(browser);
 * 
 * }
 * 
 * @AfterClass public static void tearDown() { driver.quit(); }
 */