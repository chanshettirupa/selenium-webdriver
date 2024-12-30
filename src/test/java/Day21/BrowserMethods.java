package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Note - If browser have 2 window then close method will close only one which window have focus

public class BrowserMethods {
	
	public static void main(String args[]) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/intl/en-US/gmail/about/");
		
		driver.close(); 	//close single window
		driver.quit();		// close multiple window
	}

}
