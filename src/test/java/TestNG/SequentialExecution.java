package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// Passing browser name as parameter and execute test in that browser.

public class SequentialExecution {
	
	WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	void Setup(String br){
		
		switch(br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			System.out.print("Chrome launched");
			break;
			
		case "edge":
			driver = new EdgeDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
		
		default: 
			System.out.println("Invalid Driver");
		}
		driver.manage().window().maximize();
		
	}
}
