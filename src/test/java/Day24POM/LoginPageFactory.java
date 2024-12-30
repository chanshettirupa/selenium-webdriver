package Day24POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	WebDriver driver;
	
	//constructor
	LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);   // Mandatory statement 
	}
	
	//locators
	@FindBy(xpath="//input[@name='username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement BTN;
	
	//Action
	public void setUserName(String user) {
		userName.sendKeys(user);
	}
	
	public void setUserPassword(String pass) {
		password.sendKeys(pass);
	}
	public void login() {
		BTN.click();
	}
}
