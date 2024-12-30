package Day21;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConditionalMethods {

	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofNanos(1000));
		
		driver.get("https://www.google.com/intl/en-US/gmail/about/");
		
		System.out.println(driver.findElement(By.xpath("(//div[contains(text(),'Create an account')])[1]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("(//div[contains(text(),'Create an account')])[1]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("(//div[contains(text(),'Create an account')])[1]")).isSelected());
		
		driver.close();
	}
}
