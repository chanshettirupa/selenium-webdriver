package Day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("No of rows in Table:" +rows);
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("No of columns in Table:" +cols);
		
		//read specific value
		System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[1]")).getText());
		
		//read dynamic value the use for loop with row and column and pass row and col value
		// eg = driver.findElement(By.xpath("//table[@name='BookTable']//tr[row]//td[col]")).getText()
		
		driver.close();
		
		
	}

}
