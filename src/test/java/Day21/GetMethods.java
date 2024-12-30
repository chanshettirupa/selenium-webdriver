package Day21;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		
		//driver.get("https://demo.opencart.com"); 			// hit URL on Browser
		driver.get("https://www.google.com/intl/en-US/gmail/about/");
		System.out.println("Title : "+driver.getTitle());   // get the page title
		
		System.out.println("URL : "+driver.getCurrentUrl());// get the page URL
		//System.out.println("URL : "+driver.getPageSource());// get the page source
		
		String windowID = driver.getWindowHandle();			// return single page ID 
		System.out.println("Window ID : "+ windowID);
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		Set<String> windowsID = driver.getWindowHandles();	 // return multiple page ID 
		System.out.println("multiple objs:"+windowsID);
		
//		for (String window : windowsID) {
//			System.out.println(window);
//		}
		
		driver.quit();
	}

}
