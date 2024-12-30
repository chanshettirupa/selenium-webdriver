package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class chromeOptionsPgms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new"); // Execution will not see on UI used for parallel testing.
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement elements = driver.findElement(By.xpath(("//select[@id='country']")));
		Select dropdownValue = new Select(elements);
		
		System.out.println("Executed...");
		
	}

}
