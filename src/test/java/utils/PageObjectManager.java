package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePageElements;
import pageObjects.LoginPageElements;

public class PageObjectManager {
	public static WebDriver driver;
	private HomePageElements hp;
	private LoginPageElements lp;
	
	public PageObjectManager (WebDriver driver2) {
		this.driver =driver2;
	}
	public HomePageElements getHp() {
		hp = new HomePageElements(driver);
		return hp;
		
	}
	public LoginPageElements getLp() {
		lp = new LoginPageElements(driver);
		return lp;
	}
	

}
