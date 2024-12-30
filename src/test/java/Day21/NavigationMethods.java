package Day21;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		driver.get("https://www.google.com/intl/en-US/gmail/about/");
		driver.navigate().to("https://www.google.com/");
		
		
		driver.navigate().back(); 					//Back to original page
		System.out.println("Back");
		Thread.sleep(3000);
		
		driver.navigate().forward();				//move to next page
		System.out.println("Forword");
		Thread.sleep(3000);
		
		driver.navigate().refresh();				// refresh the page
		System.out.println("Refresh");
		
		driver.close();
	}

}
