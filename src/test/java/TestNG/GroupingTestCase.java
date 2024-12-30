package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupingTestCase {
	
	
		@Test(priority=-1, groups= {"regression"})
		void openApp() {
			System.out.println("Open APp");
		}
		
		@Test(priority=0, groups= {"regression"})
		void login() {
			System.out.println("login to APp");
		}
		
		@Test(priority=1, groups= {"regression"})
		void logout() {
			System.out.println("logout the APp");
		}
		
		WebDriver driver;
		
		@BeforeMethod()
		void openURL() {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
		}
		
		@Test(priority=2,groups= {"sanity"})
		void Verifylogo() throws InterruptedException {
			Thread.sleep(3000);
			boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
			System.out.println("Displayed --> "+status);
		}
		
		@AfterMethod
		void logout1() {
			System.out.println("logout the APp");
		}
		
		@AfterClass
		void closebrowser() {
			driver.close();
		}
}
