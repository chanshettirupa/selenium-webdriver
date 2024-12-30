package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/* Assertion - to validate the test Results
 * 1) Hard Assert - functions are static so without object calling directly and if test case failed then next statement will skip.
 * 2) Soft Assert - functions are non static using object we need to call the methods and if test case is failed still it execute next statements.
 * */
public class AssertionsTypes {
	
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
		if(status == true) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=3)
	void validateAssertion() {
		
		// Soft Assert
		SoftAssert obj = new SoftAssert();
		obj.assertEquals("ABC","ABC"); // all functions are same only use object to access the element 
		obj.assertTrue(1==2);          // result is false still execute next statements 
		obj.assertAll();				// Mandatory -- because every time soft assertion result is true this statement will give you correct report if test case failed it will show as failed.
		
		System.out.println("----Hard Assertions------"); //If we wrote assertAll() method then next statement will not execute 
		//All are Hard Assert 
		Assert.assertEquals("123","123"); //both parameter datatype should be same
		Assert.assertNotEquals("123","ABC");
		Assert.assertTrue(true);  	// To pass the condition
		Assert.assertFalse(false);  // To fail the condition
		Assert.assertTrue(1==2);    // Allowed conditional statements
		System.out.println("Failed Test execution");
		Assert.fail();				// fail test case without condition 
		
	}
	
	@Test(priority=4)
	void closeApp() {
		driver.close();
	}

}
