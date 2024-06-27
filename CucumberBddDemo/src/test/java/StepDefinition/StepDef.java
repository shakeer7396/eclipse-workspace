package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;
import io.cucumber.java.en.*;// * for importing all packages
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class StepDef {
	public WebDriver driver;
	public LoginPage loginPg;
	public AddNewCustomerPage addNewCustPg;



	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		loginPg = new LoginPage(driver);
		addNewCustPg = new AddNewCustomerPage(driver);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailadd, String pwd)throws Exception {
		Thread.sleep(3000);
		loginPg.enterEmail(emailadd);
		loginPg.enterPassword(pwd);
	}

	@When("Click on Login")
	public void click_on_login()throws Exception {
		Thread.sleep(3000);
		loginPg.clickOnLoginButton();
	}

	/////////////////////////////////////////  User Login Methods class-1  //////////////////////////////////////////////////////////

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle)throws Exception {
		Thread.sleep(3000);
		String actualTitle = driver.getTitle();

		if(actualTitle.equals(expectedTitle)) {
			Assert.assertTrue(true);//pass
		}
		else {
			Assert.assertTrue(false);//fail
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link()throws Exception {
		Thread.sleep(3000);
		loginPg.clickOnLogOutButton();

	}

	@Then("close browser")
	public void close_browser() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}
	//////////////////////////////////////////  Add New Customer Features Class-2 ///////////////////////////////////////////////////////////

	@Then("User can view Dashboad")
	public void user_can_view_dashboad() {
		String actualTitle = addNewCustPg.getPageTitle();
		String exceptedTitle = "Dashboard / nopCommerce administration";

		if(actualTitle.equals(exceptedTitle)) {
			Assert.assertTrue(true);//Pass
		}
		else {
			Assert.assertTrue(false);//Fail
		}
	}

	@When("User click on customers Menu")
	public void user_click_on_customers_menu() {
		addNewCustPg.clickOnCustomersMenu();
	}

	@When("click on customers Menu Item")
	public void click_on_customers_menu_item() {
		addNewCustPg.clickOnCustomersMenuItem();
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
		addNewCustPg.clickOnAddnew();
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
		String actualTitle = addNewCustPg.getPageTitle();
		String exceptedTitle = "Add a new customer / nopCommerce administration";

		if(actualTitle.equals(exceptedTitle)) {
			Assert.assertTrue(true);//Pass
		}
		else {
			Assert.assertTrue(false);//Fail
		}
	}


@When("User enter customer info")
public void user_enter_customer_info() {
	addNewCustPg.enterEmail("test1@gmail.com");
	addNewCustPg.enterPassword("test1");
	addNewCustPg.enterFirstName("S");
	addNewCustPg.enterLastName("Shaik");
	addNewCustPg.enterGender("Male");
	addNewCustPg.enterDob("03/08/2000");
	addNewCustPg.enterCompanyName("Yaqxpro Technologies");
	addNewCustPg.enterAdminContent("Admin Data");
	addNewCustPg.enterManagerOfVendor("Vendor 1");
}

@When("click on Save button")
public void click_on_save_button() {
	addNewCustPg.clickOnSave();
}

@Then("User can view confirmation message {string}")
public void user_can_view_confirmation_message(String exceptedConfirmationMsg) {
	String bodyTagText = driver.findElement(By.tagName("Body")).getText();
	if(bodyTagText.contains(exceptedConfirmationMsg)) {
		Assert.assertTrue(true);//pass
	}
	else {
		Assert.assertTrue(false);//Fail
	}

}

}