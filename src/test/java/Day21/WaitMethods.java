package Day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// For explicit wait first need to declare and then put the condition to validate the condition.
//Fluent wait also exist

public class WaitMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Thread.sleep(1000);														Java Method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));		// Implicit wait
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(1000));  //Explicit wait Declaration
		driver.get("https://demo.opencart.com");
		
		WebElement txt = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Featured']")));  // explicit wait condition
		System.out.println("Displayed:"+ txt.isDisplayed());
	
		WebElement img = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='iPhone 6']")));  // explicit wait condition
		img.click();
		
		driver.close();
		
	}

}
