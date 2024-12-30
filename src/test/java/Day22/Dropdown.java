package Day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//only use this method when select tag is present

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement elements = driver.findElement(By.xpath(("//select[@id='country']")));
		Select dropdownValue = new Select(elements);
		
		System.out.println("Executed...");
		
		//dropdownValue.selectByValue("japan");
		//dropdownValue.selectByVisibleText("France");
		dropdownValue.selectByIndex(2);
		
		Thread.sleep(1000);
		
		
		List<WebElement> dropdownOptions = dropdownValue.getOptions();
		System.out.println("Size..."+ dropdownOptions.size());
		
		for(WebElement ele : dropdownOptions) {
			System.out.println(ele.getText());
		}
		
		
		driver.close();
	}

}
