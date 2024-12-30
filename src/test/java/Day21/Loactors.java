package Day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * LinkText - text visible in a tag eg ; <a href=''> Text</a>
 * Partial Link Text - pass some content from link text
 * */


public class Loactors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		driver.get("https://demo.opencart.com");
		
		driver.findElement(By.xpath("//img[@title='Your Store']"));			// By Xpath
		driver.findElement(By.name("search")).sendKeys("MAC");				// By Name
		boolean status = driver.findElement(By.id("logo")).isDisplayed();	// BY ID
		System.out.println("Logo displayed:--"+status);
		
		//driver.findElement(By.className("navbar-toggler")).click();			// By Class Name
		
		driver.findElement(By.linkText("Tablets")).click();					   // By Link Text
		//driver.findElement(By.partialLinkText("Tab")).isDisplayed();				// By Partial Link Text
		
		driver.findElement(By.cssSelector("div#header-cart>div>button")).click();  // BY CSS Selector
		
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of elements:"+ elements.size());
		
		
		//Xpath
		//input[contains(@name,'search')] 
		//h3[contains(.,'Featured')]  text() replaced by .  or //h3[contains(text(),'Featured')]
		//h3[contains(text(),'Featured')]/following::div[last()]   find last element
		//h3[contains(text(),'Featured')]/following::div[2)]  find 2nd element by index
		
		
		driver.close();
		
	}

}
