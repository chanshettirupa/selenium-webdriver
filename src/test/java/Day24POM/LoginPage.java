package Day24POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//1) Page object MOdel (POM) without using page factory (Predefined class).

public class LoginPage {
	
	WebDriver driver;
	
	//constructor
	LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locators
	By txt_username = By.xpath("//input[@name='username']");
	By txt_pwd = By.xpath("//input[@name='password']");
	By btn = By.xpath("//button[@type='submit']");

	
	//Action Methods
	public void setUserName(String user) {
		driver.findElement(txt_username).sendKeys(user);
	}
	
	public void setUserPassword(String pass) {
		driver.findElement(txt_pwd).sendKeys(pass);
	}
	public void login() {
		driver.findElement(btn).click();
	}
}
