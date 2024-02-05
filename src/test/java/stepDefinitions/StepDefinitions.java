package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import base.BaseFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.PageObjectManager;

public class StepDefinitions extends BaseFunction {
	//public static WebDriver driver = Hooks.driver;
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("the User navigates to the Swag Labs login page")
	public void theUserNavigatesToTheSwagLabsLoginPage() {
//		driver.get("https://www.saucedemo.com/");
		url("https://www.saucedemo.com/");

	}

	@When("the User enters the {string} and {string}")
	public void theUserEntersTheAnd(String string, String string2) {
		pom.getLp().getUsername_txtBox().sendKeys(string);
		pom.getLp().getPassword_txtBox().sendKeys(string2);
//	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(string);
//	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string2);
	}

	@When("the User clicks the login button")
	public void theUserClicksTheLoginButton() {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

	@Then("the User should be redirected to the Swag Labs home page")
	public void theUserShouldBeRedirectedToTheSwagLabsHomePage() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

	@Then("the User should not be redirected to the Swag Labs home page")
	public void theUserShouldNotBeRedirectedToTheSwagLabsHomePage() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		boolean displayed = pom.getLp().getError_message().isDisplayed();
		Assert.assertTrue(displayed);

	}
}
