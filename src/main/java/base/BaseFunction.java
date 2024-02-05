package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseFunction {
	protected static WebDriver driver = null;

	public static WebDriver launchBrowser(String option) {

		if (option.equalsIgnoreCase("chrome")) {
			ChromeOptions op = new ChromeOptions();
			op.addArguments("start-maximized");
			driver = new ChromeDriver(op);
		} else if (option.equalsIgnoreCase("edge")) {
			EdgeOptions op = new EdgeOptions();
			op.addArguments("start-maximized");
			driver = new EdgeDriver(op);
		} else if (option.equalsIgnoreCase("firefox")) {
			FirefoxOptions op = new FirefoxOptions();
			op.addArguments("start-maximized");
			driver = new FirefoxDriver(op);
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static void url(String url) {
		driver.get(url);

	}

	public static void click(WebElement ele) {
		ele.click();
	}
	public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}
