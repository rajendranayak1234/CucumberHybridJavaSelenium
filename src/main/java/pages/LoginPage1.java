package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
WebDriver driver;

public LoginPage1(WebDriver driver)
{
	this.driver=driver;

	PageFactory.initElements(driver, this);
}

@FindBy(id="input-email")
private WebElement emeailField;

@FindBy(id="input-password")
private WebElement passwordField;

@FindBy(xpath="//input[@type='submit']")
private WebElement loginButton;

@FindBy(linkText="Edit your account information") //fail
private WebElement linktextvalue;

@FindBy(xpath="//span[text()='My Account']")
private WebElement MyAccountoption;

@FindBy(linkText="Login")   //
private WebElement loginoption;

public void enterEmailaddress(String emailText)
{
	emeailField.sendKeys(emailText);
}

public void enterpassword(String passwordText)
{
	passwordField.sendKeys(passwordText);
}

public void clickonLoginButton()
{
	
	loginButton.click();
}


public boolean verifyHomepage()
{	
return linktextvalue.isDisplayed();
}

public void clickonMyaccount()
{
	MyAccountoption.click();
}

public void clickonloginbutton1()
{
	loginoption.click(); 
}
}