package hooks;

import org.openqa.selenium.WebDriver;

import base.BaseFunction;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;

    @Before
    public void setUp() {
        String browser = "chrome";
        driver = BaseFunction.launchBrowser(browser);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null; // Set the driver instance to null after quitting
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
