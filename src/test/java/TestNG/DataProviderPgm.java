package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// Provide data through method and execute in single program
public class DataProviderPgm {
	
WebDriver driver;
	
	@Test(priority=1)
	void openURL() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	void Verifylogo() throws InterruptedException {
		Thread.sleep(3000);
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Displayed --> "+status);
	}
	
	@Test(priority=3, dataProvider="dp")			// specify dependent method name 
	void Login(String email,String pwd) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(100);
	}
	
	@Test(priority=4)
	void closeApp() {
		driver.close();
	}

	//Write method to provide a data
	@DataProvider(name = "dp")
	Object[][] loginData(){
		Object data[][] = {
				{"JOhn","John123"},
				{"Abc","ABc123"},
				{"Admin","admin123"}	
		};
		return data;
	}

}
