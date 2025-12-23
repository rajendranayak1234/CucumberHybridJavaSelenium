package stepdefinition1;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory1.DriverFactory1;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.LoginPage1;

public class Login1 {
	
	WebDriver driver;
	public LoginPage1 login;
	
	@Given("user navigates to login page")
	public void user_navigates_to_login_page() throws InterruptedException {
		
		driver=DriverFactory1.getDriver();
		 login=new LoginPage1(driver);
		login.clickonMyaccount();
		//Thread.sleep(3000);
		login.clickonloginbutton1();
		//Thread.sleep(3000);
	}

	@When("user enters valid email address {string} into email field")
	public void user_enters_valid_email_address_into_email_field(String email) {
	  
	   login.enterEmailaddress(email);
	}

	@And("user enters valid password {string} into password field")
	public void user_enters_valid_password_into_password_field(String password) {
	 login.enterpassword(password);
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
	    login.clickonLoginButton();
	    
	}

	@Then("user should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
	  Assert.assertTrue(login.verifyHomepage());  
	}


}