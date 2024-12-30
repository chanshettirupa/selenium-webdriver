package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/* If Dependency method is failed then all other statement will be skipped. If not added TestNG still trying to execute those method
 * */
public class DependencyMethod {


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
	
	@Test(priority=3, dependsOnMethods = {"openURL"})			// specify dependent method name 
	void Login() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();;
	}
	
	@Test(priority=4)
	void closeApp() {
		driver.close();
	}
}
