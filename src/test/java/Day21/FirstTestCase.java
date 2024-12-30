package Day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/* Test case
 * -------
 * 1) launch browser
 * 2) open URL https://demo.opencart.com
 * 3) validate title should be "Your store"
 * 4) Close browser
 * */

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driverobj= new ChromeDriver(); 
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com");
		
		String actTitle = driver.getTitle();
		if( actTitle.equals("Your Store")){
			System.out.print("Passed");
		}
		else {
			System.out.print("Failed");
		}
		
		driver.close();
	}

}
