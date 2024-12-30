package Day24POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Durations;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	void Login() throws InterruptedException {
		
		//LoginPage IP = new LoginPage(driver);
		LoginPageFactory IP = new LoginPageFactory(driver);
		IP.setUserName("Admin");
		IP.setUserPassword("Admin@123");
		IP.login();
		Thread.sleep(100);
	}
	
	@AfterClass
	void closeB() {
		driver.quit();
	}

}
