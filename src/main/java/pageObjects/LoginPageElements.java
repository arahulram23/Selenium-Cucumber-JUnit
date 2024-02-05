package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {
	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement username_txtBox;
	
	@FindBy(xpath="//h3[@data-test='error']")
	private WebElement error_message;


	public WebElement getError_message() {
		return error_message;
	}

	public WebElement getUsername_txtBox() {
		return username_txtBox;
	}

	public WebElement getPassword_txtBox() {
		return password_txtBox;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password_txtBox;
	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement login_btn;

	public LoginPageElements(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

}
