package Day23;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsPgm2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		//1) It hide the chrome is being controlled by automation statement.
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});	   
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.close();
		
		//2) Running Test in Incognito Window 
		ChromeOptions options1 = new ChromeOptions();
		options1.addArguments("--incognito");
		WebDriver driver1 = new ChromeDriver(options1);
		
		driver1.get("https://www.google.com/");
		Thread.sleep(100);
		
		driver1.close();
		
		//3) Enable Browser Extension at run time 
		ChromeOptions options2 = new ChromeOptions();
		File file = new File("C:\\Users\\TiaaUser\\Downloads\\Unconfirmed 91181.crdownload");
		options2.addExtensions(file);
		WebDriver driver2 = new ChromeDriver(options2);
		
		driver2.get("https://www.google.com/");
		Thread.sleep(100);
		
		driver2.close();
	}

}
