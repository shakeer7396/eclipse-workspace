package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver; //Its a Local WebDriver

	public LoginPage(WebDriver rDriver) { //Its a constructor (Parameter)
		ldriver = rDriver;
		
		PageFactory.initElements(rDriver, this);
		
	}
	
	@FindBy(id = "Email")//Identifying the web element and (strategy)
	WebElement email;
	
	
	@FindBy(id = "Password")
	WebElement Password;
	
	@FindBy(xpath = "//button[@class='button-1 login-button']")
	WebElement LoginBtn;
	
	@FindBy(linkText = "Logout")
	WebElement Logout;
	
	//Action methods for above once
	public void enterEmail(String emailAdd) {
		email.clear();
		email.sendKeys(emailAdd);
	}
	public void enterPassword(String pwd) {
		Password.clear();
		Password.sendKeys(pwd);
	}
	public void clickOnLoginButton() {
		LoginBtn.click();
	}
	public void clickOnLogOutButton() {
		Logout.click();
	}
}