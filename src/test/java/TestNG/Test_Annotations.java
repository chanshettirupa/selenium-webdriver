package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/* Order - 
 * 1) @BeforeSuite  -- XML file
 * 2) @BeforeTest   -- XML file
 * 3) @BeforeClass  -- run only once in the class (java file)
 * 4) @BeforeMethod -- run multiple times before @Test (Java File)
 * 5) @Test			main test case
 * 6) @AfterMethod  -- run multiple times before @Test (Java File)
 * 7) @AfterClass	-- run only once in the class (java file)
 * 8) @AfterTest  	-- XML level
 * 9) @AfterSuite	-- XML level
 */

//@Listeners(TestNG.ListenersPgm.class) -- Adding listener to class file
public class Test_Annotations {

WebDriver driver;
	
	@BeforeMethod
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
	
	@AfterMethod
	void logout() {
		System.out.println("logout the APp");
	}
	
	@AfterClass
	void closebrowser() {
		driver.close();
	}
}
